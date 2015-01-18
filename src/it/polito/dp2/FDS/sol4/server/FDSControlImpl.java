package it.polito.dp2.FDS.sol4.server;


import it.polito.dp2.FDS.sol4.server.jaxws.AssignSeat;
import it.polito.dp2.FDS.sol4.server.jaxws.AssignSeatResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.CancelFlightInstance;
import it.polito.dp2.FDS.sol4.server.jaxws.CancelFlightInstanceResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.CancelledFlight;
import it.polito.dp2.FDS.sol4.server.jaxws.CancelledFlight_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.ChangeBoardingGate;
import it.polito.dp2.FDS.sol4.server.jaxws.ChangeBoardingGateResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.ChangeDelay;
import it.polito.dp2.FDS.sol4.server.jaxws.ChangeDelayResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.Control;
import it.polito.dp2.FDS.sol4.server.jaxws.FlightInstance;
import it.polito.dp2.FDS.sol4.server.jaxws.FlightInstanceStatus;
import it.polito.dp2.FDS.sol4.server.jaxws.FullyBookedFlight_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.GetBoardedPassengers;
import it.polito.dp2.FDS.sol4.server.jaxws.GetBoardedPassengersResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.InvalidArgument;
import it.polito.dp2.FDS.sol4.server.jaxws.InvalidArgument_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.InvalidStatus;
import it.polito.dp2.FDS.sol4.server.jaxws.InvalidStatus_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.Monitor;
import it.polito.dp2.FDS.sol4.server.jaxws.Monitor_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.NotBoarding;
import it.polito.dp2.FDS.sol4.server.jaxws.NotBoarding_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.Passenger;
import it.polito.dp2.FDS.sol4.server.jaxws.PassengerAlreadyRegistered;
import it.polito.dp2.FDS.sol4.server.jaxws.PassengerAlreadyRegistered_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.RegisterPassenger;
import it.polito.dp2.FDS.sol4.server.jaxws.RegisterPassengerResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.SeatAlreadyAssigned_Exception;
import it.polito.dp2.FDS.sol4.server.jaxws.StartBoarding;
import it.polito.dp2.FDS.sol4.server.jaxws.StartBoardingResponse;
import it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlightInstance;
import it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlightInstance_Exception;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.logging.Logger;

import javax.jws.WebService;

@WebService(serviceName="FDSControl",
portName="FDSControlImplPort",
targetNamespace="http://pad.polito.it/FDSControl",
endpointInterface="it.polito.dp2.FDS.sol4.server.jaxws.Control")
//@HandlerChain(file = "META-INF/server/custom/handler-chain.xml")
public class FDSControlImpl implements Control {

	private static DataManager manager;

	private static final String FLIGHTID_PATTERN = "^[A-Z]{2}[0-9]{1,4}$"; //two char and three numbers
	private static final Integer MAX_ENTRIES_PER_PAGE = 10;

	private static Logger logger = Logger.getLogger(FDSControlImpl.class.getName());

	public FDSControlImpl()
	{
		logger.info("FDSControlImpl starting...");
		FDSControlImpl.manager = DataManager.getInstance();
	}



