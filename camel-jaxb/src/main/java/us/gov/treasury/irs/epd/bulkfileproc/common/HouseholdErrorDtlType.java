
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Household Error Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-06-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Household coverage error details in exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for HouseholdErrorDtlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdErrorDtlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PrimaryInfoErrorsGrp" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SpouseInfoErrorsGrp" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}DependentInfoErrorsGrp" maxOccurs="99" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}AssociatedPolicyErrorDtl" maxOccurs="99" minOccurs="0"/>
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
@XmlType(name = "HouseholdErrorDtlType", propOrder = {
    "primaryInfoErrorsGrp",
    "spouseInfoErrorsGrp",
    "dependentInfoErrorsGrp",
    "associatedPolicyErrorDtl",
    "epdErrorDetail"
})
public class HouseholdErrorDtlType {

    @XmlElement(name = "PrimaryInfoErrorsGrp")
    protected PrimaryInfoErrorsGrpType primaryInfoErrorsGrp;
    @XmlElement(name = "SpouseInfoErrorsGrp")
    protected SpouseInfoErrorsGrpType spouseInfoErrorsGrp;
    @XmlElement(name = "DependentInfoErrorsGrp")
    protected List<DependentInfoErrorsGrpType> dependentInfoErrorsGrp;
    @XmlElement(name = "AssociatedPolicyErrorDtl")
    protected List<AssociatedPolicyErrorDtlType> associatedPolicyErrorDtl;
    @XmlElement(name = "EPDErrorDetail")
    protected List<EPDErrorDetailType> epdErrorDetail;

    /**
     * Gets the value of the primaryInfoErrorsGrp property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryInfoErrorsGrpType }
     *     
     */
    public PrimaryInfoErrorsGrpType getPrimaryInfoErrorsGrp() {
        return primaryInfoErrorsGrp;
    }

    /**
     * Sets the value of the primaryInfoErrorsGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryInfoErrorsGrpType }
     *     
     */
    public void setPrimaryInfoErrorsGrp(PrimaryInfoErrorsGrpType value) {
        this.primaryInfoErrorsGrp = value;
    }

    /**
     * Gets the value of the spouseInfoErrorsGrp property.
     * 
     * @return
     *     possible object is
     *     {@link SpouseInfoErrorsGrpType }
     *     
     */
    public SpouseInfoErrorsGrpType getSpouseInfoErrorsGrp() {
        return spouseInfoErrorsGrp;
    }

    /**
     * Sets the value of the spouseInfoErrorsGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpouseInfoErrorsGrpType }
     *     
     */
    public void setSpouseInfoErrorsGrp(SpouseInfoErrorsGrpType value) {
        this.spouseInfoErrorsGrp = value;
    }

    /**
     * Gets the value of the dependentInfoErrorsGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependentInfoErrorsGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependentInfoErrorsGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DependentInfoErrorsGrpType }
     * 
     * 
     */
    public List<DependentInfoErrorsGrpType> getDependentInfoErrorsGrp() {
        if (dependentInfoErrorsGrp == null) {
            dependentInfoErrorsGrp = new ArrayList<DependentInfoErrorsGrpType>();
        }
        return this.dependentInfoErrorsGrp;
    }

    /**
     * Gets the value of the associatedPolicyErrorDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedPolicyErrorDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedPolicyErrorDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedPolicyErrorDtlType }
     * 
     * 
     */
    public List<AssociatedPolicyErrorDtlType> getAssociatedPolicyErrorDtl() {
        if (associatedPolicyErrorDtl == null) {
            associatedPolicyErrorDtl = new ArrayList<AssociatedPolicyErrorDtlType>();
        }
        return this.associatedPolicyErrorDtl;
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
