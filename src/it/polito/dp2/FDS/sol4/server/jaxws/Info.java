
package it.polito.dp2.FDS.sol4.server.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Info", targetNamespace = "http://pad.polito.it/FDSInfo")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Info {


    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.GetFlightsResponse
     * @throws InvalidArgument_Exception
     * @throws Monitor_Exception
     */
    @WebMethod
    @WebResult(name = "getFlightsResponse", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSInfo/Info/getFlightsRequest", output = "http://pad.polito.it/FDSInfo/Info/getFlightsResponse", fault = {
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlights/Fault/InvalidArgument"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlights/Fault/Monitor")
    })
    public GetFlightsResponse getFlights(
        @WebParam(name = "getFlights", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
        GetFlights parameters)
        throws InvalidArgument_Exception, Monitor_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.GetFlightResponse
     * @throws InvalidArgument_Exception
     * @throws Monitor_Exception
     * @throws UnknownFlight_Exception
     */
    @WebMethod
    @WebResult(name = "getFlightResponse", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSInfo/Info/getFlightRequest", output = "http://pad.polito.it/FDSInfo/Info/getFlightResponse", fault = {
        @FaultAction(className = UnknownFlight_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlight/Fault/UnknownFlight"),
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlight/Fault/InvalidArgument"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlight/Fault/Monitor")
    })
    public GetFlightResponse getFlight(
        @WebParam(name = "getFlight", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
        GetFlight parameters)
        throws InvalidArgument_Exception, Monitor_Exception, UnknownFlight_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstanceResponse
     * @throws InvalidArgument_Exception
     * @throws Monitor_Exception
     * @throws UnknownFlightInstance_Exception
     */
    @WebMethod
    @WebResult(name = "getFlightInstanceResponse", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSInfo/Info/getFlightInstanceRequest", output = "http://pad.polito.it/FDSInfo/Info/getFlightInstanceResponse", fault = {
        @FaultAction(className = UnknownFlightInstance_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlightInstance/Fault/UnknownFlightInstance"),
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlightInstance/Fault/InvalidArgument"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlightInstance/Fault/Monitor")
    })
    public GetFlightInstanceResponse getFlightInstance(
        @WebParam(name = "getFlightInstance", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
        GetFlightInstance parameters)
        throws InvalidArgument_Exception, Monitor_Exception, UnknownFlightInstance_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.GetFlightInstancesResponse
     * @throws InvalidArgument_Exception
     * @throws Monitor_Exception
     * @throws UnknownFlight_Exception
     */
    @WebMethod
    @WebResult(name = "getFlightInstancesResponse", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSInfo/Info/getFlightInstancesRequest", output = "http://pad.polito.it/FDSInfo/Info/getFlightInstancesResponse", fault = {
        @FaultAction(className = UnknownFlight_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlightInstances/Fault/UnknownFlight"),
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlightInstances/Fault/InvalidArgument"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getFlightInstances/Fault/Monitor")
    })
    public GetFlightInstancesResponse getFlightInstances(
        @WebParam(name = "getFlightInstances", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
        GetFlightInstances parameters)
        throws InvalidArgument_Exception, Monitor_Exception, UnknownFlight_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.GetPassengersResponse
     * @throws InvalidArgument_Exception
     * @throws Monitor_Exception
     * @throws UnknownFlightInstance_Exception
     */
    @WebMethod
    @WebResult(name = "getPassengersResponse", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSInfo/Info/getPassengersRequest", output = "http://pad.polito.it/FDSInfo/Info/getPassengersResponse", fault = {
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getPassengers/Fault/InvalidArgument"),
        @FaultAction(className = UnknownFlightInstance_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getPassengers/Fault/UnknownFlightInstance"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getPassengers/Fault/Monitor")
    })
    public GetPassengersResponse getPassengers(
        @WebParam(name = "getPassengers", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
        GetPassengers parameters)
        throws InvalidArgument_Exception, Monitor_Exception, UnknownFlightInstance_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.GetAircraftsResponse
     * @throws Monitor_Exception
     */
    @WebMethod
    @WebResult(name = "getAircraftsResponse", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSInfo/Info/getAircraftsRequest", output = "http://pad.polito.it/FDSInfo/Info/getAircraftsResponse", fault = {
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSInfo/Info/getAircrafts/Fault/Monitor")
    })
    public GetAircraftsResponse getAircrafts(
        @WebParam(name = "getAircrafts", targetNamespace = "http://pad.polito.it/FDSInfo", partName = "parameters")
        GetAircrafts parameters)
        throws Monitor_Exception
    ;

}