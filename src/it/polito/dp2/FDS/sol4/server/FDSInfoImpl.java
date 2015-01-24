package it.polito.dp2.FDS.sol4.server;
import it.polito.dp2.FDS.sol4.server.jaxws.Flight;
import it.polito.dp2.FDS.sol4.server.jaxws.FlightInstance;
import it.polito.dp2.FDS.sol4.server.jaxws.GetAircrafts;
import it.polito.dp2.FDS.sol4.server.jaxws.GetAircraftsResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlight;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightByDepartureAirport;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightByDepartureAirportResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightByDestinationAirport;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightByDestinationAirportResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstance;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstanceByDepartureDate;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstanceByDepartureDateResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstanceByStatus;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstanceByStatusResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstanceResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstances;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstancesByFlightID;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstancesByFlightIDResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstancesResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlights;
import it.polito.dp2.FDS.sol4.server.jaxws.GetFlightsResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetPassengerByDepartureDate;
import it.polito.dp2.FDS.sol4.server.jaxws.GetPassengerByDepartureDateResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetPassengerByFlightID;
import it.polito.dp2.FDS.sol4.server.jaxws.GetPassengerByFlightIDResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetPassengerByPrefix;
import it.polito.dp2.FDS.sol4.server.jaxws.GetPassengerByPrefixResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.GetPassengers;
import it.polito.dp2.FDS.sol4.server.jaxws.GetPassengersResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.Info;
import it.polito.dp2.FDS.sol4.server.jaxws.InvalidArgument;
import it.polito.dp2.FDS.sol4.server.jaxws.InvalidArgument_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.Monitor;
import it.polito.dp2.FDS.sol4.server.jaxws.Monitor_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.Passenger;
import it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlight;
import it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlightInstance;
import it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlightInstance_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlight_Exception;

