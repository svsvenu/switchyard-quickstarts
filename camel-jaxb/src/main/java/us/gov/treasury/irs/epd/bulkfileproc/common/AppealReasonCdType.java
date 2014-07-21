
package us.gov.treasury.irs.epd.bulkfileproc.common;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AppealReasonCdType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AppealReasonCdType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Individual eligibility for coverage"/>
 *     &lt;enumeration value="Individual eligibility for exception"/>
 *     &lt;enumeration value="Individual eligibility for APTC"/>
 *     &lt;enumeration value="Employer does not offer MEC"/>
 *     &lt;enumeration value="Employer MEC is unaffordable"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AppealReasonCdType")
@XmlEnum
public enum AppealReasonCdType {

    @XmlEnumValue("Individual eligibility for coverage")
    INDIVIDUAL_ELIGIBILITY_FOR_COVERAGE("Individual eligibility for coverage"),
    @XmlEnumValue("Individual eligibility for exception")
    INDIVIDUAL_ELIGIBILITY_FOR_EXCEPTION("Individual eligibility for exception"),
    @XmlEnumValue("Individual eligibility for APTC")
    INDIVIDUAL_ELIGIBILITY_FOR_APTC("Individual eligibility for APTC"),
    @XmlEnumValue("Employer does not offer MEC")
    EMPLOYER_DOES_NOT_OFFER_MEC("Employer does not offer MEC"),
    @XmlEnumValue("Employer MEC is unaffordable")
    EMPLOYER_MEC_IS_UNAFFORDABLE("Employer MEC is unaffordable");
    private final String value;

    AppealReasonCdType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AppealReasonCdType fromValue(String v) {
        for (AppealReasonCdType c: AppealReasonCdType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
