
package us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BatchCategoryCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BatchCategoryCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IRS_EOM_IND_REQ"/>
 *     &lt;enumeration value="IRS_EOM_IND_RESUBMIT_FILE_REQ"/>
 *     &lt;enumeration value="IRS_EOM_IND_RESUBMIT_BATCH_REQ"/>
 *     &lt;enumeration value="IRS_EOM_IND_RESUBMIT_MISSING_FILE_REQ"/>
 *     &lt;enumeration value="IRS_EOM_SHOP_REQ"/>
 *     &lt;enumeration value="IRS_EOM_SHOP_RESUBMIT_FILE_REQ"/>
 *     &lt;enumeration value="IRS_EOM_SHOP_RESUBMIT_BATCH_REQ"/>
 *     &lt;enumeration value="IRS_EOM_SHOP_RESUBMIT_MISSING_FILE_REQ"/>
 *     &lt;enumeration value="IRS_EOY_IND_REQ"/>
 *     &lt;enumeration value="IRS_EOY_IND_RESUBMIT_FILE_REQ"/>
 *     &lt;enumeration value="IRS_EOY_IND_RESUBMIT_BATCH_REQ"/>
 *     &lt;enumeration value="IRS_EOY_IND_RESUBMIT_MISSING_FILE_REQ"/>
 *     &lt;enumeration value="IRS_APTC_REQ"/>
 *     &lt;enumeration value="IRS_IFSV_REQ"/>
 *     &lt;enumeration value="IRS_EOM_SUCCESS_RESP"/>
 *     &lt;enumeration value="IRS_EOM_ERROR_RESP"/>
 *     &lt;enumeration value="IRS_EOM_MISSING_FILE_RESP"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BatchCategoryCodeType")
@XmlEnum
public enum BatchCategoryCodeType {


    /**
     * Identifies End of Month Request processing
     * 
     */
    IRS_EOM_IND_REQ,

    /**
     * Identifies End of Month File Resubmit Request processing
     * 
     */
    IRS_EOM_IND_RESUBMIT_FILE_REQ,

    /**
     * Identifies End of Month Batch Resubmit Request processing
     * 
     */
    IRS_EOM_IND_RESUBMIT_BATCH_REQ,

    /**
     * Identifies End of Month Missing File Resubmit Request processing
     * 
     */
    IRS_EOM_IND_RESUBMIT_MISSING_FILE_REQ,

    /**
     * Identifies End of Month Request processing
     * 
     */
    IRS_EOM_SHOP_REQ,

    /**
     * Identifies End of Month File Resubmit Request processing
     * 
     */
    IRS_EOM_SHOP_RESUBMIT_FILE_REQ,

    /**
     * Identifies End of Month Batch Resubmit Request processing
     * 
     */
    IRS_EOM_SHOP_RESUBMIT_BATCH_REQ,

    /**
     * Identifies End of Month Missing File Resubmit Request processing
     * 
     */
    IRS_EOM_SHOP_RESUBMIT_MISSING_FILE_REQ,

    /**
     * Identifies End of year Request processing
     * 
     */
    IRS_EOY_IND_REQ,

    /**
     * Identifies End of Year File Resubmit Request processing
     * 
     */
    IRS_EOY_IND_RESUBMIT_FILE_REQ,

    /**
     * Identifies End of Year Batch Resubmit Request processing
     * 
     */
    IRS_EOY_IND_RESUBMIT_BATCH_REQ,

    /**
     * Identifies End of Year Missing File Resubmit Request processing
     * 
     */
    IRS_EOY_IND_RESUBMIT_MISSING_FILE_REQ,

    /**
     * Identifies APTC Request processing
     * 
     */
    IRS_APTC_REQ,

    /**
     * Identifies IFSV Request processing
     * 
     */
    IRS_IFSV_REQ,

    /**
     * Identifies End of Month Success Response processing
     * 
     */
    IRS_EOM_SUCCESS_RESP,

    /**
     * Identifies End of Month Error Response processing 
     * 
     */
    IRS_EOM_ERROR_RESP,

    /**
     * Identifies End of Month Missing File Response processing 
     * 
     */
    IRS_EOM_MISSING_FILE_RESP;

    public String value() {
        return name();
    }

    public static BatchCategoryCodeType fromValue(String v) {
        return valueOf(v);
    }

}
