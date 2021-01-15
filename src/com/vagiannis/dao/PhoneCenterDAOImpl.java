package com.vagiannis.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vagiannis.entity.PhoneCenter;

@Repository
public class PhoneCenterDAOImpl implements PhoneCenterDAO{
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional	
	@Override		
	public List<PhoneCenter> getPhones() {
		
		// get the current hibernate session
		Session currentSession=sessionFactory.getCurrentSession();
			
		//create query 
		Query<PhoneCenter> theQuery=currentSession.createQuery("from PhoneCenter",PhoneCenter.class);
		//execute query and get the result list
		List<PhoneCenter> Phones=theQuery.getResultList();
		
		return Phones;
		}

	
	

}
