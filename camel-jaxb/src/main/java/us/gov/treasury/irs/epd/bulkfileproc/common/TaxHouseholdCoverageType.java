
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Tax Household Coverage Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-05-17&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an tax household coverage on exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TaxHouseholdCoverageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxHouseholdCoverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ApplicableCoverageMonthNum"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:us:gov:treasury:irs:common}Household"/>
 *           &lt;element ref="{urn:us:gov:treasury:irs:common}OtherRelevantAdult"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxHouseholdCoverageType", propOrder = {
    "applicableCoverageMonthNum",
    "household",
    "otherRelevantAdult"
})
public class TaxHouseholdCoverageType {

    @XmlElement(name = "ApplicableCoverageMonthNum")
    protected int applicableCoverageMonthNum;
    @XmlElement(name = "Household")
    protected HouseholdType household;
    @XmlElement(name = "OtherRelevantAdult")
    protected PersonInformationType otherRelevantAdult;

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
     * Gets the value of the household property.
     * 
     * @return
     *     possible object is
     *     {@link HouseholdType }
     *     
     */
    public HouseholdType getHousehold() {
        return household;
    }

    /**
     * Sets the value of the household property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseholdType }
     *     
     */
    public void setHousehold(HouseholdType value) {
        this.household = value;
    }

    /**
     * Gets the value of the otherRelevantAdult property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInformationType }
     *     
     */
    public PersonInformationType getOtherRelevantAdult() {
        return otherRelevantAdult;
    }

    /**
     * Sets the value of the otherRelevantAdult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInformationType }
     *     
     */
    public void setOtherRelevantAdult(PersonInformationType value) {
        this.otherRelevantAdult = value;
    }

}
