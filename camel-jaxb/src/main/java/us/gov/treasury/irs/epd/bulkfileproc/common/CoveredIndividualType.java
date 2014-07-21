
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Covered IndividualType&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-09-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an covered individual on exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CoveredIndividualType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoveredIndividualType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}InsuredPerson"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}CoverageStartDt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}CoverageEndDt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoveredIndividualType", propOrder = {
    "insuredPerson",
    "coverageStartDt",
    "coverageEndDt"
})
public class CoveredIndividualType {

    @XmlElement(name = "InsuredPerson", required = true)
    protected EPDPersonType insuredPerson;
    @XmlElement(name = "CoverageStartDt", required = true)
    protected XMLGregorianCalendar coverageStartDt;
    @XmlElement(name = "CoverageEndDt")
    protected XMLGregorianCalendar coverageEndDt;

    /**
     * Gets the value of the insuredPerson property.
     * 
     * @return
     *     possible object is
     *     {@link EPDPersonType }
     *     
     */
    public EPDPersonType getInsuredPerson() {
        return insuredPerson;
    }

    /**
     * Sets the value of the insuredPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPDPersonType }
     *     
     */
    public void setInsuredPerson(EPDPersonType value) {
        this.insuredPerson = value;
    }

    /**
     * Gets the value of the coverageStartDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverageStartDt() {
        return coverageStartDt;
    }

    /**
     * Sets the value of the coverageStartDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoverageStartDt(XMLGregorianCalendar value) {
        this.coverageStartDt = value;
    }

    /**
     * Gets the value of the coverageEndDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCoverageEndDt() {
        return coverageEndDt;
    }

    /**
     * Sets the value of the coverageEndDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCoverageEndDt(XMLGregorianCalendar value) {
        this.coverageEndDt = value;
    }

}
