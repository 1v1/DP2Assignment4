package it.polito.dp2.FDS.sol4.client;

import it.polito.dp2.FDS.sol4.client.boardList.jaxb.BoardListType;
import it.polito.dp2.FDS.sol4.client.boardList.jaxb.PassengerType;
import it.polito.dp2.FDS.sol4.client.fdsBoarding.jaxb.BoardingType;
import it.polito.dp2.FDS.sol4.client.gen.Control;
import it.polito.dp2.FDS.sol4.client.gen.FDSControl;
import it.polito.dp2.FDS.sol4.client.gen.GetBoardedPassengers;
import it.polito.dp2.FDS.sol4.client.gen.GetBoardedPassengersResponse;
import it.polito.dp2.FDS.sol4.client.gen.Passenger;
import it.polito.dp2.FDS.sol4.client.gen.RegisterPassenger;
import it.polito.dp2.FDS.sol4.client.gen.RegisterPassengerResponse;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.GregorianCalendar;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Response;

import org.xml.sax.SAXException;

public class FDSControlClient {

	private static File inputFile;
	private static File inputSchemaFile;
	private static File outputFile;

	private static Control controlProxy;
	//	private static Info infoProxy;

	private static FileOutputStream outputstream;
	private static FileInputStream inputstream;

	private static BoardingType boardingInfo;

	public FDSControlClient()
	{
		try {
			outputstream = new FileOutputStream(FDSControlClient.outputFile);
			registerPassengers();
			getBoardedPassengers();
			closeBuffers(0);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			closeBuffers(2);
		} catch (MalformedURLException e) {
			e.printStackTrace();
			closeBuffers(1);
		}
	}


