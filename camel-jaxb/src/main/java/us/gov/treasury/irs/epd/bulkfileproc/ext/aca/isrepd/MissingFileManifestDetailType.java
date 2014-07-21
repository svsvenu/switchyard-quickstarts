
package us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import us.gov.treasury.irs.epd.bulkfileproc.common.ACAReportingServiceDetailType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:ext:aca:isr:4.0" xmlns:irs="urn:us:gov:treasury:irs:common" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) Missing File Manifest Detail Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA Missing File Manifest Detail Type&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MissingFileManifestDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MissingFileManifestDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:ext:aca:isr:4.0}MissingBatchDetail"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:ext:aca:isr:4.0}ACABatchTransmissionDetail"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ACAReportingServiceDetail"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingFileManifestDetailType", propOrder = {
    "missingBatchDetail",
    "acaBatchTransmissionDetail",
    "acaReportingServiceDetail"
})
public class MissingFileManifestDetailType {

    @XmlElement(name = "MissingBatchDetail", required = true)
    protected MissingBatchDetailType missingBatchDetail;
    @XmlElement(name = "ACABatchTransmissionDetail", required = true)
    protected ACABatchTransmissionDetailType acaBatchTransmissionDetail;
    @XmlElement(name = "ACAReportingServiceDetail", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected ACAReportingServiceDetailType acaReportingServiceDetail;

    /**
     * Gets the value of the missingBatchDetail property.
     * 
     * @return
     *     possible object is
     *     {@link MissingBatchDetailType }
     *     
     */
    public MissingBatchDetailType getMissingBatchDetail() {
        return missingBatchDetail;
    }

    /**
     * Sets the value of the missingBatchDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link MissingBatchDetailType }
     *     
     */
    public void setMissingBatchDetail(MissingBatchDetailType value) {
        this.missingBatchDetail = value;
    }

    /**
     * Gets the value of the acaBatchTransmissionDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ACABatchTransmissionDetailType }
     *     
     */
    public ACABatchTransmissionDetailType getACABatchTransmissionDetail() {
        return acaBatchTransmissionDetail;
    }

    /**
     * Sets the value of the acaBatchTransmissionDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACABatchTransmissionDetailType }
     *     
     */
    public void setACABatchTransmissionDetail(ACABatchTransmissionDetailType value) {
        this.acaBatchTransmissionDetail = value;
    }

    /**
     * Gets the value of the acaReportingServiceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ACAReportingServiceDetailType }
     *     
     */
    public ACAReportingServiceDetailType getACAReportingServiceDetail() {
        return acaReportingServiceDetail;
    }

    /**
     * Sets the value of the acaReportingServiceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACAReportingServiceDetailType }
     *     
     */
    public void setACAReportingServiceDetail(ACAReportingServiceDetailType value) {
        this.acaReportingServiceDetail = value;
    }

}
