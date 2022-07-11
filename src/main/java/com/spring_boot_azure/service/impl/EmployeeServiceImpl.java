package com.spring_boot_azure.service.impl;


import org.springframework.stereotype.Service;

import com.spring_boot_azure.model.Employee;
import com.spring_boot_azure.repository.EmpoyeeRepository;
import com.spring_boot_azure.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	
	private	EmpoyeeRepository employeeRepository ;

		public EmployeeServiceImpl(EmpoyeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


		@Override
		public Employee saveEmployee(Employee employee) {
			
			return employeeRepository.save(employee);
		}



		@Override
		public Employee getEmployeeById(long id) {
			java.util.Optional<Employee> optional = employeeRepository.findById(id);
			Employee employee = null;
			if (optional.isPresent()) {
				employee = optional.get();
			} else {
				throw new RuntimeException(" Employee not found for id :: " + id);
			}
			return employee;
		}


		@Override
		public void deleteEmployeeById(long id) {
			this.employeeRepository.deleteById(id);
		}


	


		@Override
		public java.util.List<Employee> getAllEmployees() {
			 return employeeRepository.findAll();
		}

	}
