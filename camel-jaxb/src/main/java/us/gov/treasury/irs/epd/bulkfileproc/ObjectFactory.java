
package us.gov.treasury.irs.epd.bulkfileproc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.gov.treasury.irs.epd.bulkfileproc package. 
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

    private final static QName _ACABulkRequestExchangeResponse_QNAME = new QName("urn:us:gov:treasury:irs:msg:hhsirsacabulkrequestexchange", "ACABulkRequestExchangeResponse");
    private final static QName _ACABulkRequestExchange_QNAME = new QName("urn:us:gov:treasury:irs:msg:hhsirsacabulkrequestexchange", "ACABulkRequestExchange");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.gov.treasury.irs.epd.bulkfileproc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ACABulkRequestExchangeResponseType }
     * 
     */
    public ACABulkRequestExchangeResponseType createACABulkRequestExchangeResponseType() {
        return new ACABulkRequestExchangeResponseType();
    }

    /**
     * Create an instance of {@link ACABulkRequestExchangeType }
     * 
     */
    public ACABulkRequestExchangeType createACABulkRequestExchangeType() {
        return new ACABulkRequestExchangeType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABulkRequestExchangeResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:msg:hhsirsacabulkrequestexchange", name = "ACABulkRequestExchangeResponse")
    public JAXBElement<ACABulkRequestExchangeResponseType> createACABulkRequestExchangeResponse(ACABulkRequestExchangeResponseType value) {
        return new JAXBElement<ACABulkRequestExchangeResponseType>(_ACABulkRequestExchangeResponse_QNAME, ACABulkRequestExchangeResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABulkRequestExchangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:msg:hhsirsacabulkrequestexchange", name = "ACABulkRequestExchange")
    public JAXBElement<ACABulkRequestExchangeType> createACABulkRequestExchange(ACABulkRequestExchangeType value) {
        return new JAXBElement<ACABulkRequestExchangeType>(_ACABulkRequestExchange_QNAME, ACABulkRequestExchangeType.class, null, value);
    }

}
