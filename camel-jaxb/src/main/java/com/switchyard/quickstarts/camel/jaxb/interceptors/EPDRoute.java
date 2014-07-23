package com.switchyard.quickstarts.camel.jaxb.interceptors;

import java.io.StringReader;
import java.util.Map;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spi.DataFormat;


public class EPDRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://GetEPDBulkRequestExchangePortType")
				.log("Received message for 'GetEPDBulkRequestExchangePortType' : ${body}")
				.process(new Processor() {
                @Override
                public void process(Exchange exchange) throws Exception {
                //	DataFormat jaxb = new JaxbDataFormat("us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd.ACABatchManifestDetailType");
                	
                 Map<String, Object>  headers =  exchange.getIn().getHeaders();
                 
                 for (String key : headers.keySet() ){
                	 

                    	 
                	 System.out.println(key + "----\n" + headers.get(key) + "----\n" + headers.get(key).toString());
                	 
                	 System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                	 
                	 if (key.equalsIgnoreCase("{urn:us:gov:treasury:irs:ext:aca:isrepd}ACABatchManifestDetail")) {
                		 
                		 unmarshall(headers.get(key).toString());
                		 
                	 }
            
                	
                	 
             
                	 
                 }
                 	
                 System.out.println(headers.size());
                 
                 System.out.println("jrebel upload 2");  
                
                 
                }
            });
	}
	
	
	private void unmarshall(String input){
		
		// DataFormat jaxb = new JaxbDataFormat("com.acme.model");
		
   	 
      	 JAXBContext jaxbContext;
		try {
			
			us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd.ACABatchManifestDetailType manifest = JAXB.unmarshal(new StringReader(input), us.gov.treasury.irs.epd.bulkfileproc.ext.aca.isrepd.ACABatchManifestDetailType.class);	
					
	
    		System.out.println("manifest elements" + manifest.getACABatchDetail().getBatchPartnerId());
    		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
