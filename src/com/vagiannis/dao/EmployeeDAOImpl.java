package com.vagiannis.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vagiannis.entity.Employee;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
		//need to inject the sesion factory
		
		@Autowired
		private SessionFactory sessionFactory;
		@Transactional	
		@Override		
		public List<Employee> getEmployees() {
			
			// get the current hibernate session
			Session currentSession=sessionFactory.getCurrentSession();
				
			//create query 
			Query<Employee> theQuery=currentSession.createQuery("from Employee",Employee.class);
			//execute query and get the result list
			List<Employee> Employees=theQuery.getResultList();
			//return the result
			return Employees;
			}
		@Override
		@Transactional
		public void saveEmployee(Employee theEmployee) {
			//get hibernate session
			Session currentSession =sessionFactory.getCurrentSession();
			//save or update session
			currentSession.saveOrUpdate(theEmployee);
			
		}
		@Override
		@Transactional
		public Employee getEmployees(int theId) {
			
			//get the current hibernate session
			Session currentSession=sessionFactory.getCurrentSession();
			//now retrieve from database using the primary key
			Employee theEmployee =currentSession.get(Employee.class, theId);
		
			
			return theEmployee;
		}
		@Override
		@Transactional
		public void deleteEmployee(int theId) {
			Session currentSession=sessionFactory.getCurrentSession();
			System.out.println(theId);
			Query theQuery=currentSession.createQuery("delete from Employee where idkuber_employees=:theEmployeeId");
			theQuery.setParameter("theEmployeeId",theId);
			//
			theQuery.executeUpdate();
			
		}

		
			
		}

	


