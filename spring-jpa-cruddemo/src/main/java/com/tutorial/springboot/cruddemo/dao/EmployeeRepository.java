package com.tutorial.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tutorial.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
