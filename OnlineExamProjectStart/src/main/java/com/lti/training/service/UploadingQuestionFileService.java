package com.lti.training.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.training.dao.MyFileDao;
import com.lti.training.dto.MyFileDTO;
import com.lti.training.entity.MyFile;
import com.lti.training.entity.Question;

@Service
public class UploadingQuestionFileService {
	String que,optA,optB,optC,optD;
	String sid,qid;
	int subjectid;
	int questionid;

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
		
		//myfileDao.addFile(file);
		XSSFRow row;
	    //Question question = new Question();
	    FileInputStream fis;
	    
	    try {
	        System.out.println("-----READING THE SPREADSHEET-----------");
	        fis = new FileInputStream(finalPath);
	        if(fis!=null)
	        {
	        	System.out.println("file found");
	        }
	        XSSFWorkbook workbookRead = new XSSFWorkbook(fis);
	        XSSFSheet spreadsheetRead = workbookRead.getSheetAt(0);

	        Iterator< Row> rowIterator = spreadsheetRead.iterator();
	        while (rowIterator.hasNext()) {
	            row = (XSSFRow) rowIterator.next();
	            Iterator<Cell> cellIterator = row.cellIterator();
	            Cell cell = cellIterator.next();

	            while (cellIterator.hasNext()) {
	                cell  = cellIterator.next();
	                
	                
	                
	                switch (cell.getColumnIndex()) {
	                    case 0:
	                        System.out.print(
	                                 cell.getRow().getCell(0).toString() + " \t\t");
	                       qid=cell.getRow().getCell(0).toString();
	                        break;
	                    case 1:
	                        System.out.print(
	                                cell.getStringCellValue() + " \t\t");
	                        que = cell.getStringCellValue();
	                       // question.setQuestion(cell.getStringCellValue());
	                      
	                    case 2:
	                        System.out.print(
	                        		 cell.getStringCellValue() + " \t\t");
	                        optA = cell.getStringCellValue();
	                        break;
	                    case 3:
	                        System.out.print(
	                        		 cell.getStringCellValue() + " \t\t");
	                        optB = cell.getStringCellValue();
	                        break;
	                    case 4:
	                        System.out.print(
	                                cell.getStringCellValue() + " \t\t");
	                        optC=cell.getStringCellValue();
	                        break;
	                    case 5:
	                        System.out.print(
	                        		 cell.getStringCellValue() + " \t\t");
	                        optD=cell.getStringCellValue();
	                        break;
	                    case 6:
	                        System.out.print(
	                        		cell.getRow().getCell(6).toString() + " \t\t");
	                        sid=cell.getRow().getCell(6).toString();
	                               
	                }   
	                 subjectid=Integer.parseInt(sid);
	                 questionid=Integer.parseInt(qid);
	                myfileDao.addDataIntoDatabase(que, questionid, subjectid) ;
	                myfileDao.addOptiontoDatabase(optA, questionid);
	                myfileDao.addOptiontoDatabase(optB, questionid);
	                myfileDao.addOptiontoDatabase(optC, questionid);
	                myfileDao.addOptiontoDatabase(optD, questionid);      
	            }
	            System.out.println();
	            
	        }
	        System.out.println("Values Read Successfully");

	        fis.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		return "success";
	}
}
