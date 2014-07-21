package org.switchyard.quickstarts.camel.jaxb;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.camel.Exchange;
import org.springframework.transaction.annotation.Transactional;
import org.switchyard.quickstarts.camel.jaxb.dao.LogsDAO;
import org.switchyard.quickstarts.camel.jaxb.entities.Logs;
import org.switchyard.quickstarts.camel.jaxb.services.SaveLogsService;

@Named
public class ManifestValidate {
	
	@Inject
	private SaveLogsService saveLogsService;

	public void isValid(Exchange in) {
		
		if (saveLogsService == null) {
			
			System.out.println("saveLogsService is null" );

			
		}
		
		else{
			
		//	System.out.println(saveLogsService.findByPrimaryKey(1L) );

		}
		
		Logs logs = new Logs();
		
		logs.setLogMessage("Message " + Math.random());
		
		saveLogsService.saveLogs(logs);
		
		System.out.println("invoked Manifest validate ${}" );
		
		in.getIn().setHeader("isValid", "true");
		
		
	}
	
	
}
