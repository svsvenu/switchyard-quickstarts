package org.switchyard.quickstarts.camel.jaxb.services;

import org.switchyard.quickstarts.camel.jaxb.entities.Logs;

public interface SaveLogsService {
	
	public void saveLogs(Logs logs);

}
