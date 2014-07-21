
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Person Information Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-09-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the information about the individual taxpayer &lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PersonInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}CompletePersonName"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SSN" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BirthDt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}USAddressGrp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonInformationType", propOrder = {
    "completePersonName",
    "ssn",
    "birthDt",
    "usAddressGrp"
})
public class PersonInformationType {

    @XmlElement(name = "CompletePersonName", required = true)
    protected CompletePersonNameType completePersonName;
    @XmlElement(name = "SSN")
    protected String ssn;
    @XmlElement(name = "BirthDt")
    protected XMLGregorianCalendar birthDt;
    @XmlElement(name = "USAddressGrp")
    protected USAddressGrpType usAddressGrp;

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

    /**
     * Gets the value of the birthDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDt() {
        return birthDt;
    }

    /**
     * Sets the value of the birthDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDt(XMLGregorianCalendar value) {
        this.birthDt = value;
    }

    /**
     * Gets the value of the usAddressGrp property.
     * 
     * @return
     *     possible object is
     *     {@link USAddressGrpType }
     *     
     */
    public USAddressGrpType getUSAddressGrp() {
        return usAddressGrp;
    }

    /**
     * Sets the value of the usAddressGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link USAddressGrpType }
     *     
     */
    public void setUSAddressGrp(USAddressGrpType value) {
        this.usAddressGrp = value;
    }

}
