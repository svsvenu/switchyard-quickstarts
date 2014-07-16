package org.switchyard.quickstarts.camel.jaxb;

import javax.inject.Named;

import org.apache.camel.Exchange;

@Named
public class ManifestValidate {

	public boolean isValid(Exchange in) {
		
		System.out.println("invoked Manifest validate" + in.getIn().getBody());
		
		
		
		return true;
		
	}
	
	
}
