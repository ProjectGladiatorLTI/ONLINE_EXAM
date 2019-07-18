package com.lti.training.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lti.training.entity.Question;

@Controller
public class ReadFileController {
	
	//@RequestMapping(value="/readDocument")
	public void fileReader() {
	
	XSSFRow row;
    Question question = new Question();
    FileInputStream fis;
    String fileName = "D:/uploads/Question.xlsx";
    
    try {
        System.out.println("-----READING THE SPREADSHEET-----------");
        fis = new FileInputStream(fileName);
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

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
                
                
                //cell.setCellType(CellType.STRING);
                switch (cell.getColumnIndex()) {
                    case 0:
                        System.out.print(
                                cell.getRow().getCell(0).toString() + " \t\t");
                        break;
                    case 1:
                        System.out.print(
                                cell.getStringCellValue() + " \t\t");
                        break;
                    case 2:
                        System.out.print(
                        		 cell.getStringCellValue() + " \t\t");
                        break;
                    case 3:
                        System.out.print(
                        		 cell.getStringCellValue() + " \t\t");
                        break;
                    case 4:
                        System.out.print(
                                cell.getStringCellValue() + " \t\t");
                        break;
                    case 5:
                        System.out.print(
                        		 cell.getStringCellValue() + " \t\t");
                        break;
                    case 6:
                        System.out.print(
                        		cell.getRow().getCell(6).toString() + " \t\t");
                    
                       
                    
                }
            }
            System.out.println();
           /* e.empId = Integer.parseInt(row.getCell(0).getStringCellValue());
            e.empName = row.getCell(1).getStringCellValue();
            e.gender = row.getCell(2).getStringCellValue();
            e.salary = row.getCell(3).getStringCellValue();

            InsertRowInDB(e.empId, e.empName, e.gender, e.salary);*/
        }
        System.out.println("Values Read Successfully");

        fis.close();
    } catch (IOException e) {
        e.printStackTrace();
    }


	
	
	
	

}
}

