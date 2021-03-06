
package com.ericsson.schemas.cai3g1;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CAI3G1.2", targetNamespace = "http://schemas.ericsson.com/cai3g1.2/", wsdlLocation = "file:/C:/Users/Daniela/Documents/Daniela/CLARO%20CONNECT/netConfiguration/CAI3G1.wsdl")
public class CAI3G12
    extends Service
{

    private final static URL CAI3G12_WSDL_LOCATION;
    private final static WebServiceException CAI3G12_EXCEPTION;
    private final static QName CAI3G12_QNAME = new QName("http://schemas.ericsson.com/cai3g1.2/", "CAI3G1.2");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/Daniela/Documents/Daniela/CLARO%20CONNECT/netConfiguration/CAI3G1.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CAI3G12_WSDL_LOCATION = url;
        CAI3G12_EXCEPTION = e;
    }

    public CAI3G12() {
        super(__getWsdlLocation(), CAI3G12_QNAME);
    }

    public CAI3G12(WebServiceFeature... features) {
        super(__getWsdlLocation(), CAI3G12_QNAME, features);
    }

    public CAI3G12(URL wsdlLocation) {
        super(wsdlLocation, CAI3G12_QNAME);
    }

    public CAI3G12(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CAI3G12_QNAME, features);
    }

    public CAI3G12(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CAI3G12(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Provisioning
     */
    @WebEndpoint(name = "Cai3gImplPort")
    public Provisioning getCai3GImplPort() {
        return super.getPort(new QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gImplPort"), Provisioning.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Provisioning
     */
    @WebEndpoint(name = "Cai3gImplPort")
    public Provisioning getCai3GImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.ericsson.com/cai3g1.2/", "Cai3gImplPort"), Provisioning.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CAI3G12_EXCEPTION!= null) {
            throw CAI3G12_EXCEPTION;
        }
        return CAI3G12_WSDL_LOCATION;
    }

}
