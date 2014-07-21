
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;IRS Household Error Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-04-15&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an individual exchange group generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for IRSHouseholdErrorDtlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IRSHouseholdErrorDtlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}IRSGroupIdentificationNum"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}TaxHouseholdErrorDtl" maxOccurs="99" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ExemptionErrorDtl" maxOccurs="99" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}InsurancePolicyErrorDtl" maxOccurs="99" minOccurs="0"/>
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
@XmlType(name = "IRSHouseholdErrorDtlType", propOrder = {
    "irsGroupIdentificationNum",
    "taxHouseholdErrorDtl",
    "exemptionErrorDtl",
    "insurancePolicyErrorDtl",
    "epdErrorDetail"
})
public class IRSHouseholdErrorDtlType {

    @XmlElement(name = "IRSGroupIdentificationNum", required = true)
    protected String irsGroupIdentificationNum;
    @XmlElement(name = "TaxHouseholdErrorDtl")
    protected List<TaxHouseholdErrorDtlType> taxHouseholdErrorDtl;
    @XmlElement(name = "ExemptionErrorDtl")
    protected List<ExemptionErrorDtlType> exemptionErrorDtl;
    @XmlElement(name = "InsurancePolicyErrorDtl")
    protected List<InsurancePolicyErrorDtlType> insurancePolicyErrorDtl;
    @XmlElement(name = "EPDErrorDetail")
    protected List<EPDErrorDetailType> epdErrorDetail;

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
     * Gets the value of the taxHouseholdErrorDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxHouseholdErrorDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxHouseholdErrorDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxHouseholdErrorDtlType }
     * 
     * 
     */
    public List<TaxHouseholdErrorDtlType> getTaxHouseholdErrorDtl() {
        if (taxHouseholdErrorDtl == null) {
            taxHouseholdErrorDtl = new ArrayList<TaxHouseholdErrorDtlType>();
        }
        return this.taxHouseholdErrorDtl;
    }

    /**
     * Gets the value of the exemptionErrorDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptionErrorDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemptionErrorDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExemptionErrorDtlType }
     * 
     * 
     */
    public List<ExemptionErrorDtlType> getExemptionErrorDtl() {
        if (exemptionErrorDtl == null) {
            exemptionErrorDtl = new ArrayList<ExemptionErrorDtlType>();
        }
        return this.exemptionErrorDtl;
    }

    /**
     * Gets the value of the insurancePolicyErrorDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurancePolicyErrorDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurancePolicyErrorDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsurancePolicyErrorDtlType }
     * 
     * 
     */
    public List<InsurancePolicyErrorDtlType> getInsurancePolicyErrorDtl() {
        if (insurancePolicyErrorDtl == null) {
            insurancePolicyErrorDtl = new ArrayList<InsurancePolicyErrorDtlType>();
        }
        return this.insurancePolicyErrorDtl;
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
