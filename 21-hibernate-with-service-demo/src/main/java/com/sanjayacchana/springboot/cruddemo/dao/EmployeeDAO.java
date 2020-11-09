package com.sanjayacchana.springboot.cruddemo.dao;

import java.util.List;

import com.sanjayacchana.springboot.cruddemo.entity.Employee;

public interface EmployeeDAO {

	public List<Employee> findAll();
	
	public Employee findEmployeeById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
	
		
}
