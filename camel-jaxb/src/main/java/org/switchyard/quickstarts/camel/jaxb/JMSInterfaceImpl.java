package org.switchyard.quickstarts.camel.jaxb;

import javax.inject.Named;

@Named
public class JMSInterfaceImpl implements JMSInterface {

	@Override
	public void send(String text) {
		// TODO Auto-generated method stub
		
		System.out.println("here");
		
	}

}
