
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TINValidationIndicatorType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TINValidationIndicatorType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Pass"/>
 *     &lt;enumeration value="Fail"/>
 *     &lt;enumeration value="Not Executed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TINValidationIndicatorType")
@XmlEnum
public enum TINValidationIndicatorType {

    @XmlEnumValue("Pass")
    PASS("Pass"),
    @XmlEnumValue("Fail")
    FAIL("Fail"),
    @XmlEnumValue("Not Executed")
    NOT_EXECUTED("Not Executed");
    private final String value;

    TINValidationIndicatorType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TINValidationIndicatorType fromValue(String v) {
        for (TINValidationIndicatorType c: TINValidationIndicatorType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
