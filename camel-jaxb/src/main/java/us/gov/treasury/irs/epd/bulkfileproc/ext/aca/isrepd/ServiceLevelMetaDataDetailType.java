
package us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.treasury.irs.epd.bulkfileproc.common.ACABusinessHeaderType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:ext:aca:isr:4.0" xmlns:irs="urn:us:gov:treasury:irs:common" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Service Level Meta Data Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2012-09-14&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Service Level MetaData for BRMG and ESB&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ServiceLevelMetaDataDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLevelMetaDataDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ACABusinessHeaderDetail"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:ext:aca:isr:4.0}ACABatchManifestDetailList"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}MessageId"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLevelMetaDataDetailType", propOrder = {
    "acaBusinessHeaderDetail",
    "acaBatchManifestDetailList",
    "messageId"
})
public class ServiceLevelMetaDataDetailType {

    @XmlElement(name = "ACABusinessHeaderDetail", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected ACABusinessHeaderType acaBusinessHeaderDetail;
    @XmlElement(name = "ACABatchManifestDetailList", required = true)
    protected ACABatchManifestDetailListType acaBatchManifestDetailList;
    @XmlElement(name = "MessageId", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected String messageId;

    /**
     * Gets the value of the acaBusinessHeaderDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ACABusinessHeaderType }
     *     
     */
    public ACABusinessHeaderType getACABusinessHeaderDetail() {
        return acaBusinessHeaderDetail;
    }

    /**
     * Sets the value of the acaBusinessHeaderDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACABusinessHeaderType }
     *     
     */
    public void setACABusinessHeaderDetail(ACABusinessHeaderType value) {
        this.acaBusinessHeaderDetail = value;
    }

    /**
     * Gets the value of the acaBatchManifestDetailList property.
     * 
     * @return
     *     possible object is
     *     {@link ACABatchManifestDetailListType }
     *     
     */
    public ACABatchManifestDetailListType getACABatchManifestDetailList() {
        return acaBatchManifestDetailList;
    }

    /**
     * Sets the value of the acaBatchManifestDetailList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACABatchManifestDetailListType }
     *     
     */
    public void setACABatchManifestDetailList(ACABatchManifestDetailListType value) {
        this.acaBatchManifestDetailList = value;
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

}
