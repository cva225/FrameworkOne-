package com.Framework.Utilities;

public class PojoUtility {
	
private  static String orFilePath = System.getProperty("user.dir")+"\\src\\com\\Framework\\Base\\OR.properties";

private  static String configFilePath = System.getProperty("user.dir")+"\\src\\com\\Framework\\Base\\config.properties";

private  static String excelFilePath = System.getProperty("user.dir")+"\\src\\com\\Framework\\testData\\TestData.xls";

public static  String  getORfilepath() {
	
	return orFilePath;
	}

public static  String  getConfigfilepath() {
	
	return configFilePath;
	}

public static  String  getExcelfilepath() {
	
	return excelFilePath;
	}
}
