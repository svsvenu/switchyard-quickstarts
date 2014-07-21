
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Service Metadata Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2012-09-14&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;A group that wraps metadata detail related to a service.&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ServiceMetadataDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceMetadataDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceRequestFileId" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceRequestFileNm" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceRequestFileLocationTxt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}MessageSourceSystemNm" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceRequestFileSizeTxt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceRequestReceivedTs" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceRequestCreatedTs" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}MessageId" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceRequestTotalRecordCnt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceResponseFileCreatedTs" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceResponseFileSentTs" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceResponseFileLocationTxt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceResponseFileNm" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BRMGatewayStatusCd" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ServiceExecutionStatusDescriptionTxt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}UserId" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}LastUpdatedTs" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceMetadataDetailType", propOrder = {
    "serviceRequestFileId",
    "serviceRequestFileNm",
    "serviceRequestFileLocationTxt",
    "messageSourceSystemNm",
    "serviceRequestFileSizeTxt",
    "serviceRequestReceivedTs",
    "serviceRequestCreatedTs",
    "messageId",
    "serviceRequestTotalRecordCnt",
    "serviceResponseFileCreatedTs",
    "serviceResponseFileSentTs",
    "serviceResponseFileLocationTxt",
    "serviceResponseFileNm",
    "brmGatewayStatusCd",
    "serviceExecutionStatusDescriptionTxt",
    "userId",
    "lastUpdatedTs"
})
public class ServiceMetadataDetailType {

    @XmlElement(name = "ServiceRequestFileId")
    protected String serviceRequestFileId;
    @XmlElement(name = "ServiceRequestFileNm")
    protected String serviceRequestFileNm;
    @XmlElement(name = "ServiceRequestFileLocationTxt")
    protected String serviceRequestFileLocationTxt;
    @XmlElement(name = "MessageSourceSystemNm")
    protected String messageSourceSystemNm;
    @XmlElement(name = "ServiceRequestFileSizeTxt")
    protected String serviceRequestFileSizeTxt;
    @XmlElement(name = "ServiceRequestReceivedTs")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceRequestReceivedTs;
    @XmlElement(name = "ServiceRequestCreatedTs")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceRequestCreatedTs;
    @XmlElement(name = "MessageId")
    protected String messageId;
    @XmlElement(name = "ServiceRequestTotalRecordCnt")
    protected String serviceRequestTotalRecordCnt;
    @XmlElement(name = "ServiceResponseFileCreatedTs")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceResponseFileCreatedTs;
    @XmlElement(name = "ServiceResponseFileSentTs")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar serviceResponseFileSentTs;
    @XmlElement(name = "ServiceResponseFileLocationTxt")
    protected String serviceResponseFileLocationTxt;
    @XmlElement(name = "ServiceResponseFileNm")
    protected String serviceResponseFileNm;
    @XmlElement(name = "BRMGatewayStatusCd")
    protected BRMGatewayStatusCodeType brmGatewayStatusCd;
    @XmlElement(name = "ServiceExecutionStatusDescriptionTxt")
    protected String serviceExecutionStatusDescriptionTxt;
    @XmlElement(name = "UserId")
    protected String userId;
    @XmlElement(name = "LastUpdatedTs")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdatedTs;

