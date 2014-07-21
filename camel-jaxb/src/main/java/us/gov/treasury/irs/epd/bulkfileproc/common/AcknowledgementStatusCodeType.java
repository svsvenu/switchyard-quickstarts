
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcknowledgementStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcknowledgementStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUCCESS"/>
 *     &lt;enumeration value="FAILURE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcknowledgementStatusCodeType")
@XmlEnum
public enum AcknowledgementStatusCodeType {

    SUCCESS,
    FAILURE;

    public String value() {
        return name();
    }

    public static AcknowledgementStatusCodeType fromValue(String v) {
        return valueOf(v);
    }

}
