package com.spring_boot_azure.service;

import java.util.List;

import com.spring_boot_azure.model.Employee;



public interface EmployeeService {
Employee saveEmployee(Employee emp);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeById(long id);
	
	void deleteEmployeeById(long id);

}
