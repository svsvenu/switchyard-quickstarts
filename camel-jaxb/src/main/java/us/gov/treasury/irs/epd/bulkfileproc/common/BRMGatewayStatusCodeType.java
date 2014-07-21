
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BRMGatewayStatusCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BRMGatewayStatusCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NEW"/>
 *     &lt;enumeration value="INPROCESS"/>
 *     &lt;enumeration value="CHUNKED"/>
 *     &lt;enumeration value="ERROR"/>
 *     &lt;enumeration value="CHUNKS RECEIVED"/>
 *     &lt;enumeration value="RESPONSE FILE CONSOLIDATED"/>
 *     &lt;enumeration value="BRM GATEWAY NOTIFIED"/>
 *     &lt;enumeration value="RESPONSE SUBMITTED TO CMS"/>
 *     &lt;enumeration value="COMPLETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BRMGatewayStatusCodeType")
@XmlEnum
public enum BRMGatewayStatusCodeType {

    NEW("NEW"),
    INPROCESS("INPROCESS"),
    CHUNKED("CHUNKED"),
    ERROR("ERROR"),
    @XmlEnumValue("CHUNKS RECEIVED")
    CHUNKS_RECEIVED("CHUNKS RECEIVED"),
    @XmlEnumValue("RESPONSE FILE CONSOLIDATED")
    RESPONSE_FILE_CONSOLIDATED("RESPONSE FILE CONSOLIDATED"),
    @XmlEnumValue("BRM GATEWAY NOTIFIED")
    BRM_GATEWAY_NOTIFIED("BRM GATEWAY NOTIFIED"),
    @XmlEnumValue("RESPONSE SUBMITTED TO CMS")
    RESPONSE_SUBMITTED_TO_CMS("RESPONSE SUBMITTED TO CMS"),
    COMPLETED("COMPLETED");
    private final String value;

    BRMGatewayStatusCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BRMGatewayStatusCodeType fromValue(String v) {
        for (BRMGatewayStatusCodeType c: BRMGatewayStatusCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
