
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Employer Plans Offered Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-09-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an employer plans offered through SHOP &lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EmployerPlansOfferedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployerPlansOfferedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}QHPIssuerEIN"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}IssuerNm"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}QHPFamilyOrIndivCoverageCd"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EmployerQHPPremiumContriAmt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EmployerQHPPremiumContriPct"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployerPlansOfferedType", propOrder = {
    "qhpIssuerEIN",
    "issuerNm",
    "qhpFamilyOrIndivCoverageCd",
    "employerQHPPremiumContriAmt",
    "employerQHPPremiumContriPct"
})
public class EmployerPlansOfferedType {

    @XmlElement(name = "QHPIssuerEIN", required = true)
    protected String qhpIssuerEIN;
    @XmlElement(name = "IssuerNm", required = true)
    protected String issuerNm;
    @XmlElement(name = "QHPFamilyOrIndivCoverageCd", required = true)
    protected String qhpFamilyOrIndivCoverageCd;
    @XmlElement(name = "EmployerQHPPremiumContriAmt", required = true)
    protected BigDecimal employerQHPPremiumContriAmt;
    @XmlElement(name = "EmployerQHPPremiumContriPct", required = true)
    protected BigDecimal employerQHPPremiumContriPct;

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
     * Gets the value of the qhpFamilyOrIndivCoverageCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQHPFamilyOrIndivCoverageCd() {
        return qhpFamilyOrIndivCoverageCd;
    }

    /**
     * Sets the value of the qhpFamilyOrIndivCoverageCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQHPFamilyOrIndivCoverageCd(String value) {
        this.qhpFamilyOrIndivCoverageCd = value;
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
     * Gets the value of the employerQHPPremiumContriPct property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployerQHPPremiumContriPct() {
        return employerQHPPremiumContriPct;
    }

    /**
     * Sets the value of the employerQHPPremiumContriPct property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployerQHPPremiumContriPct(BigDecimal value) {
        this.employerQHPPremiumContriPct = value;
    }

}
