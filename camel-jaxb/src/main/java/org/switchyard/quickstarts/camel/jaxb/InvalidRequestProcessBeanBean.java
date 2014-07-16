package org.switchyard.quickstarts.camel.jaxb;

import org.switchyard.component.bean.Service;

@Service(InvalidRequestProcessBean.class)
public class InvalidRequestProcessBeanBean implements InvalidRequestProcessBean {

	@Override
	public void String(java.lang.String text) {

		System.out.println("invalid request " + text);
	}

}
