
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;EmployeeSHOPPolicyType&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;1&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-10-31&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Added element EmployeeQHPShareOfPremiumAmt&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an employer SHOP policy on exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EmployeeSHOPPolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeSHOPPolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}QHPFamilyOrIndivCoverageCd"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PolicyCoverageStartDt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PolicyCoverageEndDt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SHOPSpouse" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SHOPDependent" maxOccurs="99" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EmployeeQHPShareOfPremiumAmt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmployeeSHOPPolicyType", propOrder = {
    "qhpFamilyOrIndivCoverageCd",
    "policyCoverageStartDt",
    "policyCoverageEndDt",
    "shopSpouse",
    "shopDependent",
    "employeeQHPShareOfPremiumAmt"
})
public class EmployeeSHOPPolicyType {

    @XmlElement(name = "QHPFamilyOrIndivCoverageCd", required = true)
    protected String qhpFamilyOrIndivCoverageCd;
    @XmlElement(name = "PolicyCoverageStartDt", required = true)
    protected XMLGregorianCalendar policyCoverageStartDt;
    @XmlElement(name = "PolicyCoverageEndDt")
    protected XMLGregorianCalendar policyCoverageEndDt;
    @XmlElement(name = "SHOPSpouse")
    protected SHOPExchangePersonType shopSpouse;
    @XmlElement(name = "SHOPDependent")
    protected List<SHOPExchangePersonType> shopDependent;
    @XmlElement(name = "EmployeeQHPShareOfPremiumAmt", required = true)
    protected BigDecimal employeeQHPShareOfPremiumAmt;

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
     * Gets the value of the shopSpouse property.
     * 
     * @return
     *     possible object is
     *     {@link SHOPExchangePersonType }
     *     
     */
    public SHOPExchangePersonType getSHOPSpouse() {
        return shopSpouse;
    }

    /**
     * Sets the value of the shopSpouse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHOPExchangePersonType }
     *     
     */
    public void setSHOPSpouse(SHOPExchangePersonType value) {
        this.shopSpouse = value;
    }

    /**
     * Gets the value of the shopDependent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopDependent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHOPDependent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHOPExchangePersonType }
     * 
     * 
     */
    public List<SHOPExchangePersonType> getSHOPDependent() {
        if (shopDependent == null) {
            shopDependent = new ArrayList<SHOPExchangePersonType>();
        }
        return this.shopDependent;
    }

    /**
     * Gets the value of the employeeQHPShareOfPremiumAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEmployeeQHPShareOfPremiumAmt() {
        return employeeQHPShareOfPremiumAmt;
    }

    /**
     * Sets the value of the employeeQHPShareOfPremiumAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEmployeeQHPShareOfPremiumAmt(BigDecimal value) {
        this.employeeQHPShareOfPremiumAmt = value;
    }

}
