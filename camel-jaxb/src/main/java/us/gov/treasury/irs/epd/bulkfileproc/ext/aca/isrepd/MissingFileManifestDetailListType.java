
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:ext:aca:isr:4.0" xmlns:irs="urn:us:gov:treasury:irs:common" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) Missing File Notification Manifest Detail List Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-07-24&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA Missing File Notification Manifest Detail List&lt;/DescriptionTxt&gt;&lt;DataElementID/&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MissingFileManifestDetailListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MissingFileManifestDetailListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:ext:aca:isr:4.0}MissingFileManifestDetail" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingFileManifestDetailListType", propOrder = {
    "missingFileManifestDetail"
})
public class MissingFileManifestDetailListType {

    @XmlElement(name = "MissingFileManifestDetail", required = true)
    protected List<MissingFileManifestDetailType> missingFileManifestDetail;

    /**
     * Gets the value of the missingFileManifestDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingFileManifestDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissingFileManifestDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MissingFileManifestDetailType }
     * 
     * 
     */
    public List<MissingFileManifestDetailType> getMissingFileManifestDetail() {
        if (missingFileManifestDetail == null) {
            missingFileManifestDetail = new ArrayList<MissingFileManifestDetailType>();
        }
        return this.missingFileManifestDetail;
    }

}
