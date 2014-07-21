
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EPDSubmissionSourceCdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EPDSubmissionSourceCdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Individual"/>
 *     &lt;enumeration value="SHOP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EPDSubmissionSourceCdType")
@XmlEnum
public enum EPDSubmissionSourceCdType {

    @XmlEnumValue("Individual")
    INDIVIDUAL("Individual"),
    SHOP("SHOP");
    private final String value;

    EPDSubmissionSourceCdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EPDSubmissionSourceCdType fromValue(String v) {
        for (EPDSubmissionSourceCdType c: EPDSubmissionSourceCdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
