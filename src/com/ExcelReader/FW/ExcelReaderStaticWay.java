package com.ExcelReader.FW;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelReaderStaticWay {
	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException{
		FileInputStream fip = new FileInputStream("D:\\eclipse workspace two\\Framework\\src\\com\\Excelreader\\fw\\excel one.xlsx");
   Workbook wb = WorkbookFactory.create(fip);
   Sheet st1 = wb.getSheet("Sheet1");
   Row r0 = st1.getRow(0);
  Cell c00= r0.getCell(0);
   Cell c01 = r0.getCell(1);
  Cell c02 = r0.getCell(2);
   Cell c03 = r0.getCell(3);
  
   String cellvalue1 = c00.getStringCellValue();
  String cellvalue2 = c01.getStringCellValue();
   String cellvalue3 = c02.getStringCellValue();
  
   System.out.println(cellvalue1+"......"+ cellvalue2 +"......." +   cellvalue3);
   
   Row r1 = st1.getRow(1);
  /* Cell c11= r0.getCell(0);
   Cell c12= r0.getCell(1);*/
  String s1= r1.getCell(0).getStringCellValue();
  String s2 = r1.getCell(1).getStringCellValue();
		  
 System.out.println(s1  + "......"+  s2);
 
 
 Row r2 = st1.getRow(2);
 
 String s3 = r2.getCell(0).getStringCellValue();
 String s4 = r2.getCell(1).getStringCellValue();
 System.out.println(s3 +"........"+ s4);
 
 
 
 Sheet st2 = wb.getSheet("Sheet2");
Row row1 = st2.getRow(0);

 String c1=row1.getCell(0).getStringCellValue();
 String c2=row1.getCell(1).getStringCellValue();
 String c3=row1.getCell(2).getStringCellValue();
 
 System.out.println(c1);
 
	}


}
