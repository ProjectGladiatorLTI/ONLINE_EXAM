package com.lti.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.training.dao.SearchDao;
import com.lti.training.entity.Admin;

@Service
public class LoginService {
	@Autowired
	private SearchDao searchDao;
	
	public Admin showSearch(String email){
		System.out.println("Service is called");

		Admin admin = new Admin();
		return searchDao.fetchOne(email);


	}


}
