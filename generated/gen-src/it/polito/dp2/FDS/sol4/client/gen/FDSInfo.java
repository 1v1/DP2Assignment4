
package it.polito.dp2.FDS.sol4.client.gen;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "FDSInfo", targetNamespace = "http://pad.polito.it/FDSInfo", wsdlLocation = "file:/Users/emdotzed/Documents/workspace/ValidationAss4bv4/build/META-INF/client/wsdl/FDSInfo.wsdl")
public class FDSInfo
    extends Service
{

    private final static URL FDSINFO_WSDL_LOCATION;
    private final static WebServiceException FDSINFO_EXCEPTION;
    private final static QName FDSINFO_QNAME = new QName("http://pad.polito.it/FDSInfo", "FDSInfo");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/emdotzed/Documents/workspace/ValidationAss4bv4/build/META-INF/client/wsdl/FDSInfo.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        FDSINFO_WSDL_LOCATION = url;
        FDSINFO_EXCEPTION = e;
    }

    public FDSInfo() {
        super(__getWsdlLocation(), FDSINFO_QNAME);
    }

    public FDSInfo(WebServiceFeature... features) {
        super(__getWsdlLocation(), FDSINFO_QNAME, features);
    }

    public FDSInfo(URL wsdlLocation) {
        super(wsdlLocation, FDSINFO_QNAME);
    }

    public FDSInfo(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, FDSINFO_QNAME, features);
    }

    public FDSInfo(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public FDSInfo(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Info
     */
    @WebEndpoint(name = "FDSInfoImplPort")
    public Info getFDSInfoImplPort() {
        return super.getPort(new QName("http://pad.polito.it/FDSInfo", "FDSInfoImplPort"), Info.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Info
     */
    @WebEndpoint(name = "FDSInfoImplPort")
    public Info getFDSInfoImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://pad.polito.it/FDSInfo", "FDSInfoImplPort"), Info.class, features);
    }

    private static URL __getWsdlLocation() {
        if (FDSINFO_EXCEPTION!= null) {
            throw FDSINFO_EXCEPTION;
        }
        return FDSINFO_WSDL_LOCATION;
    }

}
