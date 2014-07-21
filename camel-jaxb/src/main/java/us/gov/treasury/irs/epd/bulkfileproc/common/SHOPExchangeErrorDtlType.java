
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;SHOP Exchange Error Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;20013-04-15&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;The error detail elements associated with SHOP exchange group&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for SHOPExchangeErrorDtlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SHOPExchangeErrorDtlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EIN"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SHOPEmployerErrorDtl" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SHOPExchangeErrorDtlType", propOrder = {
    "ein",
    "shopEmployerErrorDtl",
    "epdErrorDetail"
})
public class SHOPExchangeErrorDtlType {

    @XmlElement(name = "EIN", required = true)
    protected String ein;
    @XmlElement(name = "SHOPEmployerErrorDtl")
    protected List<SHOPEmployerErrorDtlType> shopEmployerErrorDtl;
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
     * Gets the value of the shopEmployerErrorDtl property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shopEmployerErrorDtl property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSHOPEmployerErrorDtl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SHOPEmployerErrorDtlType }
     * 
     * 
     */
    public List<SHOPEmployerErrorDtlType> getSHOPEmployerErrorDtl() {
        if (shopEmployerErrorDtl == null) {
            shopEmployerErrorDtl = new ArrayList<SHOPEmployerErrorDtlType>();
        }
        return this.shopEmployerErrorDtl;
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
