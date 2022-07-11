package com.spring_boot_azure.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


// this is my entity class

//@Data   // by using this annotation we need not to construct getters and setters and toString method
@Entity // This annotation is used for defining it as an Entity
@Table(name="emp") // it is used to make it as table as employee.
public class Employee {
		
		@Id // it define as primary key  // auto generated values for id unique 
		private long id;
		
		@Column(name="first_name", nullable = false)  // it is used to define it as a column
		private String firstName;
		
		@Column(name="last_name")
		private String lastName;
		
		@Column(name="email")
		private String email;

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	}
