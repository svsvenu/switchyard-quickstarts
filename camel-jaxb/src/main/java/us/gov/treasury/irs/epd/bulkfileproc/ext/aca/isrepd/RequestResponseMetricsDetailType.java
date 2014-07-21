
package us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:ext:aca:isr:4.0" xmlns:irs="urn:us:gov:treasury:irs:common" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Request Response Metrics Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2014-04-03&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;The type for the Request Response Metrics detail&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RequestResponseMetricsDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestResponseMetricsDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:ext:aca:isr:4.0}RequestReceiptDateTs" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:ext:aca:isr:4.0}ResponseDeliveryDateTs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestResponseMetricsDetailType", propOrder = {
    "requestReceiptDateTs",
    "responseDeliveryDateTs"
})
public class RequestResponseMetricsDetailType {

    @XmlElement(name = "RequestReceiptDateTs")
    protected XMLGregorianCalendar requestReceiptDateTs;
    @XmlElement(name = "ResponseDeliveryDateTs")
    protected XMLGregorianCalendar responseDeliveryDateTs;

    /**
     * Gets the value of the requestReceiptDateTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestReceiptDateTs() {
        return requestReceiptDateTs;
    }

    /**
     * Sets the value of the requestReceiptDateTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestReceiptDateTs(XMLGregorianCalendar value) {
        this.requestReceiptDateTs = value;
    }

    /**
     * Gets the value of the responseDeliveryDateTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDeliveryDateTs() {
        return responseDeliveryDateTs;
    }

    /**
     * Sets the value of the responseDeliveryDateTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDeliveryDateTs(XMLGregorianCalendar value) {
        this.responseDeliveryDateTs = value;
    }

}
