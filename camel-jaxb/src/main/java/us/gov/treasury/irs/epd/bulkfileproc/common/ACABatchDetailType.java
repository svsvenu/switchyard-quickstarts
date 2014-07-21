
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) Batch Detail Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA Batch Detail Type&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ACABatchDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACABatchDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BatchId"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BatchPartnerId"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BatchAttachmentTransmissionQty"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BatchCategoryCd"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BatchTransmissionQty"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACABatchDetailType", propOrder = {
    "batchId",
    "batchPartnerId",
    "batchAttachmentTransmissionQty",
    "batchCategoryCd",
    "batchTransmissionQty"
})
public class ACABatchDetailType {

    @XmlElement(name = "BatchId", required = true)
    protected XMLGregorianCalendar batchId;
    @XmlElement(name = "BatchPartnerId", required = true)
    protected String batchPartnerId;
    @XmlElement(name = "BatchAttachmentTransmissionQty", required = true)
    protected BigInteger batchAttachmentTransmissionQty;
    @XmlElement(name = "BatchCategoryCd", required = true)
    protected BatchCategoryCodeType batchCategoryCd;
    @XmlElement(name = "BatchTransmissionQty", required = true)
    protected BigInteger batchTransmissionQty;

    /**
     * Gets the value of the batchId property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBatchId() {
        return batchId;
    }

    /**
     * Sets the value of the batchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBatchId(XMLGregorianCalendar value) {
        this.batchId = value;
    }

    /**
     * Gets the value of the batchPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchPartnerId() {
        return batchPartnerId;
    }

    /**
     * Sets the value of the batchPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchPartnerId(String value) {
        this.batchPartnerId = value;
    }

    /**
     * Gets the value of the batchAttachmentTransmissionQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatchAttachmentTransmissionQty() {
        return batchAttachmentTransmissionQty;
    }

    /**
     * Sets the value of the batchAttachmentTransmissionQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatchAttachmentTransmissionQty(BigInteger value) {
        this.batchAttachmentTransmissionQty = value;
    }

    /**
     * Gets the value of the batchCategoryCd property.
     * 
     * @return
     *     possible object is
     *     {@link BatchCategoryCodeType }
     *     
     */
    public BatchCategoryCodeType getBatchCategoryCd() {
        return batchCategoryCd;
    }

    /**
     * Sets the value of the batchCategoryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchCategoryCodeType }
     *     
     */
    public void setBatchCategoryCd(BatchCategoryCodeType value) {
        this.batchCategoryCd = value;
    }

    /**
     * Gets the value of the batchTransmissionQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBatchTransmissionQty() {
        return batchTransmissionQty;
    }

    /**
     * Sets the value of the batchTransmissionQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBatchTransmissionQty(BigInteger value) {
        this.batchTransmissionQty = value;
    }

}
