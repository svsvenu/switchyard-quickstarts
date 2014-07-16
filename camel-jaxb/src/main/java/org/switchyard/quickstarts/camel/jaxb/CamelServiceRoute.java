package org.switchyard.quickstarts.camel.jaxb;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.switchyard.common.camel.SwitchYardMessage;

public class CamelServiceRoute extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		
		String test = "check this respone out";
		
		from("switchyard://HelloWorldServicePortType").log(
				"Received message for 'HelloWorldServicePortType' : ${body}").process(new Processor() {
                @Override
                public void process(Exchange exchange) throws Exception {
                	
            		System.out.println("Received input" + exchange.getIn().getBody().toString()) ;

               //     GreetingRequest rq = exchange.getIn().getBody(GreetingRequest.class);
               //     GreetingResponse rp = new GreetingResponse("Ola " + "!");

                    SwitchYardMessage out = new SwitchYardMessage();
                                        
                    out.setBody("<venu/>");

                    exchange.setOut(exchange.getIn());
                }
            })
				.convertBodyTo(String.class);
		
	
	}

}
