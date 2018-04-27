package com.ExcelReader.FW;

import java.io.FileInputStream;
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

public class ExcelUtility {
	
		public  String filePath;
		public Sheet sheet;
		public Workbook wb;
		public Row row ;
		public Cell cell;
		
		public ExcelUtility(String filePath) throws IOException, EncryptedDocumentException, InvalidFormatException {
			this.filePath = filePath;
			FileInputStream fip = new FileInputStream(filePath);
			 wb = WorkbookFactory.create(fip);
			
			}
		public  Sheet getSheet(String sheetName) {
			 Sheet sheet = null;
			if (wb!= null) {
		 wb.getSheetIndex(sheetName);		
			
			}
			
			return sheet;

		}
		public  Row getRow(String sheetName , int rwNum) {
			row=getSheet(sheetName).getRow(rwNum);
			return row;
		}
		
		public  Cell getCell(String sheetName ,int rwNum , int cellNum) {
			cell= getSheet(sheetName).getRow(rwNum).getCell(cellNum);
			return cell;
			}
		
		public  String  getCellData(String sheetName ,int rwNum , int cellNum) {
			String cellValue= null;
			 cell = getCell(sheetName, rwNum, cellNum);
			 if (cell.getCellType()==cell.CELL_TYPE_STRING) {
				 cellValue= cell.getStringCellValue();
				 
				}
			 else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
				 cellValue = cell.getStringCellValue()+"";
				
			}
			 return cellValue;
			 

		}
		public  List getRowData(String sheetName , int rwNum) {
		  java.util.List rowData = new ArrayList();
		  String cellValue = null;
		  row = getSheet(sheetName).getRow(rwNum);
		   for (int i = 0; i <row.getLastCellNum(); i++) {
			   Cell cell = row.getCell(i);
			   if (cell.getCellType()==cell.CELL_TYPE_STRING) {
				   cellValue= cell.getStringCellValue();
				  rowData.add(cellValue);
				  
				  }
			   else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
				    cellValue = cell.getNumericCellValue()+"";
				   rowData.add(cellValue);
				
			      }
			  
		     }
		   return rowData;
		}
		 public  List getTotalRowData(String sheetName ) {
			List  TotalaRowData = new ArrayList();
			String cellValue = null;
			for (int i = 0; i <row.getLastCellNum(); i++) {
				 Row row = sheet.getRow(i);
				          
				     for (int j = 0; j <row.getLastCellNum(); j++) {
				    	 
				    	 Cell cell = row.getCell(i);
				    	  if (cell.getCellType()==cell.CELL_TYPE_STRING) {
				    		  cellValue = cell.getStringCellValue();
				    		  TotalaRowData.add(cellValue);
				    		  }
				    	  else if (cell.getCellType()==cell.CELL_TYPE_NUMERIC) {
				    		  cellValue = cell.getNumericCellValue()+"";
				    		  TotalaRowData.add(cellValue);
							
						}
						
					}
				
			}
		return	TotalaRowData;
			

		}
	}



