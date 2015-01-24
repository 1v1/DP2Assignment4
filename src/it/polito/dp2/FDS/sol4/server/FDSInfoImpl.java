package it.polito.dp2.FDS.sol4.server;
import it.polito.dp2.FDS.sol4.server.jaxws.Flight;
import it.polito.dp2.FDS.sol4.server.jaxws.FlightInstance;
import it.polito.dp2.FDS.sol4.server.jaxws.FlightInstanceStatus;
import it.polito.dp2.FDS.sol4.server.jaxws.GetAircrafts;
import it.polito.dp2.FDS.sol4.server.jaxws.GetAircraftsResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlight;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstance;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstanceResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstances;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstancesResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlights;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightsResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetPassengers;
import it.polito.dp2.FDS.sol4.server.jaxws.GetPassengersResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.Info;
import it.polito.dp2.FDS.sol4.server.jaxws.InvalidArgument;
import it.polito.dp2.FDS.sol4.server.jaxws.InvalidArgument_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.Monitor;
import it.polito.dp2.FDS.sol4.server.jaxws.Monitor_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.Time;
import it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlight;
import it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlightInstance;
import it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlightInstance_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlight_Exception;

import java.util.Map;

import javax.jws.HandlerChain;
import javax.jws.WebService;
import javax.xml.datatype.XMLGregorianCalendar;

@WebService(serviceName="FDSInfo",
portName="FDSInfoImplPort",
targetNamespace="http://pad.polito.it/FDSInfo",
endpointInterface="it.polito.dp2.FDS.sol4.server.jaxws.Info")
@HandlerChain(file = "META-INF/server/custom/handler-chain.xml")
public class FDSInfoImpl implements Info {

	private static DataManager manager;

	private static final String FLIGHTID_PATTERN = "^[A-Z]{2}[0-9]{1,4}$";

	//	private static Logger logger = Logger.getLogger(FDSControlImpl.class.getName());

	public FDSInfoImpl ()
	{
		//		logger.entering(logger.getName(), "FDSInfoImpl()");
		FDSInfoImpl.manager = DataManager.getInstance();
	}

	@Override
	public GetFlightResponse getFlight(GetFlight parameters)
			throws InvalidArgument_Exception, UnknownFlight_Exception, Monitor_Exception {

		try {
			if (manager.containsKeyFlightsMap(parameters.getFlightID()))
			{
				Flight flight;
				synchronized(flight = manager.getFlight(parameters.getFlightID()))
				{
					GetFlightResponse res = new GetFlightResponse();
					res.setReturn(flight);
					return res;
				}
			}else
			{
				//				logger.warning("The requested flight number is not present in our database");
				UnknownFlight unkFli = new UnknownFlight();
				unkFli.setMessage("The requested flight number is not present in our database");
				throw new UnknownFlight_Exception("The requested flight number is not present in our database", unkFli);
			}
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}
	}

	@Override
	public GetFlightsResponse getFlights(GetFlights parameters)
			throws InvalidArgument_Exception, Monitor_Exception {

		Time startTime = new Time();
		if (parameters.getDepartureTime()==null)
		{
			startTime.setHour(0);
			startTime.setMinute(0);
		}else
		{
			startTime.setHour(parameters.getDepartureTime().getValue().getHour());
			startTime.setMinute(parameters.getDepartureTime().getValue().getMinute());
		}

		if ( (parameters.getDepartureAirport() != null) && (parameters.getDestinationAirport()!=null) &&
				(parameters.getDepartureAirport().equals(parameters.getDestinationAirport())) )
		{
			InvalidArgument invArg = new InvalidArgument();
			invArg.setMessage("The departure airport can not be equal to destination airport");
			throw new InvalidArgument_Exception("Destination airport and departure airport are equal", invArg);
		}

		GetFlightsResponse res = new GetFlightsResponse();

		try {
			for (Map.Entry<String, Flight> entry:manager.getFlightsMap().entrySet())
			{
				if ( ( ( entry.getValue().getDepartureAirport().equals(parameters.getDepartureAirport()) ) ||
						( parameters.getDepartureAirport() == null ) ) &&
						( ( entry.getValue().getDestinationAirport().equals(parameters.getDestinationAirport()) ) ||
								( parameters.getDestinationAirport() == null ) ) &&
								( ( isTimeBefore( entry.getValue().getDepartureTime(), startTime ) ) ||
										( parameters.getDepartureTime() == null ) ) )
				{
					// This is one of the requested flights
					res.getReturn().add(entry.getValue());
				}
			}
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}

		return res;
	}

	@Override
	public GetFlightInstanceResponse getFlightInstance(
			GetFlightInstance parameters) throws InvalidArgument_Exception,
			UnknownFlightInstance_Exception, Monitor_Exception
	{
		FlightInstanceKey key = new FlightInstanceKey(parameters.getFlightID(), parameters.getDepartureDate());

		try {
			if (manager.containsKeyFlightInstancesMap(key))
			{
				FlightInstance f;
				GetFlightInstanceResponse res = new GetFlightInstanceResponse();
				synchronized(f = manager.getFlightInstance(key))
				{
					res.setReturn(f);
				}
				//				logger.fine("Flight instance returned");
				return res;
			}else
			{
				//				logger.warning("The specified flight instance does not exist");
				UnknownFlightInstance unkFli = new UnknownFlightInstance();
				unkFli.setMessage("The specified flight instance does not exist");
				throw new UnknownFlightInstance_Exception("The specified flight instance does not exist", unkFli);
			}
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}
	}

