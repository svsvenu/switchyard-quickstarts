package org.switchyard.quickstarts.camel.jaxb.dao;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.switchyard.quickstarts.camel.jaxb.entities.Logs;

@Named
public class LogsDAO {
	

	@PersistenceContext

	private EntityManager entityManager;

	public Logs findByPrimaryKey(Long id) {

	//	printstackTrace();


		// TODO Auto-generated method stub
		if ( entityManager != null){

			System.out.println("Venu Entity manager is " + entityManager.toString() + "id is " + id);

		}

		System.out.println(entityManager.find(Logs.class, 1L));
		return entityManager.find(Logs.class, id);
	}

	public void printstackTrace(){


		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();

		for (StackTraceElement stack : stacks){

			System.out.println(stack.toString());

		}

	}
	
	public String toString() {
		
		
		return "what up biatch";
	}



}
