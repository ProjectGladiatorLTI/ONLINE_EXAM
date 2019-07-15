package com.lti.training.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.training.entity.Admin;
import com.lti.training.service.LoginService;

@RestController
public class adminLoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value="/adminLogin",method=RequestMethod.GET)
	public Admin fetch(@RequestParam(name= "email") String email) {
		
		System.out.println("Controller is called");

		
		return loginService.showSearch(email);



	}


}
