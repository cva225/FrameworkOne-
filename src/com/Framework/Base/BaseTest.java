package com.Framework.Base;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import com.Framework.Supporters.ExcelReader;
import com.Framework.Supporters.PropertiesUtility;
import com.Framework.Utilities.PojoUtility;

public class BaseTest extends ActionEngine {
	public static PropertiesUtility  getPropConfigInstance() throws IOException {
		PropertiesUtility propConfig = new PropertiesUtility(PojoUtility.getConfigfilepath());
		return propConfig;
	}
	
	public static PropertiesUtility  getPrORConfigInstance() throws IOException {
		PropertiesUtility prORConfig = new PropertiesUtility(PojoUtility.getORfilepath());
		return prORConfig;
	
	}
	public static ExcelReader  getExcelReaderInstance() throws IOException, EncryptedDocumentException, InvalidFormatException {
		ExcelReader excelReader = new ExcelReader(PojoUtility.getExcelfilepath());
		return excelReader;
		
	
        }
	;;;;;;;;;;;;;;;;;;
	}