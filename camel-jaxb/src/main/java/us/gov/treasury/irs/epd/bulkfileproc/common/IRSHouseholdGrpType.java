
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;IRS Household Group Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-05-17&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an IRS household group&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IRSHouseholdGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IRSHouseholdGrpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}IRSGroupIdentificationNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}TaxHousehold" maxOccurs="99"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}Exemption" maxOccurs="99" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}InsurancePolicy" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IRSHouseholdGrpType", propOrder = {
    "irsGroupIdentificationNum",
    "taxHousehold",
    "exemption",
    "insurancePolicy"
})
public class IRSHouseholdGrpType {

    @XmlElement(name = "IRSGroupIdentificationNum", required = true)
    protected String irsGroupIdentificationNum;
    @XmlElement(name = "TaxHousehold", required = true)
    protected List<TaxHouseholdType> taxHousehold;
    @XmlElement(name = "Exemption")
    protected List<ExemptionType> exemption;
    @XmlElement(name = "InsurancePolicy")
    protected List<InsurancePolicyType> insurancePolicy;

    /**
     * Gets the value of the irsGroupIdentificationNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIRSGroupIdentificationNum() {
        return irsGroupIdentificationNum;
    }

    /**
     * Sets the value of the irsGroupIdentificationNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIRSGroupIdentificationNum(String value) {
        this.irsGroupIdentificationNum = value;
    }

    /**
     * Gets the value of the taxHousehold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxHousehold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxHousehold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxHouseholdType }
     * 
     * 
     */
    public List<TaxHouseholdType> getTaxHousehold() {
        if (taxHousehold == null) {
            taxHousehold = new ArrayList<TaxHouseholdType>();
        }
        return this.taxHousehold;
    }

    /**
     * Gets the value of the exemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExemptionType }
     * 
     * 
     */
    public List<ExemptionType> getExemption() {
        if (exemption == null) {
            exemption = new ArrayList<ExemptionType>();
        }
        return this.exemption;
    }

    /**
     * Gets the value of the insurancePolicy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurancePolicy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurancePolicy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsurancePolicyType }
     * 
     * 
     */
    public List<InsurancePolicyType> getInsurancePolicy() {
        if (insurancePolicy == null) {
            insurancePolicy = new ArrayList<InsurancePolicyType>();
        }
        return this.insurancePolicy;
    }

}
