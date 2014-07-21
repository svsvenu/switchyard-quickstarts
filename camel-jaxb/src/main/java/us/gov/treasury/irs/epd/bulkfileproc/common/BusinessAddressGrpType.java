
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Business Address Group Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2008-01-08&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Type for a Exchange Periodic Data Business address &lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for BusinessAddressGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessAddressGrpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}USAddressGrp"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ForeignAddressGrp"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessAddressGrpType", propOrder = {
    "usAddressGrp",
    "foreignAddressGrp"
})
public class BusinessAddressGrpType {

    @XmlElement(name = "USAddressGrp")
    protected USAddressGrpType usAddressGrp;
    @XmlElement(name = "ForeignAddressGrp")
    protected ForeignAddressGrpType foreignAddressGrp;

    /**
     * Gets the value of the usAddressGrp property.
     * 
     * @return
     *     possible object is
     *     {@link USAddressGrpType }
     *     
     */
    public USAddressGrpType getUSAddressGrp() {
        return usAddressGrp;
    }

    /**
     * Sets the value of the usAddressGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link USAddressGrpType }
     *     
     */
    public void setUSAddressGrp(USAddressGrpType value) {
        this.usAddressGrp = value;
    }

    /**
     * Gets the value of the foreignAddressGrp property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignAddressGrpType }
     *     
     */
    public ForeignAddressGrpType getForeignAddressGrp() {
        return foreignAddressGrp;
    }

    /**
     * Sets the value of the foreignAddressGrp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignAddressGrpType }
     *     
     */
    public void setForeignAddressGrp(ForeignAddressGrpType value) {
        this.foreignAddressGrp = value;
    }

}
