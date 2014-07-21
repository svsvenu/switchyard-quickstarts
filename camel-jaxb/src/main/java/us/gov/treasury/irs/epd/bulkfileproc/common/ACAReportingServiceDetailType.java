
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) Reporting Service Detail Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA Reporting Service Detail Type&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ACAReportingServiceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ACAReportingServiceDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}ReportPeriodDate"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ACAReportingServiceDetailType", propOrder = {
    "reportPeriodDate"
})
public class ACAReportingServiceDetailType {

    @XmlElement(name = "ReportPeriodDate", required = true)
    protected ReportPeriodDateType reportPeriodDate;

    /**
     * Gets the value of the reportPeriodDate property.
     * 
     * @return
     *     possible object is
     *     {@link ReportPeriodDateType }
     *     
     */
    public ReportPeriodDateType getReportPeriodDate() {
        return reportPeriodDate;
    }

    /**
     * Sets the value of the reportPeriodDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportPeriodDateType }
     *     
     */
    public void setReportPeriodDate(ReportPeriodDateType value) {
        this.reportPeriodDate = value;
    }

}
