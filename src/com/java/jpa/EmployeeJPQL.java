package com.java.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeJPQL {
	public void getEmployeesBetween(){
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("JPA");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		
		Query between=manager.createQuery("Select e from Employee e where"
										+ " e.salary between 40000 AND 70000");
		List<Employee> employeeList=between.getResultList();
		for(Employee employee:employeeList)
			System.out.println(employee.getName());
	}
}