
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;HouseholdType&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-05-17&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an household coverage on exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for HouseholdType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HouseholdType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}PrimaryGrp"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SpouseGrp" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}DependentGrp" maxOccurs="99" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}AssociatedPolicy" maxOccurs="99"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HouseholdType", propOrder = {
    "primaryGrp",
    "spouseGrp",
    "dependentGrp",
    "associatedPolicy"
})
public class HouseholdType {

    @XmlElement(name = "PrimaryGrp", required = true)
    protected PrimaryGrpType primaryGrp;
    @XmlElement(name = "SpouseGrp")
    protected SpouseGrpType spouseGrp;
    @XmlElement(name = "DependentGrp")
    protected List<DependentGrpType> dependentGrp;
    @XmlElement(name = "AssociatedPolicy", required = true)
    protected List<AssociatedPolicyType> associatedPolicy;

    /**
     * Gets the value of the primaryGrp property.
     * 
     * @return
     *     possible object is
     *     {@link PrimaryGrpType }
     *     
     */
    public PrimaryGrpType getPrimaryGrp() {
        return primaryGrp;
    }

    /**
     * Sets the value of the primaryGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrimaryGrpType }
     *     
     */
    public void setPrimaryGrp(PrimaryGrpType value) {
        this.primaryGrp = value;
    }

    /**
     * Gets the value of the spouseGrp property.
     * 
     * @return
     *     possible object is
     *     {@link SpouseGrpType }
     *     
     */
    public SpouseGrpType getSpouseGrp() {
        return spouseGrp;
    }

    /**
     * Sets the value of the spouseGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpouseGrpType }
     *     
     */
    public void setSpouseGrp(SpouseGrpType value) {
        this.spouseGrp = value;
    }

    /**
     * Gets the value of the dependentGrp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependentGrp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependentGrp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DependentGrpType }
     * 
     * 
     */
    public List<DependentGrpType> getDependentGrp() {
        if (dependentGrp == null) {
            dependentGrp = new ArrayList<DependentGrpType>();
        }
        return this.dependentGrp;
    }

    /**
     * Gets the value of the associatedPolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedPolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedPolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedPolicyType }
     * 
     * 
     */
    public List<AssociatedPolicyType> getAssociatedPolicy() {
        if (associatedPolicy == null) {
            associatedPolicy = new ArrayList<AssociatedPolicyType>();
        }
        return this.associatedPolicy;
    }

}
