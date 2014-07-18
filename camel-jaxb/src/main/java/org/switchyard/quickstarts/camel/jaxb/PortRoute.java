package org.switchyard.quickstarts.camel.jaxb;

import java.util.Map;

import javax.inject.Inject;
import javax.xml.bind.JAXBContext;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.http.Header;
import org.switchyard.common.camel.SwitchYardMessage;
import org.switchyard.component.bean.Reference;

public class PortRoute extends RouteBuilder { 

	@Inject
	@Reference("JMSInterface")
	private JMSInterface _service;
	
	@Override
    public void configure() throws Exception {
		
		System.out.println("invoked the switchyard");
		
        from("switchyard://getMultiElementSearchDataPort")
            .to("file:////Users/venusurampudi/Desktop/incomingsoap.xml")
            .bean(ManifestValidate.class, "isValid")
            .choice()
            		.when( header("isValid").isEqualTo("false") ).to("switchyard://JMSInterface")
            		.otherwise().to("switchyard://InvalidJMSInterface")
            .process(new Processor() {
                @Override
                public void process(Exchange exchange) throws Exception {
                 Map<String, Object>  headers =  exchange.getIn().getHeaders();
                 
                 for (String key : headers.keySet() ){
                	 
              
                	 System.out.println(key + "----" + headers.get(key) + "----" + headers.get(key).getClass());
                	 
                 }
                 	
                 System.out.println(headers.size());
                 
                if ( _service == null) {
                 
             	System.out.println("request is null") ;
             	
                 }
                 
                }
            }).convertBodyTo(String.class)
            .to("file:////Users/venusurampudi/Desktop/soapreq.xml").log("${body}");
            
            
            
            
            

    }
}
