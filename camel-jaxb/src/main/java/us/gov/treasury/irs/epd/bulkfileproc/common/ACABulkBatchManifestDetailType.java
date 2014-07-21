
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) HHS Batch Manifest Detail Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA HHS (includes Bulk File) Batch Manifest Detail Type&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ACABulkBatchManifestDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACABulkBatchManifestDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ACABatchManifestDetail"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BulkExchangeFile"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACABulkBatchManifestDetailType", propOrder = {
    "acaBatchManifestDetail",
    "bulkExchangeFile"
})
public class ACABulkBatchManifestDetailType {

    @XmlElement(name = "ACABatchManifestDetail", required = true)
    protected ACABatchManifestDetailType acaBatchManifestDetail;
    @XmlElement(name = "BulkExchangeFile", required = true)
    @XmlMimeType("*/*")
    protected DataHandler bulkExchangeFile;

    /**
     * Gets the value of the acaBatchManifestDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ACABatchManifestDetailType }
     *     
     */
    public ACABatchManifestDetailType getACABatchManifestDetail() {
        return acaBatchManifestDetail;
    }

    /**
     * Sets the value of the acaBatchManifestDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACABatchManifestDetailType }
     *     
     */
    public void setACABatchManifestDetail(ACABatchManifestDetailType value) {
        this.acaBatchManifestDetail = value;
    }

    /**
     * Gets the value of the bulkExchangeFile property.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getBulkExchangeFile() {
        return bulkExchangeFile;
    }

    /**
     * Sets the value of the bulkExchangeFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setBulkExchangeFile(DataHandler value) {
        this.bulkExchangeFile = value;
    }

}
