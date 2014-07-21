
package us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:ext:aca:isr:4.0" xmlns:irs="urn:us:gov:treasury:irs:common" xmlns:xmime="http://www.w3.org/2005/05/xmlmime" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Affordable Care Act (ACA) Missing Batch Detail Group&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-01-01&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;Global type for the ACA Missing Batch Detail Type&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MissingBatchDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MissingBatchDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:ext:aca:isr:4.0}ACABatchDetail"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}MissingDocumentSequenceNum" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MissingBatchDetailType", propOrder = {
    "acaBatchDetail",
    "missingDocumentSequenceNum"
})
public class MissingBatchDetailType {

    @XmlElement(name = "ACABatchDetail", required = true)
    protected ACABatchDetailType acaBatchDetail;
    @XmlElement(name = "MissingDocumentSequenceNum", namespace = "urn:us:gov:treasury:irs:common", required = true)
    protected List<BigInteger> missingDocumentSequenceNum;

    /**
     * Gets the value of the acaBatchDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ACABatchDetailType }
     *     
     */
    public ACABatchDetailType getACABatchDetail() {
        return acaBatchDetail;
    }

    /**
     * Sets the value of the acaBatchDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ACABatchDetailType }
     *     
     */
    public void setACABatchDetail(ACABatchDetailType value) {
        this.acaBatchDetail = value;
    }

    /**
     * Gets the value of the missingDocumentSequenceNum property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the missingDocumentSequenceNum property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMissingDocumentSequenceNum().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getMissingDocumentSequenceNum() {
        if (missingDocumentSequenceNum == null) {
            missingDocumentSequenceNum = new ArrayList<BigInteger>();
        }
        return this.missingDocumentSequenceNum;
    }

}