	@Override
	public GetFlightInstancesResponse getFlightInstances(
			GetFlightInstances parameters) throws InvalidArgument_Exception,
			UnknownFlight_Exception, Monitor_Exception
	{
		if ( (!parameters.getFlightID().matches(FLIGHTID_PATTERN) ) && (parameters.getFlightID() != null) )
		{
			//			logger.warning("The requested flight number is not valid");
			InvalidArgument unkFli = new InvalidArgument();
			unkFli.setMessage("The requested flight number is not valid");
			throw new InvalidArgument_Exception("The requested flight number is not valid", unkFli);
		}

		if ( (! isStatusValid(parameters.getFlightStatus())) && ( parameters.getFlightStatus() != null ) )
		{
			//			logger.warning("The requested flight status is not valid");
			InvalidArgument unkFli = new InvalidArgument();
			unkFli.setMessage("The requested flight status is not valid");
			throw new InvalidArgument_Exception("The requested flight status is not valid", unkFli);
		}

		GetFlightInstancesResponse res = new GetFlightInstancesResponse();

		try {
			for (FlightInstance f: manager.getflightInstancesMap().values())
				if ( ( (parameters.getFlightStatus() == null) ||
						(f.getStatus().equals(parameters.getFlightStatus())) ) &&
						((parameters.getDepartureDate() == null ) ||
								( isBefore(f.getDate(), parameters.getDepartureDate()) ) ) &&
								((parameters.getFlightID() == null) ||
										(f.getFlightID().equals(parameters.getFlightID()))) )

					res.getReturn().add(f);
			//			logger.info("Flight instances returned!");
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}
		return res;
	}

	@Override
	public GetPassengersResponse getPassengers(GetPassengers parameters)
			throws InvalidArgument_Exception, UnknownFlightInstance_Exception, Monitor_Exception
	{

		FlightInstanceKey key = new FlightInstanceKey(parameters.getFlightID(), parameters.getDepartureDate());

		try {
			if (manager.containsKeyFplist_map(key))
			{
				GetPassengersResponse res = new GetPassengersResponse();
				res.getReturn().addAll(manager.getPassengerList(key));
				return res;
			}else
			{
				//				logger.warning("The requested flight number is not in our database");
				UnknownFlightInstance unkFli = new UnknownFlightInstance();
				unkFli.setMessage("The requested flight number is not in our database");
				throw new UnknownFlightInstance_Exception("The requested flight number is not in our database", unkFli);
			}
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}
	}

	@Override
	public GetAircraftsResponse getAircrafts(GetAircrafts parameters)
	{
		GetAircraftsResponse res = new GetAircraftsResponse();
		res.getReturn().addAll(manager.getAircrafts());
		return res;
	}


	private boolean isStatusValid(FlightInstanceStatus Status)
	{
		String status = Status.toString();

		if (status.equals("ARRIVED"))
			return true;
		if (status.equals("BOARDING"))
			return true;
		if (status.equals("BOOKING"))
			return true;
		if (status.equals("CANCELLED"))
			return true;
		if (status.equals("CHECKINGIN"))
			return true;
		if (status.equals("DEPARTED"))
			return true;
		return false;

	}

	private boolean isTimeBefore(Time flightTime, Time wantedTime)
	{
		if (flightTime.getHour() > wantedTime.getHour())
			return true;
		else if (flightTime.getHour() == wantedTime.getHour())
			if (flightTime.getMinute() > wantedTime.getMinute())
				return true;
		return false;
	}

	private boolean isBefore(XMLGregorianCalendar flightDate, XMLGregorianCalendar wantedDate)
	{
		//		GregorianCalendar flightDate_gc = flightDate.toGregorianCalendar();
		//		GregorianCalendar wantedDate_gc = wantedDate.toGregorianCalendar();
		//		
		//		flightDate_gc.set(Calendar.HOUR, 0);
		//		flightDate_gc.set(Calendar.MINUTE, 0);
		//		flightDate_gc.set(Calendar.SECOND, 0);
		//		flightDate_gc.set(Calendar.MILLISECOND, 0);
		//		wantedDate_gc.set(Calendar.HOUR, 0);
		//		wantedDate_gc.set(Calendar.MINUTE, 0);
		//		wantedDate_gc.set(Calendar.SECOND, 0);
		//		wantedDate_gc.set(Calendar.MILLISECOND, 0);
		//		
		//		return !wantedDate_gc.after(flightDate_gc);

		if (flightDate.getYear() > wantedDate.getYear())
			return true;
		if(flightDate.getYear() == wantedDate.getYear())
		{
			if (flightDate.getMonth() > wantedDate.getMonth())
				return true;
			if (flightDate.getMonth() == wantedDate.getMonth())
				if (flightDate.getDay() >= wantedDate.getDay())
					return true;
		}
		return false;
	}
}
