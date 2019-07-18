package com.lti.training.service;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.training.dao.MyFileDao;
import com.lti.training.dto.MyFileDTO;
import com.lti.training.entity.MyFile;

@Service
public class UploadingQuestionFileService {

	@Autowired
	private MyFileDao myfileDao;
	
	public String uploadFileToDatabase(MyFileDTO myFileDto) {
		System.out.println("Service");
		
		String path="d:/uploads/";
		String fileName=myFileDto.getFile().getOriginalFilename();
		String finalPath = path+fileName;
		try {
			myFileDto.getFile().transferTo(new File(finalPath));	
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		MyFile file = new MyFile(myFileDto, finalPath);
		
		return "success";
	}
}
