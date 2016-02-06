package com.java.jpa;

public class EmployeeJpaApp {

	public static void main(String[] args) {
/*		CreateEmployee newEmployee=new CreateEmployee();
		Employee employee1=new Employee();
		employee1.setName("Aakash");
		employee1.setId(1001);
		employee1.setDepartment("IT");
		employee1.setSalary(50000);
		
		Employee employee2=new Employee();
		employee2.setName("Vikas");
		employee2.setDepartment("Finance");
		employee2.setSalary(60000);
		
		Employee employee3=new Employee();
		employee3.setName("Rahul");
		employee3.setDepartment("HR");
		employee3.setSalary(70000);
		
		Employee employee4=new Employee();
		employee4.setName("Sanish");
		employee4.setId(2001);
		employee4.setDepartment("Web");
		employee4.setSalary(75000);
		
		Employee employee5=new Employee();
		employee5.setName("Vinay");
		employee5.setId(3001);
		employee5.setDepartment("Legal");
		employee5.setSalary(80000);
		
		Employee[] employees={employee1,employee2,employee3,employee4,employee5};
		newEmployee.createEmployee(employees);*/
		
		EmployeeJPQL jpql1=new EmployeeJPQL();
		jpql1.getEmployeesBetween();
		/*UpdateEmployee alterEmployee=new UpdateEmployee();
		alterEmployee.update(1001);
		
		DeleteEmployee deleteEmployee=new DeleteEmployee();
		deleteEmployee.delete(51);
*/	}
}