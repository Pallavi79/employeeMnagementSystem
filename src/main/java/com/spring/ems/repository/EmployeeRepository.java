package com.spring.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.ems.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
