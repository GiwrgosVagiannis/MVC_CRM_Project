package com.vagiannis.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vagiannis.entity.Computer;


@Repository
public class ComputerDAOImpl implements ComputerDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional	
	@Override		
	public List<Computer> getComputers() {
		
		// get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
			
		//create query 
		Query<Computer> theQuery=currentSession.createQuery("from Computer",Computer.class);
		//execute query and get the result list
		List<Computer> Computers=theQuery.getResultList();
		
		return Computers;
		}

}
