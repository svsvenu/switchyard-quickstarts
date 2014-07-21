
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Associated Policy Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-09-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;The elements associated with a policies on exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for AssociatedPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssociatedPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}QHPPolicyNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}QHPIssuerEIN"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PediatricDentalPlanPremiumInd" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SLCSPAdjMonthlyPremiumAmt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}HouseholdAPTCAmt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}TotalHsldMonthlyPremiumAmt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedPolicyType", propOrder = {
    "qhpPolicyNum",
    "qhpIssuerEIN",
    "pediatricDentalPlanPremiumInd",
    "slcspAdjMonthlyPremiumAmt",
    "householdAPTCAmt",
    "totalHsldMonthlyPremiumAmt"
})
public class AssociatedPolicyType {

    @XmlElement(name = "QHPPolicyNum", required = true)
    protected String qhpPolicyNum;
    @XmlElement(name = "QHPIssuerEIN", required = true)
    protected String qhpIssuerEIN;
    @XmlElement(name = "PediatricDentalPlanPremiumInd")
    protected BooleanStringType pediatricDentalPlanPremiumInd;
    @XmlElement(name = "SLCSPAdjMonthlyPremiumAmt", required = true)
    protected BigDecimal slcspAdjMonthlyPremiumAmt;
    @XmlElement(name = "HouseholdAPTCAmt", required = true)
    protected BigDecimal householdAPTCAmt;
    @XmlElement(name = "TotalHsldMonthlyPremiumAmt", required = true)
    protected BigDecimal totalHsldMonthlyPremiumAmt;

    /**
     * Gets the value of the qhpPolicyNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQHPPolicyNum() {
        return qhpPolicyNum;
    }

    /**
     * Sets the value of the qhpPolicyNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQHPPolicyNum(String value) {
        this.qhpPolicyNum = value;
    }

    /**
     * Gets the value of the qhpIssuerEIN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQHPIssuerEIN() {
        return qhpIssuerEIN;
    }

    /**
     * Sets the value of the qhpIssuerEIN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQHPIssuerEIN(String value) {
        this.qhpIssuerEIN = value;
    }

    /**
     * Gets the value of the pediatricDentalPlanPremiumInd property.
     * 
     * @return
     *     possible object is
     *     {@link BooleanStringType }
     *     
     */
    public BooleanStringType getPediatricDentalPlanPremiumInd() {
        return pediatricDentalPlanPremiumInd;
    }

    /**
     * Sets the value of the pediatricDentalPlanPremiumInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BooleanStringType }
     *     
     */
    public void setPediatricDentalPlanPremiumInd(BooleanStringType value) {
        this.pediatricDentalPlanPremiumInd = value;
    }

    /**
     * Gets the value of the slcspAdjMonthlyPremiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSLCSPAdjMonthlyPremiumAmt() {
        return slcspAdjMonthlyPremiumAmt;
    }

    /**
     * Sets the value of the slcspAdjMonthlyPremiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSLCSPAdjMonthlyPremiumAmt(BigDecimal value) {
        this.slcspAdjMonthlyPremiumAmt = value;
    }

    /**
     * Gets the value of the householdAPTCAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHouseholdAPTCAmt() {
        return householdAPTCAmt;
    }

    /**
     * Sets the value of the householdAPTCAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setHouseholdAPTCAmt(BigDecimal value) {
        this.householdAPTCAmt = value;
    }

    /**
     * Gets the value of the totalHsldMonthlyPremiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalHsldMonthlyPremiumAmt() {
        return totalHsldMonthlyPremiumAmt;
    }

    /**
     * Sets the value of the totalHsldMonthlyPremiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalHsldMonthlyPremiumAmt(BigDecimal value) {
        this.totalHsldMonthlyPremiumAmt = value;
    }

}
