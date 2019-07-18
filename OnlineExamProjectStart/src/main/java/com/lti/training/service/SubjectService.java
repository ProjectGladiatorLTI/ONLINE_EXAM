package com.lti.training.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.training.dao.SubjectDAO;
import com.lti.training.entity.Subject;
@Service
public class SubjectService {
	
	@Autowired
	private SubjectDAO dao;
	public List<Subject> displaySubject() {
		
		
		System.out.println("service is called");
		List<Subject>list=dao.display();
		for (Subject subject : list) {
			System.out.println(subject.getSubjectname());
			
		}
		return list;
		
	}

}
