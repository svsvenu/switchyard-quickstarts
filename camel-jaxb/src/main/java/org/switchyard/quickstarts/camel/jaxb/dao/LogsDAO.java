package org.switchyard.quickstarts.camel.jaxb.dao;

import org.switchyard.quickstarts.camel.jaxb.entities.Logs;

public interface LogsDAO {
	
	public Logs findByPrimaryKey(Long id) ;
	
	public void save(Logs logs);

}
