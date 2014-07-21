package org.switchyard.quickstarts.camel.jaxb.dao;


import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.switchyard.quickstarts.camel.jaxb.entities.Logs;

// @Stateless 
@Named
public class LogsDAOImpl implements LogsDAO{
	

	@PersistenceContext
	private EntityManager entityManager;

	public Logs findByPrimaryKey(Long id) {

		// TODO Auto-generated method stub
		if ( entityManager != null){

			System.out.println("Venu Entity manager is " + entityManager.toString() + "id is " + id);

		}

		System.out.println(entityManager.find(Logs.class, 1L));
		
		return entityManager.find(Logs.class, id);
	}
	
	public void save(Logs logs){
		
		
	//	entityManager.getTransaction().begin();
		
		entityManager.persist(logs);
		
		entityManager.flush();
		
	//	entityManager.getTransaction().commit();
		
	}

	public void printstackTrace(){


		StackTraceElement[] stacks = Thread.currentThread().getStackTrace();

		for (StackTraceElement stack : stacks){

			System.out.println(stack.toString());

		}

	}
	
	public String toString() {
			
		return entityManager.toString();
	}

}
