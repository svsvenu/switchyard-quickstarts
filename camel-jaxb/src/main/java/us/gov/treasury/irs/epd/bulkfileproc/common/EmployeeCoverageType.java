
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Employee Coverage Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-09-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an employee roster coverage in exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EmployeeCoverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeCoverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ApplicableCoverageMonthNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}CompletePersonName"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SSN"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EmployerQHPPremiumContriAmt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EmployeeSHOPPolicy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeCoverageType", propOrder = {
    "applicableCoverageMonthNum",
    "completePersonName",
    "ssn",
    "employerQHPPremiumContriAmt",
    "employeeSHOPPolicy"
})
public class EmployeeCoverageType {

    @XmlElement(name = "ApplicableCoverageMonthNum")
    protected int applicableCoverageMonthNum;
    @XmlElement(name = "CompletePersonName", required = true)
    protected CompletePersonNameType completePersonName;
    @XmlElement(name = "SSN", required = true)
    protected String ssn;
    @XmlElement(name = "EmployerQHPPremiumContriAmt", required = true)
    protected BigDecimal employerQHPPremiumContriAmt;
    @XmlElement(name = "EmployeeSHOPPolicy")
    protected EmployeeSHOPPolicyType employeeSHOPPolicy;

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
     * Gets the value of the employerQHPPremiumContriAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployerQHPPremiumContriAmt() {
        return employerQHPPremiumContriAmt;
    }

    /**
     * Sets the value of the employerQHPPremiumContriAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployerQHPPremiumContriAmt(BigDecimal value) {
        this.employerQHPPremiumContriAmt = value;
    }

    /**
     * Gets the value of the employeeSHOPPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSHOPPolicyType }
     *     
     */
    public EmployeeSHOPPolicyType getEmployeeSHOPPolicy() {
        return employeeSHOPPolicy;
    }

    /**
     * Sets the value of the employeeSHOPPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSHOPPolicyType }
     *     
     */
    public void setEmployeeSHOPPolicy(EmployeeSHOPPolicyType value) {
        this.employeeSHOPPolicy = value;
    }

}
