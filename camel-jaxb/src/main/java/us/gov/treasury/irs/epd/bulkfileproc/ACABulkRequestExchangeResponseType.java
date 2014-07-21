
package us.gov.treasury.irs.epd.bulkfileproc;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.treasury.irs.epd.bulkfileproc.common.AcknowledgementStatusCodeType;
import us.gov.treasury.irs.epd.bulkfileproc.common.ErrorMessageDetailType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:msg:hhsirsacabulkrequestexchange" xmlns:irs="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;ACA (Affordable Care Act) Bulk Request Exchange Response Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2012-07-10&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Message payload for the SOA service for a bulk request exchange response&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ACABulkRequestExchangeResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACABulkRequestExchangeResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}AcknowledgementStatusCd"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ErrorMessageDetail" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACABulkRequestExchangeResponseType", propOrder = {
    "acknowledgementStatusCd",
    "errorMessageDetail"
})
public class ACABulkRequestExchangeResponseType {

    @XmlElement(name = "AcknowledgementStatusCd", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected AcknowledgementStatusCodeType acknowledgementStatusCd;
    @XmlElement(name = "ErrorMessageDetail", namespace = "urn:us:gov:treasury:irs:common")
    protected ErrorMessageDetailType errorMessageDetail;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the acknowledgementStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link AcknowledgementStatusCodeType }
     *     
     */
    public AcknowledgementStatusCodeType getAcknowledgementStatusCd() {
        return acknowledgementStatusCd;
    }

    /**
     * Sets the value of the acknowledgementStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcknowledgementStatusCodeType }
     *     
     */
    public void setAcknowledgementStatusCd(AcknowledgementStatusCodeType value) {
        this.acknowledgementStatusCd = value;
    }

    /**
     * Gets the value of the errorMessageDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ErrorMessageDetailType }
     *     
     */
    public ErrorMessageDetailType getErrorMessageDetail() {
        return errorMessageDetail;
    }

    /**
     * Sets the value of the errorMessageDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ErrorMessageDetailType }
     *     
     */
    public void setErrorMessageDetail(ErrorMessageDetailType value) {
        this.errorMessageDetail = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "1.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