import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

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

	//	private static Logger logger = Logger.getLogger(FDSControlImpl.class.getName());

	public FDSInfoImpl ()
	{
		//		logger.entering(logger.getName(), "FDSInfoImpl()");
		FDSInfoImpl.manager = DataManager.getInstance();
	}

	//	private boolean isStatusValid(FlightInstanceStatus Status)
	//	{
	//		String status = Status.toString();
	//
	//		if (status.equals("ARRIVED"))
	//			return true;
	//		if (status.equals("BOARDING"))
	//			return true;
	//		if (status.equals("BOOKING"))
	//			return true;
	//		if (status.equals("CANCELLED"))
	//			return true;
	//		if (status.equals("CHECKINGIN"))
	//			return true;
	//		if (status.equals("DEPARTED"))
	//			return true;
	//		return false;
	//
	//	}
	//
	//	private boolean isTimeBefore(Time flightTime, Time wantedTime)
	//	{
	//		if (flightTime.getHour() > wantedTime.getHour())
	//			return true;
	//		else if (flightTime.getHour() == wantedTime.getHour())
	//			if (flightTime.getMinute() > wantedTime.getMinute())
	//				return true;
	//		return false;
	//	}
	//
	//	private boolean isBefore(XMLGregorianCalendar flightDate, XMLGregorianCalendar startDate)
	//	{
	//		/*
	//		 * Check if the startDate is before the flight date.
	//		 * 
	//		 * I consider to compare the two dates, using only DAY_OF_MONTH, MONTH, YEAR and the TIMEZONE.
	//		 * In order to do that, I reset all the meaningless fields of the two dates before comparing them.
	//		 * I use the method after to compare the two dates, and I return the complement of the operation, 
	//		 * to include also the dates that are equals.
	//		 * 
	//		 */
	//
	//		GregorianCalendar flightDate_gc = flightDate.toGregorianCalendar();
	//		GregorianCalendar startDate_gc = startDate.toGregorianCalendar();
	//
	//		flightDate_gc.set(Calendar.HOUR, 0);
	//		flightDate_gc.set(Calendar.MINUTE, 0);
	//		flightDate_gc.set(Calendar.SECOND, 0);
	//		flightDate_gc.set(Calendar.MILLISECOND, 0);
	//
	//		startDate_gc.set(Calendar.HOUR, 0);
	//		startDate_gc.set(Calendar.MINUTE, 0);
	//		startDate_gc.set(Calendar.SECOND, 0);
	//		startDate_gc.set(Calendar.MILLISECOND, 0);
	//
	//		return !startDate_gc.after(flightDate_gc);
	//	}

	@Override
	public GetAircraftsResponse getAircrafts(GetAircrafts parameters)
	{
		GetAircraftsResponse res = new GetAircraftsResponse();
		res.getReturn().addAll(manager.getAircrafts());
		return res;
	}

	@Override
	public GetFlightResponse getFlight(GetFlight parameters)
			throws InvalidArgument_Exception, Monitor_Exception,
			UnknownFlight_Exception {
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
			throws InvalidArgument_Exception, Monitor_Exception
	{

		GetFlightsResponse res = new GetFlightsResponse();

		try {
			for (Map.Entry<String, Flight> entry:manager.getFlightsMap().entrySet())
			{
				// This is one of the requested flights
				res.getReturn().add(entry.getValue());
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
	public GetFlightByDepartureAirportResponse getFlightByDepartureAirport(
			GetFlightByDepartureAirport parameters)
					throws InvalidArgument_Exception, Monitor_Exception
	{
		GetFlightByDepartureAirportResponse res = new GetFlightByDepartureAirportResponse();
		try {
			for (Map.Entry<String, Flight> entry:manager.getFlightsMap().entrySet())
				if ( entry.getValue().getDepartureAirport().equals(parameters.getDepartureAirport()) ) 
					// This is one of the requested flights
					res.getReturn().add(entry.getValue());
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}
		return res;
	}

	@Override
	public GetFlightByDestinationAirportResponse getFlightByDestinationAirport(
			GetFlightByDestinationAirport parameters)
					throws InvalidArgument_Exception, Monitor_Exception {
		GetFlightByDestinationAirportResponse res = new GetFlightByDestinationAirportResponse();
		try {
			for (Map.Entry<String, Flight> entry:manager.getFlightsMap().entrySet())
				if ( entry.getValue().getDestinationAirport().equals(parameters.getDestinationAirport()) ) 
					// This is one of the requested flights
					res.getReturn().add(entry.getValue());
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
			Monitor_Exception, UnknownFlightInstance_Exception
	{
		GetFlightInstanceResponse res = new GetFlightInstanceResponse();

		try {
			FlightInstanceKey key = new FlightInstanceKey(parameters.getFlightID(), parameters.getDepartureDate());

			if (manager.containsKeyFlightInstancesMap(key))
			{
				FlightInstance f = manager.getFlightInstance(key);
				//				logger.info("Flight instances returned!");
				res.setReturn(f);
			}else
			{
				UnknownFlightInstance unkFli = new UnknownFlightInstance();
				unkFli.setMessage("The specified flight instance is not in our database");
				throw new UnknownFlightInstance_Exception("The specified flight instance is not in our database", unkFli);
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
	public GetFlightInstancesResponse getFlightInstances(
			GetFlightInstances parameters) throws Monitor_Exception {
		GetFlightInstancesResponse res = new GetFlightInstancesResponse();
		res.getReturn().clear();


		try {
			for (Map.Entry<FlightInstanceKey, FlightInstance> entry:manager.getflightInstancesMap().entrySet())
				res.getReturn().add(entry.getValue());
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}


		return res;
	}

	@Override
	public GetFlightInstancesByFlightIDResponse getFlightInstancesByFlightID(
			GetFlightInstancesByFlightID parameters)
					throws InvalidArgument_Exception, Monitor_Exception,
					UnknownFlightInstance_Exception {
		GetFlightInstancesByFlightIDResponse res = new GetFlightInstancesByFlightIDResponse();

		try {
			for (Map.Entry<FlightInstanceKey, FlightInstance> entry:manager.getflightInstancesMap().entrySet())
				if (entry.getValue().getFlightID().equals(parameters.getFlightID()))
					res.getReturn().add(entry.getValue());
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}
		return res;
	}

	@Override
	public GetFlightInstanceByStatusResponse getFlightInstanceByStatus(
			GetFlightInstanceByStatus parameters)
					throws InvalidArgument_Exception, Monitor_Exception,
					UnknownFlightInstance_Exception {
		GetFlightInstanceByStatusResponse res = new GetFlightInstanceByStatusResponse();

		try {
			for (Map.Entry<FlightInstanceKey, FlightInstance> entry:manager.getflightInstancesMap().entrySet())
				if (entry.getValue().getStatus() == parameters.getStatus())
					res.getReturn().add(entry.getValue());
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}
		return res;
	}

	@Override
	public GetFlightInstanceByDepartureDateResponse getFlightInstanceByDepartureDate(
			GetFlightInstanceByDepartureDate parameters)
					throws InvalidArgument_Exception, Monitor_Exception,
					UnknownFlightInstance_Exception {
		GetFlightInstanceByDepartureDateResponse res = new GetFlightInstanceByDepartureDateResponse();

		try {
			for (Map.Entry<FlightInstanceKey, FlightInstance> entry:manager.getflightInstancesMap().entrySet())
				if (isEqual(entry.getValue().getDate(), parameters.getDepartureDate()))
					res.getReturn().add(entry.getValue());
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
			throws InvalidArgument_Exception, Monitor_Exception {


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
				InvalidArgument unkFli = new InvalidArgument();
				unkFli.setMessage("The requested flight number is not in our database");
				throw new InvalidArgument_Exception("The requested flight number is not in our database", unkFli);
			}
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}
	}

	@Override
	public GetPassengerByFlightIDResponse getPassengerByFlightID(
			GetPassengerByFlightID parameters)
					throws InvalidArgument_Exception, Monitor_Exception,
					UnknownFlightInstance_Exception {
		GetPassengerByFlightIDResponse res = new GetPassengerByFlightIDResponse();

		try {
			for(Map.Entry<FlightInstanceKey, CopyOnWriteArrayList<Passenger>> entry:manager.getFplist_map().entrySet())
			{
				if (entry.getValue().get(0).getFlightID().equals(parameters.getFlightID()))
				{
					res.getReturn().addAll(entry.getValue());
					break;
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
	public GetPassengerByPrefixResponse getPassengerByPrefix(
			GetPassengerByPrefix parameters) throws InvalidArgument_Exception,
			Monitor_Exception, UnknownFlightInstance_Exception {
		GetPassengerByPrefixResponse res = new GetPassengerByPrefixResponse();

		try {
			for(Map.Entry<FlightInstanceKey, CopyOnWriteArrayList<Passenger>> entry:manager.getFplist_map().entrySet())
			{
				if (entry.getValue().get(0).getName().startsWith(parameters.getPrefix()))
				{
					res.getReturn().addAll(entry.getValue());
					break;
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
	public GetPassengerByDepartureDateResponse getPassengerByDepartureDate(
			GetPassengerByDepartureDate parameters)
					throws InvalidArgument_Exception, Monitor_Exception,
					UnknownFlightInstance_Exception {
		GetPassengerByDepartureDateResponse res = new GetPassengerByDepartureDateResponse();

		try {
			for(Map.Entry<FlightInstanceKey, CopyOnWriteArrayList<Passenger>> entry:manager.getFplist_map().entrySet())
			{
				if (isEqual(entry.getValue().get(0).getDepartureDate(), parameters.getDepartureDate()))
				{
					res.getReturn().addAll(entry.getValue());
					break;
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

	private static boolean isEqual(XMLGregorianCalendar flightDate, XMLGregorianCalendar startDate)
	{
		if (flightDate.getYear() != startDate.getYear())
			return false;
		if (flightDate.getMonth() != startDate.getMonth())
			return false;
		if (flightDate.getDay() != startDate.getDay())
			return false;
		return true;
	}

}
