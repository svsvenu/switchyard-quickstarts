package com.tests;

import javax.jms.Message;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.switchyard.component.bean.config.model.BeanSwitchYardScanner;
import org.switchyard.component.test.mixins.cdi.CDIMixIn;
import org.switchyard.component.test.mixins.hornetq.HornetQMixIn;
//import org.switchyard.component.test.mixins.hornetq.HornetQMixIn;
import org.switchyard.component.test.mixins.http.HTTPMixIn;
import org.switchyard.component.test.mixins.naming.NamingMixIn;
//import org.switchyard.component.test.mixins.smooks.SmooksMixIn;
import org.switchyard.test.Invoker;
import org.switchyard.test.MockHandler;
import org.switchyard.test.ServiceOperation;
import org.switchyard.test.SwitchYardRunner;
import org.switchyard.test.SwitchYardTestCaseConfig;
import org.switchyard.test.SwitchYardTestKit;
import org.switchyard.transform.config.model.TransformSwitchYardScanner;
import org.switchyard.component.test.mixins.http.*;

@RunWith(SwitchYardRunner.class)
 @SwitchYardTestCaseConfig(config = SwitchYardTestCaseConfig.SWITCHYARD_XML, mixins ={HTTPMixIn.class, CDIMixIn.class, HornetQMixIn.class}) 
public class GetEPDBulkRequestExchangePortTypeTest {

	private SwitchYardTestKit testKit; 
	
	private String url = "http://localhost:8080/epd/GetEPDBulkRequestExchangeService";
	
	HTTPMixIn httpMixIn ;


	@ServiceOperation("GetEPDBulkRequestExchangePortType")
	private Invoker service;

	@Test
	public void testGetEPDBulkRequestExchange() {
		
        final MockHandler validRequestProcess = testKit.registerInOnlyService("ValidRequestProcess");
        
        final MockHandler InvalidRequestProcess = testKit.registerInOnlyService("InvalidRequestProcess");

		

		httpMixIn.initialize();
	//	testKit.getResourceAsStream("soaprequest.xml");
		
		String output = httpMixIn.postFile(url, "/Users/venusurampudi/git/switchyard-quickstarts/camel-jaxb/src/test/resources/soaprequest.xml");
		
	//String output = httpMixIn.postResource(url, "soaprequest.xml");
		
    //    Message message = HTTPMixIn.HTTP_POST

		
	 System.out.println(output);
		// TODO Auto-generated method stub
		// initialize your test message
	//	Object message = null;
	//	String result = service.operation("GetEPDBulkRequestExchange")
	//			.sendInOut(message).getContent(String.class);
		
	//	testKit.compareXMLToResource(result, "soapresponse.xml");

		// validate the results
		// Assert.assertTrue("Implement me", false);
	}

}
