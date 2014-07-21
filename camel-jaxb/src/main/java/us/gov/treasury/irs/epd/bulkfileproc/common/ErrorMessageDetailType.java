
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Error Message Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2012-11-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;Description&gt;A group that provides error message related information&lt;/Description&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ErrorMessageDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ErrorMessageDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ErrorMessageCd"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ErrorMessageTxt" minOccurs="0"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}XpathContent" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ErrorMessageDetailType", propOrder = {
    "errorMessageCd",
    "errorMessageTxt",
    "xpathContent"
})
public class ErrorMessageDetailType {

    @XmlElement(name = "ErrorMessageCd", required = true)
    protected String errorMessageCd;
    @XmlElement(name = "ErrorMessageTxt")
    protected String errorMessageTxt;
    @XmlElement(name = "XpathContent")
    protected String xpathContent;

    /**
     * Gets the value of the errorMessageCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessageCd() {
        return errorMessageCd;
    }

    /**
     * Sets the value of the errorMessageCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessageCd(String value) {
        this.errorMessageCd = value;
    }

    /**
     * Gets the value of the errorMessageTxt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessageTxt() {
        return errorMessageTxt;
    }

    /**
     * Sets the value of the errorMessageTxt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessageTxt(String value) {
        this.errorMessageTxt = value;
    }

    /**
     * Gets the value of the xpathContent property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXpathContent() {
        return xpathContent;
    }

    /**
     * Sets the value of the xpathContent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXpathContent(String value) {
        this.xpathContent = value;
    }

}
