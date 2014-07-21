
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;SHOPEmployerType&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-09-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;The elements associated with SHOP employer in the policy on exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SHOPEmployerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SHOPEmployerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EIN"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SHOPEmployerInfo" maxOccurs="12"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SHOPEmployee" maxOccurs="1000"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHOPEmployerType", propOrder = {
    "ein",
    "shopEmployerInfo",
    "shopEmployee"
})
public class SHOPEmployerType {

    @XmlElement(name = "EIN", required = true)
    protected String ein;
    @XmlElement(name = "SHOPEmployerInfo", required = true)
    protected List<SHOPEmployerInfoType> shopEmployerInfo;
    @XmlElement(name = "SHOPEmployee", required = true)
    protected List<SHOPEmployeeType> shopEmployee;

    /**
     * Gets the value of the ein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN() {
        return ein;
    }

    /**
     * Sets the value of the ein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN(String value) {
        this.ein = value;
    }

    /**
     * Gets the value of the shopEmployerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopEmployerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHOPEmployerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHOPEmployerInfoType }
     * 
     * 
     */
    public List<SHOPEmployerInfoType> getSHOPEmployerInfo() {
        if (shopEmployerInfo == null) {
            shopEmployerInfo = new ArrayList<SHOPEmployerInfoType>();
        }
        return this.shopEmployerInfo;
    }

    /**
     * Gets the value of the shopEmployee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopEmployee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHOPEmployee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHOPEmployeeType }
     * 
     * 
     */
    public List<SHOPEmployeeType> getSHOPEmployee() {
        if (shopEmployee == null) {
            shopEmployee = new ArrayList<SHOPEmployeeType>();
        }
        return this.shopEmployee;
    }

}