    /**
     * Gets the value of the serviceRequestFileId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestFileId() {
        return serviceRequestFileId;
    }

    /**
     * Sets the value of the serviceRequestFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestFileId(String value) {
        this.serviceRequestFileId = value;
    }

    /**
     * Gets the value of the serviceRequestFileNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestFileNm() {
        return serviceRequestFileNm;
    }

    /**
     * Sets the value of the serviceRequestFileNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestFileNm(String value) {
        this.serviceRequestFileNm = value;
    }

    /**
     * Gets the value of the serviceRequestFileLocationTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestFileLocationTxt() {
        return serviceRequestFileLocationTxt;
    }

    /**
     * Sets the value of the serviceRequestFileLocationTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestFileLocationTxt(String value) {
        this.serviceRequestFileLocationTxt = value;
    }

    /**
     * Gets the value of the messageSourceSystemNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageSourceSystemNm() {
        return messageSourceSystemNm;
    }

    /**
     * Sets the value of the messageSourceSystemNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageSourceSystemNm(String value) {
        this.messageSourceSystemNm = value;
    }

    /**
     * Gets the value of the serviceRequestFileSizeTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestFileSizeTxt() {
        return serviceRequestFileSizeTxt;
    }

    /**
     * Sets the value of the serviceRequestFileSizeTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestFileSizeTxt(String value) {
        this.serviceRequestFileSizeTxt = value;
    }

    /**
     * Gets the value of the serviceRequestReceivedTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceRequestReceivedTs() {
        return serviceRequestReceivedTs;
    }

    /**
     * Sets the value of the serviceRequestReceivedTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceRequestReceivedTs(XMLGregorianCalendar value) {
        this.serviceRequestReceivedTs = value;
    }

    /**
     * Gets the value of the serviceRequestCreatedTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceRequestCreatedTs() {
        return serviceRequestCreatedTs;
    }

    /**
     * Sets the value of the serviceRequestCreatedTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceRequestCreatedTs(XMLGregorianCalendar value) {
        this.serviceRequestCreatedTs = value;
    }

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageId(String value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the serviceRequestTotalRecordCnt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceRequestTotalRecordCnt() {
        return serviceRequestTotalRecordCnt;
    }

    /**
     * Sets the value of the serviceRequestTotalRecordCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceRequestTotalRecordCnt(String value) {
        this.serviceRequestTotalRecordCnt = value;
    }

    /**
     * Gets the value of the serviceResponseFileCreatedTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceResponseFileCreatedTs() {
        return serviceResponseFileCreatedTs;
    }

    /**
     * Sets the value of the serviceResponseFileCreatedTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceResponseFileCreatedTs(XMLGregorianCalendar value) {
        this.serviceResponseFileCreatedTs = value;
    }

    /**
     * Gets the value of the serviceResponseFileSentTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServiceResponseFileSentTs() {
        return serviceResponseFileSentTs;
    }

    /**
     * Sets the value of the serviceResponseFileSentTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServiceResponseFileSentTs(XMLGregorianCalendar value) {
        this.serviceResponseFileSentTs = value;
    }

    /**
     * Gets the value of the serviceResponseFileLocationTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceResponseFileLocationTxt() {
        return serviceResponseFileLocationTxt;
    }

    /**
     * Sets the value of the serviceResponseFileLocationTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceResponseFileLocationTxt(String value) {
        this.serviceResponseFileLocationTxt = value;
    }

    /**
     * Gets the value of the serviceResponseFileNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceResponseFileNm() {
        return serviceResponseFileNm;
    }

    /**
     * Sets the value of the serviceResponseFileNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceResponseFileNm(String value) {
        this.serviceResponseFileNm = value;
    }

    /**
     * Gets the value of the brmGatewayStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link BRMGatewayStatusCodeType }
     *     
     */
    public BRMGatewayStatusCodeType getBRMGatewayStatusCd() {
        return brmGatewayStatusCd;
    }

    /**
     * Sets the value of the brmGatewayStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BRMGatewayStatusCodeType }
     *     
     */
    public void setBRMGatewayStatusCd(BRMGatewayStatusCodeType value) {
        this.brmGatewayStatusCd = value;
    }

    /**
     * Gets the value of the serviceExecutionStatusDescriptionTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceExecutionStatusDescriptionTxt() {
        return serviceExecutionStatusDescriptionTxt;
    }

    /**
     * Sets the value of the serviceExecutionStatusDescriptionTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceExecutionStatusDescriptionTxt(String value) {
        this.serviceExecutionStatusDescriptionTxt = value;
    }

    /**
     * Gets the value of the userId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserId(String value) {
        this.userId = value;
    }

    /**
     * Gets the value of the lastUpdatedTs property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdatedTs() {
        return lastUpdatedTs;
    }

    /**
     * Sets the value of the lastUpdatedTs property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdatedTs(XMLGregorianCalendar value) {
        this.lastUpdatedTs = value;
    }

}
