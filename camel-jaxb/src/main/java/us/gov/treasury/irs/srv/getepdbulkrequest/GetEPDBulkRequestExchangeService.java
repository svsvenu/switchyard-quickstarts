package us.gov.treasury.irs.srv.getepdbulkrequest;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-07-21T12:31:09.193-05:00
 * Generated source version: 3.0.1
 * 
 */
@WebServiceClient(name = "GetEPDBulkRequestExchangeService", 
                  wsdlLocation = "file:/Users/venusurampudi/git/switchyard-quickstarts/camel-jaxb/src/main/resources/wsdl/ACA_XML_LIBRARY_8.0/SRV/HHS-IRS-GetEPDBulkRequestService-1.0.wsdl",
                  targetNamespace = "urn:us:gov:treasury:irs:srv:getepdbulkrequest") 
public class GetEPDBulkRequestExchangeService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("urn:us:gov:treasury:irs:srv:getepdbulkrequest", "GetEPDBulkRequestExchangeService");
    public final static QName GetEPDBulkRequestExchangePort = new QName("urn:us:gov:treasury:irs:srv:getepdbulkrequest", "GetEPDBulkRequestExchangePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/Users/venusurampudi/git/switchyard-quickstarts/camel-jaxb/src/main/resources/wsdl/ACA_XML_LIBRARY_8.0/SRV/HHS-IRS-GetEPDBulkRequestService-1.0.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetEPDBulkRequestExchangeService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/Users/venusurampudi/git/switchyard-quickstarts/camel-jaxb/src/main/resources/wsdl/ACA_XML_LIBRARY_8.0/SRV/HHS-IRS-GetEPDBulkRequestService-1.0.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GetEPDBulkRequestExchangeService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetEPDBulkRequestExchangeService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetEPDBulkRequestExchangeService() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns GetEPDBulkRequestExchangePortType
     */
    @WebEndpoint(name = "GetEPDBulkRequestExchangePort")
    public GetEPDBulkRequestExchangePortType getGetEPDBulkRequestExchangePort() {
        return super.getPort(GetEPDBulkRequestExchangePort, GetEPDBulkRequestExchangePortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetEPDBulkRequestExchangePortType
     */
    @WebEndpoint(name = "GetEPDBulkRequestExchangePort")
    public GetEPDBulkRequestExchangePortType getGetEPDBulkRequestExchangePort(WebServiceFeature... features) {
        return super.getPort(GetEPDBulkRequestExchangePort, GetEPDBulkRequestExchangePortType.class, features);
    }

}