package com.java.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CreateEmployee {
	public void createEmployee(Employee[] employees){
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		
		for(Employee employee:employees)
			manager.persist(employee);
		transaction.commit();
		manager.close();
		factory.close();
	}
}