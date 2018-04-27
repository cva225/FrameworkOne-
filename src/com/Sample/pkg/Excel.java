package com.Sample.pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.examples.CreateUserDefinedDataFormats;

public class Excel {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fip = new FileInputStream("D:\\eclipse workspace two\\FrameworkOne\\src\\com\\Framework\\Base\\ExcelFile.xls");
	Workbook workbook = WorkbookFactory.create(fip);
	  
	org.apache.poi.ss.usermodel.Sheet sheet1=workbook.createSheet("Sheet1");
	 Cell cell=sheet1.createRow(0).createCell(0);
	cell.setCellValue("sivakuamr");
	
	FileOutputStream fop = new FileOutputStream("D:\\eclipse workspace two\\FrameworkOne\\src\\com\\Framework\\testData\\TestData.xls");
	workbook.write(fop);
	
		
		
		
		
	}

}
