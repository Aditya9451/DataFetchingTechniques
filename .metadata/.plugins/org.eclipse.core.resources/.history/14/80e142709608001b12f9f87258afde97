package com.tutorial.springboot.cruddemo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.springboot.cruddemo.dao.EmployeeDAO;
import com.tutorial.springboot.cruddemo.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	@Transactional
	public List<Employee> findAll() {
		
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int empId) {
		// TODO Auto-generated method stub
		return employeeDAO.findById(empId);
	}

	@Override
	@Transactional
	public void save(Employee emp) {
		employeeDAO.save(emp);	
	}

	@Override
	@Transactional
	public void deleteById(int empId) {
	employeeDAO.deleteById(empId);
		
	}

}
