package com.java.jpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {
	
	public void update(int empId){
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		
		 Employee employee=manager.find(Employee.class,empId);
		 employee.setSalary(75000);
		 
		 transaction.commit();
		 manager.close();
		 factory.close();
	}
}