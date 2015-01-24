
package it.polito.dp2.FDS.sol4.client.gen;

import java.util.concurrent.Future;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.AsyncHandler;
import javax.xml.ws.FaultAction;
import javax.xml.ws.Response;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Control", targetNamespace = "http://pad.polito.it/FDS")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Control {


    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<it.polito.dp2.FDS.sol4.client.gen.StartBoardingResponse>
     */
    @WebMethod(operationName = "startBoarding")
    public Response<StartBoardingResponse> startBoardingAsync(
        @WebParam(name = "startBoarding", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        StartBoarding parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "startBoarding")
    public Future<?> startBoardingAsync(
        @WebParam(name = "startBoarding", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        StartBoarding parameters,
        @WebParam(name = "startBoardingResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<StartBoardingResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.client.gen.StartBoardingResponse
     * @throws InvalidStatusException
     * @throws InvalidArgumentException
     * @throws UnknownFlightInstanceException
     * @throws MonitorException
     * @throws CancelledFlightException
     */
    @WebMethod
    @WebResult(name = "startBoardingResponse", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/startBoardingRequest", output = "http://pad.polito.it/FDSControl/Control/startBoardingResponse", fault = {
        @FaultAction(className = CancelledFlightException.class, value = "http://pad.polito.it/FDSControl/Control/startBoarding/Fault/CancelledFlight"),
        @FaultAction(className = InvalidArgumentException.class, value = "http://pad.polito.it/FDSControl/Control/startBoarding/Fault/InvalidArgument"),
        @FaultAction(className = InvalidStatusException.class, value = "http://pad.polito.it/FDSControl/Control/startBoarding/Fault/InvalidStatus"),
        @FaultAction(className = MonitorException.class, value = "http://pad.polito.it/FDSControl/Control/startBoarding/Fault/Monitor"),
        @FaultAction(className = UnknownFlightInstanceException.class, value = "http://pad.polito.it/FDSControl/Control/startBoarding/Fault/UnknownFlightInstance")
    })
    public StartBoardingResponse startBoarding(
        @WebParam(name = "startBoarding", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        StartBoarding parameters)
        throws CancelledFlightException, InvalidArgumentException, InvalidStatusException, MonitorException, UnknownFlightInstanceException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<it.polito.dp2.FDS.sol4.client.gen.RegisterPassengerResponse>
     */
    @WebMethod(operationName = "registerPassenger")
    public Response<RegisterPassengerResponse> registerPassengerAsync(
        @WebParam(name = "registerPassenger", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        RegisterPassenger parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "registerPassenger")
    public Future<?> registerPassengerAsync(
        @WebParam(name = "registerPassenger", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        RegisterPassenger parameters,
        @WebParam(name = "registerPassengerResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<RegisterPassengerResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.client.gen.RegisterPassengerResponse
     * @throws InvalidArgumentException
     * @throws PassengerAlreadyRegisteredException
     * @throws UnknownFlightInstanceException
     * @throws NotBoardingException
     * @throws MonitorException
     */
    @WebMethod
    @WebResult(name = "registerPassengerResponse", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/registerPassengerRequest", output = "http://pad.polito.it/FDSControl/Control/registerPassengerResponse", fault = {
        @FaultAction(className = InvalidArgumentException.class, value = "http://pad.polito.it/FDSControl/Control/registerPassenger/Fault/InvalidArgument"),
        @FaultAction(className = MonitorException.class, value = "http://pad.polito.it/FDSControl/Control/registerPassenger/Fault/Monitor"),
        @FaultAction(className = NotBoardingException.class, value = "http://pad.polito.it/FDSControl/Control/registerPassenger/Fault/NotBoarding"),
        @FaultAction(className = PassengerAlreadyRegisteredException.class, value = "http://pad.polito.it/FDSControl/Control/registerPassenger/Fault/PassengerAlreadyRegistered"),
        @FaultAction(className = UnknownFlightInstanceException.class, value = "http://pad.polito.it/FDSControl/Control/registerPassenger/Fault/UnknownFlightInstance")
    })
    public RegisterPassengerResponse registerPassenger(
        @WebParam(name = "registerPassenger", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        RegisterPassenger parameters)
        throws InvalidArgumentException, MonitorException, NotBoardingException, PassengerAlreadyRegisteredException, UnknownFlightInstanceException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<it.polito.dp2.FDS.sol4.client.gen.GetBoardedPassengersResponse>
     */
    @WebMethod(operationName = "getBoardedPassengers")
    public Response<GetBoardedPassengersResponse> getBoardedPassengersAsync(
        @WebParam(name = "getBoardedPassengers", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        GetBoardedPassengers parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "getBoardedPassengers")
    public Future<?> getBoardedPassengersAsync(
        @WebParam(name = "getBoardedPassengers", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        GetBoardedPassengers parameters,
        @WebParam(name = "getBoardedPassengersResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<GetBoardedPassengersResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.client.gen.GetBoardedPassengersResponse
     * @throws InvalidArgumentException
     * @throws UnknownFlightInstanceException
     * @throws MonitorException
     */
    @WebMethod
    @WebResult(name = "getBoardedPassengersResponse", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/getBoardedPassengersRequest", output = "http://pad.polito.it/FDSControl/Control/getBoardedPassengersResponse", fault = {
        @FaultAction(className = InvalidArgumentException.class, value = "http://pad.polito.it/FDSControl/Control/getBoardedPassengers/Fault/InvalidArgument"),
        @FaultAction(className = MonitorException.class, value = "http://pad.polito.it/FDSControl/Control/getBoardedPassengers/Fault/Monitor"),
        @FaultAction(className = UnknownFlightInstanceException.class, value = "http://pad.polito.it/FDSControl/Control/getBoardedPassengers/Fault/UnknownFlightInstance")
    })
    public GetBoardedPassengersResponse getBoardedPassengers(
        @WebParam(name = "getBoardedPassengers", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        GetBoardedPassengers parameters)
        throws InvalidArgumentException, MonitorException, UnknownFlightInstanceException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<it.polito.dp2.FDS.sol4.client.gen.CancelFlightInstanceResponse>
     */
    @WebMethod(operationName = "cancelFlightInstance")
    public Response<CancelFlightInstanceResponse> cancelFlightInstanceAsync(
        @WebParam(name = "cancelFlightInstance", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        CancelFlightInstance parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "cancelFlightInstance")
    public Future<?> cancelFlightInstanceAsync(
        @WebParam(name = "cancelFlightInstance", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        CancelFlightInstance parameters,
        @WebParam(name = "cancelFlightInstanceResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<CancelFlightInstanceResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.client.gen.CancelFlightInstanceResponse
     * @throws InvalidArgumentException
     * @throws UnknownFlightInstanceException
     * @throws MonitorException
     */
    @WebMethod
    @WebResult(name = "cancelFlightInstanceResponse", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/cancelFlightInstanceRequest", output = "http://pad.polito.it/FDSControl/Control/cancelFlightInstanceResponse", fault = {
        @FaultAction(className = InvalidArgumentException.class, value = "http://pad.polito.it/FDSControl/Control/cancelFlightInstance/Fault/InvalidArgument"),
        @FaultAction(className = MonitorException.class, value = "http://pad.polito.it/FDSControl/Control/cancelFlightInstance/Fault/Monitor"),
        @FaultAction(className = UnknownFlightInstanceException.class, value = "http://pad.polito.it/FDSControl/Control/cancelFlightInstance/Fault/UnknownFlightInstance")
    })
    public CancelFlightInstanceResponse cancelFlightInstance(
        @WebParam(name = "cancelFlightInstance", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        CancelFlightInstance parameters)
        throws InvalidArgumentException, MonitorException, UnknownFlightInstanceException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<it.polito.dp2.FDS.sol4.client.gen.ChangeBoardingGateResponse>
     */
    @WebMethod(operationName = "changeBoardingGate")
    public Response<ChangeBoardingGateResponse> changeBoardingGateAsync(
        @WebParam(name = "changeBoardingGate", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        ChangeBoardingGate parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "changeBoardingGate")
    public Future<?> changeBoardingGateAsync(
        @WebParam(name = "changeBoardingGate", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        ChangeBoardingGate parameters,
        @WebParam(name = "changeBoardingGateResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ChangeBoardingGateResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.client.gen.ChangeBoardingGateResponse
     * @throws InvalidArgumentException
     * @throws UnknownFlightInstanceException
     * @throws MonitorException
     */
    @WebMethod
    @WebResult(name = "changeBoardingGateResponse", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/changeBoardingGateRequest", output = "http://pad.polito.it/FDSControl/Control/changeBoardingGateResponse", fault = {
        @FaultAction(className = InvalidArgumentException.class, value = "http://pad.polito.it/FDSControl/Control/changeBoardingGate/Fault/InvalidArgument"),
        @FaultAction(className = MonitorException.class, value = "http://pad.polito.it/FDSControl/Control/changeBoardingGate/Fault/Monitor"),
        @FaultAction(className = UnknownFlightInstanceException.class, value = "http://pad.polito.it/FDSControl/Control/changeBoardingGate/Fault/UnknownFlightInstance")
    })
    public ChangeBoardingGateResponse changeBoardingGate(
        @WebParam(name = "changeBoardingGate", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        ChangeBoardingGate parameters)
        throws InvalidArgumentException, MonitorException, UnknownFlightInstanceException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<it.polito.dp2.FDS.sol4.client.gen.ChangeDelayResponse>
     */
    @WebMethod(operationName = "changeDelay")
    public Response<ChangeDelayResponse> changeDelayAsync(
        @WebParam(name = "changeDelay", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        ChangeDelay parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "changeDelay")
    public Future<?> changeDelayAsync(
        @WebParam(name = "changeDelay", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        ChangeDelay parameters,
        @WebParam(name = "changeDelayResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<ChangeDelayResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.client.gen.ChangeDelayResponse
     * @throws InvalidArgumentException
     * @throws UnknownFlightInstanceException
     * @throws MonitorException
     */
    @WebMethod
    @WebResult(name = "changeDelayResponse", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/changeDelayRequest", output = "http://pad.polito.it/FDSControl/Control/changeDelayResponse", fault = {
        @FaultAction(className = InvalidArgumentException.class, value = "http://pad.polito.it/FDSControl/Control/changeDelay/Fault/InvalidArgument"),
        @FaultAction(className = MonitorException.class, value = "http://pad.polito.it/FDSControl/Control/changeDelay/Fault/Monitor"),
        @FaultAction(className = UnknownFlightInstanceException.class, value = "http://pad.polito.it/FDSControl/Control/changeDelay/Fault/UnknownFlightInstance")
    })
    public ChangeDelayResponse changeDelay(
        @WebParam(name = "changeDelay", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        ChangeDelay parameters)
        throws InvalidArgumentException, MonitorException, UnknownFlightInstanceException
    ;

    /**
     * 
     * @param parameters
     * @return
     *     returns javax.xml.ws.Response<it.polito.dp2.FDS.sol4.client.gen.AssignSeatResponse>
     */
    @WebMethod(operationName = "assignSeat")
    public Response<AssignSeatResponse> assignSeatAsync(
        @WebParam(name = "assignSeat", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        AssignSeat parameters);

    /**
     * 
     * @param asyncHandler
     * @param parameters
     * @return
     *     returns java.util.concurrent.Future<? extends java.lang.Object>
     */
    @WebMethod(operationName = "assignSeat")
    public Future<?> assignSeatAsync(
        @WebParam(name = "assignSeat", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        AssignSeat parameters,
        @WebParam(name = "assignSeatResponse", targetNamespace = "", partName = "asyncHandler")
        AsyncHandler<AssignSeatResponse> asyncHandler);

    /**
     * 
     * @param parameters
     * @return
     *     returns it.polito.dp2.FDS.sol4.client.gen.AssignSeatResponse
     * @throws FullyBookedFlightException
     * @throws SeatAlreadyAssignedException
     * @throws UnknownFlightInstanceException
     * @throws MonitorException
     */
    @WebMethod
    @WebResult(name = "assignSeatResponse", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
    @Action(input = "http://pad.polito.it/FDSControl/Control/assignSeatRequest", output = "http://pad.polito.it/FDSControl/Control/assignSeatResponse", fault = {
        @FaultAction(className = FullyBookedFlightException.class, value = "http://pad.polito.it/FDSControl/Control/assignSeat/Fault/FullyBookedFlight"),
        @FaultAction(className = MonitorException.class, value = "http://pad.polito.it/FDSControl/Control/assignSeat/Fault/Monitor"),
        @FaultAction(className = SeatAlreadyAssignedException.class, value = "http://pad.polito.it/FDSControl/Control/assignSeat/Fault/SeatAlreadyAssigned"),
        @FaultAction(className = UnknownFlightInstanceException.class, value = "http://pad.polito.it/FDSControl/Control/assignSeat/Fault/UnknownFlightInstance")
    })
    public AssignSeatResponse assignSeat(
        @WebParam(name = "assignSeat", targetNamespace = "http://pad.polito.it/FDS", partName = "parameters")
        AssignSeat parameters)
        throws FullyBookedFlightException, MonitorException, SeatAlreadyAssignedException, UnknownFlightInstanceException
    ;

}
