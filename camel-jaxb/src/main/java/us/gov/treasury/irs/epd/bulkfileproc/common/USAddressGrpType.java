
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;US Address Group Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-01-08&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Type for a Exchange Periodic Data person address &lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for USAddressGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="USAddressGrpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}AddressLine1Txt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}AddressLine2Txt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}CityNm"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}USStateCd"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}USZIPCd"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}USZIPExtensionCd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USAddressGrpType", propOrder = {
    "addressLine1Txt",
    "addressLine2Txt",
    "cityNm",
    "usStateCd",
    "uszipCd",
    "uszipExtensionCd"
})
public class USAddressGrpType {

    @XmlElement(name = "AddressLine1Txt", required = true)
    protected String addressLine1Txt;
    @XmlElement(name = "AddressLine2Txt")
    protected String addressLine2Txt;
    @XmlElement(name = "CityNm", required = true)
    protected String cityNm;
    @XmlElement(name = "USStateCd", required = true)
    protected USStateCdType usStateCd;
    @XmlElement(name = "USZIPCd", required = true)
    protected String uszipCd;
    @XmlElement(name = "USZIPExtensionCd")
    protected String uszipExtensionCd;

    /**
     * Gets the value of the addressLine1Txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1Txt() {
        return addressLine1Txt;
    }

    /**
     * Sets the value of the addressLine1Txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1Txt(String value) {
        this.addressLine1Txt = value;
    }

    /**
     * Gets the value of the addressLine2Txt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2Txt() {
        return addressLine2Txt;
    }

    /**
     * Sets the value of the addressLine2Txt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2Txt(String value) {
        this.addressLine2Txt = value;
    }

    /**
     * Gets the value of the cityNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityNm() {
        return cityNm;
    }

    /**
     * Sets the value of the cityNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityNm(String value) {
        this.cityNm = value;
    }

    /**
     * Gets the value of the usStateCd property.
     * 
     * @return
     *     possible object is
     *     {@link USStateCdType }
     *     
     */
    public USStateCdType getUSStateCd() {
        return usStateCd;
    }

    /**
     * Sets the value of the usStateCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link USStateCdType }
     *     
     */
    public void setUSStateCd(USStateCdType value) {
        this.usStateCd = value;
    }

    /**
     * Gets the value of the uszipCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSZIPCd() {
        return uszipCd;
    }

    /**
     * Sets the value of the uszipCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSZIPCd(String value) {
        this.uszipCd = value;
    }

    /**
     * Gets the value of the uszipExtensionCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUSZIPExtensionCd() {
        return uszipExtensionCd;
    }

    /**
     * Sets the value of the uszipExtensionCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUSZIPExtensionCd(String value) {
        this.uszipExtensionCd = value;
    }

}
