
package it.polito.dp2.FDS.sol4.server.jaxws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.polito.dp2.FDS.sol4.server.jaxws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetFlight_QNAME = new QName("http://pad.polito.it/FDS", "getFlight");
    private final static QName _CancelledFlight_QNAME = new QName("http://pad.polito.it/FDS", "CancelledFlight");
    private final static QName _GetFlightInstanceResponse_QNAME = new QName("http://pad.polito.it/FDS", "getFlightInstanceResponse");
    private final static QName _InvalidStatus_QNAME = new QName("http://pad.polito.it/FDS", "InvalidStatus");
    private final static QName _ChangeBoardingGate_QNAME = new QName("http://pad.polito.it/FDS", "changeBoardingGate");
    private final static QName _CancelFlightInstanceResponse_QNAME = new QName("http://pad.polito.it/FDS", "cancelFlightInstanceResponse");
    private final static QName _InvalidArgument_QNAME = new QName("http://pad.polito.it/FDS", "InvalidArgument");
    private final static QName _PassengerAlreadyRegistered_QNAME = new QName("http://pad.polito.it/FDS", "PassengerAlreadyRegistered");
    private final static QName _RegisterPassenger_QNAME = new QName("http://pad.polito.it/FDS", "registerPassenger");
    private final static QName _GetPassengersResponse_QNAME = new QName("http://pad.polito.it/FDS", "getPassengersResponse");
    private final static QName _GetFlightInstances_QNAME = new QName("http://pad.polito.it/FDS", "getFlightInstances");
    private final static QName _CancelFlightInstance_QNAME = new QName("http://pad.polito.it/FDS", "cancelFlightInstance");
    private final static QName _GetAircrafts_QNAME = new QName("http://pad.polito.it/FDS", "getAircrafts");
    private final static QName _AssignSeat_QNAME = new QName("http://pad.polito.it/FDS", "assignSeat");
    private final static QName _ChangeDelay_QNAME = new QName("http://pad.polito.it/FDS", "changeDelay");
    private final static QName _FullyBookedFlight_QNAME = new QName("http://pad.polito.it/FDS", "FullyBookedFlight");
    private final static QName _GetFlightResponse_QNAME = new QName("http://pad.polito.it/FDS", "getFlightResponse");
    private final static QName _ChangeDelayResponse_QNAME = new QName("http://pad.polito.it/FDS", "changeDelayResponse");
    private final static QName _NotBoarding_QNAME = new QName("http://pad.polito.it/FDS", "NotBoarding");
    private final static QName _GetFlights_QNAME = new QName("http://pad.polito.it/FDS", "getFlights");
    private final static QName _GetFlightInstancesResponse_QNAME = new QName("http://pad.polito.it/FDS", "getFlightInstancesResponse");
    private final static QName _GetAircraftsResponse_QNAME = new QName("http://pad.polito.it/FDS", "getAircraftsResponse");
    private final static QName _UnknownFlight_QNAME = new QName("http://pad.polito.it/FDS", "UnknownFlight");
    private final static QName _StartBoardingResponse_QNAME = new QName("http://pad.polito.it/FDS", "startBoardingResponse");
    private final static QName _GetBoardedPassengersResponse_QNAME = new QName("http://pad.polito.it/FDS", "getBoardedPassengersResponse");
    private final static QName _GetBoardedPassengers_QNAME = new QName("http://pad.polito.it/FDS", "getBoardedPassengers");
    private final static QName _Monitor_QNAME = new QName("http://pad.polito.it/FDS", "Monitor");
    private final static QName _StartBoarding_QNAME = new QName("http://pad.polito.it/FDS", "startBoarding");
    private final static QName _UnknownFlightInstance_QNAME = new QName("http://pad.polito.it/FDS", "UnknownFlightInstance");
    private final static QName _GetFlightInstance_QNAME = new QName("http://pad.polito.it/FDS", "getFlightInstance");
    private final static QName _GetPassengers_QNAME = new QName("http://pad.polito.it/FDS", "getPassengers");
    private final static QName _AssignSeatResponse_QNAME = new QName("http://pad.polito.it/FDS", "assignSeatResponse");
    private final static QName _SeatAlreadyAssigned_QNAME = new QName("http://pad.polito.it/FDS", "SeatAlreadyAssigned");
    private final static QName _GetFlightsResponse_QNAME = new QName("http://pad.polito.it/FDS", "getFlightsResponse");
    private final static QName _ChangeBoardingGateResponse_QNAME = new QName("http://pad.polito.it/FDS", "changeBoardingGateResponse");
    private final static QName _RegisterPassengerResponse_QNAME = new QName("http://pad.polito.it/FDS", "registerPassengerResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polito.dp2.FDS.sol4.server.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SeatAlreadyAssigned }
     * 
     */
    public SeatAlreadyAssigned createSeatAlreadyAssigned() {
        return new SeatAlreadyAssigned();
    }

    /**
     * Create an instance of {@link GetPassengers }
     * 
     */
    public GetPassengers createGetPassengers() {
        return new GetPassengers();
    }

    /**
     * Create an instance of {@link AssignSeatResponse }
     * 
     */
    public AssignSeatResponse createAssignSeatResponse() {
        return new AssignSeatResponse();
    }

    /**
     * Create an instance of {@link RegisterPassengerResponse }
     * 
     */
    public RegisterPassengerResponse createRegisterPassengerResponse() {
        return new RegisterPassengerResponse();
    }

    /**
     * Create an instance of {@link ChangeBoardingGateResponse }
     * 
     */
    public ChangeBoardingGateResponse createChangeBoardingGateResponse() {
        return new ChangeBoardingGateResponse();
    }

    /**
     * Create an instance of {@link GetFlightsResponse }
     * 
     */
    public GetFlightsResponse createGetFlightsResponse() {
        return new GetFlightsResponse();
    }

    /**
     * Create an instance of {@link StartBoarding }
     * 
     */
    public StartBoarding createStartBoarding() {
        return new StartBoarding();
    }

    /**
     * Create an instance of {@link UnknownFlightInstance }
     * 
     */
    public UnknownFlightInstance createUnknownFlightInstance() {
        return new UnknownFlightInstance();
    }

    /**
     * Create an instance of {@link GetFlightInstance }
     * 
     */
    public GetFlightInstance createGetFlightInstance() {
        return new GetFlightInstance();
    }

    /**
     * Create an instance of {@link StartBoardingResponse }
     * 
     */
    public StartBoardingResponse createStartBoardingResponse() {
        return new StartBoardingResponse();
    }

    /**
     * Create an instance of {@link UnknownFlight }
     * 
     */
    public UnknownFlight createUnknownFlight() {
        return new UnknownFlight();
    }

    /**
     * Create an instance of {@link GetBoardedPassengersResponse }
     * 
     */
    public GetBoardedPassengersResponse createGetBoardedPassengersResponse() {
        return new GetBoardedPassengersResponse();
    }

    /**
     * Create an instance of {@link GetBoardedPassengers }
     * 
     */
    public GetBoardedPassengers createGetBoardedPassengers() {
        return new GetBoardedPassengers();
    }

    /**
     * Create an instance of {@link Monitor }
     * 
     */
    public Monitor createMonitor() {
        return new Monitor();
    }

    /**
     * Create an instance of {@link GetFlights }
     * 
     */
    public GetFlights createGetFlights() {
        return new GetFlights();
    }

    /**
     * Create an instance of {@link ChangeDelayResponse }
     * 
     */
    public ChangeDelayResponse createChangeDelayResponse() {
        return new ChangeDelayResponse();
    }

    /**
     * Create an instance of {@link NotBoarding }
     * 
     */
    public NotBoarding createNotBoarding() {
        return new NotBoarding();
    }

    /**
     * Create an instance of {@link GetAircraftsResponse }
     * 
     */
    public GetAircraftsResponse createGetAircraftsResponse() {
        return new GetAircraftsResponse();
    }

    /**
     * Create an instance of {@link GetFlightInstancesResponse }
     * 
     */
    public GetFlightInstancesResponse createGetFlightInstancesResponse() {
        return new GetFlightInstancesResponse();
    }

    /**
     * Create an instance of {@link CancelFlightInstance }
     * 
     */
    public CancelFlightInstance createCancelFlightInstance() {
        return new CancelFlightInstance();
    }

    /**
     * Create an instance of {@link GetAircrafts }
     * 
     */
    public GetAircrafts createGetAircrafts() {
        return new GetAircrafts();
    }

    /**
     * Create an instance of {@link FullyBookedFlight }
     * 
     */
    public FullyBookedFlight createFullyBookedFlight() {
        return new FullyBookedFlight();
    }

    /**
     * Create an instance of {@link GetFlightResponse }
     * 
     */
    public GetFlightResponse createGetFlightResponse() {
        return new GetFlightResponse();
    }

    /**
     * Create an instance of {@link ChangeDelay }
     * 
     */
    public ChangeDelay createChangeDelay() {
        return new ChangeDelay();
    }

    /**
     * Create an instance of {@link AssignSeat }
     * 
     */
    public AssignSeat createAssignSeat() {
        return new AssignSeat();
    }

    /**
     * Create an instance of {@link RegisterPassenger }
     * 
     */
    public RegisterPassenger createRegisterPassenger() {
        return new RegisterPassenger();
    }

    /**
     * Create an instance of {@link GetFlightInstances }
     * 
     */
    public GetFlightInstances createGetFlightInstances() {
        return new GetFlightInstances();
    }

    /**
     * Create an instance of {@link GetPassengersResponse }
     * 
     */
    public GetPassengersResponse createGetPassengersResponse() {
        return new GetPassengersResponse();
    }

    /**
     * Create an instance of {@link ChangeBoardingGate }
     * 
     */
    public ChangeBoardingGate createChangeBoardingGate() {
        return new ChangeBoardingGate();
    }

    /**
     * Create an instance of {@link CancelFlightInstanceResponse }
     * 
     */
    public CancelFlightInstanceResponse createCancelFlightInstanceResponse() {
        return new CancelFlightInstanceResponse();
    }

    /**
     * Create an instance of {@link InvalidStatus }
     * 
     */
    public InvalidStatus createInvalidStatus() {
        return new InvalidStatus();
    }

    /**
     * Create an instance of {@link PassengerAlreadyRegistered }
     * 
     */
    public PassengerAlreadyRegistered createPassengerAlreadyRegistered() {
        return new PassengerAlreadyRegistered();
    }

    /**
     * Create an instance of {@link InvalidArgument }
     * 
     */
    public InvalidArgument createInvalidArgument() {
        return new InvalidArgument();
    }

    /**
     * Create an instance of {@link GetFlight }
     * 
     */
    public GetFlight createGetFlight() {
        return new GetFlight();
    }

    /**
     * Create an instance of {@link CancelledFlight }
     * 
     */
    public CancelledFlight createCancelledFlight() {
        return new CancelledFlight();
    }

    /**
     * Create an instance of {@link GetFlightInstanceResponse }
     * 
     */
    public GetFlightInstanceResponse createGetFlightInstanceResponse() {
        return new GetFlightInstanceResponse();
    }

    /**
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link AircraftType }
     * 
     */
    public AircraftType createAircraftType() {
        return new AircraftType();
    }

    /**
     * Create an instance of {@link BoardingInfo }
     * 
     */
    public BoardingInfo createBoardingInfo() {
        return new BoardingInfo();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link FlightInstance }
     * 
     */
    public FlightInstance createFlightInstance() {
        return new FlightInstance();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getFlight")
    public JAXBElement<GetFlight> createGetFlight(GetFlight value) {
        return new JAXBElement<GetFlight>(_GetFlight_QNAME, GetFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelledFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "CancelledFlight")
    public JAXBElement<CancelledFlight> createCancelledFlight(CancelledFlight value) {
        return new JAXBElement<CancelledFlight>(_CancelledFlight_QNAME, CancelledFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightInstanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getFlightInstanceResponse")
    public JAXBElement<GetFlightInstanceResponse> createGetFlightInstanceResponse(GetFlightInstanceResponse value) {
        return new JAXBElement<GetFlightInstanceResponse>(_GetFlightInstanceResponse_QNAME, GetFlightInstanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "InvalidStatus")
    public JAXBElement<InvalidStatus> createInvalidStatus(InvalidStatus value) {
        return new JAXBElement<InvalidStatus>(_InvalidStatus_QNAME, InvalidStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBoardingGate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "changeBoardingGate")
    public JAXBElement<ChangeBoardingGate> createChangeBoardingGate(ChangeBoardingGate value) {
        return new JAXBElement<ChangeBoardingGate>(_ChangeBoardingGate_QNAME, ChangeBoardingGate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelFlightInstanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "cancelFlightInstanceResponse")
    public JAXBElement<CancelFlightInstanceResponse> createCancelFlightInstanceResponse(CancelFlightInstanceResponse value) {
        return new JAXBElement<CancelFlightInstanceResponse>(_CancelFlightInstanceResponse_QNAME, CancelFlightInstanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidArgument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "InvalidArgument")
    public JAXBElement<InvalidArgument> createInvalidArgument(InvalidArgument value) {
        return new JAXBElement<InvalidArgument>(_InvalidArgument_QNAME, InvalidArgument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PassengerAlreadyRegistered }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "PassengerAlreadyRegistered")
    public JAXBElement<PassengerAlreadyRegistered> createPassengerAlreadyRegistered(PassengerAlreadyRegistered value) {
        return new JAXBElement<PassengerAlreadyRegistered>(_PassengerAlreadyRegistered_QNAME, PassengerAlreadyRegistered.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterPassenger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "registerPassenger")
    public JAXBElement<RegisterPassenger> createRegisterPassenger(RegisterPassenger value) {
        return new JAXBElement<RegisterPassenger>(_RegisterPassenger_QNAME, RegisterPassenger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getPassengersResponse")
    public JAXBElement<GetPassengersResponse> createGetPassengersResponse(GetPassengersResponse value) {
        return new JAXBElement<GetPassengersResponse>(_GetPassengersResponse_QNAME, GetPassengersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getFlightInstances")
    public JAXBElement<GetFlightInstances> createGetFlightInstances(GetFlightInstances value) {
        return new JAXBElement<GetFlightInstances>(_GetFlightInstances_QNAME, GetFlightInstances.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CancelFlightInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "cancelFlightInstance")
    public JAXBElement<CancelFlightInstance> createCancelFlightInstance(CancelFlightInstance value) {
        return new JAXBElement<CancelFlightInstance>(_CancelFlightInstance_QNAME, CancelFlightInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAircrafts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getAircrafts")
    public JAXBElement<GetAircrafts> createGetAircrafts(GetAircrafts value) {
        return new JAXBElement<GetAircrafts>(_GetAircrafts_QNAME, GetAircrafts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignSeat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "assignSeat")
    public JAXBElement<AssignSeat> createAssignSeat(AssignSeat value) {
        return new JAXBElement<AssignSeat>(_AssignSeat_QNAME, AssignSeat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDelay }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "changeDelay")
    public JAXBElement<ChangeDelay> createChangeDelay(ChangeDelay value) {
        return new JAXBElement<ChangeDelay>(_ChangeDelay_QNAME, ChangeDelay.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FullyBookedFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "FullyBookedFlight")
    public JAXBElement<FullyBookedFlight> createFullyBookedFlight(FullyBookedFlight value) {
        return new JAXBElement<FullyBookedFlight>(_FullyBookedFlight_QNAME, FullyBookedFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getFlightResponse")
    public JAXBElement<GetFlightResponse> createGetFlightResponse(GetFlightResponse value) {
        return new JAXBElement<GetFlightResponse>(_GetFlightResponse_QNAME, GetFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeDelayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "changeDelayResponse")
    public JAXBElement<ChangeDelayResponse> createChangeDelayResponse(ChangeDelayResponse value) {
        return new JAXBElement<ChangeDelayResponse>(_ChangeDelayResponse_QNAME, ChangeDelayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotBoarding }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "NotBoarding")
    public JAXBElement<NotBoarding> createNotBoarding(NotBoarding value) {
        return new JAXBElement<NotBoarding>(_NotBoarding_QNAME, NotBoarding.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getFlights")
    public JAXBElement<GetFlights> createGetFlights(GetFlights value) {
        return new JAXBElement<GetFlights>(_GetFlights_QNAME, GetFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightInstancesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getFlightInstancesResponse")
    public JAXBElement<GetFlightInstancesResponse> createGetFlightInstancesResponse(GetFlightInstancesResponse value) {
        return new JAXBElement<GetFlightInstancesResponse>(_GetFlightInstancesResponse_QNAME, GetFlightInstancesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAircraftsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getAircraftsResponse")
    public JAXBElement<GetAircraftsResponse> createGetAircraftsResponse(GetAircraftsResponse value) {
        return new JAXBElement<GetAircraftsResponse>(_GetAircraftsResponse_QNAME, GetAircraftsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "UnknownFlight")
    public JAXBElement<UnknownFlight> createUnknownFlight(UnknownFlight value) {
        return new JAXBElement<UnknownFlight>(_UnknownFlight_QNAME, UnknownFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartBoardingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "startBoardingResponse")
    public JAXBElement<StartBoardingResponse> createStartBoardingResponse(StartBoardingResponse value) {
        return new JAXBElement<StartBoardingResponse>(_StartBoardingResponse_QNAME, StartBoardingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardedPassengersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getBoardedPassengersResponse")
    public JAXBElement<GetBoardedPassengersResponse> createGetBoardedPassengersResponse(GetBoardedPassengersResponse value) {
        return new JAXBElement<GetBoardedPassengersResponse>(_GetBoardedPassengersResponse_QNAME, GetBoardedPassengersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBoardedPassengers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getBoardedPassengers")
    public JAXBElement<GetBoardedPassengers> createGetBoardedPassengers(GetBoardedPassengers value) {
        return new JAXBElement<GetBoardedPassengers>(_GetBoardedPassengers_QNAME, GetBoardedPassengers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Monitor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "Monitor")
    public JAXBElement<Monitor> createMonitor(Monitor value) {
        return new JAXBElement<Monitor>(_Monitor_QNAME, Monitor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartBoarding }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "startBoarding")
    public JAXBElement<StartBoarding> createStartBoarding(StartBoarding value) {
        return new JAXBElement<StartBoarding>(_StartBoarding_QNAME, StartBoarding.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownFlightInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "UnknownFlightInstance")
    public JAXBElement<UnknownFlightInstance> createUnknownFlightInstance(UnknownFlightInstance value) {
        return new JAXBElement<UnknownFlightInstance>(_UnknownFlightInstance_QNAME, UnknownFlightInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getFlightInstance")
    public JAXBElement<GetFlightInstance> createGetFlightInstance(GetFlightInstance value) {
        return new JAXBElement<GetFlightInstance>(_GetFlightInstance_QNAME, GetFlightInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getPassengers")
    public JAXBElement<GetPassengers> createGetPassengers(GetPassengers value) {
        return new JAXBElement<GetPassengers>(_GetPassengers_QNAME, GetPassengers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssignSeatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "assignSeatResponse")
    public JAXBElement<AssignSeatResponse> createAssignSeatResponse(AssignSeatResponse value) {
        return new JAXBElement<AssignSeatResponse>(_AssignSeatResponse_QNAME, AssignSeatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SeatAlreadyAssigned }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "SeatAlreadyAssigned")
    public JAXBElement<SeatAlreadyAssigned> createSeatAlreadyAssigned(SeatAlreadyAssigned value) {
        return new JAXBElement<SeatAlreadyAssigned>(_SeatAlreadyAssigned_QNAME, SeatAlreadyAssigned.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "getFlightsResponse")
    public JAXBElement<GetFlightsResponse> createGetFlightsResponse(GetFlightsResponse value) {
        return new JAXBElement<GetFlightsResponse>(_GetFlightsResponse_QNAME, GetFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ChangeBoardingGateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "changeBoardingGateResponse")
    public JAXBElement<ChangeBoardingGateResponse> createChangeBoardingGateResponse(ChangeBoardingGateResponse value) {
        return new JAXBElement<ChangeBoardingGateResponse>(_ChangeBoardingGateResponse_QNAME, ChangeBoardingGateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterPassengerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDS", name = "registerPassengerResponse")
    public JAXBElement<RegisterPassengerResponse> createRegisterPassengerResponse(RegisterPassengerResponse value) {
        return new JAXBElement<RegisterPassengerResponse>(_RegisterPassengerResponse_QNAME, RegisterPassengerResponse.class, null, value);
    }

}
