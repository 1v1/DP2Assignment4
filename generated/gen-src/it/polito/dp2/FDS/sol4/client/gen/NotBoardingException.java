
package it.polito.dp2.FDS.sol4.client.gen;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "NotBoarding", targetNamespace = "http://pad.polito.it/FDS")
public class NotBoardingException
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private NotBoarding faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public NotBoardingException(String message, NotBoarding faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public NotBoardingException(String message, NotBoarding faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: it.polito.dp2.FDS.sol4.client.gen.NotBoarding
     */
    public NotBoarding getFaultInfo() {
        return faultInfo;
    }

}
