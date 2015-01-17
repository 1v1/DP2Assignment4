
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
@WebService(name = "Control", targetNamespace = "http://pad.polito.it/FDSControl")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Control {


    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.AssignSeatResponse
     * @throws Monitor_Exception
     * @throws UnknownFlightInstance_Exception
     * @throws FullyBookedFlight_Exception
     * @throws SeatAlreadyAssigned_Exception
     */
    @WebMethod
    @WebResult(name = "assignSeatResponse", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/assignSeatRequest", output = "http://pad.polito.it/FDSControl/Control/assignSeatResponse", fault = {
        @FaultAction(className = UnknownFlightInstance_Exception.class, value = "http://pad.polito.it/FDSControl/Control/assignSeat/Fault/UnknownFlightInstance"),
        @FaultAction(className = SeatAlreadyAssigned_Exception.class, value = "http://pad.polito.it/FDSControl/Control/assignSeat/Fault/SeatAlreadyAssigned"),
        @FaultAction(className = FullyBookedFlight_Exception.class, value = "http://pad.polito.it/FDSControl/Control/assignSeat/Fault/FullyBookedFlight"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSControl/Control/assignSeat/Fault/Monitor")
    })
    public AssignSeatResponse assignSeat(
        @WebParam(name = "assignSeat", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
        AssignSeat parameters)
        throws FullyBookedFlight_Exception, Monitor_Exception, SeatAlreadyAssigned_Exception, UnknownFlightInstance_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.StartBoardingResponse
     * @throws Monitor_Exception
     * @throws CancelledFlight_Exception
     * @throws InvalidArgument_Exception
     * @throws UnknownFlightInstance_Exception
     * @throws InvalidStatus_Exception
     */
    @WebMethod
    @WebResult(name = "startBoardingResponse", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/startBoardingRequest", output = "http://pad.polito.it/FDSControl/Control/startBoardingResponse", fault = {
        @FaultAction(className = UnknownFlightInstance_Exception.class, value = "http://pad.polito.it/FDSControl/Control/startBoarding/Fault/UnknownFlightInstance"),
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSControl/Control/startBoarding/Fault/InvalidArgument"),
        @FaultAction(className = CancelledFlight_Exception.class, value = "http://pad.polito.it/FDSControl/Control/startBoarding/Fault/CancelledFlight"),
        @FaultAction(className = InvalidStatus_Exception.class, value = "http://pad.polito.it/FDSControl/Control/startBoarding/Fault/InvalidStatus"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSControl/Control/startBoarding/Fault/Monitor")
    })
    public StartBoardingResponse startBoarding(
        @WebParam(name = "startBoarding", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
        StartBoarding parameters)
        throws CancelledFlight_Exception, InvalidArgument_Exception, InvalidStatus_Exception, Monitor_Exception, UnknownFlightInstance_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.RegisterPassengerResponse
     * @throws Monitor_Exception
     * @throws NotBoarding_Exception
     * @throws InvalidArgument_Exception
     * @throws UnknownFlightInstance_Exception
     * @throws PassengerAlreadyRegistered_Exception
     */
    @WebMethod
    @WebResult(name = "registerPassengerResponse", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/registerPassengerRequest", output = "http://pad.polito.it/FDSControl/Control/registerPassengerResponse", fault = {
        @FaultAction(className = UnknownFlightInstance_Exception.class, value = "http://pad.polito.it/FDSControl/Control/registerPassenger/Fault/UnknownFlightInstance"),
        @FaultAction(className = NotBoarding_Exception.class, value = "http://pad.polito.it/FDSControl/Control/registerPassenger/Fault/NotBoarding"),
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSControl/Control/registerPassenger/Fault/InvalidArgument"),
        @FaultAction(className = PassengerAlreadyRegistered_Exception.class, value = "http://pad.polito.it/FDSControl/Control/registerPassenger/Fault/PassengerAlreadyRegistered"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSControl/Control/registerPassenger/Fault/Monitor")
    })
    public RegisterPassengerResponse registerPassenger(
        @WebParam(name = "registerPassenger", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
        RegisterPassenger parameters)
        throws InvalidArgument_Exception, Monitor_Exception, NotBoarding_Exception, PassengerAlreadyRegistered_Exception, UnknownFlightInstance_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.GetBoardedPassengersResponse
     * @throws Monitor_Exception
     * @throws InvalidArgument_Exception
     * @throws UnknownFlightInstance_Exception
     */
    @WebMethod
    @WebResult(name = "getBoardedPassengersResponse", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/getBoardedPassengersRequest", output = "http://pad.polito.it/FDSControl/Control/getBoardedPassengersResponse", fault = {
        @FaultAction(className = UnknownFlightInstance_Exception.class, value = "http://pad.polito.it/FDSControl/Control/getBoardedPassengers/Fault/UnknownFlightInstance"),
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSControl/Control/getBoardedPassengers/Fault/InvalidArgument"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSControl/Control/getBoardedPassengers/Fault/Monitor")
    })
    public GetBoardedPassengersResponse getBoardedPassengers(
        @WebParam(name = "getBoardedPassengers", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
        GetBoardedPassengers parameters)
        throws InvalidArgument_Exception, Monitor_Exception, UnknownFlightInstance_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.CancelFlightInstanceResponse
     * @throws Monitor_Exception
     * @throws InvalidArgument_Exception
     * @throws UnknownFlightInstance_Exception
     */
    @WebMethod
    @WebResult(name = "cancelFlightInstanceResponse", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/cancelFlightInstanceRequest", output = "http://pad.polito.it/FDSControl/Control/cancelFlightInstanceResponse", fault = {
        @FaultAction(className = UnknownFlightInstance_Exception.class, value = "http://pad.polito.it/FDSControl/Control/cancelFlightInstance/Fault/UnknownFlightInstance"),
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSControl/Control/cancelFlightInstance/Fault/InvalidArgument"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSControl/Control/cancelFlightInstance/Fault/Monitor")
    })
    public CancelFlightInstanceResponse cancelFlightInstance(
        @WebParam(name = "cancelFlightInstance", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
        CancelFlightInstance parameters)
        throws InvalidArgument_Exception, Monitor_Exception, UnknownFlightInstance_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.ChangeBoardingGateResponse
     * @throws Monitor_Exception
     * @throws InvalidArgument_Exception
     * @throws UnknownFlightInstance_Exception
     */
    @WebMethod
    @WebResult(name = "changeBoardingGateResponse", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/changeBoardingGateRequest", output = "http://pad.polito.it/FDSControl/Control/changeBoardingGateResponse", fault = {
        @FaultAction(className = UnknownFlightInstance_Exception.class, value = "http://pad.polito.it/FDSControl/Control/changeBoardingGate/Fault/UnknownFlightInstance"),
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSControl/Control/changeBoardingGate/Fault/InvalidArgument"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSControl/Control/changeBoardingGate/Fault/Monitor")
    })
    public ChangeBoardingGateResponse changeBoardingGate(
        @WebParam(name = "changeBoardingGate", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
        ChangeBoardingGate parameters)
        throws InvalidArgument_Exception, Monitor_Exception, UnknownFlightInstance_Exception
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.server.jaxws.ChangeDelayResponse
     * @throws Monitor_Exception
     * @throws InvalidArgument_Exception
     * @throws UnknownFlightInstance_Exception
     */
    @WebMethod
    @WebResult(name = "changeDelayResponse", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/changeDelayRequest", output = "http://pad.polito.it/FDSControl/Control/changeDelayResponse", fault = {
        @FaultAction(className = UnknownFlightInstance_Exception.class, value = "http://pad.polito.it/FDSControl/Control/changeDelay/Fault/UnknownFlightInstance"),
        @FaultAction(className = InvalidArgument_Exception.class, value = "http://pad.polito.it/FDSControl/Control/changeDelay/Fault/InvalidArgument"),
        @FaultAction(className = Monitor_Exception.class, value = "http://pad.polito.it/FDSControl/Control/changeDelay/Fault/Monitor")
    })
    public ChangeDelayResponse changeDelay(
        @WebParam(name = "changeDelay", targetNamespace = "http://pad.polito.it/FDSControl", partName = "parameters")
        ChangeDelay parameters)
        throws InvalidArgument_Exception, Monitor_Exception, UnknownFlightInstance_Exception
    ;

}
