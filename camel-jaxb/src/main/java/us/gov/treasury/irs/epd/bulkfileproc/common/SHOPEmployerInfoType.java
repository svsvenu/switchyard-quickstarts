
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;SHOP Employer Information Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-03-05&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Content Type for elements associated with SHOP employer in the policy on exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SHOPEmployerInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SHOPEmployerInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ApplicableCoverageMonthNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BusinessName"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}BusinessAddressGrp"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EmployerQHPCoverageStartDt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EmployerQHPCoverageTermDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SHOPEmployerInfoType", propOrder = {
    "applicableCoverageMonthNum",
    "businessName",
    "businessAddressGrp",
    "employerQHPCoverageStartDt",
    "employerQHPCoverageTermDt"
})
public class SHOPEmployerInfoType {

    @XmlElement(name = "ApplicableCoverageMonthNum")
    protected int applicableCoverageMonthNum;
    @XmlElement(name = "BusinessName", required = true)
    protected BusinessNameType businessName;
    @XmlElement(name = "BusinessAddressGrp", required = true)
    protected BusinessAddressGrpType businessAddressGrp;
    @XmlElement(name = "EmployerQHPCoverageStartDt", required = true)
    protected XMLGregorianCalendar employerQHPCoverageStartDt;
    @XmlElement(name = "EmployerQHPCoverageTermDt")
    protected XMLGregorianCalendar employerQHPCoverageTermDt;

    /**
     * Gets the value of the applicableCoverageMonthNum property.
     * 
     */
    public int getApplicableCoverageMonthNum() {
        return applicableCoverageMonthNum;
    }

    /**
     * Sets the value of the applicableCoverageMonthNum property.
     * 
     */
    public void setApplicableCoverageMonthNum(int value) {
        this.applicableCoverageMonthNum = value;
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
     * Gets the value of the employerQHPCoverageStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmployerQHPCoverageStartDt() {
        return employerQHPCoverageStartDt;
    }

    /**
     * Sets the value of the employerQHPCoverageStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmployerQHPCoverageStartDt(XMLGregorianCalendar value) {
        this.employerQHPCoverageStartDt = value;
    }

    /**
     * Gets the value of the employerQHPCoverageTermDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEmployerQHPCoverageTermDt() {
        return employerQHPCoverageTermDt;
    }

    /**
     * Sets the value of the employerQHPCoverageTermDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEmployerQHPCoverageTermDt(XMLGregorianCalendar value) {
        this.employerQHPCoverageTermDt = value;
    }

}
