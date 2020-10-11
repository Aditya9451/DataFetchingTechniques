package com.tutorial.springboot.cruddemo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.springboot.cruddemo.dao.EmployeeRepository;
import com.tutorial.springboot.cruddemo.entity.Employee;
import com.tutorial.springboot.cruddemo.exception.EmployeeNotFoundException;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public List<Employee> findAll() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int empId) {
	Optional<Employee> result=employeeRepository.findById(empId);
	Employee emp=null;
	if(result.isPresent())
		emp=result.get();
	else
		throw new EmployeeNotFoundException("Employee not found "+ empId);
	
	return emp;
	}

	@Override
	public void save(Employee emp) {
		employeeRepository.save(emp);	
	}

	@Override
	public void deleteById(int empId) {
		employeeRepository.deleteById(empId);
		
	}

}
