
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Exemption Coverage Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-05-17&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an Exemption coverage on a month&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ExemptionCoverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExemptionCoverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ApplicableCoverageMonthNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ExemptPerson"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ExemptionCertificateNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}MonthsExemptStartDt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}MonthsExemptEndDt"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExemptionCoverageType", propOrder = {
    "applicableCoverageMonthNum",
    "exemptPerson",
    "exemptionCertificateNum",
    "monthsExemptStartDt",
    "monthsExemptEndDt"
})
public class ExemptionCoverageType {

    @XmlElement(name = "ApplicableCoverageMonthNum")
    protected int applicableCoverageMonthNum;
    @XmlElement(name = "ExemptPerson", required = true)
    protected EPDPersonType exemptPerson;
    @XmlElement(name = "ExemptionCertificateNum", required = true)
    protected String exemptionCertificateNum;
    @XmlElement(name = "MonthsExemptStartDt", required = true)
    protected XMLGregorianCalendar monthsExemptStartDt;
    @XmlElement(name = "MonthsExemptEndDt", required = true)
    protected XMLGregorianCalendar monthsExemptEndDt;

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
     * Gets the value of the exemptPerson property.
     * 
     * @return
     *     possible object is
     *     {@link EPDPersonType }
     *     
     */
    public EPDPersonType getExemptPerson() {
        return exemptPerson;
    }

    /**
     * Sets the value of the exemptPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPDPersonType }
     *     
     */
    public void setExemptPerson(EPDPersonType value) {
        this.exemptPerson = value;
    }

    /**
     * Gets the value of the exemptionCertificateNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptionCertificateNum() {
        return exemptionCertificateNum;
    }

    /**
     * Sets the value of the exemptionCertificateNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptionCertificateNum(String value) {
        this.exemptionCertificateNum = value;
    }

    /**
     * Gets the value of the monthsExemptStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonthsExemptStartDt() {
        return monthsExemptStartDt;
    }

    /**
     * Sets the value of the monthsExemptStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonthsExemptStartDt(XMLGregorianCalendar value) {
        this.monthsExemptStartDt = value;
    }

    /**
     * Gets the value of the monthsExemptEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMonthsExemptEndDt() {
        return monthsExemptEndDt;
    }

    /**
     * Sets the value of the monthsExemptEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMonthsExemptEndDt(XMLGregorianCalendar value) {
        this.monthsExemptEndDt = value;
    }

}
