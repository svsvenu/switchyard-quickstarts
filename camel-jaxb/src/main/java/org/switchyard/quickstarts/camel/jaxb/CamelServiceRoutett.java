package org.switchyard.quickstarts.camel.jaxb;

import org.apache.camel.builder.RouteBuilder;

public class CamelServiceRoutett extends RouteBuilder {

	/**
	 * The Camel route is configured via this method.  The from endpoint is required to be a SwitchYard service.
	 */
	public void configure() {
		// TODO Auto-generated method stub
		from("switchyard://getMultiElementSearchDataPort")
				.log("Received message for 'getMultiElementSearchDataPort' : ${body}");
	}

}
