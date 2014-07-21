
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmissionValidationCdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SubmissionValidationCdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Valid"/>
 *     &lt;enumeration value="Invalid"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SubmissionValidationCdType")
@XmlEnum
public enum SubmissionValidationCdType {

    @XmlEnumValue("Valid")
    VALID("Valid"),
    @XmlEnumValue("Invalid")
    INVALID("Invalid");
    private final String value;

    SubmissionValidationCdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SubmissionValidationCdType fromValue(String v) {
        for (SubmissionValidationCdType c: SubmissionValidationCdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
