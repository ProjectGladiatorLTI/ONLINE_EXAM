package com.lti.training.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.lti.training.dto.MyFileDTO;

@Entity
@Table(name="MYFILE_TBL")
public class MyFile {
	
	@Id
	@GeneratedValue
	private int id;
	private String fileName;
	
	public MyFile(MyFileDTO ud,String fname) {
		
		this.fileName = fname;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	
	

}
