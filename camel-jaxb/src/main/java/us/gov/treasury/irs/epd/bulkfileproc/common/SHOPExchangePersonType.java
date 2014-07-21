
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Person Details Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-03-05&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Name and SSN used by the individual taxpayer &lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SHOPExchangePersonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SHOPExchangePersonType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}CompletePersonName"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SSN"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHOPExchangePersonType", propOrder = {
    "completePersonName",
    "ssn"
})
public class SHOPExchangePersonType {

    @XmlElement(name = "CompletePersonName", required = true)
    protected CompletePersonNameType completePersonName;
    @XmlElement(name = "SSN", required = true)
    protected String ssn;

    /**
     * Gets the value of the completePersonName property.
     * 
     * @return
     *     possible object is
     *     {@link CompletePersonNameType }
     *     
     */
    public CompletePersonNameType getCompletePersonName() {
        return completePersonName;
    }

    /**
     * Sets the value of the completePersonName property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletePersonNameType }
     *     
     */
    public void setCompletePersonName(CompletePersonNameType value) {
        this.completePersonName = value;
    }

    /**
     * Gets the value of the ssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSSN() {
        return ssn;
    }

    /**
     * Sets the value of the ssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSSN(String value) {
        this.ssn = value;
    }

}
