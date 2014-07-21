
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
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;Component xmlns="urn:us:gov:treasury:irs:common" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;DictionaryEntryNm&gt;Dependent Group Type&lt;/DictionaryEntryNm&gt;&lt;MajorVersionNum&gt;1&lt;/MajorVersionNum&gt;&lt;MinorVersionNum&gt;0&lt;/MinorVersionNum&gt;&lt;VersionEffectiveBeginDt&gt;2013-05-21&lt;/VersionEffectiveBeginDt&gt;&lt;VersionDescriptionTxt&gt;Initial Version&lt;/VersionDescriptionTxt&gt;&lt;DescriptionTxt&gt;All the information about the dependent&lt;/DescriptionTxt&gt;&lt;/Component&gt;
 * </pre>
 * 
 * 
 * <p>Java class for DependentGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DependentGrpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}Dependent"/>
 *         &lt;element ref="{urn:us:gov:treasury:irs:common}EmployerMEC" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DependentGrpType", propOrder = {
    "dependent",
    "employerMEC"
})
public class DependentGrpType {

    @XmlElement(name = "Dependent", required = true)
    protected EPDPersonType dependent;
    @XmlElement(name = "EmployerMEC")
    protected List<EmployerMECType> employerMEC;

    /**
     * Gets the value of the dependent property.
     * 
     * @return
     *     possible object is
     *     {@link EPDPersonType }
     *     
     */
    public EPDPersonType getDependent() {
        return dependent;
    }

    /**
     * Sets the value of the dependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPDPersonType }
     *     
     */
    public void setDependent(EPDPersonType value) {
        this.dependent = value;
    }

    /**
     * Gets the value of the employerMEC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employerMEC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployerMEC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployerMECType }
     * 
     * 
     */
    public List<EmployerMECType> getEmployerMEC() {
        if (employerMEC == null) {
            employerMEC = new ArrayList<EmployerMECType>();
        }
        return this.employerMEC;
    }

}
