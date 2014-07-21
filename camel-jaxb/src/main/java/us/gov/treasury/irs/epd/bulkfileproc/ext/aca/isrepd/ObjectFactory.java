
package us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import us.gov.treasury.irs.epd.bulkfileproc.common.ErrorMessageDetailType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BatchCategoryCd_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "BatchCategoryCd");
    private final static QName _BatchAttachmentTransmissionQty_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "BatchAttachmentTransmissionQty");
    private final static QName _BatchPartnerId_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "BatchPartnerId");
    private final static QName _ACABatchManifestDetailList_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "ACABatchManifestDetailList");
    private final static QName _MissingBatchDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "MissingBatchDetail");
    private final static QName _BatchTransmissionQty_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "BatchTransmissionQty");
    private final static QName _SequenceNum_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "SequenceNum");
    private final static QName _ResponseDeliveryDateTs_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "ResponseDeliveryDateTs");
    private final static QName _RequestResponseMetricsDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "RequestResponseMetricsDetail");
    private final static QName _AttachmentByteSizeNum_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "AttachmentByteSizeNum");
    private final static QName _ACABatchManifestDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "ACABatchManifestDetail");
    private final static QName _ACABatchManifestResponseDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "ACABatchManifestResponseDetail");
    private final static QName _DocumentSystemFileNm_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "DocumentSystemFileNm");
    private final static QName _FileStatusCd_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "FileStatusCd");
    private final static QName _ACAAttachmentDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "ACAAttachmentDetail");
    private final static QName _CMSResponseDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "CMSResponseDetail");
    private final static QName _ServiceLevelMetaDataDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "ServiceLevelMetaDataDetail");
    private final static QName _TransmissionAttachmentQty_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "TransmissionAttachmentQty");
    private final static QName _RequestReceiptDateTs_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "RequestReceiptDateTs");
    private final static QName _ACABulkBatchManifestDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "ACABulkBatchManifestDetail");
    private final static QName _MissingFileManifestDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "MissingFileManifestDetail");
    private final static QName _ACABatchTransmissionDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "ACABatchTransmissionDetail");
    private final static QName _MissingFileManifestDetailList_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "MissingFileManifestDetailList");
    private final static QName _ACABatchDetail_QNAME = new QName("urn:us:gov:treasury:irs:ext:aca:isr:4.0", "ACABatchDetail");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ACABatchManifestResponseDetailType }
     * 
     */
    public ACABatchManifestResponseDetailType createACABatchManifestResponseDetailType() {
        return new ACABatchManifestResponseDetailType();
    }

    /**
     * Create an instance of {@link ACABulkBatchManifestDetailType }
     * 
     */
    public ACABulkBatchManifestDetailType createACABulkBatchManifestDetailType() {
        return new ACABulkBatchManifestDetailType();
    }

    /**
     * Create an instance of {@link ACABatchTransmissionDetailType }
     * 
     */
    public ACABatchTransmissionDetailType createACABatchTransmissionDetailType() {
        return new ACABatchTransmissionDetailType();
    }

    /**
     * Create an instance of {@link MissingFileManifestDetailListType }
     * 
     */
    public MissingFileManifestDetailListType createMissingFileManifestDetailListType() {
        return new MissingFileManifestDetailListType();
    }

    /**
     * Create an instance of {@link ACABatchDetailType }
     * 
     */
    public ACABatchDetailType createACABatchDetailType() {
        return new ACABatchDetailType();
    }

    /**
     * Create an instance of {@link ACAAttachmentDetailType }
     * 
     */
    public ACAAttachmentDetailType createACAAttachmentDetailType() {
        return new ACAAttachmentDetailType();
    }

    /**
     * Create an instance of {@link ACABatchManifestDetailListType }
     * 
     */
    public ACABatchManifestDetailListType createACABatchManifestDetailListType() {
        return new ACABatchManifestDetailListType();
    }

    /**
     * Create an instance of {@link MissingBatchDetailType }
     * 
     */
    public MissingBatchDetailType createMissingBatchDetailType() {
        return new MissingBatchDetailType();
    }

    /**
     * Create an instance of {@link MissingFileManifestDetailType }
     * 
     */
    public MissingFileManifestDetailType createMissingFileManifestDetailType() {
        return new MissingFileManifestDetailType();
    }

    /**
     * Create an instance of {@link RequestResponseMetricsDetailType }
     * 
     */
    public RequestResponseMetricsDetailType createRequestResponseMetricsDetailType() {
        return new RequestResponseMetricsDetailType();
    }

    /**
     * Create an instance of {@link ACABatchManifestDetailType }
     * 
     */
    public ACABatchManifestDetailType createACABatchManifestDetailType() {
        return new ACABatchManifestDetailType();
    }

    /**
     * Create an instance of {@link ServiceLevelMetaDataDetailType }
     * 
     */
    public ServiceLevelMetaDataDetailType createServiceLevelMetaDataDetailType() {
        return new ServiceLevelMetaDataDetailType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchCategoryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "BatchCategoryCd")
    public JAXBElement<BatchCategoryCodeType> createBatchCategoryCd(BatchCategoryCodeType value) {
        return new JAXBElement<BatchCategoryCodeType>(_BatchCategoryCd_QNAME, BatchCategoryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "BatchAttachmentTransmissionQty")
    public JAXBElement<BigInteger> createBatchAttachmentTransmissionQty(BigInteger value) {
        return new JAXBElement<BigInteger>(_BatchAttachmentTransmissionQty_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "BatchPartnerId")
    public JAXBElement<String> createBatchPartnerId(String value) {
        return new JAXBElement<String>(_BatchPartnerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABatchManifestDetailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "ACABatchManifestDetailList")
    public JAXBElement<ACABatchManifestDetailListType> createACABatchManifestDetailList(ACABatchManifestDetailListType value) {
        return new JAXBElement<ACABatchManifestDetailListType>(_ACABatchManifestDetailList_QNAME, ACABatchManifestDetailListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MissingBatchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "MissingBatchDetail")
    public JAXBElement<MissingBatchDetailType> createMissingBatchDetail(MissingBatchDetailType value) {
        return new JAXBElement<MissingBatchDetailType>(_MissingBatchDetail_QNAME, MissingBatchDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "BatchTransmissionQty")
    public JAXBElement<BigInteger> createBatchTransmissionQty(BigInteger value) {
        return new JAXBElement<BigInteger>(_BatchTransmissionQty_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "SequenceNum")
    public JAXBElement<BigInteger> createSequenceNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_SequenceNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "ResponseDeliveryDateTs")
    public JAXBElement<XMLGregorianCalendar> createResponseDeliveryDateTs(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ResponseDeliveryDateTs_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestResponseMetricsDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "RequestResponseMetricsDetail")
    public JAXBElement<RequestResponseMetricsDetailType> createRequestResponseMetricsDetail(RequestResponseMetricsDetailType value) {
        return new JAXBElement<RequestResponseMetricsDetailType>(_RequestResponseMetricsDetail_QNAME, RequestResponseMetricsDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "AttachmentByteSizeNum")
    public JAXBElement<BigInteger> createAttachmentByteSizeNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_AttachmentByteSizeNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABatchManifestDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "ACABatchManifestDetail")
    public JAXBElement<ACABatchManifestDetailType> createACABatchManifestDetail(ACABatchManifestDetailType value) {
        return new JAXBElement<ACABatchManifestDetailType>(_ACABatchManifestDetail_QNAME, ACABatchManifestDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABatchManifestResponseDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "ACABatchManifestResponseDetail")
    public JAXBElement<ACABatchManifestResponseDetailType> createACABatchManifestResponseDetail(ACABatchManifestResponseDetailType value) {
        return new JAXBElement<ACABatchManifestResponseDetailType>(_ACABatchManifestResponseDetail_QNAME, ACABatchManifestResponseDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "DocumentSystemFileNm")
    public JAXBElement<String> createDocumentSystemFileNm(String value) {
        return new JAXBElement<String>(_DocumentSystemFileNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileStatusCdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "FileStatusCd")
    public JAXBElement<FileStatusCdType> createFileStatusCd(FileStatusCdType value) {
        return new JAXBElement<FileStatusCdType>(_FileStatusCd_QNAME, FileStatusCdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACAAttachmentDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "ACAAttachmentDetail")
    public JAXBElement<ACAAttachmentDetailType> createACAAttachmentDetail(ACAAttachmentDetailType value) {
        return new JAXBElement<ACAAttachmentDetailType>(_ACAAttachmentDetail_QNAME, ACAAttachmentDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorMessageDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "CMSResponseDetail")
    public JAXBElement<ErrorMessageDetailType> createCMSResponseDetail(ErrorMessageDetailType value) {
        return new JAXBElement<ErrorMessageDetailType>(_CMSResponseDetail_QNAME, ErrorMessageDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceLevelMetaDataDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "ServiceLevelMetaDataDetail")
    public JAXBElement<ServiceLevelMetaDataDetailType> createServiceLevelMetaDataDetail(ServiceLevelMetaDataDetailType value) {
        return new JAXBElement<ServiceLevelMetaDataDetailType>(_ServiceLevelMetaDataDetail_QNAME, ServiceLevelMetaDataDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "TransmissionAttachmentQty")
    public JAXBElement<BigInteger> createTransmissionAttachmentQty(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransmissionAttachmentQty_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "RequestReceiptDateTs")
    public JAXBElement<XMLGregorianCalendar> createRequestReceiptDateTs(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RequestReceiptDateTs_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABulkBatchManifestDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "ACABulkBatchManifestDetail")
    public JAXBElement<ACABulkBatchManifestDetailType> createACABulkBatchManifestDetail(ACABulkBatchManifestDetailType value) {
        return new JAXBElement<ACABulkBatchManifestDetailType>(_ACABulkBatchManifestDetail_QNAME, ACABulkBatchManifestDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MissingFileManifestDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "MissingFileManifestDetail")
    public JAXBElement<MissingFileManifestDetailType> createMissingFileManifestDetail(MissingFileManifestDetailType value) {
        return new JAXBElement<MissingFileManifestDetailType>(_MissingFileManifestDetail_QNAME, MissingFileManifestDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABatchTransmissionDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "ACABatchTransmissionDetail")
    public JAXBElement<ACABatchTransmissionDetailType> createACABatchTransmissionDetail(ACABatchTransmissionDetailType value) {
        return new JAXBElement<ACABatchTransmissionDetailType>(_ACABatchTransmissionDetail_QNAME, ACABatchTransmissionDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MissingFileManifestDetailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "MissingFileManifestDetailList")
    public JAXBElement<MissingFileManifestDetailListType> createMissingFileManifestDetailList(MissingFileManifestDetailListType value) {
        return new JAXBElement<MissingFileManifestDetailListType>(_MissingFileManifestDetailList_QNAME, MissingFileManifestDetailListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABatchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:ext:aca:isr:4.0", name = "ACABatchDetail")
    public JAXBElement<ACABatchDetailType> createACABatchDetail(ACABatchDetailType value) {
        return new JAXBElement<ACABatchDetailType>(_ACABatchDetail_QNAME, ACABatchDetailType.class, null, value);
    }

}
