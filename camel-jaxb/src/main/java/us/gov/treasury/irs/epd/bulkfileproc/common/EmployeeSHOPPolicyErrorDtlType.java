
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Employee SHOP Policy Error Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-06-19&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Type of employer SHOP policy error in the exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for EmployeeSHOPPolicyErrorDtlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmployeeSHOPPolicyErrorDtlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SHOPSpouseErrorDtl" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SHOPDependentErrorDtl" maxOccurs="99" minOccurs="0"/>
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
@XmlType(name = "EmployeeSHOPPolicyErrorDtlType", propOrder = {
    "shopSpouseErrorDtl",
    "shopDependentErrorDtl",
    "epdErrorDetail"
})
public class EmployeeSHOPPolicyErrorDtlType {

    @XmlElement(name = "SHOPSpouseErrorDtl")
    protected SHOPExchPersonErrorDtlType shopSpouseErrorDtl;
    @XmlElement(name = "SHOPDependentErrorDtl")
    protected List<SHOPExchPersonErrorDtlType> shopDependentErrorDtl;
    @XmlElement(name = "EPDErrorDetail")
    protected List<EPDErrorDetailType> epdErrorDetail;

    /**
     * Gets the value of the shopSpouseErrorDtl property.
     * 
     * @return
     *     possible object is
     *     {@link SHOPExchPersonErrorDtlType }
     *     
     */
    public SHOPExchPersonErrorDtlType getSHOPSpouseErrorDtl() {
        return shopSpouseErrorDtl;
    }

    /**
     * Sets the value of the shopSpouseErrorDtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SHOPExchPersonErrorDtlType }
     *     
     */
    public void setSHOPSpouseErrorDtl(SHOPExchPersonErrorDtlType value) {
        this.shopSpouseErrorDtl = value;
    }

    /**
     * Gets the value of the shopDependentErrorDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopDependentErrorDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHOPDependentErrorDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHOPExchPersonErrorDtlType }
     * 
     * 
     */
    public List<SHOPExchPersonErrorDtlType> getSHOPDependentErrorDtl() {
        if (shopDependentErrorDtl == null) {
            shopDependentErrorDtl = new ArrayList<SHOPExchPersonErrorDtlType>();
        }
        return this.shopDependentErrorDtl;
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
