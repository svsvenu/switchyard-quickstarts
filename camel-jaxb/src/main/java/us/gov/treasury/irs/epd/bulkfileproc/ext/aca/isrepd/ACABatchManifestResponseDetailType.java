
package us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.treasury.irs.epd.bulkfileproc.common.ErrorMessageDetailType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:ext:aca:isr:4.0" xmlns:irs="urn:us:gov:treasury:irs:common" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) Batch Manifest Response Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA Batch Manifest Response Detail Type&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ACABatchManifestResponseDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACABatchManifestResponseDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ResponseCd"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ResponseCodeDescription"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SystemDocumentId" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}DocumentSequenceNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ErrorMessageDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACABatchManifestResponseDetailType", propOrder = {
    "responseCd",
    "responseCodeDescription",
    "systemDocumentId",
    "documentSequenceNum",
    "errorMessageDetail"
})
public class ACABatchManifestResponseDetailType {

    @XmlElement(name = "ResponseCd", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected String responseCd;
    @XmlElement(name = "ResponseCodeDescription", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected String responseCodeDescription;
    @XmlElement(name = "SystemDocumentId", namespace = "urn:us:gov:treasury:irs:common")
    protected String systemDocumentId;
    @XmlElement(name = "DocumentSequenceNum", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected BigInteger documentSequenceNum;
    @XmlElement(name = "ErrorMessageDetail", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected ErrorMessageDetailType errorMessageDetail;

    /**
     * Gets the value of the responseCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCd() {
        return responseCd;
    }

    /**
     * Sets the value of the responseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCd(String value) {
        this.responseCd = value;
    }

    /**
     * Gets the value of the responseCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCodeDescription() {
        return responseCodeDescription;
    }

    /**
     * Sets the value of the responseCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCodeDescription(String value) {
        this.responseCodeDescription = value;
    }

    /**
     * Gets the value of the systemDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemDocumentId() {
        return systemDocumentId;
    }

    /**
     * Sets the value of the systemDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemDocumentId(String value) {
        this.systemDocumentId = value;
    }

    /**
     * Gets the value of the documentSequenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDocumentSequenceNum() {
        return documentSequenceNum;
    }

    /**
     * Sets the value of the documentSequenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDocumentSequenceNum(BigInteger value) {
        this.documentSequenceNum = value;
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

}
