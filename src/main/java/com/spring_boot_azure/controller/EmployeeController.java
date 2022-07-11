package com.spring_boot_azure.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.http.HttpStatus;
	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.spring_boot_azure.model.Employee;
import com.spring_boot_azure.service.EmployeeService;




	//this is my controller file

	@RestController
	public class EmployeeController { 


			@Autowired
			private EmployeeService employeeservice;

			public EmployeeController(EmployeeService employeeservice) {
				super();
				this.employeeservice = employeeservice;
			}
			
			
			@GetMapping("/employees")
			public java.util.List<Employee> getAllEmployees(){
				return (java.util.List<Employee>) this.employeeservice.getAllEmployees();
			}
			
			@GetMapping("/employees/{id}")
			public Employee getemEmployeeById(@PathVariable("id") String id) {
				return this.employeeservice.getEmployeeById(Long.parseLong(id));
			}
			
			@PostMapping("/employees")
			public ResponseEntity<Employee> saveEmployee(@RequestBody Employee emp){
				return new ResponseEntity<Employee>(employeeservice.saveEmployee(emp),HttpStatus.CREATED);
			}
				
				@DeleteMapping("/employees/{id}")
				public ResponseEntity<HttpStatus> deleteEmployeeById(@PathVariable String id) {
					try {
						this.employeeservice.deleteEmployeeById(Long.parseLong(id));
						return new ResponseEntity<>(HttpStatus.OK);
					}
					catch(Exception e) {
						return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
					}
				
			}

		}
