
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;SHOPExchangeType&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-09-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;The elements associated with SHOP exchange group&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SHOPExchangeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SHOPExchangeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}HealthExchangeId"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SHOPEmployer" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHOPExchangeType", propOrder = {
    "healthExchangeId",
    "shopEmployer"
})
public class SHOPExchangeType {

    @XmlElement(name = "HealthExchangeId", required = true)
    protected String healthExchangeId;
    @XmlElement(name = "SHOPEmployer", required = true)
    protected List<SHOPEmployerType> shopEmployer;

    /**
     * Gets the value of the healthExchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHealthExchangeId() {
        return healthExchangeId;
    }

    /**
     * Sets the value of the healthExchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHealthExchangeId(String value) {
        this.healthExchangeId = value;
    }

    /**
     * Gets the value of the shopEmployer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopEmployer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHOPEmployer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHOPEmployerType }
     * 
     * 
     */
    public List<SHOPEmployerType> getSHOPEmployer() {
        if (shopEmployer == null) {
            shopEmployer = new ArrayList<SHOPEmployerType>();
        }
        return this.shopEmployer;
    }

}
