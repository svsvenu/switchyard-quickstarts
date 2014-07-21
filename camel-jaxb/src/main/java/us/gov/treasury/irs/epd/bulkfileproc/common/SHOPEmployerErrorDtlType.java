
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;SHOP Employer Error Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-04-15&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;SHOP employer policy error details in the exchange generated monthly report&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SHOPEmployerErrorDtlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SHOPEmployerErrorDtlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EIN"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SHOPEmployerInfoErrorDtl" maxOccurs="12"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SHOPEmployeeErrorDtl" maxOccurs="1000"/>
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
@XmlType(name = "SHOPEmployerErrorDtlType", propOrder = {
    "ein",
    "shopEmployerInfoErrorDtl",
    "shopEmployeeErrorDtl",
    "epdErrorDetail"
})
public class SHOPEmployerErrorDtlType {

    @XmlElement(name = "EIN", required = true)
    protected String ein;
    @XmlElement(name = "SHOPEmployerInfoErrorDtl", required = true)
    protected List<SHOPEmployerInfoErrorDtlType> shopEmployerInfoErrorDtl;
    @XmlElement(name = "SHOPEmployeeErrorDtl", required = true)
    protected List<SHOPEmployeeErrorDtlType> shopEmployeeErrorDtl;
    @XmlElement(name = "EPDErrorDetail")
    protected List<EPDErrorDetailType> epdErrorDetail;

    /**
     * Gets the value of the ein property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIN() {
        return ein;
    }

    /**
     * Sets the value of the ein property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEIN(String value) {
        this.ein = value;
    }

    /**
     * Gets the value of the shopEmployerInfoErrorDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopEmployerInfoErrorDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHOPEmployerInfoErrorDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHOPEmployerInfoErrorDtlType }
     * 
     * 
     */
    public List<SHOPEmployerInfoErrorDtlType> getSHOPEmployerInfoErrorDtl() {
        if (shopEmployerInfoErrorDtl == null) {
            shopEmployerInfoErrorDtl = new ArrayList<SHOPEmployerInfoErrorDtlType>();
        }
        return this.shopEmployerInfoErrorDtl;
    }

    /**
     * Gets the value of the shopEmployeeErrorDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopEmployeeErrorDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHOPEmployeeErrorDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHOPEmployeeErrorDtlType }
     * 
     * 
     */
    public List<SHOPEmployeeErrorDtlType> getSHOPEmployeeErrorDtl() {
        if (shopEmployeeErrorDtl == null) {
            shopEmployeeErrorDtl = new ArrayList<SHOPEmployeeErrorDtlType>();
        }
        return this.shopEmployeeErrorDtl;
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
