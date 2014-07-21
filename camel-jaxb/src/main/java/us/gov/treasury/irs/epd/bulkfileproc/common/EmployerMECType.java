
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Employer MEC Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-05-17&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an insured employer on exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EmployerMECType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployerMECType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EIN"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BusinessName"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BusinessAddressGrp"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}MECStatusInd"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerMECType", propOrder = {
    "ein",
    "businessName",
    "businessAddressGrp",
    "mecStatusInd"
})
public class EmployerMECType {

    @XmlElement(name = "EIN", required = true)
    protected String ein;
    @XmlElement(name = "BusinessName", required = true)
    protected BusinessNameType businessName;
    @XmlElement(name = "BusinessAddressGrp", required = true)
    protected BusinessAddressGrpType businessAddressGrp;
    @XmlElement(name = "MECStatusInd", required = true)
    protected BooleanStringType mecStatusInd;

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
     * Gets the value of the businessName property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessNameType }
     *     
     */
    public BusinessNameType getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessNameType }
     *     
     */
    public void setBusinessName(BusinessNameType value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the businessAddressGrp property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessAddressGrpType }
     *     
     */
    public BusinessAddressGrpType getBusinessAddressGrp() {
        return businessAddressGrp;
    }

    /**
     * Sets the value of the businessAddressGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessAddressGrpType }
     *     
     */
    public void setBusinessAddressGrp(BusinessAddressGrpType value) {
        this.businessAddressGrp = value;
    }

    /**
     * Gets the value of the mecStatusInd property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanStringType }
     *     
     */
    public BooleanStringType getMECStatusInd() {
        return mecStatusInd;
    }

    /**
     * Sets the value of the mecStatusInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanStringType }
     *     
     */
    public void setMECStatusInd(BooleanStringType value) {
        this.mecStatusInd = value;
    }

}
