package org.switchyard.quickstarts.camel.jaxb;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.camel.Exchange;
import org.switchyard.quickstarts.camel.jaxb.dao.LogsDAO;

@Named
public class ManifestValidate {
	
	@Inject
	private LogsDAO logsDAO;

	public void isValid(Exchange in) {
		
		if (logsDAO == null) {
			
			System.out.println("logsDAO is null" );

			
		}
		
		else{
			
			System.out.println(logsDAO.findByPrimaryKey(1L) );

		}
		
		System.out.println("invoked Manifest validate ${}" );
		
		in.getIn().setHeader("isValid", "true");
		
		
	}
	
	
}
