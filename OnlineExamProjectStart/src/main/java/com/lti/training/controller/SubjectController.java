package com.lti.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.training.entity.Subject;
import com.lti.training.service.SubjectService;

@RestController
public class SubjectController {
	
	@Autowired 
	private SubjectService subjectService;
	
	@RequestMapping(value="/getSubject",method=RequestMethod.GET)
    public List<Subject> displaysubject() {
		System.out.println("controller called");
		
		return subjectService.displaySubject();
		
    
		
		
    }

}
