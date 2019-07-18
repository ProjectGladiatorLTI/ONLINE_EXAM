/*package com.lti.training.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lti.training.dao.MyFileDao;
import com.lti.training.dto.MyFileDTO;
import com.lti.training.entity.MyFile;

@Controller
public class UploadController {
	@Autowired 
	  MyFileDao myfiledao;
	
	@RequestMapping(path="/uploadDocument")//,method = RequestMethod.POST)
	public void uploadingDocument(MyFileDTO myFileDTO) {
		
		System.out.println("Upload controller is called");
		
		
		String path="d:/uploads/";
		
		String fileName=myFileDTO.getFile().getOriginalFilename();
		System.out.println("File Name is:"+fileName);
		String finalPath=path+fileName;
		MyFile file=new MyFile(myFileDTO,fileName);

		try {
		myFileDTO.getFile().transferTo(new File(finalPath));
		}catch(IOException e) {
			e.printStackTrace();
		}
		 myfiledao.addFile(file); 
		
		}

}
*/