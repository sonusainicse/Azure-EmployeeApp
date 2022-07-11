package com.spring_boot_azure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring_boot_azure.model.Employee;

public interface EmpoyeeRepository extends JpaRepository<Employee, Long> {

}