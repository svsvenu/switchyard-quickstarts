
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Foreign Address Group Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-25&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;A group that wraps detail associated with a generic foreign address&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ForeignAddressGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForeignAddressGrpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}AddressLine1Txt"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}AddressLine2Txt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}CityNm" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element ref="{urn:us:gov:treasury:irs:common}CountryCd"/>
 *           &lt;element ref="{urn:us:gov:treasury:irs:common}CountryName"/>
 *         &lt;/choice>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ForeignProvinceNm" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ForeignPostalCd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForeignAddressGrpType", propOrder = {
    "addressLine1Txt",
    "addressLine2Txt",
    "cityNm",
    "countryCd",
    "countryName",
    "foreignProvinceNm",
    "foreignPostalCd"
})
public class ForeignAddressGrpType {

    @XmlElement(name = "AddressLine1Txt", required = true)
    protected String addressLine1Txt;
    @XmlElement(name = "AddressLine2Txt")
    protected String addressLine2Txt;
    @XmlElement(name = "CityNm")
    protected String cityNm;
    @XmlElement(name = "CountryCd")
    protected String countryCd;
    @XmlElement(name = "CountryName")
    protected String countryName;
    @XmlElement(name = "ForeignProvinceNm")
    protected String foreignProvinceNm;
    @XmlElement(name = "ForeignPostalCd")
    protected String foreignPostalCd;

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
     * Gets the value of the countryCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCd() {
        return countryCd;
    }

    /**
     * Sets the value of the countryCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCd(String value) {
        this.countryCd = value;
    }

    /**
     * Gets the value of the countryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Gets the value of the foreignProvinceNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignProvinceNm() {
        return foreignProvinceNm;
    }

    /**
     * Sets the value of the foreignProvinceNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignProvinceNm(String value) {
        this.foreignProvinceNm = value;
    }

    /**
     * Gets the value of the foreignPostalCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForeignPostalCd() {
        return foreignPostalCd;
    }

    /**
     * Sets the value of the foreignPostalCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForeignPostalCd(String value) {
        this.foreignPostalCd = value;
    }

}
