
package us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileStatusCdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileStatusCdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Rejected-Pending-Delivery"/>
 *     &lt;enumeration value="Rejected-Delivered-Success"/>
 *     &lt;enumeration value="Rejected-Delivered-Exception"/>
 *     &lt;enumeration value="Rejected-Delivery-Failed"/>
 *     &lt;enumeration value="Delivered-Success"/>
 *     &lt;enumeration value="Delivered-Exception"/>
 *     &lt;enumeration value="Delivery-Failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileStatusCdType")
@XmlEnum
public enum FileStatusCdType {

    @XmlEnumValue("Rejected-Pending-Delivery")
    REJECTED_PENDING_DELIVERY("Rejected-Pending-Delivery"),
    @XmlEnumValue("Rejected-Delivered-Success")
    REJECTED_DELIVERED_SUCCESS("Rejected-Delivered-Success"),
    @XmlEnumValue("Rejected-Delivered-Exception")
    REJECTED_DELIVERED_EXCEPTION("Rejected-Delivered-Exception"),
    @XmlEnumValue("Rejected-Delivery-Failed")
    REJECTED_DELIVERY_FAILED("Rejected-Delivery-Failed"),
    @XmlEnumValue("Delivered-Success")
    DELIVERED_SUCCESS("Delivered-Success"),
    @XmlEnumValue("Delivered-Exception")
    DELIVERED_EXCEPTION("Delivered-Exception"),
    @XmlEnumValue("Delivery-Failed")
    DELIVERY_FAILED("Delivery-Failed");
    private final String value;

    FileStatusCdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileStatusCdType fromValue(String v) {
        for (FileStatusCdType c: FileStatusCdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
