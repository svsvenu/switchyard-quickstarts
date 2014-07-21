
package us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import us.gov.treasury.irs.epd.bulkfileproc.common.BinaryFormatCodeType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:ext:aca:isr:4.0" xmlns:irs="urn:us:gov:treasury:irs:common" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) Attachment Detail Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA Attachment Detail&lt;/DescriptionTxt&gt;&lt;/Component&gt;
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
 *         &lt;element ref="{urn:us:gov:treasury:irs:ext:aca:isr:4.0}AttachmentByteSizeNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:ext:aca:isr:4.0}DocumentSystemFileNm"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SystemDocumentId" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}DocumentSequenceNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}InternalDocumentSystemFileNm" minOccurs="0"/>
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
    "documentSequenceNum",
    "internalDocumentSystemFileNm"
})
public class ACAAttachmentDetailType {

    @XmlElement(name = "BinaryFormatCd", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected BinaryFormatCodeType binaryFormatCd;
    @XmlElement(name = "ChecksumAugmentationNum", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected String checksumAugmentationNum;
    @XmlElement(name = "AttachmentByteSizeNum", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger attachmentByteSizeNum;
    @XmlElement(name = "DocumentSystemFileNm", required = true)
    protected String documentSystemFileNm;
    @XmlElement(name = "SystemDocumentId", namespace = "urn:us:gov:treasury:irs:common")
    protected String systemDocumentId;
    @XmlElement(name = "DocumentSequenceNum", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected BigInteger documentSequenceNum;
    @XmlElement(name = "InternalDocumentSystemFileNm", namespace = "urn:us:gov:treasury:irs:common")
    protected String internalDocumentSystemFileNm;

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
     * Gets the value of the internalDocumentSystemFileNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalDocumentSystemFileNm() {
        return internalDocumentSystemFileNm;
    }

    /**
     * Sets the value of the internalDocumentSystemFileNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalDocumentSystemFileNm(String value) {
        this.internalDocumentSystemFileNm = value;
    }

}
