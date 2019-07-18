package com.lti.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lti.training.dto.MyFileDTO;
import com.lti.training.service.UploadingQuestionFileService;

@RestController
public class UploadFileController {

	@Autowired
	private UploadingQuestionFileService uploadService;
	
	@RequestMapping(path="/uploadDocument", method=RequestMethod.POST)
	public String fileUpload(MyFileDTO myFileDto) {
		System.out.println("controller reached");
		

		return uploadService.uploadFileToDatabase( myFileDto);
	}
}
