package us.gov.treasury.irs.srv.getepdbulkrequest;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.1
 * 2014-07-21T12:31:09.176-05:00
 * Generated source version: 3.0.1
 * 
 */
@WebService(targetNamespace = "urn:us:gov:treasury:irs:srv:getepdbulkrequest", name = "GetEPDBulkRequestExchangePortType")
@XmlSeeAlso({us.gov.treasury.irs.epd.bulkfileproc.common.ObjectFactory.class, us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd.ObjectFactory.class, us.gov.treasury.irs.epd.bulkfileproc.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface GetEPDBulkRequestExchangePortType {

    @WebResult(name = "ACABulkRequestExchangeResponse", targetNamespace = "urn:us:gov:treasury:irs:msg:hhsirsacabulkrequestexchange", partName = "GetEPDBulkRequestExchangeResponse")
    @WebMethod(operationName = "GetEPDBulkRequestExchange", action = "GetEPDBulkRequestExchange")
    public us.gov.treasury.irs.epd.bulkfileproc.ACABulkRequestExchangeResponseType getEPDBulkRequestExchange(
        @WebParam(partName = "GetEPDBulkRequestExchange", name = "ACABulkRequestExchange", targetNamespace = "urn:us:gov:treasury:irs:msg:hhsirsacabulkrequestexchange")
        us.gov.treasury.irs.epd.bulkfileproc.ACABulkRequestExchangeType getEPDBulkRequestExchange
    ) throws Fault;
}