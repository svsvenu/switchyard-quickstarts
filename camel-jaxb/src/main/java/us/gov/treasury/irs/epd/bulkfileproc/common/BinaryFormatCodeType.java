
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BinaryFormatCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BinaryFormatCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="application/xml"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BinaryFormatCodeType")
@XmlEnum
public enum BinaryFormatCodeType {

    @XmlEnumValue("application/xml")
    APPLICATION_XML("application/xml");
    private final String value;

    BinaryFormatCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BinaryFormatCodeType fromValue(String v) {
        for (BinaryFormatCodeType c: BinaryFormatCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
