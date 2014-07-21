package org.switchyard.quickstarts.camel.jaxb;

import java.io.StringReader;
import java.util.Map;

import javax.inject.Inject;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.converter.jaxb.JaxbDataFormat;
import org.apache.camel.spi.DataFormat;
import org.apache.http.Header;
import org.switchyard.common.camel.SwitchYardMessage;
import org.switchyard.component.bean.Reference;

public class PortRoute extends RouteBuilder { 

	@Inject
	@Reference("JMSInterface")
	private JMSInterface _service;
	
	@Override
    public void configure() throws Exception {
		
		DataFormat jaxb = new JaxbDataFormat("demo.quickstart.switchyard.math._1.AddNumbers");
		
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
                	 
                     if (key.equalsIgnoreCase("{urn:switchyard-quickstart-demo:math:1.0}addNumbers")) {
                    	 
                	 System.out.println(key + "----" + headers.get(key) + "----" + headers.get(key).getClass());
                	 
            //    	 JAXBContext jaxbContext = JAXBContext.newInstance(demo.quickstart.switchyard.math._1.AddNumbers.class);
                	 
            // 		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
             		
             		 StringBuffer xmlStr = new StringBuffer( headers.get(key).toString() );
             	//       Object o = jaxbUnmarshaller.unmarshal( new StreamSource( new StringReader( xmlStr.toString() ) ) );
             		
             		
             //		 jaxbUnmarshaller.unmarshal(headers.get(key));
             		System.out.println(0);
                	
                	 
                     }
                	 
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
