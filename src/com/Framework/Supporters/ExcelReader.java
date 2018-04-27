package com.Framework.Supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.Framework.Utilities.PojoUtility;

public class ExcelReader {
	private String filePath;
	private Workbook workbook;
	private  FileInputStream fip;
	private  FileOutputStream fop;
	private Row row ;
	private Sheet sheet;
	
	
	public ExcelReader(String filePath) throws EncryptedDocumentException, InvalidFormatException, IOException {
		this.filePath = filePath;
		fip= new FileInputStream(PojoUtility.getExcelfilepath());
		workbook = new WorkbookFactory().create(fip);
		
	}
public  Sheet  getSheet(String sheetName) {
	if (workbook!=null) {
		sheet = workbook.getSheet(sheetName);
		}
	return sheet;
}
public  int totalNoOfRows(String sheetName) {
	if (workbook!=null) {
		sheet = workbook.getSheet(sheetName);
		
		}
	return sheet.getLastRowNum();
    }

public  int  getTotalNoOfCells(String sheetName, int rowNo, int cellNo) {
	if (workbook!=null) {
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNo);
		
		}
	return row.getLastCellNum();
    }

public String getCellData(String sheetName , int rowNo , int cellNum) {
	
	String cellValue = null;
	if (workbook!=null) {
		sheet = workbook.getSheet(sheetName);
		row = sheet.getRow(rowNo);
		Cell cell = row.getCell(cellNum);
		 if (cell.getCellType()== cell.CELL_TYPE_NUMERIC) {
			 cellValue  = cell.getNumericCellValue()+"";
			 }
		 else if (cell.getCellType()==cell.CELL_TYPE_STRING) {
			 cellValue = cell.getStringCellValue();
			 }
	      }
	return cellValue;
    }

public  List getTatalSheetData() {
	List list = new ArrayList();
	for (int i = 0; i <sheet.getLastRowNum(); i++) {
		row = sheet.getRow(i);
		for (int j = 0; j < row.getLastCellNum(); j++) {
			
			Cell cell = row.getCell(j);
			
		    if (cell.getCellType()== cell.CELL_TYPE_NUMERIC) {
				String  cellValue  = cell.getNumericCellValue()+"";
				list.add(cellValue);
				System.out.println(cellValue);
				 }
			 else if (cell.getCellType()==cell.CELL_TYPE_STRING) {
				String  cellValue = cell.getStringCellValue();
			         list.add(cellValue);
			         System.out.println(cellValue);
			         
			         }
              }
		
	}
	
return list;
}
}
