
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Tax Household Coverage Error Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-06-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Tax household errors in exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for TaxHouseholdCoverageErrorDtlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxHouseholdCoverageErrorDtlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element ref="{urn:us:gov:treasury:irs:common}HouseholdErrorDtl" minOccurs="0"/>
 *           &lt;element ref="{urn:us:gov:treasury:irs:common}OtherRelevantAdultErrorDtl" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EPDErrorDetail" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxHouseholdCoverageErrorDtlType", propOrder = {
    "householdErrorDtl",
    "otherRelevantAdultErrorDtl",
    "epdErrorDetail"
})
public class TaxHouseholdCoverageErrorDtlType {

    @XmlElement(name = "HouseholdErrorDtl")
    protected HouseholdErrorDtlType householdErrorDtl;
    @XmlElement(name = "OtherRelevantAdultErrorDtl")
    protected PersonInformationErrorDtlType otherRelevantAdultErrorDtl;
    @XmlElement(name = "EPDErrorDetail")
    protected List<EPDErrorDetailType> epdErrorDetail;

    /**
     * Gets the value of the householdErrorDtl property.
     * 
     * @return
     *     possible object is
     *     {@link HouseholdErrorDtlType }
     *     
     */
    public HouseholdErrorDtlType getHouseholdErrorDtl() {
        return householdErrorDtl;
    }

    /**
     * Sets the value of the householdErrorDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link HouseholdErrorDtlType }
     *     
     */
    public void setHouseholdErrorDtl(HouseholdErrorDtlType value) {
        this.householdErrorDtl = value;
    }

    /**
     * Gets the value of the otherRelevantAdultErrorDtl property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInformationErrorDtlType }
     *     
     */
    public PersonInformationErrorDtlType getOtherRelevantAdultErrorDtl() {
        return otherRelevantAdultErrorDtl;
    }

    /**
     * Sets the value of the otherRelevantAdultErrorDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInformationErrorDtlType }
     *     
     */
    public void setOtherRelevantAdultErrorDtl(PersonInformationErrorDtlType value) {
        this.otherRelevantAdultErrorDtl = value;
    }

    /**
     * Gets the value of the epdErrorDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the epdErrorDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEPDErrorDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EPDErrorDetailType }
     * 
     * 
     */
    public List<EPDErrorDetailType> getEPDErrorDetail() {
        if (epdErrorDetail == null) {
            epdErrorDetail = new ArrayList<EPDErrorDetailType>();
        }
        return this.epdErrorDetail;
    }

}
