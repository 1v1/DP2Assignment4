
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

    private final static QName _InvalidArgument_QNAME = new QName("http://pad.polito.it/FDSInfo", "InvalidArgument");
    private final static QName _UnknownFlight_QNAME = new QName("http://pad.polito.it/FDSInfo", "UnknownFlight");
    private final static QName _Monitor_QNAME = new QName("http://pad.polito.it/FDSInfo", "Monitor");
    private final static QName _GetFlightInstancesResponse_QNAME = new QName("http://pad.polito.it/FDSInfo", "getFlightInstancesResponse");
    private final static QName _GetFlightInstanceResponse_QNAME = new QName("http://pad.polito.it/FDSInfo", "getFlightInstanceResponse");
    private final static QName _GetAircraftsResponse_QNAME = new QName("http://pad.polito.it/FDSInfo", "getAircraftsResponse");
    private final static QName _GetFlight_QNAME = new QName("http://pad.polito.it/FDSInfo", "getFlight");
    private final static QName _GetFlights_QNAME = new QName("http://pad.polito.it/FDSInfo", "getFlights");
    private final static QName _GetFlightsResponse_QNAME = new QName("http://pad.polito.it/FDSInfo", "getFlightsResponse");
    private final static QName _GetFlightResponse_QNAME = new QName("http://pad.polito.it/FDSInfo", "getFlightResponse");
    private final static QName _GetPassengers_QNAME = new QName("http://pad.polito.it/FDSInfo", "getPassengers");
    private final static QName _GetAircrafts_QNAME = new QName("http://pad.polito.it/FDSInfo", "getAircrafts");
    private final static QName _UnknownFlightInstance_QNAME = new QName("http://pad.polito.it/FDSInfo", "UnknownFlightInstance");
    private final static QName _GetFlightInstance_QNAME = new QName("http://pad.polito.it/FDSInfo", "getFlightInstance");
    private final static QName _GetPassengersResponse_QNAME = new QName("http://pad.polito.it/FDSInfo", "getPassengersResponse");
    private final static QName _GetFlightInstances_QNAME = new QName("http://pad.polito.it/FDSInfo", "getFlightInstances");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.polito.dp2.FDS.sol4.server.jaxws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAircrafts }
     * 
     */
    public GetAircrafts createGetAircrafts() {
        return new GetAircrafts();
    }

    /**
     * Create an instance of {@link GetPassengers }
     * 
     */
    public GetPassengers createGetPassengers() {
        return new GetPassengers();
    }

    /**
     * Create an instance of {@link GetFlightResponse }
     * 
     */
    public GetFlightResponse createGetFlightResponse() {
        return new GetFlightResponse();
    }

    /**
     * Create an instance of {@link GetFlightsResponse }
     * 
     */
    public GetFlightsResponse createGetFlightsResponse() {
        return new GetFlightsResponse();
    }

    /**
     * Create an instance of {@link GetPassengersResponse }
     * 
     */
    public GetPassengersResponse createGetPassengersResponse() {
        return new GetPassengersResponse();
    }

    /**
     * Create an instance of {@link GetFlightInstances }
     * 
     */
    public GetFlightInstances createGetFlightInstances() {
        return new GetFlightInstances();
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
     * Create an instance of {@link UnknownFlight }
     * 
     */
    public UnknownFlight createUnknownFlight() {
        return new UnknownFlight();
    }

    /**
     * Create an instance of {@link Monitor }
     * 
     */
    public Monitor createMonitor() {
        return new Monitor();
    }

    /**
     * Create an instance of {@link InvalidArgument }
     * 
     */
    public InvalidArgument createInvalidArgument() {
        return new InvalidArgument();
    }

    /**
     * Create an instance of {@link GetFlights }
     * 
     */
    public GetFlights createGetFlights() {
        return new GetFlights();
    }

    /**
     * Create an instance of {@link GetFlight }
     * 
     */
    public GetFlight createGetFlight() {
        return new GetFlight();
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
     * Create an instance of {@link GetFlightInstanceResponse }
     * 
     */
    public GetFlightInstanceResponse createGetFlightInstanceResponse() {
        return new GetFlightInstanceResponse();
    }

    /**
     * Create an instance of {@link AircraftType }
     * 
     */
    public AircraftType createAircraftType() {
        return new AircraftType();
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
     * Create an instance of {@link Time }
     * 
     */
    public Time createTime() {
        return new Time();
    }

    /**
     * Create an instance of {@link FlightInstance }
     * 
     */
    public FlightInstance createFlightInstance() {
        return new FlightInstance();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvalidArgument }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "InvalidArgument")
    public JAXBElement<InvalidArgument> createInvalidArgument(InvalidArgument value) {
        return new JAXBElement<InvalidArgument>(_InvalidArgument_QNAME, InvalidArgument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "UnknownFlight")
    public JAXBElement<UnknownFlight> createUnknownFlight(UnknownFlight value) {
        return new JAXBElement<UnknownFlight>(_UnknownFlight_QNAME, UnknownFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Monitor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "Monitor")
    public JAXBElement<Monitor> createMonitor(Monitor value) {
        return new JAXBElement<Monitor>(_Monitor_QNAME, Monitor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightInstancesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getFlightInstancesResponse")
    public JAXBElement<GetFlightInstancesResponse> createGetFlightInstancesResponse(GetFlightInstancesResponse value) {
        return new JAXBElement<GetFlightInstancesResponse>(_GetFlightInstancesResponse_QNAME, GetFlightInstancesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightInstanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getFlightInstanceResponse")
    public JAXBElement<GetFlightInstanceResponse> createGetFlightInstanceResponse(GetFlightInstanceResponse value) {
        return new JAXBElement<GetFlightInstanceResponse>(_GetFlightInstanceResponse_QNAME, GetFlightInstanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAircraftsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getAircraftsResponse")
    public JAXBElement<GetAircraftsResponse> createGetAircraftsResponse(GetAircraftsResponse value) {
        return new JAXBElement<GetAircraftsResponse>(_GetAircraftsResponse_QNAME, GetAircraftsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getFlight")
    public JAXBElement<GetFlight> createGetFlight(GetFlight value) {
        return new JAXBElement<GetFlight>(_GetFlight_QNAME, GetFlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlights }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getFlights")
    public JAXBElement<GetFlights> createGetFlights(GetFlights value) {
        return new JAXBElement<GetFlights>(_GetFlights_QNAME, GetFlights.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getFlightsResponse")
    public JAXBElement<GetFlightsResponse> createGetFlightsResponse(GetFlightsResponse value) {
        return new JAXBElement<GetFlightsResponse>(_GetFlightsResponse_QNAME, GetFlightsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getFlightResponse")
    public JAXBElement<GetFlightResponse> createGetFlightResponse(GetFlightResponse value) {
        return new JAXBElement<GetFlightResponse>(_GetFlightResponse_QNAME, GetFlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getPassengers")
    public JAXBElement<GetPassengers> createGetPassengers(GetPassengers value) {
        return new JAXBElement<GetPassengers>(_GetPassengers_QNAME, GetPassengers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAircrafts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getAircrafts")
    public JAXBElement<GetAircrafts> createGetAircrafts(GetAircrafts value) {
        return new JAXBElement<GetAircrafts>(_GetAircrafts_QNAME, GetAircrafts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnknownFlightInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "UnknownFlightInstance")
    public JAXBElement<UnknownFlightInstance> createUnknownFlightInstance(UnknownFlightInstance value) {
        return new JAXBElement<UnknownFlightInstance>(_UnknownFlightInstance_QNAME, UnknownFlightInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightInstance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getFlightInstance")
    public JAXBElement<GetFlightInstance> createGetFlightInstance(GetFlightInstance value) {
        return new JAXBElement<GetFlightInstance>(_GetFlightInstance_QNAME, GetFlightInstance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPassengersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getPassengersResponse")
    public JAXBElement<GetPassengersResponse> createGetPassengersResponse(GetPassengersResponse value) {
        return new JAXBElement<GetPassengersResponse>(_GetPassengersResponse_QNAME, GetPassengersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetFlightInstances }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://pad.polito.it/FDSInfo", name = "getFlightInstances")
    public JAXBElement<GetFlightInstances> createGetFlightInstances(GetFlightInstances value) {
        return new JAXBElement<GetFlightInstances>(_GetFlightInstances_QNAME, GetFlightInstances.class, null, value);
    }

}
