
package it.polito.dp2.FDS.sol4.client.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "CancelledFlight", targetNamespace = "http://pad.polito.it/FDS")
public class CancelledFlightException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private CancelledFlight faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public CancelledFlightException(String message, CancelledFlight faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public CancelledFlightException(String message, CancelledFlight faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: it.polito.dp2.FDS.sol4.client.gen.CancelledFlight
     */
    public CancelledFlight getFaultInfo() {
        return faultInfo;
    }

}
