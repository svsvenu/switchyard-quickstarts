
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Rejected File Detail Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-07-29&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Type for rejected file details&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for RejectedFileDtlType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RejectedFileDtlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SubmissionRejectReasonCd"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}SubmissionRejectedFilesNum"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RejectedFileDtlType", propOrder = {
    "submissionRejectReasonCd",
    "submissionRejectedFilesNum"
})
public class RejectedFileDtlType {

    @XmlElement(name = "SubmissionRejectReasonCd", required = true)
    protected String submissionRejectReasonCd;
    @XmlElement(name = "SubmissionRejectedFilesNum", required = true)
    protected BigInteger submissionRejectedFilesNum;

    /**
     * Gets the value of the submissionRejectReasonCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmissionRejectReasonCd() {
        return submissionRejectReasonCd;
    }

    /**
     * Sets the value of the submissionRejectReasonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubmissionRejectReasonCd(String value) {
        this.submissionRejectReasonCd = value;
    }

    /**
     * Gets the value of the submissionRejectedFilesNum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSubmissionRejectedFilesNum() {
        return submissionRejectedFilesNum;
    }

    /**
     * Sets the value of the submissionRejectedFilesNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSubmissionRejectedFilesNum(BigInteger value) {
        this.submissionRejectedFilesNum = value;
    }

}
