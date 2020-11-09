package com.sanjayacchana.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanjayacchana.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
