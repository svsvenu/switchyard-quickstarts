package com.switchyard.quickstarts.camel.jaxb.interceptors;

import java.io.IOException;

import org.apache.cxf.attachment.AttachmentDeserializer;
import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingMessage;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
 
public class SOAPInterceptor extends LoggingInInterceptor {
  
	public SOAPInterceptor()
	{
	    super(Phase.RECEIVE );
	
	}
   

	 @Override
	    protected String formatLoggingMessage(LoggingMessage loggingMessage) {
		 
	        String soapXmlPayload = loggingMessage.getPayload() != null ? loggingMessage.getPayload().toString() : null;
	        System.out.println(soapXmlPayload);
	        return super.formatLoggingMessage(loggingMessage);
	    }
}