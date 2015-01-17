
package it.polito.dp2.FDS.sol4.server.jaxws;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "UnknownFlightInstance", targetNamespace = "http://pad.polito.it/FDSInfo")
public class UnknownFlightInstance_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UnknownFlightInstance faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UnknownFlightInstance_Exception(String message, UnknownFlightInstance faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UnknownFlightInstance_Exception(String message, UnknownFlightInstance faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: it.polito.dp2.FDS.sol4.server.jaxws.UnknownFlightInstance
     */
    public UnknownFlightInstance getFaultInfo() {
        return faultInfo;
    }

}
