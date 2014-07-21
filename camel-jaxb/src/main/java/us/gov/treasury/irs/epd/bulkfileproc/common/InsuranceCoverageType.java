
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Insurance Coverage Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-05-17&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;The elements associated with insurance policy on exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for InsuranceCoverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InsuranceCoverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ApplicableCoverageMonthNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}QHPPolicyNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PediatricDentalPlanPremiumInd" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}QHPIssuerEIN"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}IssuerNm"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PolicyCoverageStartDt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PolicyCoverageEndDt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}TotalQHPMonthlyPremiumAmt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}APTCPaymentAmt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}CoveredIndividual" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceCoverageType", propOrder = {
    "applicableCoverageMonthNum",
    "qhpPolicyNum",
    "pediatricDentalPlanPremiumInd",
    "qhpIssuerEIN",
    "issuerNm",
    "policyCoverageStartDt",
    "policyCoverageEndDt",
    "totalQHPMonthlyPremiumAmt",
    "aptcPaymentAmt",
    "coveredIndividual"
})
public class InsuranceCoverageType {

    @XmlElement(name = "ApplicableCoverageMonthNum")
    protected int applicableCoverageMonthNum;
    @XmlElement(name = "QHPPolicyNum", required = true)
    protected String qhpPolicyNum;
    @XmlElement(name = "PediatricDentalPlanPremiumInd")
    protected BooleanStringType pediatricDentalPlanPremiumInd;
    @XmlElement(name = "QHPIssuerEIN", required = true)
    protected String qhpIssuerEIN;
    @XmlElement(name = "IssuerNm", required = true)
    protected String issuerNm;
    @XmlElement(name = "PolicyCoverageStartDt", required = true)
    protected XMLGregorianCalendar policyCoverageStartDt;
    @XmlElement(name = "PolicyCoverageEndDt")
    protected XMLGregorianCalendar policyCoverageEndDt;
    @XmlElement(name = "TotalQHPMonthlyPremiumAmt", required = true)
    protected BigDecimal totalQHPMonthlyPremiumAmt;
    @XmlElement(name = "APTCPaymentAmt", required = true)
    protected BigDecimal aptcPaymentAmt;
    @XmlElement(name = "CoveredIndividual", required = true)
    protected List<CoveredIndividualType> coveredIndividual;

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
     * Gets the value of the issuerNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuerNm() {
        return issuerNm;
    }

    /**
     * Sets the value of the issuerNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuerNm(String value) {
        this.issuerNm = value;
    }

    /**
     * Gets the value of the policyCoverageStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyCoverageStartDt() {
        return policyCoverageStartDt;
    }

    /**
     * Sets the value of the policyCoverageStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyCoverageStartDt(XMLGregorianCalendar value) {
        this.policyCoverageStartDt = value;
    }

    /**
     * Gets the value of the policyCoverageEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPolicyCoverageEndDt() {
        return policyCoverageEndDt;
    }

    /**
     * Sets the value of the policyCoverageEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPolicyCoverageEndDt(XMLGregorianCalendar value) {
        this.policyCoverageEndDt = value;
    }

    /**
     * Gets the value of the totalQHPMonthlyPremiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalQHPMonthlyPremiumAmt() {
        return totalQHPMonthlyPremiumAmt;
    }

    /**
     * Sets the value of the totalQHPMonthlyPremiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalQHPMonthlyPremiumAmt(BigDecimal value) {
        this.totalQHPMonthlyPremiumAmt = value;
    }

    /**
     * Gets the value of the aptcPaymentAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAPTCPaymentAmt() {
        return aptcPaymentAmt;
    }

    /**
     * Sets the value of the aptcPaymentAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAPTCPaymentAmt(BigDecimal value) {
        this.aptcPaymentAmt = value;
    }

    /**
     * Gets the value of the coveredIndividual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coveredIndividual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoveredIndividual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoveredIndividualType }
     * 
     * 
     */
    public List<CoveredIndividualType> getCoveredIndividual() {
        if (coveredIndividual == null) {
            coveredIndividual = new ArrayList<CoveredIndividualType>();
        }
        return this.coveredIndividual;
    }

}
