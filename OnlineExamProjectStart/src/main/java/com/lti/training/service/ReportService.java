package com.lti.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.training.dao.ReportDao;
import com.lti.training.entity.Report;

//@Service
public class ReportService {

	@Autowired
	private ReportDao reportDao;
		
	public void addData() {
		/*
		 * Report report = new Report(); report.setEmail("sai@gmail.com");
		 * report.setLevel1(7); report.setLevel2(8); report.setLevel3(9);
		 * report.setSid(1); report.setTotal(24);
		 * 
		 * reportDao.add(report);
		 */
		
	}
	
}
