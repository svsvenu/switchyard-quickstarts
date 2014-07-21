
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Complete Person Name Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-02-13&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;A group that provides person's full name&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CompletePersonNameType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompletePersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PersonFirstName"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PersonMiddleName" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PersonLastName"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SuffixName" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompletePersonNameType", propOrder = {
    "personFirstName",
    "personMiddleName",
    "personLastName",
    "suffixName"
})
public class CompletePersonNameType {

    @XmlElement(name = "PersonFirstName", required = true)
    protected String personFirstName;
    @XmlElement(name = "PersonMiddleName")
    protected String personMiddleName;
    @XmlElement(name = "PersonLastName", required = true)
    protected String personLastName;
    @XmlElement(name = "SuffixName")
    protected String suffixName;

    /**
     * Gets the value of the personFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonFirstName() {
        return personFirstName;
    }

    /**
     * Sets the value of the personFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonFirstName(String value) {
        this.personFirstName = value;
    }

    /**
     * Gets the value of the personMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonMiddleName() {
        return personMiddleName;
    }

    /**
     * Sets the value of the personMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonMiddleName(String value) {
        this.personMiddleName = value;
    }

    /**
     * Gets the value of the personLastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonLastName() {
        return personLastName;
    }

    /**
     * Sets the value of the personLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonLastName(String value) {
        this.personLastName = value;
    }

    /**
     * Gets the value of the suffixName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffixName() {
        return suffixName;
    }

    /**
     * Sets the value of the suffixName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffixName(String value) {
        this.suffixName = value;
    }

}
