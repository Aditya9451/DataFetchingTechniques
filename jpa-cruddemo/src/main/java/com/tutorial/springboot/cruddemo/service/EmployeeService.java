package com.tutorial.springboot.cruddemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tutorial.springboot.cruddemo.dao.EmployeeDAO;
import com.tutorial.springboot.cruddemo.entity.Employee;

public interface EmployeeService {
	
	
public List<Employee> findAll();
	
	public Employee findById(int empId);
	
	public void save(Employee emp);
	
	public void deleteById(int empId);
	
	
	
	
	

}