	@Override
	public StartBoardingResponse startBoarding(StartBoarding parameters)
			throws CancelledFlight_Exception, InvalidArgument_Exception,
			UnknownFlightInstance_Exception, InvalidStatus_Exception, Monitor_Exception {

		logger.info("startBoarding()");

		if (!parameters.getFlightID().matches(FLIGHTID_PATTERN))
		{
			logger.warning("The specified flight number is not valid");
			InvalidArgument invArg = new InvalidArgument();
			invArg.setMessage("The specified flight number is not valid");
			throw new InvalidArgument_Exception("Check th flight number input parameter", invArg);
		}

		if (parameters.getDepartureDate() == null)
		{
			logger.warning("The departure date is null");
			InvalidArgument invArg = new InvalidArgument();
			invArg.setMessage("The departure date is null");
			throw new InvalidArgument_Exception("The departure date is null: insert a departure date", invArg);
		}


		FlightInstanceKey key = new FlightInstanceKey(parameters.getFlightID(), parameters.getDepartureDate());

		try {
			if (manager.containsKeyFlightInstancesMap(key))
			{
				FlightInstance f;
				synchronized(f = manager.getFlightInstance(key))
				{
					if (f.getStatus() == FlightInstanceStatus.CHECKINGIN)
					{
						logger.info("Flight instance="+f.getFlightID()+" "+f.getDate().toString()+" CHECKING --> BOARDING");
						f.setStatus(FlightInstanceStatus.BOARDING);

						// Update the flightInstancesMap
						manager.putflightInstancesMap(key, f);
						// SUCCESS!
						return null;
					}else if (f.getStatus() == FlightInstanceStatus.CANCELLED)
					{
						logger.warning("The requested flight instance has been cancelled");
						CancelledFlight unkFli = new CancelledFlight();
						unkFli.setMessage("The requested flight instance has been cancelled");
						throw new CancelledFlight_Exception("The requested flight instance has been cancelled", unkFli);
					}else
					{
						logger.warning("The flight instance status for this flight instance is not valid");
						InvalidStatus invSta = new InvalidStatus();
						invSta.setMessage("The flight instance status for this flight instance is not valid");
						throw new InvalidStatus_Exception("The flight instance status for this flight instance is not valid", invSta);
					}
				}
			}else
			{
				logger.warning("The requested flight number is not in our database");
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
	public RegisterPassengerResponse registerPassenger(
			RegisterPassenger parameters) throws InvalidArgument_Exception,
			NotBoarding_Exception, PassengerAlreadyRegistered_Exception,
			UnknownFlightInstance_Exception, Monitor_Exception {

		logger.info("registering a new passenger:"+parameters.getPassengerName());

		// Check if the flight number is valid
		if (!parameters.getFlightID().matches(FLIGHTID_PATTERN))
		{
			logger.warning("The specified flight number is not valid");
			InvalidArgument invArg = new InvalidArgument();
			invArg.setMessage("The specified flight number is not valid");
			throw new InvalidArgument_Exception("The specified flight number is not valid", invArg);
		}

		if (parameters.getDepartureDate()==null)
		{
			logger.warning("The specified departure date is not valid");
			InvalidArgument invArg = new InvalidArgument();
			invArg.setMessage("The specified departure date is not valid");
			throw new InvalidArgument_Exception("The specified departure date is not valid", invArg);
		}

		FlightInstanceKey key = new FlightInstanceKey(parameters.getFlightID(), parameters.getDepartureDate());

		try {
			if (manager.containsKeyFlightInstancesMap(key))
			{
				FlightInstance flightInstance;

				synchronized(flightInstance = manager.getFlightInstance(key))
				{
					if (flightInstance.getStatus() == FlightInstanceStatus.CHECKINGIN)
					{
						logger.info("Flight instance="+flightInstance.getFlightID()+" "+flightInstance.getDate().toString()+" CHECKING --> BOARDING");
						flightInstance.setStatus(FlightInstanceStatus.BOARDING);

						// Update the flightInstancesMap with the updated flightInstance
						manager.putflightInstancesMap(key, flightInstance);
					}

					if (flightInstance.getStatus() != FlightInstanceStatus.BOARDING)
					{
						logger.warning("The flight status is not BOARDING");
						NotBoarding notBoa = new NotBoarding();
						notBoa.setMessage("The flight status is not BOARDING");
						throw new NotBoarding_Exception("The flight status is not BOARDING", notBoa);
					}

					CopyOnWriteArrayList<Passenger> passengerList;
					synchronized(passengerList= manager.getPassengerList(key))
					{
						for (int i=0; i<passengerList.size(); i++)
						{
							Passenger passenger = passengerList.get(i);

							if (passenger.getName().equals(parameters.getPassengerName()))
							{
								if (passenger.isBoarded())
								{
									logger.warning("This passenger has already been registered on this flight instance");
									PassengerAlreadyRegistered passReg = new PassengerAlreadyRegistered();
									passReg.setMessage("This passenger has already been registered on this flight instance");
									throw new PassengerAlreadyRegistered_Exception("Passenger is already on this flight",passReg);
								}else
								{
									logger.info(passenger.getName()+" BOARDED!");
									passenger.setBoarded(true);

									// Update the passenger list for this flight instance
									passengerList.remove(i); // passengerList is a copy, so there's no interleave among threads
									passengerList.add(passenger);

									// Update fp_list Map
									manager.putFplist_map(key, passengerList);

									// SUCCESS!
									return null;
								}
							}
						}

						logger.warning("The specified passenger's name is not valid");
						InvalidArgument invArg = new InvalidArgument();
						invArg.setMessage("The specified passenger's name is not valid");
						throw new InvalidArgument_Exception("The specified passenger's name is not valid", invArg);
					}
				}
			}else
			{
				logger.warning("The specified flight number does not exist");
				UnknownFlightInstance unkFli = new UnknownFlightInstance();
				unkFli.setMessage("The specified flight number does not exist");
				throw new UnknownFlightInstance_Exception("The specified flight number does not exist", unkFli);
			}
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}
	}

	@Override
	public GetBoardedPassengersResponse getBoardedPassengers (GetBoardedPassengers parameters)
			throws InvalidArgument_Exception, UnknownFlightInstance_Exception, Monitor_Exception {

		if (!parameters.getFlightID().matches(FLIGHTID_PATTERN))
		{
			InvalidArgument invArg = new InvalidArgument();
			invArg.setMessage("The specified flight number is not valid");
			throw new InvalidArgument_Exception("Check th flight number input parameter", invArg);
		}

		if (parameters.getDepartureDate()==null)
		{
			logger.warning("The specified departure date is not valid");
			InvalidArgument invArg = new InvalidArgument();
			invArg.setMessage("The specified departure date is not valid");
			throw new InvalidArgument_Exception("The specified departure date is not valid", invArg);
		}

		FlightInstanceKey key = new FlightInstanceKey(parameters.getFlightID(), parameters.getDepartureDate());

		try {
			if (manager.containsKeyFplist_map(key))
			{
				GetBoardedPassengersResponse res = new GetBoardedPassengersResponse();

				List<Passenger> passList;
				
				// Paging response parameters
				int boardedPassengers = 0;
				int pageNumber = parameters.getPageNumber();
				int entriesPerPage = 0;
				int pageBeginning = pageNumber * FDSControlImpl.MAX_ENTRIES_PER_PAGE;
				int passengers = 0;
				synchronized(passList = manager.getPassengerList(key))
				{
					for (Passenger p:passList)
					{
						passengers++;
						if (p.isBoarded())
						{
							boardedPassengers++;
							if (boardedPassengers > pageBeginning)
							{
								// Boarded passengers not returned yet
								entriesPerPage++;
								res.getReturn().add(p);
								if (entriesPerPage == MAX_ENTRIES_PER_PAGE)
								{
									// Max entries per page limit reached
									res.setPageNumber(pageNumber);
									if (passengers == passList.size())
									{
										res.setLastPage(true);
										logger.info("Boarded passengers last page returned!");
									}else
									{
										logger.info("Boarded passengers page number "+pageNumber+" returned!");
										res.setLastPage(false);
									}
									return res;
								}
							}
						}
					}
				}
				logger.info("Boarded passengers last page returned!");
				res.setLastPage(true);
				res.setPageNumber(pageNumber);
				return res;
			}else
			{
				logger.warning("There are no flight instances for the specified departure date");
				UnknownFlightInstance unkFlight = new UnknownFlightInstance();
				unkFlight.setMessage("There are no flight instances for the specified departure date");
				throw new UnknownFlightInstance_Exception("There are no flight instances for the specified departure date",unkFlight);
			}
		} catch (DataManagerException e) {
			e.printStackTrace();
			Monitor mon = new Monitor();
			mon.setMessage("Error during lazy initialization");
			throw new Monitor_Exception("Error during lazy initialization", mon);
		}
	}

	@Override
	public CancelFlightInstanceResponse cancelFlightInstance(
			CancelFlightInstance parameters) throws InvalidArgument_Exception,
			UnknownFlightInstance_Exception, Monitor_Exception {
		return null;
	}

	@Override
	public ChangeBoardingGateResponse changeBoardingGate(
			ChangeBoardingGate parameters) throws InvalidArgument_Exception,
			UnknownFlightInstance_Exception, Monitor_Exception {
		return null;
	}

	@Override
	public ChangeDelayResponse changeDelay(ChangeDelay parameters)
			throws InvalidArgument_Exception, UnknownFlightInstance_Exception, Monitor_Exception {
		return null;
	}


	@Override
	public AssignSeatResponse assignSeat(AssignSeat parameters)
			throws FullyBookedFlight_Exception, Monitor_Exception,
			SeatAlreadyAssigned_Exception, UnknownFlightInstance_Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
