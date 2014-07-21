
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Employee Coverage Error Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-10-31&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the elements associated with an employee roster coverage in exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EmployeeCoverageErrorDtlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeCoverageErrorDtlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}CompletePersonNameErrorDtl"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EmployeeSHOPPolicyErrorDtl" minOccurs="0"/>
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
@XmlType(name = "EmployeeCoverageErrorDtlType", propOrder = {
    "completePersonNameErrorDtl",
    "employeeSHOPPolicyErrorDtl",
    "epdErrorDetail"
})
public class EmployeeCoverageErrorDtlType {

    @XmlElement(name = "CompletePersonNameErrorDtl", required = true)
    protected CompletePersonNameErrorDtlType completePersonNameErrorDtl;
    @XmlElement(name = "EmployeeSHOPPolicyErrorDtl")
    protected EmployeeSHOPPolicyErrorDtlType employeeSHOPPolicyErrorDtl;
    @XmlElement(name = "EPDErrorDetail")
    protected List<EPDErrorDetailType> epdErrorDetail;

    /**
     * Gets the value of the completePersonNameErrorDtl property.
     * 
     * @return
     *     possible object is
     *     {@link CompletePersonNameErrorDtlType }
     *     
     */
    public CompletePersonNameErrorDtlType getCompletePersonNameErrorDtl() {
        return completePersonNameErrorDtl;
    }

    /**
     * Sets the value of the completePersonNameErrorDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletePersonNameErrorDtlType }
     *     
     */
    public void setCompletePersonNameErrorDtl(CompletePersonNameErrorDtlType value) {
        this.completePersonNameErrorDtl = value;
    }

    /**
     * Gets the value of the employeeSHOPPolicyErrorDtl property.
     * 
     * @return
     *     possible object is
     *     {@link EmployeeSHOPPolicyErrorDtlType }
     *     
     */
    public EmployeeSHOPPolicyErrorDtlType getEmployeeSHOPPolicyErrorDtl() {
        return employeeSHOPPolicyErrorDtl;
    }

    /**
     * Sets the value of the employeeSHOPPolicyErrorDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmployeeSHOPPolicyErrorDtlType }
     *     
     */
    public void setEmployeeSHOPPolicyErrorDtl(EmployeeSHOPPolicyErrorDtlType value) {
        this.employeeSHOPPolicyErrorDtl = value;
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
