
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) Attachment Detail Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA Attachment Detail&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ACAAttachmentDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACAAttachmentDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BinaryFormatCd"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ChecksumAugmentationNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}AttachmentByteSizeNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}DocumentSystemFileNm"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SystemDocumentId"/>
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
@XmlType(name = "ACAAttachmentDetailType", propOrder = {
    "binaryFormatCd",
    "checksumAugmentationNum",
    "attachmentByteSizeNum",
    "documentSystemFileNm",
    "systemDocumentId",
    "sequenceNum"
})
public class ACAAttachmentDetailType {

    @XmlElement(name = "BinaryFormatCd", required = true)
    protected BinaryFormatCodeType binaryFormatCd;
    @XmlElement(name = "ChecksumAugmentationNum", required = true)
    protected String checksumAugmentationNum;
    @XmlElement(name = "AttachmentByteSizeNum", required = true)
    protected BigInteger attachmentByteSizeNum;
    @XmlElement(name = "DocumentSystemFileNm", required = true)
    protected String documentSystemFileNm;
    @XmlElement(name = "SystemDocumentId", required = true)
    protected String systemDocumentId;
    @XmlElement(name = "SequenceNum", required = true)
    protected BigInteger sequenceNum;

    /**
     * Gets the value of the binaryFormatCd property.
     * 
     * @return
     *     possible object is
     *     {@link BinaryFormatCodeType }
     *     
     */
    public BinaryFormatCodeType getBinaryFormatCd() {
        return binaryFormatCd;
    }

    /**
     * Sets the value of the binaryFormatCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinaryFormatCodeType }
     *     
     */
    public void setBinaryFormatCd(BinaryFormatCodeType value) {
        this.binaryFormatCd = value;
    }

    /**
     * Gets the value of the checksumAugmentationNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChecksumAugmentationNum() {
        return checksumAugmentationNum;
    }

    /**
     * Sets the value of the checksumAugmentationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChecksumAugmentationNum(String value) {
        this.checksumAugmentationNum = value;
    }

    /**
     * Gets the value of the attachmentByteSizeNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAttachmentByteSizeNum() {
        return attachmentByteSizeNum;
    }

    /**
     * Sets the value of the attachmentByteSizeNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAttachmentByteSizeNum(BigInteger value) {
        this.attachmentByteSizeNum = value;
    }

    /**
     * Gets the value of the documentSystemFileNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentSystemFileNm() {
        return documentSystemFileNm;
    }

    /**
     * Sets the value of the documentSystemFileNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentSystemFileNm(String value) {
        this.documentSystemFileNm = value;
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
