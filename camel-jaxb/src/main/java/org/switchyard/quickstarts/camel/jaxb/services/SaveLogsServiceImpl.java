package org.switchyard.quickstarts.camel.jaxb.services;

import javax.annotation.Resource;
import javax.inject.Inject;
import javax.transaction.UserTransaction;
import org.switchyard.quickstarts.camel.jaxb.dao.LogsDAO;
import org.switchyard.quickstarts.camel.jaxb.entities.Logs;

public class SaveLogsServiceImpl implements SaveLogsService {

	@Inject
	private LogsDAO logsDAO;

	@Resource(mappedName = "java:/jboss/UserTransaction")
	private UserTransaction trans;

	@Override
	public void saveLogs(Logs logs) {

		try {
			
		//	trans.begin();
			
			logsDAO.save(logs);
			
		//	trans.commit();
			
		} catch (Exception e) {
			
			e.printStackTrace();

		}

	}

}
