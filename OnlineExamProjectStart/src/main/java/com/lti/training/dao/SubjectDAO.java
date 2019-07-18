package com.lti.training.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.lti.training.entity.Subject;

@Repository
public class SubjectDAO {
	
	@PersistenceContext
	EntityManager em;
	
        public List<Subject> display() {
        	
		List<Subject> list=em.createQuery("select s from Subject as s").getResultList();
		
		return list;		
				
        }

}
