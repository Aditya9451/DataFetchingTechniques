package com.tutorial.springboot.cruddemo.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tutorial.springboot.cruddemo.entity.Employee;

@Repository
public class EmployeeDAOJPAImpl implements EmployeeDAO {
	
	
	private EntityManager entityManager;

	@Autowired
	public EmployeeDAOJPAImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {
		Query thequery=entityManager.createQuery("from Employee");
		List<Employee> list= thequery.getResultList();
		
		return list;
		
	}

	@Override
	public Employee findById(int empId) {
		Employee thequery = entityManager.find(Employee.class, empId);
		return thequery;
	}

	@Override
	public void save(Employee emp) {
		
	entityManager.persist(emp);
	}

	@Override
	public void deleteById(int empId) {
	
		Query thequery=entityManager.createQuery("delete from Employee where id=:employeeId");
		thequery.setParameter("employeeId", empId);
		thequery.executeUpdate();
		
	}

}
