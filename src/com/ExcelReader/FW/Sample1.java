package com.ExcelReader.FW;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;



public class Sample1 {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		ExcelUtility e = new ExcelUtility("D:\\eclipse workspace two\\Framework\\src\\com\\Excelreader\\fw\\sample1.xlsx");
	 System.out.println(e);
		Sheet st= e.getSheet("Sheet1");
		System.out.println(st);
		
		
		
		
	}

}
