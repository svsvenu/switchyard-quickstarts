package org.switchyard.quickstarts.camel.jaxb.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="logs", schema="brmg")
public class Logs {
	
	@Id
	@GeneratedValue
	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogMessage() {
		return logMessage;
	}

	public void setLogMessage(String logMessage) {
		this.logMessage = logMessage;
	}

	private String logMessage;
	
	public String toString( ) {
		
		return "id: " + id + "logMessage"  + logMessage;
		
	}

}
