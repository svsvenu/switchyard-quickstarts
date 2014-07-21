
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Dependent Information Errors Group Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-06-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Innformation about the dependent errors in the monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DependentInfoErrorsGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DependentInfoErrorsGrpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}DependentInfoErrorDtl" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EmployerMECErrorDtl" maxOccurs="10" minOccurs="0"/>
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
@XmlType(name = "DependentInfoErrorsGrpType", propOrder = {
    "dependentInfoErrorDtl",
    "employerMECErrorDtl",
    "epdErrorDetail"
})
public class DependentInfoErrorsGrpType {

    @XmlElement(name = "DependentInfoErrorDtl")
    protected EPDPersonErrorDtlType dependentInfoErrorDtl;
    @XmlElement(name = "EmployerMECErrorDtl")
    protected List<EmployerMECErrorDtlType> employerMECErrorDtl;
    @XmlElement(name = "EPDErrorDetail")
    protected List<EPDErrorDetailType> epdErrorDetail;

    /**
     * Gets the value of the dependentInfoErrorDtl property.
     * 
     * @return
     *     possible object is
     *     {@link EPDPersonErrorDtlType }
     *     
     */
    public EPDPersonErrorDtlType getDependentInfoErrorDtl() {
        return dependentInfoErrorDtl;
    }

    /**
     * Sets the value of the dependentInfoErrorDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPDPersonErrorDtlType }
     *     
     */
    public void setDependentInfoErrorDtl(EPDPersonErrorDtlType value) {
        this.dependentInfoErrorDtl = value;
    }

    /**
     * Gets the value of the employerMECErrorDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employerMECErrorDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployerMECErrorDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployerMECErrorDtlType }
     * 
     * 
     */
    public List<EmployerMECErrorDtlType> getEmployerMECErrorDtl() {
        if (employerMECErrorDtl == null) {
            employerMECErrorDtl = new ArrayList<EmployerMECErrorDtlType>();
        }
        return this.employerMECErrorDtl;
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