	public static void main(String[] args) {

		try
		{
			if (args.length!=2)
			{
				System.out.println("usage: input_filename output_filename");
				closeBuffers(2);
			}
			String inputFilename=args[0];
			String outputFilename=args[1];


			parseFiles(inputFilename, outputFilename);

			new FDSControlClient();
			closeBuffers(0);

		}catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			closeBuffers(2);
		}catch (Exception e)
		{
			e.printStackTrace();
			closeBuffers(2);
		}
	}


	private static void parseFiles (String inputFilename, String outputFilename)
	{
		try {
			FDSControlClient.inputFile = new File(inputFilename);

			FDSControlClient.inputSchemaFile = new File("./xsd/fdsBoarding.xsd");

			FDSControlClient.outputFile = new File(outputFilename);

			// Parse the input file
			Source schemaSource = new StreamSource(FDSControlClient.inputSchemaFile);
			SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			Schema schema = schemaFactory.newSchema(schemaSource); 
			FDSControlClient.inputstream = new FileInputStream(FDSControlClient.inputFile);
			Source s = new StreamSource(FDSControlClient.inputstream);
			JAXBContext jaxbContext = JAXBContext.newInstance("it.polito.dp2.FDS.sol4.client.fdsBoarding.jaxb");
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

			jaxbUnmarshaller.setSchema(schema);
			jaxbUnmarshaller.setEventHandler(new MyValidationEventHandler());

			JAXBElement<BoardingType> root = jaxbUnmarshaller.unmarshal(s, BoardingType.class);
			boardingInfo = root.getValue();
			inputstream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			closeBuffers(1);
		} catch (IOException e) {
			e.printStackTrace();
			closeBuffers(2);
		} catch (SAXException e) {
			e.printStackTrace();
			closeBuffers(1);
		} catch (JAXBException e) {
			e.printStackTrace();
			closeBuffers(1);
		}
	}

	private static void prepareControlEndpoint()
	{
		try {
			if (boardingInfo.getEndpoint() == null)
				throw new MalformedURLException("The endpoint url is null");

			URL endpointUrl = new URL(boardingInfo.getEndpoint()+"?wsdl");

			FDSControl service = new FDSControl( endpointUrl,
					new QName("http://pad.polito.it/FDSControl", "FDSControl"));
			controlProxy = service.getFDSControlImplPort();

			BindingProvider bindprov = (BindingProvider) controlProxy;
			bindprov.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, boardingInfo.getEndpoint()+"?wsdl");
		} catch (MalformedURLException e)
		{
			e.printStackTrace();
			closeBuffers(2);
		} catch (Exception e)
		{
			e.printStackTrace();
			closeBuffers(2);
		}
	}

	private static void registerPassengers() throws MalformedURLException
	{
		XMLGregorianCalendar departureDate = boardingInfo.getDate();
		String flightID = boardingInfo.getFlight();

		if ((flightID.isEmpty()) || (flightID == null))
		{
			System.out.println("Invalid flight ID in the input file");
			closeBuffers(1);
		}
		
		if (departureDate == null)
		{
			System.out.println("Invalid departure date in the input file");
			closeBuffers(1);
		}

		prepareControlEndpoint();

		System.out.println("FLIGHTID="+flightID);
		System.out.println("DEPARTURE DATE="+departureDate);

		try {
			for (String passengerName:boardingInfo.getPassenger())
			{
				GregorianCalendar date = new GregorianCalendar();
				date.clear();
				date = departureDate.toGregorianCalendar();

				XMLGregorianCalendar depDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(departureDate.toGregorianCalendar());

				RegisterPassenger req = new RegisterPassenger();
				req.setDepartureDate(depDate);
				req.setFlightID(flightID);
				req.setPassengerName(passengerName);

				Response<RegisterPassengerResponse> res = controlProxy.registerPassengerAsync(req);
				res.get();
			}
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			closeBuffers(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
			closeBuffers(1);
		} catch (ExecutionException e) {
			e.printStackTrace();
			closeBuffers(1);
		}
	}

	private static void getBoardedPassengers()
	{
		XMLGregorianCalendar departureDate = boardingInfo.getDate();
		String flightID = boardingInfo.getFlight();

		if ((flightID.isEmpty()) || (flightID == null))
		{
			System.out.println("Invalid flight ID in the input file");
			closeBuffers(1);
		}

		if (departureDate == null)
		{
			System.out.println("Invalid departure date in the input file");
			closeBuffers(1);
		}

		prepareControlEndpoint();

		List<Passenger> returnList = new LinkedList<Passenger>();

		try {
			GregorianCalendar date = new GregorianCalendar();
			date.clear();
			date = departureDate.toGregorianCalendar();

			XMLGregorianCalendar depDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(departureDate.toGregorianCalendar());

			Boolean lastPage = false;
			int pageNumber = 0;
			while(!lastPage)
			{
				GetBoardedPassengers req = new GetBoardedPassengers();
				req.setDepartureDate(depDate);
				req.setFlightID(flightID);
				req.setPageNumber(pageNumber);

				Response<GetBoardedPassengersResponse> res = controlProxy.getBoardedPassengersAsync(req);
				
				pageNumber++;
				returnList.addAll(res.get().getReturn());
				if (res.get().isLastPage())
					lastPage=true;
			}

		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			closeBuffers(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
			closeBuffers(1);
		} catch (ExecutionException e) {
			e.printStackTrace();
			closeBuffers(1);
		}

		printBoardList(returnList);
	}

	private static void printBoardList(List<Passenger> passengerList)
	{
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance("it.polito.dp2.FDS.sol4.client.boardList.jaxb");
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			BoardListType boardingList = new BoardListType();
			boardingList.setFlight(passengerList.get(0).getFlightID());
			boardingList.setDate(passengerList.get(0).getDepartureDate());

			for (Passenger p:passengerList)
			{
				System.out.println("Printing: "+p.getName()+" Seat= "+p.getSeat());
				PassengerType passenger = new PassengerType();
				passenger.setSeat(p.getSeat());
				passenger.setValue(p.getName());
				boardingList.getPassenger().add(passenger);
			}

			// output pretty printed
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
			jaxbMarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "./xsd/boardList.xsd");

			JAXBElement<BoardListType> boardListElement = (new it.polito.dp2.FDS.sol4.client.boardList.jaxb.ObjectFactory()).createBoardList(boardingList);

			jaxbMarshaller.marshal(boardListElement, outputstream);
		} catch (PropertyException e) {
			e.printStackTrace();
			closeBuffers(2);
		}catch (JAXBException e) {
			e.printStackTrace();
			closeBuffers(2);
		}
	}

	private static void closeBuffers(int exitCode)
	{
		try {
			FDSControlClient.inputstream.close();
			FDSControlClient.outputstream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.exit(exitCode);
	}

	//	private static void printFlights()
	//	{
	//		prepareInfoEndpoint();
	//		try {
	//			GetFlights req = new GetFlights();
	//			req.setDepartureAirport(null);
	//			req.setDepartureTime(null);
	//			req.setDestinationAirport(null);
	//			Response<GetFlightsResponse> res = infoProxy.getFlightsAsync(req);
	//			List<Flight> returnList = res.get().getReturn();
	//			for (Flight f:returnList)
	//				System.out.println("FLIGHT ID="+f.getNumber()+" DEP="+f.getDepartureAirport()+
	//						" ARR="+f.getDestinationAirport()+" TIME="+f.getDepartureTime().getHour()+":"+f.getDepartureTime().getMinute());
	//		} catch (InterruptedException e) {
	//			e.printStackTrace();
	//			closeBuffers(1);
	//		} catch (ExecutionException e) {
	//			e.printStackTrace();
	//			closeBuffers(1);
	//		}
	//	}
}
