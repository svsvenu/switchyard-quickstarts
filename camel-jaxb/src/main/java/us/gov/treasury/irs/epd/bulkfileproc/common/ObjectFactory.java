
package us.gov.treasury.irs.epd.bulkfileproc.common;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.activation.DataHandler;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the us.gov.treasury.irs.epd.bulkfileproc.common package. 
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

    private final static QName _EPDSubmissionSourceCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "EPDSubmissionSourceCd");
    private final static QName _AddressLine2Txt_QNAME = new QName("urn:us:gov:treasury:irs:common", "AddressLine2Txt");
    private final static QName _TrackingStartDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "TrackingStartDt");
    private final static QName _ChunkId_QNAME = new QName("urn:us:gov:treasury:irs:common", "ChunkId");
    private final static QName _SubmissionRejectReasonCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "SubmissionRejectReasonCd");
    private final static QName _DocumentSequenceNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "DocumentSequenceNum");
    private final static QName _SystemDocumentId_QNAME = new QName("urn:us:gov:treasury:irs:common", "SystemDocumentId");
    private final static QName _CoverageEndDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "CoverageEndDt");
    private final static QName _ForeignProvinceNm_QNAME = new QName("urn:us:gov:treasury:irs:common", "ForeignProvinceNm");
    private final static QName _HouseholdErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "HouseholdErrorDtl");
    private final static QName _YearMonth_QNAME = new QName("urn:us:gov:treasury:irs:common", "YearMonth");
    private final static QName _TransmissionAttachmentQty_QNAME = new QName("urn:us:gov:treasury:irs:common", "TransmissionAttachmentQty");
    private final static QName _ForeignAddressErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "ForeignAddressErrorDtl");
    private final static QName _ACAReportingServiceDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "ACAReportingServiceDetail");
    private final static QName _ServiceResponseFileNm_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceResponseFileNm");
    private final static QName _TotalFilesSubmissionQty_QNAME = new QName("urn:us:gov:treasury:irs:common", "TotalFilesSubmissionQty");
    private final static QName _SubmissionInProcessFilesNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "SubmissionInProcessFilesNum");
    private final static QName _IRSHouseholdGrp_QNAME = new QName("urn:us:gov:treasury:irs:common", "IRSHouseholdGrp");
    private final static QName _PersonFirstName_QNAME = new QName("urn:us:gov:treasury:irs:common", "PersonFirstName");
    private final static QName _ServiceWindowCloseInd_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceWindowCloseInd");
    private final static QName _EmployeeRosterErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployeeRosterErrorDtl");
    private final static QName _BusinessAddressErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "BusinessAddressErrorDtl");
    private final static QName _ExemptionErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "ExemptionErrorDtl");
    private final static QName _SHOPExchangeErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPExchangeErrorDtl");
    private final static QName _TINValidationInd_QNAME = new QName("urn:us:gov:treasury:irs:common", "TINValidationInd");
    private final static QName _ACABusinessHeader_QNAME = new QName("urn:us:gov:treasury:irs:msg:acabusinessheader", "ACABusinessHeader");
    private final static QName _InsuranceCoverage_QNAME = new QName("urn:us:gov:treasury:irs:common", "InsuranceCoverage");
    private final static QName _SLCSPAdjMonthlyPremiumAmt_QNAME = new QName("urn:us:gov:treasury:irs:common", "SLCSPAdjMonthlyPremiumAmt");
    private final static QName _SpouseInfoErrorsGrp_QNAME = new QName("urn:us:gov:treasury:irs:common", "SpouseInfoErrorsGrp");
    private final static QName _PolicyCoverageEndDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "PolicyCoverageEndDt");
    private final static QName _ServiceRequestTotalRecordCnt_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceRequestTotalRecordCnt");
    private final static QName _QHPIssuerEIN_QNAME = new QName("urn:us:gov:treasury:irs:common", "QHPIssuerEIN");
    private final static QName _ACAAttachmentDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "ACAAttachmentDetail");
    private final static QName _ReportPeriodDate_QNAME = new QName("urn:us:gov:treasury:irs:common", "ReportPeriodDate");
    private final static QName _PolicyCoverageStartDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "PolicyCoverageStartDt");
    private final static QName _UserId_QNAME = new QName("urn:us:gov:treasury:irs:common", "UserId");
    private final static QName _BusinessNameErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "BusinessNameErrorDtl");
    private final static QName _ServiceRequestFileNm_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceRequestFileNm");
    private final static QName _Household_QNAME = new QName("urn:us:gov:treasury:irs:common", "Household");
    private final static QName _DocumentSystemFileNm_QNAME = new QName("urn:us:gov:treasury:irs:common", "DocumentSystemFileNm");
    private final static QName _ExemptPerson_QNAME = new QName("urn:us:gov:treasury:irs:common", "ExemptPerson");
    private final static QName _FileStatusCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "FileStatusCd");
    private final static QName _BinaryFormatCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "BinaryFormatCd");
    private final static QName _ServiceExecutionStatusDescriptionTxt_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceExecutionStatusDescriptionTxt");
    private final static QName _InsuredPersonErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "InsuredPersonErrorDtl");
    private final static QName _USStateCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "USStateCd");
    private final static QName _DependentInfoErrorsGrp_QNAME = new QName("urn:us:gov:treasury:irs:common", "DependentInfoErrorsGrp");
    private final static QName _EPDPersonErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "EPDPersonErrorDtl");
    private final static QName _FilesReceivingStartDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "FilesReceivingStartDt");
    private final static QName _APTCPaymentAmt_QNAME = new QName("urn:us:gov:treasury:irs:common", "APTCPaymentAmt");
    private final static QName _WindowCloseNotificationServiceDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "WindowCloseNotificationServiceDetail");
    private final static QName _TotalQHPMonthlyPremiumAmt_QNAME = new QName("urn:us:gov:treasury:irs:common", "TotalQHPMonthlyPremiumAmt");
    private final static QName _ACABatchManifestResponseDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "ACABatchManifestResponseDetail");
    private final static QName _ErrorMessageDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "ErrorMessageDetail");
    private final static QName _SHOPDependentErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPDependentErrorDtl");
    private final static QName _EPDErrorDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "EPDErrorDetail");
    private final static QName _FilesReceivingEndDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "FilesReceivingEndDt");
    private final static QName _OriginalBatchId_QNAME = new QName("urn:us:gov:treasury:irs:common", "OriginalBatchId");
    private final static QName _HealthExchangeId_QNAME = new QName("urn:us:gov:treasury:irs:common", "HealthExchangeId");
    private final static QName _ServiceVersionNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceVersionNum");
    private final static QName _MonthsExemptStartDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "MonthsExemptStartDt");
    private final static QName _CoverageHousehold_QNAME = new QName("urn:us:gov:treasury:irs:common", "CoverageHousehold");
    private final static QName _ACABatchDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "ACABatchDetail");
    private final static QName _TIN_QNAME = new QName("urn:us:gov:treasury:irs:common", "TIN");
    private final static QName _AddressLine1Txt_QNAME = new QName("urn:us:gov:treasury:irs:common", "AddressLine1Txt");
    private final static QName _DependentGrp_QNAME = new QName("urn:us:gov:treasury:irs:common", "DependentGrp");
    private final static QName _SHOPSpouse_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPSpouse");
    private final static QName _RejectedFileOrigSubmissionNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "RejectedFileOrigSubmissionNum");
    private final static QName _ChecksumAugmentationNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "ChecksumAugmentationNum");
    private final static QName _HouseholdAPTCAmt_QNAME = new QName("urn:us:gov:treasury:irs:common", "HouseholdAPTCAmt");
    private final static QName _SHOPEmployerErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPEmployerErrorDtl");
    private final static QName _EmployerQHPCoverageStartDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployerQHPCoverageStartDt");
    private final static QName _Primary_QNAME = new QName("urn:us:gov:treasury:irs:common", "Primary");
    private final static QName _ACABatchTransmissionDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "ACABatchTransmissionDetail");
    private final static QName _CountryName_QNAME = new QName("urn:us:gov:treasury:irs:common", "CountryName");
    private final static QName _ResponseCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "ResponseCd");
    private final static QName _OtherRelevantAdultErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "OtherRelevantAdultErrorDtl");
    private final static QName _FileStatusTxt_QNAME = new QName("urn:us:gov:treasury:irs:common", "FileStatusTxt");
    private final static QName _BRMGatewayStatusCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "BRMGatewayStatusCd");
    private final static QName _CompletePersonNameErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "CompletePersonNameErrorDtl");
    private final static QName _FileNm_QNAME = new QName("urn:us:gov:treasury:irs:common", "FileNm");
    private final static QName _Dependent_QNAME = new QName("urn:us:gov:treasury:irs:common", "Dependent");
    private final static QName _PrimaryInfoErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "PrimaryInfoErrorDtl");
    private final static QName _BatchId_QNAME = new QName("urn:us:gov:treasury:irs:common", "BatchId");
    private final static QName _QHPEligibilityDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "QHPEligibilityDt");
    private final static QName _MissingDocumentSequenceNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "MissingDocumentSequenceNum");
    private final static QName _CountryCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "CountryCd");
    private final static QName _IRSHouseholdErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "IRSHouseholdErrorDtl");
    private final static QName _ACABusinessHeaderResponse_QNAME = new QName("urn:us:gov:treasury:irs:msg:acabusinessheader", "ACABusinessHeaderResponse");
    private final static QName _ErrorValueTxt_QNAME = new QName("urn:us:gov:treasury:irs:common", "ErrorValueTxt");
    private final static QName _CityNm_QNAME = new QName("urn:us:gov:treasury:irs:common", "CityNm");
    private final static QName _SHOPDependent_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPDependent");
    private final static QName _ACABulkBatchManifestDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "ACABulkBatchManifestDetail");
    private final static QName _AcknowledgementStatusCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "AcknowledgementStatusCd");
    private final static QName _EmployeeCoverageErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployeeCoverageErrorDtl");
    private final static QName _EIN_QNAME = new QName("urn:us:gov:treasury:irs:common", "EIN");
    private final static QName _QHPPolicyNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "QHPPolicyNum");
    private final static QName _EmployerQHPPremiumContriPct_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployerQHPPremiumContriPct");
    private final static QName _SHOPEmployer_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPEmployer");
    private final static QName _BusinessNameLine2_QNAME = new QName("urn:us:gov:treasury:irs:common", "BusinessNameLine2");
    private final static QName _BusinessNameLine1_QNAME = new QName("urn:us:gov:treasury:irs:common", "BusinessNameLine1");
    private final static QName _MonthsOfferedCoverageInd_QNAME = new QName("urn:us:gov:treasury:irs:common", "MonthsOfferedCoverageInd");
    private final static QName _BulkExchangeFile_QNAME = new QName("urn:us:gov:treasury:irs:common", "BulkExchangeFile");
    private final static QName _Year_QNAME = new QName("urn:us:gov:treasury:irs:common", "Year");
    private final static QName _IndividualExchange_QNAME = new QName("urn:us:gov:treasury:irs:common", "IndividualExchange");
    private final static QName _ServiceRequestFileLocationTxt_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceRequestFileLocationTxt");
    private final static QName _InsurancePolicy_QNAME = new QName("urn:us:gov:treasury:irs:common", "InsurancePolicy");
    private final static QName _SHOPExchangePerson_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPExchangePerson");
    private final static QName _EmployerMECErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployerMECErrorDtl");
    private final static QName _SHOPEmployee_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPEmployee");
    private final static QName _MessageSourceSystemNm_QNAME = new QName("urn:us:gov:treasury:irs:common", "MessageSourceSystemNm");
    private final static QName _ResponseCodeDescription_QNAME = new QName("urn:us:gov:treasury:irs:common", "ResponseCodeDescription");
    private final static QName _AssociatedPolicyErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "AssociatedPolicyErrorDtl");
    private final static QName _ExemptionCoverage_QNAME = new QName("urn:us:gov:treasury:irs:common", "ExemptionCoverage");
    private final static QName _FileProcessingStartDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "FileProcessingStartDt");
    private final static QName _BirthDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "BirthDt");
    private final static QName _TotalHsldMonthlyPremiumAmt_QNAME = new QName("urn:us:gov:treasury:irs:common", "TotalHsldMonthlyPremiumAmt");
    private final static QName _BatchTransmissionQty_QNAME = new QName("urn:us:gov:treasury:irs:common", "BatchTransmissionQty");
    private final static QName _CompletePersonName_QNAME = new QName("urn:us:gov:treasury:irs:common", "CompletePersonName");
    private final static QName _ExemptionCertificateNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "ExemptionCertificateNum");
    private final static QName _SubmissionProcessedFilesNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "SubmissionProcessedFilesNum");
    private final static QName _AssociatedPolicy_QNAME = new QName("urn:us:gov:treasury:irs:common", "AssociatedPolicy");
    private final static QName _TotalNumOfRejectedFilesQty_QNAME = new QName("urn:us:gov:treasury:irs:common", "TotalNumOfRejectedFilesQty");
    private final static QName _EmployerQHPCoverageTermDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployerQHPCoverageTermDt");
    private final static QName _ServiceRequestCreatedTs_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceRequestCreatedTs");
    private final static QName _SHOPIdentificationNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPIdentificationNum");
    private final static QName _CoveredIndividual_QNAME = new QName("urn:us:gov:treasury:irs:common", "CoveredIndividual");
    private final static QName _SubmissionMissingFilesNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "SubmissionMissingFilesNum");
    private final static QName _EmployerMEC_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployerMEC");
    private final static QName _ApplicableCoverageYr_QNAME = new QName("urn:us:gov:treasury:irs:common", "ApplicableCoverageYr");
    private final static QName _ACABatchManifestDetailList_QNAME = new QName("urn:us:gov:treasury:irs:common", "ACABatchManifestDetailList");
    private final static QName _PersonLastName_QNAME = new QName("urn:us:gov:treasury:irs:common", "PersonLastName");
    private final static QName _PrimaryGrp_QNAME = new QName("urn:us:gov:treasury:irs:common", "PrimaryGrp");
    private final static QName _OriginalBatchIdPresenceInd_QNAME = new QName("urn:us:gov:treasury:irs:common", "OriginalBatchIdPresenceInd");
    private final static QName _ValidExchangeInd_QNAME = new QName("urn:us:gov:treasury:irs:common", "ValidExchangeInd");
    private final static QName _SHOPEmployeeErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPEmployeeErrorDtl");
    private final static QName _USZIPCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "USZIPCd");
    private final static QName _SHOPEmployerInfo_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPEmployerInfo");
    private final static QName _TaxHouseholdCoverageErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "TaxHouseholdCoverageErrorDtl");
    private final static QName _SubmissionYr_QNAME = new QName("urn:us:gov:treasury:irs:common", "SubmissionYr");
    private final static QName _CoveredIndividualErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "CoveredIndividualErrorDtl");
    private final static QName _MECStatusInd_QNAME = new QName("urn:us:gov:treasury:irs:common", "MECStatusInd");
    private final static QName _PersonInformation_QNAME = new QName("urn:us:gov:treasury:irs:common", "PersonInformation");
    private final static QName _ServiceRequestReceivedTs_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceRequestReceivedTs");
    private final static QName _EmployeeQHPShareOfPremiumAmt_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployeeQHPShareOfPremiumAmt");
    private final static QName _BatchPartnerId_QNAME = new QName("urn:us:gov:treasury:irs:common", "BatchPartnerId");
    private final static QName _TaxpayerValidityCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "TaxpayerValidityCd");
    private final static QName _EmployerPlansOfferedErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployerPlansOfferedErrorDtl");
    private final static QName _PrimaryInfoErrorsGrp_QNAME = new QName("urn:us:gov:treasury:irs:common", "PrimaryInfoErrorsGrp");
    private final static QName _USZIPExtensionCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "USZIPExtensionCd");
    private final static QName _SHOPExchange_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPExchange");
    private final static QName _TaxHouseholdErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "TaxHouseholdErrorDtl");
    private final static QName _Timestamp_QNAME = new QName("urn:us:gov:treasury:irs:common", "Timestamp");
    private final static QName _Spouse_QNAME = new QName("urn:us:gov:treasury:irs:common", "Spouse");
    private final static QName _ServiceRequestFileSizeTxt_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceRequestFileSizeTxt");
    private final static QName _DependentInfoErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "DependentInfoErrorDtl");
    private final static QName _ExemptionCoverageErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "ExemptionCoverageErrorDtl");
    private final static QName _BusinessName_QNAME = new QName("urn:us:gov:treasury:irs:common", "BusinessName");
    private final static QName _SSN_QNAME = new QName("urn:us:gov:treasury:irs:common", "SSN");
    private final static QName _InsuredPerson_QNAME = new QName("urn:us:gov:treasury:irs:common", "InsuredPerson");
    private final static QName _SHOPExchangeError_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPExchangeError");
    private final static QName _InsurancePolicyErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "InsurancePolicyErrorDtl");
    private final static QName _SuffixName_QNAME = new QName("urn:us:gov:treasury:irs:common", "SuffixName");
    private final static QName _ServiceResponseFileCreatedTs_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceResponseFileCreatedTs");
    private final static QName _EPDPerson_QNAME = new QName("urn:us:gov:treasury:irs:common", "EPDPerson");
    private final static QName _SubmissionTotalNumOfFilesQty_QNAME = new QName("urn:us:gov:treasury:irs:common", "SubmissionTotalNumOfFilesQty");
    private final static QName _TrackingEndDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "TrackingEndDt");
    private final static QName _LastUpdatedTs_QNAME = new QName("urn:us:gov:treasury:irs:common", "LastUpdatedTs");
    private final static QName _IndividualSHOPInd_QNAME = new QName("urn:us:gov:treasury:irs:common", "IndividualSHOPInd");
    private final static QName _TaxHouseholdCoverage_QNAME = new QName("urn:us:gov:treasury:irs:common", "TaxHouseholdCoverage");
    private final static QName _InternalDocumentSystemFileNm_QNAME = new QName("urn:us:gov:treasury:irs:common", "InternalDocumentSystemFileNm");
    private final static QName _BatchCategoryCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "BatchCategoryCd");
    private final static QName _BatchAttachmentTransmissionQty_QNAME = new QName("urn:us:gov:treasury:irs:common", "BatchAttachmentTransmissionQty");
    private final static QName _ACABusinessCorrelationId_QNAME = new QName("urn:us:gov:treasury:irs:common", "ACABusinessCorrelationId");
    private final static QName _ACABatchManifestDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "ACABatchManifestDetail");
    private final static QName _SubmissionValidationCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "SubmissionValidationCd");
    private final static QName _SpouseGrp_QNAME = new QName("urn:us:gov:treasury:irs:common", "SpouseGrp");
    private final static QName _ForeignPostalCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "ForeignPostalCd");
    private final static QName _PersonMiddleName_QNAME = new QName("urn:us:gov:treasury:irs:common", "PersonMiddleName");
    private final static QName _ApplicableCoverageMonthNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "ApplicableCoverageMonthNum");
    private final static QName _SubmissionMonthNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "SubmissionMonthNum");
    private final static QName _AttachmentByteSizeNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "AttachmentByteSizeNum");
    private final static QName _EmployerQHPPremiumContriAmt_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployerQHPPremiumContriAmt");
    private final static QName _PediatricDentalPlanPremiumInd_QNAME = new QName("urn:us:gov:treasury:irs:common", "PediatricDentalPlanPremiumInd");
    private final static QName _USAddressGrp_QNAME = new QName("urn:us:gov:treasury:irs:common", "USAddressGrp");
    private final static QName _EmployerPlansOffered_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployerPlansOffered");
    private final static QName _SpouseInfoErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "SpouseInfoErrorDtl");
    private final static QName _CoverageStartDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "CoverageStartDt");
    private final static QName _ACABusinessHeaderDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "ACABusinessHeaderDetail");
    private final static QName _TaxHousehold_QNAME = new QName("urn:us:gov:treasury:irs:common", "TaxHousehold");
    private final static QName _ServiceResponseFileSentTs_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceResponseFileSentTs");
    private final static QName _MessageId_QNAME = new QName("urn:us:gov:treasury:irs:common", "MessageId");
    private final static QName _NotifyCMSInd_QNAME = new QName("urn:us:gov:treasury:irs:common", "NotifyCMSInd");
    private final static QName _OtherRelevantAdult_QNAME = new QName("urn:us:gov:treasury:irs:common", "OtherRelevantAdult");
    private final static QName _SHOPEmployerInfoErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPEmployerInfoErrorDtl");
    private final static QName _QHPFamilyOrIndivCoverageCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "QHPFamilyOrIndivCoverageCd");
    private final static QName _IndividualExchangeError_QNAME = new QName("urn:us:gov:treasury:irs:common", "IndividualExchangeError");
    private final static QName _IRSGroupIdentificationNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "IRSGroupIdentificationNum");
    private final static QName _FileProcessingEndDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "FileProcessingEndDt");
    private final static QName _USAddressErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "USAddressErrorDtl");
    private final static QName _ForeignAddressGrp_QNAME = new QName("urn:us:gov:treasury:irs:common", "ForeignAddressGrp");
    private final static QName _ServiceMetadataDetail_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceMetadataDetail");
    private final static QName _BusinessAddressGrp_QNAME = new QName("urn:us:gov:treasury:irs:common", "BusinessAddressGrp");
    private final static QName _XpathContent_QNAME = new QName("urn:us:gov:treasury:irs:common", "XpathContent");
    private final static QName _ExemptPersonErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "ExemptPersonErrorDtl");
    private final static QName _ErrorMessageTxt_QNAME = new QName("urn:us:gov:treasury:irs:common", "ErrorMessageTxt");
    private final static QName _Exemption_QNAME = new QName("urn:us:gov:treasury:irs:common", "Exemption");
    private final static QName _AuthorizationStatusInd_QNAME = new QName("urn:us:gov:treasury:irs:common", "AuthorizationStatusInd");
    private final static QName _IssuerNm_QNAME = new QName("urn:us:gov:treasury:irs:common", "IssuerNm");
    private final static QName _EmployeeSHOPPolicy_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployeeSHOPPolicy");
    private final static QName _EmployeeSHOPPolicyErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployeeSHOPPolicyErrorDtl");
    private final static QName _ServiceNm_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceNm");
    private final static QName _RejectedFileDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "RejectedFileDtl");
    private final static QName _EmployeeCoverage_QNAME = new QName("urn:us:gov:treasury:irs:common", "EmployeeCoverage");
    private final static QName _ErrorMessageCd_QNAME = new QName("urn:us:gov:treasury:irs:common", "ErrorMessageCd");
    private final static QName _APTCorCSREligibilityDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "APTCorCSREligibilityDt");
    private final static QName _MonthsExemptEndDt_QNAME = new QName("urn:us:gov:treasury:irs:common", "MonthsExemptEndDt");
    private final static QName _ReplacingRejectedFilesNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "ReplacingRejectedFilesNum");
    private final static QName _ServiceResponseFileLocationTxt_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceResponseFileLocationTxt");
    private final static QName _ServiceRequestFileId_QNAME = new QName("urn:us:gov:treasury:irs:common", "ServiceRequestFileId");
    private final static QName _LowestCostPlanPolicyPremiumAmt_QNAME = new QName("urn:us:gov:treasury:irs:common", "LowestCostPlanPolicyPremiumAmt");
    private final static QName _SubmissionRejectedFilesNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "SubmissionRejectedFilesNum");
    private final static QName _SHOPSpouseErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "SHOPSpouseErrorDtl");
    private final static QName _InsuranceCoverageErrorDtl_QNAME = new QName("urn:us:gov:treasury:irs:common", "InsuranceCoverageErrorDtl");
    private final static QName _SequenceNum_QNAME = new QName("urn:us:gov:treasury:irs:common", "SequenceNum");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: us.gov.treasury.irs.epd.bulkfileproc.common
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SHOPExchangeErrorDtlType }
     * 
     */
    public SHOPExchangeErrorDtlType createSHOPExchangeErrorDtlType() {
        return new SHOPExchangeErrorDtlType();
    }

    /**
     * Create an instance of {@link ExemptionErrorDtlType }
     * 
     */
    public ExemptionErrorDtlType createExemptionErrorDtlType() {
        return new ExemptionErrorDtlType();
    }

    /**
     * Create an instance of {@link BusinessAddressErrorDtlType }
     * 
     */
    public BusinessAddressErrorDtlType createBusinessAddressErrorDtlType() {
        return new BusinessAddressErrorDtlType();
    }

    /**
     * Create an instance of {@link EmployeeRosterErrorDtlType }
     * 
     */
    public EmployeeRosterErrorDtlType createEmployeeRosterErrorDtlType() {
        return new EmployeeRosterErrorDtlType();
    }

    /**
     * Create an instance of {@link IRSHouseholdGrpType }
     * 
     */
    public IRSHouseholdGrpType createIRSHouseholdGrpType() {
        return new IRSHouseholdGrpType();
    }

    /**
     * Create an instance of {@link ACAReportingServiceDetailType }
     * 
     */
    public ACAReportingServiceDetailType createACAReportingServiceDetailType() {
        return new ACAReportingServiceDetailType();
    }

    /**
     * Create an instance of {@link ForeignAddressErrorDtlType }
     * 
     */
    public ForeignAddressErrorDtlType createForeignAddressErrorDtlType() {
        return new ForeignAddressErrorDtlType();
    }

    /**
     * Create an instance of {@link HouseholdErrorDtlType }
     * 
     */
    public HouseholdErrorDtlType createHouseholdErrorDtlType() {
        return new HouseholdErrorDtlType();
    }

    /**
     * Create an instance of {@link ACABatchManifestResponseDetailType }
     * 
     */
    public ACABatchManifestResponseDetailType createACABatchManifestResponseDetailType() {
        return new ACABatchManifestResponseDetailType();
    }

    /**
     * Create an instance of {@link WindowCloseNotificationServiceDetailType }
     * 
     */
    public WindowCloseNotificationServiceDetailType createWindowCloseNotificationServiceDetailType() {
        return new WindowCloseNotificationServiceDetailType();
    }

    /**
     * Create an instance of {@link EPDPersonErrorDtlType }
     * 
     */
    public EPDPersonErrorDtlType createEPDPersonErrorDtlType() {
        return new EPDPersonErrorDtlType();
    }

    /**
     * Create an instance of {@link DependentInfoErrorsGrpType }
     * 
     */
    public DependentInfoErrorsGrpType createDependentInfoErrorsGrpType() {
        return new DependentInfoErrorsGrpType();
    }

    /**
     * Create an instance of {@link EPDPersonType }
     * 
     */
    public EPDPersonType createEPDPersonType() {
        return new EPDPersonType();
    }

    /**
     * Create an instance of {@link HouseholdType }
     * 
     */
    public HouseholdType createHouseholdType() {
        return new HouseholdType();
    }

    /**
     * Create an instance of {@link BusinessNameErrorDtlType }
     * 
     */
    public BusinessNameErrorDtlType createBusinessNameErrorDtlType() {
        return new BusinessNameErrorDtlType();
    }

    /**
     * Create an instance of {@link ACAAttachmentDetailType }
     * 
     */
    public ACAAttachmentDetailType createACAAttachmentDetailType() {
        return new ACAAttachmentDetailType();
    }

    /**
     * Create an instance of {@link ReportPeriodDateType }
     * 
     */
    public ReportPeriodDateType createReportPeriodDateType() {
        return new ReportPeriodDateType();
    }

    /**
     * Create an instance of {@link SpouseInfoErrorsGrpType }
     * 
     */
    public SpouseInfoErrorsGrpType createSpouseInfoErrorsGrpType() {
        return new SpouseInfoErrorsGrpType();
    }

    /**
     * Create an instance of {@link InsuranceCoverageType }
     * 
     */
    public InsuranceCoverageType createInsuranceCoverageType() {
        return new InsuranceCoverageType();
    }

    /**
     * Create an instance of {@link ACABatchTransmissionDetailType }
     * 
     */
    public ACABatchTransmissionDetailType createACABatchTransmissionDetailType() {
        return new ACABatchTransmissionDetailType();
    }

    /**
     * Create an instance of {@link PersonInformationType }
     * 
     */
    public PersonInformationType createPersonInformationType() {
        return new PersonInformationType();
    }

    /**
     * Create an instance of {@link SHOPEmployerErrorDtlType }
     * 
     */
    public SHOPEmployerErrorDtlType createSHOPEmployerErrorDtlType() {
        return new SHOPEmployerErrorDtlType();
    }

    /**
     * Create an instance of {@link SHOPExchangePersonType }
     * 
     */
    public SHOPExchangePersonType createSHOPExchangePersonType() {
        return new SHOPExchangePersonType();
    }

    /**
     * Create an instance of {@link DependentGrpType }
     * 
     */
    public DependentGrpType createDependentGrpType() {
        return new DependentGrpType();
    }

    /**
     * Create an instance of {@link ACABatchDetailType }
     * 
     */
    public ACABatchDetailType createACABatchDetailType() {
        return new ACABatchDetailType();
    }

    /**
     * Create an instance of {@link CoverageHouseholdType }
     * 
     */
    public CoverageHouseholdType createCoverageHouseholdType() {
        return new CoverageHouseholdType();
    }

    /**
     * Create an instance of {@link EPDErrorDetailType }
     * 
     */
    public EPDErrorDetailType createEPDErrorDetailType() {
        return new EPDErrorDetailType();
    }

    /**
     * Create an instance of {@link SHOPExchPersonErrorDtlType }
     * 
     */
    public SHOPExchPersonErrorDtlType createSHOPExchPersonErrorDtlType() {
        return new SHOPExchPersonErrorDtlType();
    }

    /**
     * Create an instance of {@link ErrorMessageDetailType }
     * 
     */
    public ErrorMessageDetailType createErrorMessageDetailType() {
        return new ErrorMessageDetailType();
    }

    /**
     * Create an instance of {@link EmployerMECErrorDtlType }
     * 
     */
    public EmployerMECErrorDtlType createEmployerMECErrorDtlType() {
        return new EmployerMECErrorDtlType();
    }

    /**
     * Create an instance of {@link SHOPEmployeeType }
     * 
     */
    public SHOPEmployeeType createSHOPEmployeeType() {
        return new SHOPEmployeeType();
    }

    /**
     * Create an instance of {@link InsurancePolicyType }
     * 
     */
    public InsurancePolicyType createInsurancePolicyType() {
        return new InsurancePolicyType();
    }

    /**
     * Create an instance of {@link IndividualExchangeType }
     * 
     */
    public IndividualExchangeType createIndividualExchangeType() {
        return new IndividualExchangeType();
    }

    /**
     * Create an instance of {@link SHOPEmployerType }
     * 
     */
    public SHOPEmployerType createSHOPEmployerType() {
        return new SHOPEmployerType();
    }

    /**
     * Create an instance of {@link EmployeeCoverageErrorDtlType }
     * 
     */
    public EmployeeCoverageErrorDtlType createEmployeeCoverageErrorDtlType() {
        return new EmployeeCoverageErrorDtlType();
    }

    /**
     * Create an instance of {@link ACABulkBatchManifestDetailType }
     * 
     */
    public ACABulkBatchManifestDetailType createACABulkBatchManifestDetailType() {
        return new ACABulkBatchManifestDetailType();
    }

    /**
     * Create an instance of {@link IRSHouseholdErrorDtlType }
     * 
     */
    public IRSHouseholdErrorDtlType createIRSHouseholdErrorDtlType() {
        return new IRSHouseholdErrorDtlType();
    }

    /**
     * Create an instance of {@link PersonInformationErrorDtlType }
     * 
     */
    public PersonInformationErrorDtlType createPersonInformationErrorDtlType() {
        return new PersonInformationErrorDtlType();
    }

    /**
     * Create an instance of {@link CompletePersonNameErrorDtlType }
     * 
     */
    public CompletePersonNameErrorDtlType createCompletePersonNameErrorDtlType() {
        return new CompletePersonNameErrorDtlType();
    }

    /**
     * Create an instance of {@link SHOPEmployeeErrorDtlType }
     * 
     */
    public SHOPEmployeeErrorDtlType createSHOPEmployeeErrorDtlType() {
        return new SHOPEmployeeErrorDtlType();
    }

    /**
     * Create an instance of {@link PrimaryGrpType }
     * 
     */
    public PrimaryGrpType createPrimaryGrpType() {
        return new PrimaryGrpType();
    }

    /**
     * Create an instance of {@link ACABatchManifestDetailListType }
     * 
     */
    public ACABatchManifestDetailListType createACABatchManifestDetailListType() {
        return new ACABatchManifestDetailListType();
    }

    /**
     * Create an instance of {@link EmployerMECType }
     * 
     */
    public EmployerMECType createEmployerMECType() {
        return new EmployerMECType();
    }

    /**
     * Create an instance of {@link CoveredIndividualType }
     * 
     */
    public CoveredIndividualType createCoveredIndividualType() {
        return new CoveredIndividualType();
    }

    /**
     * Create an instance of {@link AssociatedPolicyType }
     * 
     */
    public AssociatedPolicyType createAssociatedPolicyType() {
        return new AssociatedPolicyType();
    }

    /**
     * Create an instance of {@link CompletePersonNameType }
     * 
     */
    public CompletePersonNameType createCompletePersonNameType() {
        return new CompletePersonNameType();
    }

    /**
     * Create an instance of {@link ExemptionCoverageType }
     * 
     */
    public ExemptionCoverageType createExemptionCoverageType() {
        return new ExemptionCoverageType();
    }

    /**
     * Create an instance of {@link AssociatedPolicyErrorDtlType }
     * 
     */
    public AssociatedPolicyErrorDtlType createAssociatedPolicyErrorDtlType() {
        return new AssociatedPolicyErrorDtlType();
    }

    /**
     * Create an instance of {@link TaxHouseholdCoverageType }
     * 
     */
    public TaxHouseholdCoverageType createTaxHouseholdCoverageType() {
        return new TaxHouseholdCoverageType();
    }

    /**
     * Create an instance of {@link InsurancePolicyErrorDtlType }
     * 
     */
    public InsurancePolicyErrorDtlType createInsurancePolicyErrorDtlType() {
        return new InsurancePolicyErrorDtlType();
    }

    /**
     * Create an instance of {@link SHOPExchangeErrorType }
     * 
     */
    public SHOPExchangeErrorType createSHOPExchangeErrorType() {
        return new SHOPExchangeErrorType();
    }

    /**
     * Create an instance of {@link ExemptionCoverageErrorDtlType }
     * 
     */
    public ExemptionCoverageErrorDtlType createExemptionCoverageErrorDtlType() {
        return new ExemptionCoverageErrorDtlType();
    }

    /**
     * Create an instance of {@link BusinessNameType }
     * 
     */
    public BusinessNameType createBusinessNameType() {
        return new BusinessNameType();
    }

    /**
     * Create an instance of {@link TaxHouseholdErrorDtlType }
     * 
     */
    public TaxHouseholdErrorDtlType createTaxHouseholdErrorDtlType() {
        return new TaxHouseholdErrorDtlType();
    }

    /**
     * Create an instance of {@link EmployerPlansOfferedErrorDtlType }
     * 
     */
    public EmployerPlansOfferedErrorDtlType createEmployerPlansOfferedErrorDtlType() {
        return new EmployerPlansOfferedErrorDtlType();
    }

    /**
     * Create an instance of {@link PrimaryInfoErrorsGrpType }
     * 
     */
    public PrimaryInfoErrorsGrpType createPrimaryInfoErrorsGrpType() {
        return new PrimaryInfoErrorsGrpType();
    }

    /**
     * Create an instance of {@link SHOPExchangeType }
     * 
     */
    public SHOPExchangeType createSHOPExchangeType() {
        return new SHOPExchangeType();
    }

    /**
     * Create an instance of {@link CoveredIndividualErrorDtlType }
     * 
     */
    public CoveredIndividualErrorDtlType createCoveredIndividualErrorDtlType() {
        return new CoveredIndividualErrorDtlType();
    }

    /**
     * Create an instance of {@link TaxHouseholdCoverageErrorDtlType }
     * 
     */
    public TaxHouseholdCoverageErrorDtlType createTaxHouseholdCoverageErrorDtlType() {
        return new TaxHouseholdCoverageErrorDtlType();
    }

    /**
     * Create an instance of {@link SHOPEmployerInfoType }
     * 
     */
    public SHOPEmployerInfoType createSHOPEmployerInfoType() {
        return new SHOPEmployerInfoType();
    }

    /**
     * Create an instance of {@link ForeignAddressGrpType }
     * 
     */
    public ForeignAddressGrpType createForeignAddressGrpType() {
        return new ForeignAddressGrpType();
    }

    /**
     * Create an instance of {@link ServiceMetadataDetailType }
     * 
     */
    public ServiceMetadataDetailType createServiceMetadataDetailType() {
        return new ServiceMetadataDetailType();
    }

    /**
     * Create an instance of {@link IndividualExchangeErrorType }
     * 
     */
    public IndividualExchangeErrorType createIndividualExchangeErrorType() {
        return new IndividualExchangeErrorType();
    }

    /**
     * Create an instance of {@link USAddressErrorDtlType }
     * 
     */
    public USAddressErrorDtlType createUSAddressErrorDtlType() {
        return new USAddressErrorDtlType();
    }

    /**
     * Create an instance of {@link SHOPEmployerInfoErrorDtlType }
     * 
     */
    public SHOPEmployerInfoErrorDtlType createSHOPEmployerInfoErrorDtlType() {
        return new SHOPEmployerInfoErrorDtlType();
    }

    /**
     * Create an instance of {@link TaxHouseholdType }
     * 
     */
    public TaxHouseholdType createTaxHouseholdType() {
        return new TaxHouseholdType();
    }

    /**
     * Create an instance of {@link ACABusinessHeaderType }
     * 
     */
    public ACABusinessHeaderType createACABusinessHeaderType() {
        return new ACABusinessHeaderType();
    }

    /**
     * Create an instance of {@link EmployerPlansOfferedType }
     * 
     */
    public EmployerPlansOfferedType createEmployerPlansOfferedType() {
        return new EmployerPlansOfferedType();
    }

    /**
     * Create an instance of {@link USAddressGrpType }
     * 
     */
    public USAddressGrpType createUSAddressGrpType() {
        return new USAddressGrpType();
    }

    /**
     * Create an instance of {@link SpouseGrpType }
     * 
     */
    public SpouseGrpType createSpouseGrpType() {
        return new SpouseGrpType();
    }

    /**
     * Create an instance of {@link ACABatchManifestDetailType }
     * 
     */
    public ACABatchManifestDetailType createACABatchManifestDetailType() {
        return new ACABatchManifestDetailType();
    }

    /**
     * Create an instance of {@link InsuranceCoverageErrorDtlType }
     * 
     */
    public InsuranceCoverageErrorDtlType createInsuranceCoverageErrorDtlType() {
        return new InsuranceCoverageErrorDtlType();
    }

    /**
     * Create an instance of {@link EmployeeCoverageType }
     * 
     */
    public EmployeeCoverageType createEmployeeCoverageType() {
        return new EmployeeCoverageType();
    }

    /**
     * Create an instance of {@link RejectedFileDtlType }
     * 
     */
    public RejectedFileDtlType createRejectedFileDtlType() {
        return new RejectedFileDtlType();
    }

    /**
     * Create an instance of {@link EmployeeSHOPPolicyErrorDtlType }
     * 
     */
    public EmployeeSHOPPolicyErrorDtlType createEmployeeSHOPPolicyErrorDtlType() {
        return new EmployeeSHOPPolicyErrorDtlType();
    }

    /**
     * Create an instance of {@link EmployeeSHOPPolicyType }
     * 
     */
    public EmployeeSHOPPolicyType createEmployeeSHOPPolicyType() {
        return new EmployeeSHOPPolicyType();
    }

    /**
     * Create an instance of {@link ExemptionType }
     * 
     */
    public ExemptionType createExemptionType() {
        return new ExemptionType();
    }

    /**
     * Create an instance of {@link BusinessAddressGrpType }
     * 
     */
    public BusinessAddressGrpType createBusinessAddressGrpType() {
        return new BusinessAddressGrpType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDSubmissionSourceCdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EPDSubmissionSourceCd")
    public JAXBElement<EPDSubmissionSourceCdType> createEPDSubmissionSourceCd(EPDSubmissionSourceCdType value) {
        return new JAXBElement<EPDSubmissionSourceCdType>(_EPDSubmissionSourceCd_QNAME, EPDSubmissionSourceCdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "AddressLine2Txt")
    public JAXBElement<String> createAddressLine2Txt(String value) {
        return new JAXBElement<String>(_AddressLine2Txt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TrackingStartDt")
    public JAXBElement<XMLGregorianCalendar> createTrackingStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrackingStartDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ChunkId")
    public JAXBElement<String> createChunkId(String value) {
        return new JAXBElement<String>(_ChunkId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SubmissionRejectReasonCd")
    public JAXBElement<String> createSubmissionRejectReasonCd(String value) {
        return new JAXBElement<String>(_SubmissionRejectReasonCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "DocumentSequenceNum")
    public JAXBElement<BigInteger> createDocumentSequenceNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_DocumentSequenceNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SystemDocumentId")
    public JAXBElement<String> createSystemDocumentId(String value) {
        return new JAXBElement<String>(_SystemDocumentId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "CoverageEndDt")
    public JAXBElement<XMLGregorianCalendar> createCoverageEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CoverageEndDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ForeignProvinceNm")
    public JAXBElement<String> createForeignProvinceNm(String value) {
        return new JAXBElement<String>(_ForeignProvinceNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HouseholdErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "HouseholdErrorDtl")
    public JAXBElement<HouseholdErrorDtlType> createHouseholdErrorDtl(HouseholdErrorDtlType value) {
        return new JAXBElement<HouseholdErrorDtlType>(_HouseholdErrorDtl_QNAME, HouseholdErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "YearMonth")
    public JAXBElement<XMLGregorianCalendar> createYearMonth(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_YearMonth_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TransmissionAttachmentQty")
    public JAXBElement<BigInteger> createTransmissionAttachmentQty(BigInteger value) {
        return new JAXBElement<BigInteger>(_TransmissionAttachmentQty_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForeignAddressErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ForeignAddressErrorDtl")
    public JAXBElement<ForeignAddressErrorDtlType> createForeignAddressErrorDtl(ForeignAddressErrorDtlType value) {
        return new JAXBElement<ForeignAddressErrorDtlType>(_ForeignAddressErrorDtl_QNAME, ForeignAddressErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACAReportingServiceDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ACAReportingServiceDetail")
    public JAXBElement<ACAReportingServiceDetailType> createACAReportingServiceDetail(ACAReportingServiceDetailType value) {
        return new JAXBElement<ACAReportingServiceDetailType>(_ACAReportingServiceDetail_QNAME, ACAReportingServiceDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceResponseFileNm")
    public JAXBElement<String> createServiceResponseFileNm(String value) {
        return new JAXBElement<String>(_ServiceResponseFileNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TotalFilesSubmissionQty")
    public JAXBElement<BigInteger> createTotalFilesSubmissionQty(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalFilesSubmissionQty_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SubmissionInProcessFilesNum")
    public JAXBElement<BigInteger> createSubmissionInProcessFilesNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubmissionInProcessFilesNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IRSHouseholdGrpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "IRSHouseholdGrp")
    public JAXBElement<IRSHouseholdGrpType> createIRSHouseholdGrp(IRSHouseholdGrpType value) {
        return new JAXBElement<IRSHouseholdGrpType>(_IRSHouseholdGrp_QNAME, IRSHouseholdGrpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "PersonFirstName")
    public JAXBElement<String> createPersonFirstName(String value) {
        return new JAXBElement<String>(_PersonFirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceWindowCloseInd")
    public JAXBElement<BooleanStringType> createServiceWindowCloseInd(BooleanStringType value) {
        return new JAXBElement<BooleanStringType>(_ServiceWindowCloseInd_QNAME, BooleanStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeRosterErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployeeRosterErrorDtl")
    public JAXBElement<EmployeeRosterErrorDtlType> createEmployeeRosterErrorDtl(EmployeeRosterErrorDtlType value) {
        return new JAXBElement<EmployeeRosterErrorDtlType>(_EmployeeRosterErrorDtl_QNAME, EmployeeRosterErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessAddressErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BusinessAddressErrorDtl")
    public JAXBElement<BusinessAddressErrorDtlType> createBusinessAddressErrorDtl(BusinessAddressErrorDtlType value) {
        return new JAXBElement<BusinessAddressErrorDtlType>(_BusinessAddressErrorDtl_QNAME, BusinessAddressErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemptionErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ExemptionErrorDtl")
    public JAXBElement<ExemptionErrorDtlType> createExemptionErrorDtl(ExemptionErrorDtlType value) {
        return new JAXBElement<ExemptionErrorDtlType>(_ExemptionErrorDtl_QNAME, ExemptionErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPExchangeErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPExchangeErrorDtl")
    public JAXBElement<SHOPExchangeErrorDtlType> createSHOPExchangeErrorDtl(SHOPExchangeErrorDtlType value) {
        return new JAXBElement<SHOPExchangeErrorDtlType>(_SHOPExchangeErrorDtl_QNAME, SHOPExchangeErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TINValidationIndicatorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TINValidationInd")
    public JAXBElement<TINValidationIndicatorType> createTINValidationInd(TINValidationIndicatorType value) {
        return new JAXBElement<TINValidationIndicatorType>(_TINValidationInd_QNAME, TINValidationIndicatorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABusinessHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:msg:acabusinessheader", name = "ACABusinessHeader")
    public JAXBElement<ACABusinessHeaderType> createACABusinessHeader(ACABusinessHeaderType value) {
        return new JAXBElement<ACABusinessHeaderType>(_ACABusinessHeader_QNAME, ACABusinessHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "InsuranceCoverage")
    public JAXBElement<InsuranceCoverageType> createInsuranceCoverage(InsuranceCoverageType value) {
        return new JAXBElement<InsuranceCoverageType>(_InsuranceCoverage_QNAME, InsuranceCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SLCSPAdjMonthlyPremiumAmt")
    public JAXBElement<BigDecimal> createSLCSPAdjMonthlyPremiumAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SLCSPAdjMonthlyPremiumAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpouseInfoErrorsGrpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SpouseInfoErrorsGrp")
    public JAXBElement<SpouseInfoErrorsGrpType> createSpouseInfoErrorsGrp(SpouseInfoErrorsGrpType value) {
        return new JAXBElement<SpouseInfoErrorsGrpType>(_SpouseInfoErrorsGrp_QNAME, SpouseInfoErrorsGrpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "PolicyCoverageEndDt")
    public JAXBElement<XMLGregorianCalendar> createPolicyCoverageEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PolicyCoverageEndDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceRequestTotalRecordCnt")
    public JAXBElement<String> createServiceRequestTotalRecordCnt(String value) {
        return new JAXBElement<String>(_ServiceRequestTotalRecordCnt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "QHPIssuerEIN")
    public JAXBElement<String> createQHPIssuerEIN(String value) {
        return new JAXBElement<String>(_QHPIssuerEIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACAAttachmentDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ACAAttachmentDetail")
    public JAXBElement<ACAAttachmentDetailType> createACAAttachmentDetail(ACAAttachmentDetailType value) {
        return new JAXBElement<ACAAttachmentDetailType>(_ACAAttachmentDetail_QNAME, ACAAttachmentDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReportPeriodDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ReportPeriodDate")
    public JAXBElement<ReportPeriodDateType> createReportPeriodDate(ReportPeriodDateType value) {
        return new JAXBElement<ReportPeriodDateType>(_ReportPeriodDate_QNAME, ReportPeriodDateType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "PolicyCoverageStartDt")
    public JAXBElement<XMLGregorianCalendar> createPolicyCoverageStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PolicyCoverageStartDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "UserId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessNameErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BusinessNameErrorDtl")
    public JAXBElement<BusinessNameErrorDtlType> createBusinessNameErrorDtl(BusinessNameErrorDtlType value) {
        return new JAXBElement<BusinessNameErrorDtlType>(_BusinessNameErrorDtl_QNAME, BusinessNameErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceRequestFileNm")
    public JAXBElement<String> createServiceRequestFileNm(String value) {
        return new JAXBElement<String>(_ServiceRequestFileNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HouseholdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "Household")
    public JAXBElement<HouseholdType> createHousehold(HouseholdType value) {
        return new JAXBElement<HouseholdType>(_Household_QNAME, HouseholdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "DocumentSystemFileNm")
    public JAXBElement<String> createDocumentSystemFileNm(String value) {
        return new JAXBElement<String>(_DocumentSystemFileNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ExemptPerson")
    public JAXBElement<EPDPersonType> createExemptPerson(EPDPersonType value) {
        return new JAXBElement<EPDPersonType>(_ExemptPerson_QNAME, EPDPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileStatusCdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "FileStatusCd")
    public JAXBElement<FileStatusCdType> createFileStatusCd(FileStatusCdType value) {
        return new JAXBElement<FileStatusCdType>(_FileStatusCd_QNAME, FileStatusCdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BinaryFormatCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BinaryFormatCd")
    public JAXBElement<BinaryFormatCodeType> createBinaryFormatCd(BinaryFormatCodeType value) {
        return new JAXBElement<BinaryFormatCodeType>(_BinaryFormatCd_QNAME, BinaryFormatCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceExecutionStatusDescriptionTxt")
    public JAXBElement<String> createServiceExecutionStatusDescriptionTxt(String value) {
        return new JAXBElement<String>(_ServiceExecutionStatusDescriptionTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDPersonErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "InsuredPersonErrorDtl")
    public JAXBElement<EPDPersonErrorDtlType> createInsuredPersonErrorDtl(EPDPersonErrorDtlType value) {
        return new JAXBElement<EPDPersonErrorDtlType>(_InsuredPersonErrorDtl_QNAME, EPDPersonErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USStateCdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "USStateCd")
    public JAXBElement<USStateCdType> createUSStateCd(USStateCdType value) {
        return new JAXBElement<USStateCdType>(_USStateCd_QNAME, USStateCdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DependentInfoErrorsGrpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "DependentInfoErrorsGrp")
    public JAXBElement<DependentInfoErrorsGrpType> createDependentInfoErrorsGrp(DependentInfoErrorsGrpType value) {
        return new JAXBElement<DependentInfoErrorsGrpType>(_DependentInfoErrorsGrp_QNAME, DependentInfoErrorsGrpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDPersonErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EPDPersonErrorDtl")
    public JAXBElement<EPDPersonErrorDtlType> createEPDPersonErrorDtl(EPDPersonErrorDtlType value) {
        return new JAXBElement<EPDPersonErrorDtlType>(_EPDPersonErrorDtl_QNAME, EPDPersonErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "FilesReceivingStartDt")
    public JAXBElement<XMLGregorianCalendar> createFilesReceivingStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FilesReceivingStartDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "APTCPaymentAmt")
    public JAXBElement<BigDecimal> createAPTCPaymentAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_APTCPaymentAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WindowCloseNotificationServiceDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "WindowCloseNotificationServiceDetail")
    public JAXBElement<WindowCloseNotificationServiceDetailType> createWindowCloseNotificationServiceDetail(WindowCloseNotificationServiceDetailType value) {
        return new JAXBElement<WindowCloseNotificationServiceDetailType>(_WindowCloseNotificationServiceDetail_QNAME, WindowCloseNotificationServiceDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TotalQHPMonthlyPremiumAmt")
    public JAXBElement<BigDecimal> createTotalQHPMonthlyPremiumAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TotalQHPMonthlyPremiumAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABatchManifestResponseDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ACABatchManifestResponseDetail")
    public JAXBElement<ACABatchManifestResponseDetailType> createACABatchManifestResponseDetail(ACABatchManifestResponseDetailType value) {
        return new JAXBElement<ACABatchManifestResponseDetailType>(_ACABatchManifestResponseDetail_QNAME, ACABatchManifestResponseDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorMessageDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ErrorMessageDetail")
    public JAXBElement<ErrorMessageDetailType> createErrorMessageDetail(ErrorMessageDetailType value) {
        return new JAXBElement<ErrorMessageDetailType>(_ErrorMessageDetail_QNAME, ErrorMessageDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPExchPersonErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPDependentErrorDtl")
    public JAXBElement<SHOPExchPersonErrorDtlType> createSHOPDependentErrorDtl(SHOPExchPersonErrorDtlType value) {
        return new JAXBElement<SHOPExchPersonErrorDtlType>(_SHOPDependentErrorDtl_QNAME, SHOPExchPersonErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDErrorDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EPDErrorDetail")
    public JAXBElement<EPDErrorDetailType> createEPDErrorDetail(EPDErrorDetailType value) {
        return new JAXBElement<EPDErrorDetailType>(_EPDErrorDetail_QNAME, EPDErrorDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "FilesReceivingEndDt")
    public JAXBElement<XMLGregorianCalendar> createFilesReceivingEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FilesReceivingEndDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "OriginalBatchId")
    public JAXBElement<XMLGregorianCalendar> createOriginalBatchId(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OriginalBatchId_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "HealthExchangeId")
    public JAXBElement<String> createHealthExchangeId(String value) {
        return new JAXBElement<String>(_HealthExchangeId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceVersionNum")
    public JAXBElement<String> createServiceVersionNum(String value) {
        return new JAXBElement<String>(_ServiceVersionNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "MonthsExemptStartDt")
    public JAXBElement<XMLGregorianCalendar> createMonthsExemptStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MonthsExemptStartDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoverageHouseholdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "CoverageHousehold")
    public JAXBElement<CoverageHouseholdType> createCoverageHousehold(CoverageHouseholdType value) {
        return new JAXBElement<CoverageHouseholdType>(_CoverageHousehold_QNAME, CoverageHouseholdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABatchDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ACABatchDetail")
    public JAXBElement<ACABatchDetailType> createACABatchDetail(ACABatchDetailType value) {
        return new JAXBElement<ACABatchDetailType>(_ACABatchDetail_QNAME, ACABatchDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TIN")
    public JAXBElement<String> createTIN(String value) {
        return new JAXBElement<String>(_TIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "AddressLine1Txt")
    public JAXBElement<String> createAddressLine1Txt(String value) {
        return new JAXBElement<String>(_AddressLine1Txt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DependentGrpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "DependentGrp")
    public JAXBElement<DependentGrpType> createDependentGrp(DependentGrpType value) {
        return new JAXBElement<DependentGrpType>(_DependentGrp_QNAME, DependentGrpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPExchangePersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPSpouse")
    public JAXBElement<SHOPExchangePersonType> createSHOPSpouse(SHOPExchangePersonType value) {
        return new JAXBElement<SHOPExchangePersonType>(_SHOPSpouse_QNAME, SHOPExchangePersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "RejectedFileOrigSubmissionNum")
    public JAXBElement<BigInteger> createRejectedFileOrigSubmissionNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_RejectedFileOrigSubmissionNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ChecksumAugmentationNum")
    public JAXBElement<String> createChecksumAugmentationNum(String value) {
        return new JAXBElement<String>(_ChecksumAugmentationNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "HouseholdAPTCAmt")
    public JAXBElement<BigDecimal> createHouseholdAPTCAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_HouseholdAPTCAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPEmployerErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPEmployerErrorDtl")
    public JAXBElement<SHOPEmployerErrorDtlType> createSHOPEmployerErrorDtl(SHOPEmployerErrorDtlType value) {
        return new JAXBElement<SHOPEmployerErrorDtlType>(_SHOPEmployerErrorDtl_QNAME, SHOPEmployerErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployerQHPCoverageStartDt")
    public JAXBElement<XMLGregorianCalendar> createEmployerQHPCoverageStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmployerQHPCoverageStartDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "Primary")
    public JAXBElement<PersonInformationType> createPrimary(PersonInformationType value) {
        return new JAXBElement<PersonInformationType>(_Primary_QNAME, PersonInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABatchTransmissionDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ACABatchTransmissionDetail")
    public JAXBElement<ACABatchTransmissionDetailType> createACABatchTransmissionDetail(ACABatchTransmissionDetailType value) {
        return new JAXBElement<ACABatchTransmissionDetailType>(_ACABatchTransmissionDetail_QNAME, ACABatchTransmissionDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "CountryName")
    public JAXBElement<String> createCountryName(String value) {
        return new JAXBElement<String>(_CountryName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ResponseCd")
    public JAXBElement<String> createResponseCd(String value) {
        return new JAXBElement<String>(_ResponseCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInformationErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "OtherRelevantAdultErrorDtl")
    public JAXBElement<PersonInformationErrorDtlType> createOtherRelevantAdultErrorDtl(PersonInformationErrorDtlType value) {
        return new JAXBElement<PersonInformationErrorDtlType>(_OtherRelevantAdultErrorDtl_QNAME, PersonInformationErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "FileStatusTxt")
    public JAXBElement<String> createFileStatusTxt(String value) {
        return new JAXBElement<String>(_FileStatusTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BRMGatewayStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BRMGatewayStatusCd")
    public JAXBElement<BRMGatewayStatusCodeType> createBRMGatewayStatusCd(BRMGatewayStatusCodeType value) {
        return new JAXBElement<BRMGatewayStatusCodeType>(_BRMGatewayStatusCd_QNAME, BRMGatewayStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompletePersonNameErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "CompletePersonNameErrorDtl")
    public JAXBElement<CompletePersonNameErrorDtlType> createCompletePersonNameErrorDtl(CompletePersonNameErrorDtlType value) {
        return new JAXBElement<CompletePersonNameErrorDtlType>(_CompletePersonNameErrorDtl_QNAME, CompletePersonNameErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "FileNm")
    public JAXBElement<String> createFileNm(String value) {
        return new JAXBElement<String>(_FileNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "Dependent")
    public JAXBElement<EPDPersonType> createDependent(EPDPersonType value) {
        return new JAXBElement<EPDPersonType>(_Dependent_QNAME, EPDPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInformationErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "PrimaryInfoErrorDtl")
    public JAXBElement<PersonInformationErrorDtlType> createPrimaryInfoErrorDtl(PersonInformationErrorDtlType value) {
        return new JAXBElement<PersonInformationErrorDtlType>(_PrimaryInfoErrorDtl_QNAME, PersonInformationErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BatchId")
    public JAXBElement<XMLGregorianCalendar> createBatchId(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BatchId_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "QHPEligibilityDt")
    public JAXBElement<XMLGregorianCalendar> createQHPEligibilityDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_QHPEligibilityDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "MissingDocumentSequenceNum")
    public JAXBElement<BigInteger> createMissingDocumentSequenceNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_MissingDocumentSequenceNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "CountryCd")
    public JAXBElement<String> createCountryCd(String value) {
        return new JAXBElement<String>(_CountryCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IRSHouseholdErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "IRSHouseholdErrorDtl")
    public JAXBElement<IRSHouseholdErrorDtlType> createIRSHouseholdErrorDtl(IRSHouseholdErrorDtlType value) {
        return new JAXBElement<IRSHouseholdErrorDtlType>(_IRSHouseholdErrorDtl_QNAME, IRSHouseholdErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABusinessHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:msg:acabusinessheader", name = "ACABusinessHeaderResponse")
    public JAXBElement<ACABusinessHeaderType> createACABusinessHeaderResponse(ACABusinessHeaderType value) {
        return new JAXBElement<ACABusinessHeaderType>(_ACABusinessHeaderResponse_QNAME, ACABusinessHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ErrorValueTxt")
    public JAXBElement<String> createErrorValueTxt(String value) {
        return new JAXBElement<String>(_ErrorValueTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "CityNm")
    public JAXBElement<String> createCityNm(String value) {
        return new JAXBElement<String>(_CityNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPExchangePersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPDependent")
    public JAXBElement<SHOPExchangePersonType> createSHOPDependent(SHOPExchangePersonType value) {
        return new JAXBElement<SHOPExchangePersonType>(_SHOPDependent_QNAME, SHOPExchangePersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABulkBatchManifestDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ACABulkBatchManifestDetail")
    public JAXBElement<ACABulkBatchManifestDetailType> createACABulkBatchManifestDetail(ACABulkBatchManifestDetailType value) {
        return new JAXBElement<ACABulkBatchManifestDetailType>(_ACABulkBatchManifestDetail_QNAME, ACABulkBatchManifestDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcknowledgementStatusCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "AcknowledgementStatusCd")
    public JAXBElement<AcknowledgementStatusCodeType> createAcknowledgementStatusCd(AcknowledgementStatusCodeType value) {
        return new JAXBElement<AcknowledgementStatusCodeType>(_AcknowledgementStatusCd_QNAME, AcknowledgementStatusCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeCoverageErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployeeCoverageErrorDtl")
    public JAXBElement<EmployeeCoverageErrorDtlType> createEmployeeCoverageErrorDtl(EmployeeCoverageErrorDtlType value) {
        return new JAXBElement<EmployeeCoverageErrorDtlType>(_EmployeeCoverageErrorDtl_QNAME, EmployeeCoverageErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EIN")
    public JAXBElement<String> createEIN(String value) {
        return new JAXBElement<String>(_EIN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "QHPPolicyNum")
    public JAXBElement<String> createQHPPolicyNum(String value) {
        return new JAXBElement<String>(_QHPPolicyNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployerQHPPremiumContriPct")
    public JAXBElement<BigDecimal> createEmployerQHPPremiumContriPct(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployerQHPPremiumContriPct_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPEmployerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPEmployer")
    public JAXBElement<SHOPEmployerType> createSHOPEmployer(SHOPEmployerType value) {
        return new JAXBElement<SHOPEmployerType>(_SHOPEmployer_QNAME, SHOPEmployerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BusinessNameLine2")
    public JAXBElement<String> createBusinessNameLine2(String value) {
        return new JAXBElement<String>(_BusinessNameLine2_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BusinessNameLine1")
    public JAXBElement<String> createBusinessNameLine1(String value) {
        return new JAXBElement<String>(_BusinessNameLine1_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "MonthsOfferedCoverageInd")
    public JAXBElement<BooleanStringType> createMonthsOfferedCoverageInd(BooleanStringType value) {
        return new JAXBElement<BooleanStringType>(_MonthsOfferedCoverageInd_QNAME, BooleanStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BulkExchangeFile")
    @XmlMimeType("*/*")
    public JAXBElement<DataHandler> createBulkExchangeFile(DataHandler value) {
        return new JAXBElement<DataHandler>(_BulkExchangeFile_QNAME, DataHandler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "Year")
    public JAXBElement<XMLGregorianCalendar> createYear(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Year_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualExchangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "IndividualExchange")
    public JAXBElement<IndividualExchangeType> createIndividualExchange(IndividualExchangeType value) {
        return new JAXBElement<IndividualExchangeType>(_IndividualExchange_QNAME, IndividualExchangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceRequestFileLocationTxt")
    public JAXBElement<String> createServiceRequestFileLocationTxt(String value) {
        return new JAXBElement<String>(_ServiceRequestFileLocationTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsurancePolicyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "InsurancePolicy")
    public JAXBElement<InsurancePolicyType> createInsurancePolicy(InsurancePolicyType value) {
        return new JAXBElement<InsurancePolicyType>(_InsurancePolicy_QNAME, InsurancePolicyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPExchangePersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPExchangePerson")
    public JAXBElement<SHOPExchangePersonType> createSHOPExchangePerson(SHOPExchangePersonType value) {
        return new JAXBElement<SHOPExchangePersonType>(_SHOPExchangePerson_QNAME, SHOPExchangePersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployerMECErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployerMECErrorDtl")
    public JAXBElement<EmployerMECErrorDtlType> createEmployerMECErrorDtl(EmployerMECErrorDtlType value) {
        return new JAXBElement<EmployerMECErrorDtlType>(_EmployerMECErrorDtl_QNAME, EmployerMECErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPEmployeeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPEmployee")
    public JAXBElement<SHOPEmployeeType> createSHOPEmployee(SHOPEmployeeType value) {
        return new JAXBElement<SHOPEmployeeType>(_SHOPEmployee_QNAME, SHOPEmployeeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "MessageSourceSystemNm")
    public JAXBElement<String> createMessageSourceSystemNm(String value) {
        return new JAXBElement<String>(_MessageSourceSystemNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ResponseCodeDescription")
    public JAXBElement<String> createResponseCodeDescription(String value) {
        return new JAXBElement<String>(_ResponseCodeDescription_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociatedPolicyErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "AssociatedPolicyErrorDtl")
    public JAXBElement<AssociatedPolicyErrorDtlType> createAssociatedPolicyErrorDtl(AssociatedPolicyErrorDtlType value) {
        return new JAXBElement<AssociatedPolicyErrorDtlType>(_AssociatedPolicyErrorDtl_QNAME, AssociatedPolicyErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemptionCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ExemptionCoverage")
    public JAXBElement<ExemptionCoverageType> createExemptionCoverage(ExemptionCoverageType value) {
        return new JAXBElement<ExemptionCoverageType>(_ExemptionCoverage_QNAME, ExemptionCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "FileProcessingStartDt")
    public JAXBElement<XMLGregorianCalendar> createFileProcessingStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileProcessingStartDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BirthDt")
    public JAXBElement<XMLGregorianCalendar> createBirthDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_BirthDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TotalHsldMonthlyPremiumAmt")
    public JAXBElement<BigDecimal> createTotalHsldMonthlyPremiumAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TotalHsldMonthlyPremiumAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BatchTransmissionQty")
    public JAXBElement<BigInteger> createBatchTransmissionQty(BigInteger value) {
        return new JAXBElement<BigInteger>(_BatchTransmissionQty_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CompletePersonNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "CompletePersonName")
    public JAXBElement<CompletePersonNameType> createCompletePersonName(CompletePersonNameType value) {
        return new JAXBElement<CompletePersonNameType>(_CompletePersonName_QNAME, CompletePersonNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ExemptionCertificateNum")
    public JAXBElement<String> createExemptionCertificateNum(String value) {
        return new JAXBElement<String>(_ExemptionCertificateNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SubmissionProcessedFilesNum")
    public JAXBElement<BigInteger> createSubmissionProcessedFilesNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubmissionProcessedFilesNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociatedPolicyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "AssociatedPolicy")
    public JAXBElement<AssociatedPolicyType> createAssociatedPolicy(AssociatedPolicyType value) {
        return new JAXBElement<AssociatedPolicyType>(_AssociatedPolicy_QNAME, AssociatedPolicyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TotalNumOfRejectedFilesQty")
    public JAXBElement<BigInteger> createTotalNumOfRejectedFilesQty(BigInteger value) {
        return new JAXBElement<BigInteger>(_TotalNumOfRejectedFilesQty_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployerQHPCoverageTermDt")
    public JAXBElement<XMLGregorianCalendar> createEmployerQHPCoverageTermDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmployerQHPCoverageTermDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceRequestCreatedTs")
    public JAXBElement<XMLGregorianCalendar> createServiceRequestCreatedTs(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ServiceRequestCreatedTs_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPIdentificationNum")
    public JAXBElement<String> createSHOPIdentificationNum(String value) {
        return new JAXBElement<String>(_SHOPIdentificationNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoveredIndividualType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "CoveredIndividual")
    public JAXBElement<CoveredIndividualType> createCoveredIndividual(CoveredIndividualType value) {
        return new JAXBElement<CoveredIndividualType>(_CoveredIndividual_QNAME, CoveredIndividualType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SubmissionMissingFilesNum")
    public JAXBElement<BigInteger> createSubmissionMissingFilesNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubmissionMissingFilesNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployerMECType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployerMEC")
    public JAXBElement<EmployerMECType> createEmployerMEC(EmployerMECType value) {
        return new JAXBElement<EmployerMECType>(_EmployerMEC_QNAME, EmployerMECType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ApplicableCoverageYr")
    public JAXBElement<XMLGregorianCalendar> createApplicableCoverageYr(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApplicableCoverageYr_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABatchManifestDetailListType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ACABatchManifestDetailList")
    public JAXBElement<ACABatchManifestDetailListType> createACABatchManifestDetailList(ACABatchManifestDetailListType value) {
        return new JAXBElement<ACABatchManifestDetailListType>(_ACABatchManifestDetailList_QNAME, ACABatchManifestDetailListType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "PersonLastName")
    public JAXBElement<String> createPersonLastName(String value) {
        return new JAXBElement<String>(_PersonLastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimaryGrpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "PrimaryGrp")
    public JAXBElement<PrimaryGrpType> createPrimaryGrp(PrimaryGrpType value) {
        return new JAXBElement<PrimaryGrpType>(_PrimaryGrp_QNAME, PrimaryGrpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "OriginalBatchIdPresenceInd")
    public JAXBElement<BooleanStringType> createOriginalBatchIdPresenceInd(BooleanStringType value) {
        return new JAXBElement<BooleanStringType>(_OriginalBatchIdPresenceInd_QNAME, BooleanStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ValidExchangeInd")
    public JAXBElement<BooleanStringType> createValidExchangeInd(BooleanStringType value) {
        return new JAXBElement<BooleanStringType>(_ValidExchangeInd_QNAME, BooleanStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPEmployeeErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPEmployeeErrorDtl")
    public JAXBElement<SHOPEmployeeErrorDtlType> createSHOPEmployeeErrorDtl(SHOPEmployeeErrorDtlType value) {
        return new JAXBElement<SHOPEmployeeErrorDtlType>(_SHOPEmployeeErrorDtl_QNAME, SHOPEmployeeErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "USZIPCd")
    public JAXBElement<String> createUSZIPCd(String value) {
        return new JAXBElement<String>(_USZIPCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPEmployerInfoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPEmployerInfo")
    public JAXBElement<SHOPEmployerInfoType> createSHOPEmployerInfo(SHOPEmployerInfoType value) {
        return new JAXBElement<SHOPEmployerInfoType>(_SHOPEmployerInfo_QNAME, SHOPEmployerInfoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxHouseholdCoverageErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TaxHouseholdCoverageErrorDtl")
    public JAXBElement<TaxHouseholdCoverageErrorDtlType> createTaxHouseholdCoverageErrorDtl(TaxHouseholdCoverageErrorDtlType value) {
        return new JAXBElement<TaxHouseholdCoverageErrorDtlType>(_TaxHouseholdCoverageErrorDtl_QNAME, TaxHouseholdCoverageErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SubmissionYr")
    public JAXBElement<XMLGregorianCalendar> createSubmissionYr(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SubmissionYr_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CoveredIndividualErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "CoveredIndividualErrorDtl")
    public JAXBElement<CoveredIndividualErrorDtlType> createCoveredIndividualErrorDtl(CoveredIndividualErrorDtlType value) {
        return new JAXBElement<CoveredIndividualErrorDtlType>(_CoveredIndividualErrorDtl_QNAME, CoveredIndividualErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "MECStatusInd")
    public JAXBElement<BooleanStringType> createMECStatusInd(BooleanStringType value) {
        return new JAXBElement<BooleanStringType>(_MECStatusInd_QNAME, BooleanStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "PersonInformation")
    public JAXBElement<PersonInformationType> createPersonInformation(PersonInformationType value) {
        return new JAXBElement<PersonInformationType>(_PersonInformation_QNAME, PersonInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceRequestReceivedTs")
    public JAXBElement<XMLGregorianCalendar> createServiceRequestReceivedTs(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ServiceRequestReceivedTs_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployeeQHPShareOfPremiumAmt")
    public JAXBElement<BigDecimal> createEmployeeQHPShareOfPremiumAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeQHPShareOfPremiumAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BatchPartnerId")
    public JAXBElement<String> createBatchPartnerId(String value) {
        return new JAXBElement<String>(_BatchPartnerId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TaxpayerValidityCd")
    public JAXBElement<BigInteger> createTaxpayerValidityCd(BigInteger value) {
        return new JAXBElement<BigInteger>(_TaxpayerValidityCd_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployerPlansOfferedErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployerPlansOfferedErrorDtl")
    public JAXBElement<EmployerPlansOfferedErrorDtlType> createEmployerPlansOfferedErrorDtl(EmployerPlansOfferedErrorDtlType value) {
        return new JAXBElement<EmployerPlansOfferedErrorDtlType>(_EmployerPlansOfferedErrorDtl_QNAME, EmployerPlansOfferedErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimaryInfoErrorsGrpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "PrimaryInfoErrorsGrp")
    public JAXBElement<PrimaryInfoErrorsGrpType> createPrimaryInfoErrorsGrp(PrimaryInfoErrorsGrpType value) {
        return new JAXBElement<PrimaryInfoErrorsGrpType>(_PrimaryInfoErrorsGrp_QNAME, PrimaryInfoErrorsGrpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "USZIPExtensionCd")
    public JAXBElement<String> createUSZIPExtensionCd(String value) {
        return new JAXBElement<String>(_USZIPExtensionCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPExchangeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPExchange")
    public JAXBElement<SHOPExchangeType> createSHOPExchange(SHOPExchangeType value) {
        return new JAXBElement<SHOPExchangeType>(_SHOPExchange_QNAME, SHOPExchangeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxHouseholdErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TaxHouseholdErrorDtl")
    public JAXBElement<TaxHouseholdErrorDtlType> createTaxHouseholdErrorDtl(TaxHouseholdErrorDtlType value) {
        return new JAXBElement<TaxHouseholdErrorDtlType>(_TaxHouseholdErrorDtl_QNAME, TaxHouseholdErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "Timestamp")
    public JAXBElement<XMLGregorianCalendar> createTimestamp(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Timestamp_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "Spouse")
    public JAXBElement<EPDPersonType> createSpouse(EPDPersonType value) {
        return new JAXBElement<EPDPersonType>(_Spouse_QNAME, EPDPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceRequestFileSizeTxt")
    public JAXBElement<String> createServiceRequestFileSizeTxt(String value) {
        return new JAXBElement<String>(_ServiceRequestFileSizeTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDPersonErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "DependentInfoErrorDtl")
    public JAXBElement<EPDPersonErrorDtlType> createDependentInfoErrorDtl(EPDPersonErrorDtlType value) {
        return new JAXBElement<EPDPersonErrorDtlType>(_DependentInfoErrorDtl_QNAME, EPDPersonErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemptionCoverageErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ExemptionCoverageErrorDtl")
    public JAXBElement<ExemptionCoverageErrorDtlType> createExemptionCoverageErrorDtl(ExemptionCoverageErrorDtlType value) {
        return new JAXBElement<ExemptionCoverageErrorDtlType>(_ExemptionCoverageErrorDtl_QNAME, ExemptionCoverageErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessNameType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BusinessName")
    public JAXBElement<BusinessNameType> createBusinessName(BusinessNameType value) {
        return new JAXBElement<BusinessNameType>(_BusinessName_QNAME, BusinessNameType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SSN")
    public JAXBElement<String> createSSN(String value) {
        return new JAXBElement<String>(_SSN_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "InsuredPerson")
    public JAXBElement<EPDPersonType> createInsuredPerson(EPDPersonType value) {
        return new JAXBElement<EPDPersonType>(_InsuredPerson_QNAME, EPDPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPExchangeErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPExchangeError")
    public JAXBElement<SHOPExchangeErrorType> createSHOPExchangeError(SHOPExchangeErrorType value) {
        return new JAXBElement<SHOPExchangeErrorType>(_SHOPExchangeError_QNAME, SHOPExchangeErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsurancePolicyErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "InsurancePolicyErrorDtl")
    public JAXBElement<InsurancePolicyErrorDtlType> createInsurancePolicyErrorDtl(InsurancePolicyErrorDtlType value) {
        return new JAXBElement<InsurancePolicyErrorDtlType>(_InsurancePolicyErrorDtl_QNAME, InsurancePolicyErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SuffixName")
    public JAXBElement<String> createSuffixName(String value) {
        return new JAXBElement<String>(_SuffixName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceResponseFileCreatedTs")
    public JAXBElement<XMLGregorianCalendar> createServiceResponseFileCreatedTs(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ServiceResponseFileCreatedTs_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDPersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EPDPerson")
    public JAXBElement<EPDPersonType> createEPDPerson(EPDPersonType value) {
        return new JAXBElement<EPDPersonType>(_EPDPerson_QNAME, EPDPersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SubmissionTotalNumOfFilesQty")
    public JAXBElement<BigInteger> createSubmissionTotalNumOfFilesQty(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubmissionTotalNumOfFilesQty_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TrackingEndDt")
    public JAXBElement<XMLGregorianCalendar> createTrackingEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrackingEndDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "LastUpdatedTs")
    public JAXBElement<XMLGregorianCalendar> createLastUpdatedTs(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LastUpdatedTs_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "IndividualSHOPInd")
    public JAXBElement<BooleanStringType> createIndividualSHOPInd(BooleanStringType value) {
        return new JAXBElement<BooleanStringType>(_IndividualSHOPInd_QNAME, BooleanStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxHouseholdCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TaxHouseholdCoverage")
    public JAXBElement<TaxHouseholdCoverageType> createTaxHouseholdCoverage(TaxHouseholdCoverageType value) {
        return new JAXBElement<TaxHouseholdCoverageType>(_TaxHouseholdCoverage_QNAME, TaxHouseholdCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "InternalDocumentSystemFileNm")
    public JAXBElement<String> createInternalDocumentSystemFileNm(String value) {
        return new JAXBElement<String>(_InternalDocumentSystemFileNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BatchCategoryCodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BatchCategoryCd")
    public JAXBElement<BatchCategoryCodeType> createBatchCategoryCd(BatchCategoryCodeType value) {
        return new JAXBElement<BatchCategoryCodeType>(_BatchCategoryCd_QNAME, BatchCategoryCodeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BatchAttachmentTransmissionQty")
    public JAXBElement<BigInteger> createBatchAttachmentTransmissionQty(BigInteger value) {
        return new JAXBElement<BigInteger>(_BatchAttachmentTransmissionQty_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ACABusinessCorrelationId")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createACABusinessCorrelationId(String value) {
        return new JAXBElement<String>(_ACABusinessCorrelationId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABatchManifestDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ACABatchManifestDetail")
    public JAXBElement<ACABatchManifestDetailType> createACABatchManifestDetail(ACABatchManifestDetailType value) {
        return new JAXBElement<ACABatchManifestDetailType>(_ACABatchManifestDetail_QNAME, ACABatchManifestDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmissionValidationCdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SubmissionValidationCd")
    public JAXBElement<SubmissionValidationCdType> createSubmissionValidationCd(SubmissionValidationCdType value) {
        return new JAXBElement<SubmissionValidationCdType>(_SubmissionValidationCd_QNAME, SubmissionValidationCdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpouseGrpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SpouseGrp")
    public JAXBElement<SpouseGrpType> createSpouseGrp(SpouseGrpType value) {
        return new JAXBElement<SpouseGrpType>(_SpouseGrp_QNAME, SpouseGrpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ForeignPostalCd")
    public JAXBElement<String> createForeignPostalCd(String value) {
        return new JAXBElement<String>(_ForeignPostalCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "PersonMiddleName")
    public JAXBElement<String> createPersonMiddleName(String value) {
        return new JAXBElement<String>(_PersonMiddleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ApplicableCoverageMonthNum")
    public JAXBElement<Integer> createApplicableCoverageMonthNum(Integer value) {
        return new JAXBElement<Integer>(_ApplicableCoverageMonthNum_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SubmissionMonthNum")
    public JAXBElement<Integer> createSubmissionMonthNum(Integer value) {
        return new JAXBElement<Integer>(_SubmissionMonthNum_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "AttachmentByteSizeNum")
    public JAXBElement<BigInteger> createAttachmentByteSizeNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_AttachmentByteSizeNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployerQHPPremiumContriAmt")
    public JAXBElement<BigDecimal> createEmployerQHPPremiumContriAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployerQHPPremiumContriAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "PediatricDentalPlanPremiumInd")
    public JAXBElement<BooleanStringType> createPediatricDentalPlanPremiumInd(BooleanStringType value) {
        return new JAXBElement<BooleanStringType>(_PediatricDentalPlanPremiumInd_QNAME, BooleanStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USAddressGrpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "USAddressGrp")
    public JAXBElement<USAddressGrpType> createUSAddressGrp(USAddressGrpType value) {
        return new JAXBElement<USAddressGrpType>(_USAddressGrp_QNAME, USAddressGrpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployerPlansOfferedType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployerPlansOffered")
    public JAXBElement<EmployerPlansOfferedType> createEmployerPlansOffered(EmployerPlansOfferedType value) {
        return new JAXBElement<EmployerPlansOfferedType>(_EmployerPlansOffered_QNAME, EmployerPlansOfferedType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDPersonErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SpouseInfoErrorDtl")
    public JAXBElement<EPDPersonErrorDtlType> createSpouseInfoErrorDtl(EPDPersonErrorDtlType value) {
        return new JAXBElement<EPDPersonErrorDtlType>(_SpouseInfoErrorDtl_QNAME, EPDPersonErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "CoverageStartDt")
    public JAXBElement<XMLGregorianCalendar> createCoverageStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CoverageStartDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ACABusinessHeaderType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ACABusinessHeaderDetail")
    public JAXBElement<ACABusinessHeaderType> createACABusinessHeaderDetail(ACABusinessHeaderType value) {
        return new JAXBElement<ACABusinessHeaderType>(_ACABusinessHeaderDetail_QNAME, ACABusinessHeaderType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxHouseholdType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "TaxHousehold")
    public JAXBElement<TaxHouseholdType> createTaxHousehold(TaxHouseholdType value) {
        return new JAXBElement<TaxHouseholdType>(_TaxHousehold_QNAME, TaxHouseholdType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceResponseFileSentTs")
    public JAXBElement<XMLGregorianCalendar> createServiceResponseFileSentTs(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ServiceResponseFileSentTs_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "MessageId")
    public JAXBElement<String> createMessageId(String value) {
        return new JAXBElement<String>(_MessageId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "NotifyCMSInd")
    public JAXBElement<BooleanStringType> createNotifyCMSInd(BooleanStringType value) {
        return new JAXBElement<BooleanStringType>(_NotifyCMSInd_QNAME, BooleanStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonInformationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "OtherRelevantAdult")
    public JAXBElement<PersonInformationType> createOtherRelevantAdult(PersonInformationType value) {
        return new JAXBElement<PersonInformationType>(_OtherRelevantAdult_QNAME, PersonInformationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPEmployerInfoErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPEmployerInfoErrorDtl")
    public JAXBElement<SHOPEmployerInfoErrorDtlType> createSHOPEmployerInfoErrorDtl(SHOPEmployerInfoErrorDtlType value) {
        return new JAXBElement<SHOPEmployerInfoErrorDtlType>(_SHOPEmployerInfoErrorDtl_QNAME, SHOPEmployerInfoErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "QHPFamilyOrIndivCoverageCd")
    public JAXBElement<String> createQHPFamilyOrIndivCoverageCd(String value) {
        return new JAXBElement<String>(_QHPFamilyOrIndivCoverageCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IndividualExchangeErrorType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "IndividualExchangeError")
    public JAXBElement<IndividualExchangeErrorType> createIndividualExchangeError(IndividualExchangeErrorType value) {
        return new JAXBElement<IndividualExchangeErrorType>(_IndividualExchangeError_QNAME, IndividualExchangeErrorType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "IRSGroupIdentificationNum")
    public JAXBElement<String> createIRSGroupIdentificationNum(String value) {
        return new JAXBElement<String>(_IRSGroupIdentificationNum_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "FileProcessingEndDt")
    public JAXBElement<XMLGregorianCalendar> createFileProcessingEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_FileProcessingEndDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link USAddressErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "USAddressErrorDtl")
    public JAXBElement<USAddressErrorDtlType> createUSAddressErrorDtl(USAddressErrorDtlType value) {
        return new JAXBElement<USAddressErrorDtlType>(_USAddressErrorDtl_QNAME, USAddressErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ForeignAddressGrpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ForeignAddressGrp")
    public JAXBElement<ForeignAddressGrpType> createForeignAddressGrp(ForeignAddressGrpType value) {
        return new JAXBElement<ForeignAddressGrpType>(_ForeignAddressGrp_QNAME, ForeignAddressGrpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceMetadataDetailType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceMetadataDetail")
    public JAXBElement<ServiceMetadataDetailType> createServiceMetadataDetail(ServiceMetadataDetailType value) {
        return new JAXBElement<ServiceMetadataDetailType>(_ServiceMetadataDetail_QNAME, ServiceMetadataDetailType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BusinessAddressGrpType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "BusinessAddressGrp")
    public JAXBElement<BusinessAddressGrpType> createBusinessAddressGrp(BusinessAddressGrpType value) {
        return new JAXBElement<BusinessAddressGrpType>(_BusinessAddressGrp_QNAME, BusinessAddressGrpType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "XpathContent")
    public JAXBElement<String> createXpathContent(String value) {
        return new JAXBElement<String>(_XpathContent_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EPDPersonErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ExemptPersonErrorDtl")
    public JAXBElement<EPDPersonErrorDtlType> createExemptPersonErrorDtl(EPDPersonErrorDtlType value) {
        return new JAXBElement<EPDPersonErrorDtlType>(_ExemptPersonErrorDtl_QNAME, EPDPersonErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ErrorMessageTxt")
    public JAXBElement<String> createErrorMessageTxt(String value) {
        return new JAXBElement<String>(_ErrorMessageTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExemptionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "Exemption")
    public JAXBElement<ExemptionType> createExemption(ExemptionType value) {
        return new JAXBElement<ExemptionType>(_Exemption_QNAME, ExemptionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BooleanStringType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "AuthorizationStatusInd")
    public JAXBElement<BooleanStringType> createAuthorizationStatusInd(BooleanStringType value) {
        return new JAXBElement<BooleanStringType>(_AuthorizationStatusInd_QNAME, BooleanStringType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "IssuerNm")
    public JAXBElement<String> createIssuerNm(String value) {
        return new JAXBElement<String>(_IssuerNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeSHOPPolicyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployeeSHOPPolicy")
    public JAXBElement<EmployeeSHOPPolicyType> createEmployeeSHOPPolicy(EmployeeSHOPPolicyType value) {
        return new JAXBElement<EmployeeSHOPPolicyType>(_EmployeeSHOPPolicy_QNAME, EmployeeSHOPPolicyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeSHOPPolicyErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployeeSHOPPolicyErrorDtl")
    public JAXBElement<EmployeeSHOPPolicyErrorDtlType> createEmployeeSHOPPolicyErrorDtl(EmployeeSHOPPolicyErrorDtlType value) {
        return new JAXBElement<EmployeeSHOPPolicyErrorDtlType>(_EmployeeSHOPPolicyErrorDtl_QNAME, EmployeeSHOPPolicyErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceNm")
    public JAXBElement<String> createServiceNm(String value) {
        return new JAXBElement<String>(_ServiceNm_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RejectedFileDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "RejectedFileDtl")
    public JAXBElement<RejectedFileDtlType> createRejectedFileDtl(RejectedFileDtlType value) {
        return new JAXBElement<RejectedFileDtlType>(_RejectedFileDtl_QNAME, RejectedFileDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeeCoverageType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "EmployeeCoverage")
    public JAXBElement<EmployeeCoverageType> createEmployeeCoverage(EmployeeCoverageType value) {
        return new JAXBElement<EmployeeCoverageType>(_EmployeeCoverage_QNAME, EmployeeCoverageType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ErrorMessageCd")
    public JAXBElement<String> createErrorMessageCd(String value) {
        return new JAXBElement<String>(_ErrorMessageCd_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "APTCorCSREligibilityDt")
    public JAXBElement<XMLGregorianCalendar> createAPTCorCSREligibilityDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_APTCorCSREligibilityDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "MonthsExemptEndDt")
    public JAXBElement<XMLGregorianCalendar> createMonthsExemptEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_MonthsExemptEndDt_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ReplacingRejectedFilesNum")
    public JAXBElement<BigInteger> createReplacingRejectedFilesNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_ReplacingRejectedFilesNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceResponseFileLocationTxt")
    public JAXBElement<String> createServiceResponseFileLocationTxt(String value) {
        return new JAXBElement<String>(_ServiceResponseFileLocationTxt_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "ServiceRequestFileId")
    public JAXBElement<String> createServiceRequestFileId(String value) {
        return new JAXBElement<String>(_ServiceRequestFileId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "LowestCostPlanPolicyPremiumAmt")
    public JAXBElement<BigDecimal> createLowestCostPlanPolicyPremiumAmt(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LowestCostPlanPolicyPremiumAmt_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SubmissionRejectedFilesNum")
    public JAXBElement<BigInteger> createSubmissionRejectedFilesNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_SubmissionRejectedFilesNum_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SHOPExchPersonErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SHOPSpouseErrorDtl")
    public JAXBElement<SHOPExchPersonErrorDtlType> createSHOPSpouseErrorDtl(SHOPExchPersonErrorDtlType value) {
        return new JAXBElement<SHOPExchPersonErrorDtlType>(_SHOPSpouseErrorDtl_QNAME, SHOPExchPersonErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsuranceCoverageErrorDtlType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "InsuranceCoverageErrorDtl")
    public JAXBElement<InsuranceCoverageErrorDtlType> createInsuranceCoverageErrorDtl(InsuranceCoverageErrorDtlType value) {
        return new JAXBElement<InsuranceCoverageErrorDtlType>(_InsuranceCoverageErrorDtl_QNAME, InsuranceCoverageErrorDtlType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:us:gov:treasury:irs:common", name = "SequenceNum")
    public JAXBElement<BigInteger> createSequenceNum(BigInteger value) {
        return new JAXBElement<BigInteger>(_SequenceNum_QNAME, BigInteger.class, null, value);
    }

}
