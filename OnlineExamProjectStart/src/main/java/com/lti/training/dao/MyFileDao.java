package com.lti.training.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.entity.MyFile;

@Repository
public class MyFileDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Transactional // for begin and commit
	public void addFile(MyFile myfile) {
		System.out.println("DAO is called");
		entityManager.merge(myfile);
	}
	
	

}
