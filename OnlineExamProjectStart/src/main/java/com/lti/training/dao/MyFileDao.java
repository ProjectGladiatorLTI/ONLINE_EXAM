package com.lti.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.training.entity.MyFile;
import com.lti.training.entity.Option;
import com.lti.training.entity.Question;
import com.lti.training.entity.Subject;

@Repository
public class MyFileDao {
	
	@PersistenceContext
	private EntityManager entityManager;
	

	@Transactional // for begin and commit
	public void addFile(MyFile myfile) {
		System.out.println("DAO is called");
		entityManager.merge(myfile);	
	}
	
	public void addDataIntoDatabase(String que, int qid, int sid) {
	
		Question question = new Question();
		question.setQuestion(que);
		question.setQid(qid);
		
		Subject sb = (Subject) entityManager.find(Subject.class, sid);
		question.setSubject(sb);
		
		entityManager.merge(question);
	}
	public void addOptiontoDatabase(String optionvalue, int qid) {
		
		Option op = new Option();
		op.setOptions(optionvalue);
		
		Question qu= (Question) entityManager.find(Question.class, qid);
		op.setQuestion(qu);
		entityManager.merge(op);
	}
}
