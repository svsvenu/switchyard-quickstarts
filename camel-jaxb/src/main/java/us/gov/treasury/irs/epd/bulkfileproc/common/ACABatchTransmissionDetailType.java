
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) Batch Transmission Detail Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA Batch Transmission Detail Type&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ACABatchTransmissionDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACABatchTransmissionDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}TransmissionAttachmentQty"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SequenceNum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACABatchTransmissionDetailType", propOrder = {
    "transmissionAttachmentQty",
    "sequenceNum"
})
public class ACABatchTransmissionDetailType {

    @XmlElement(name = "TransmissionAttachmentQty", required = true)
    protected BigInteger transmissionAttachmentQty;
    @XmlElement(name = "SequenceNum", required = true)
    protected BigInteger sequenceNum;

    /**
     * Gets the value of the transmissionAttachmentQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransmissionAttachmentQty() {
        return transmissionAttachmentQty;
    }

    /**
     * Sets the value of the transmissionAttachmentQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransmissionAttachmentQty(BigInteger value) {
        this.transmissionAttachmentQty = value;
    }

    /**
     * Gets the value of the sequenceNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNum() {
        return sequenceNum;
    }

    /**
     * Sets the value of the sequenceNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNum(BigInteger value) {
        this.sequenceNum = value;
    }

}
