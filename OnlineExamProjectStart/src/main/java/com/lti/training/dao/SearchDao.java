package com.lti.training.dao;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.training.entity.Admin;

@Repository
public class SearchDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public Admin fetchOne(String email){

		/*Query q = entityManager.createQuery("select a from Admin as a where a.email=:em");
		q.setParameter("em", email);*/
		Admin admin=entityManager.find(Admin.class, email);
		System.out.println("Password is:"+admin.getPassword());
		return admin;


	}
	

}
