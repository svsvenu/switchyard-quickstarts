
package us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:ext:aca:isr:4.0" xmlns:irs="urn:us:gov:treasury:irs:common" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) Attachment Detail List Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA Attachment Detail List&lt;/DescriptionTxt&gt;&lt;DataElementID/&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ACABatchManifestDetailListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACABatchManifestDetailListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:ext:aca:isr:4.0}ACABatchManifestDetail" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACABatchManifestDetailListType", propOrder = {
    "acaBatchManifestDetail"
})
public class ACABatchManifestDetailListType {

    @XmlElement(name = "ACABatchManifestDetail", required = true)
    protected List<ACABatchManifestDetailType> acaBatchManifestDetail;

    /**
     * Gets the value of the acaBatchManifestDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acaBatchManifestDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getACABatchManifestDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ACABatchManifestDetailType }
     * 
     * 
     */
    public List<ACABatchManifestDetailType> getACABatchManifestDetail() {
        if (acaBatchManifestDetail == null) {
            acaBatchManifestDetail = new ArrayList<ACABatchManifestDetailType>();
        }
        return this.acaBatchManifestDetail;
    }

}
