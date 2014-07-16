package org.switchyard.quickstarts.camel.jaxb;

import org.switchyard.component.bean.Service;

@Service(ValidRequestProcess.class)
public class ValidRequestProcessBean implements ValidRequestProcess {

	@Override
	public void greet(String name) {
		// TODO Auto-generated method stub
		
		System.out.println("this is the message i got " + name);
		
	}

}
