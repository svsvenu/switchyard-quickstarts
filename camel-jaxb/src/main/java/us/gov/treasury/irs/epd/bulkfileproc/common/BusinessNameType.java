
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Business Name Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-01-08&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;EFileTypes, December 14, 2007&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Type for a Business Name, 2 Name Lines&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BusinessNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BusinessNameLine1"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BusinessNameLine2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessNameType", propOrder = {
    "businessNameLine1",
    "businessNameLine2"
})
public class BusinessNameType {

    @XmlElement(name = "BusinessNameLine1", required = true)
    protected String businessNameLine1;
    @XmlElement(name = "BusinessNameLine2")
    protected String businessNameLine2;

    /**
     * Gets the value of the businessNameLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNameLine1() {
        return businessNameLine1;
    }

    /**
     * Sets the value of the businessNameLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNameLine1(String value) {
        this.businessNameLine1 = value;
    }

    /**
     * Gets the value of the businessNameLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessNameLine2() {
        return businessNameLine2;
    }

    /**
     * Sets the value of the businessNameLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessNameLine2(String value) {
        this.businessNameLine2 = value;
    }

}
