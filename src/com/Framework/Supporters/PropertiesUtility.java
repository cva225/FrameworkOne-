package com.Framework.Supporters;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.regexp.recompile;

public class PropertiesUtility {
 private String filePath;
 FileInputStream fip;
 Properties properties;
  public   PropertiesUtility(String filePath) throws IOException {
	  this.filePath =filePath;
	  fip = new FileInputStream(filePath);
	  properties = new Properties();
	  properties.load(fip);
	  
  }
  public String getPropertValue(String key) {
		String value = null;
	if (properties!=null) {
		value = properties.getProperty(key);
	}	
	return value;
	}
public String getPropertyValue(String key , String defaultValue) {
	String value = null;
	if (properties!=null) {
		value = properties.getProperty(key, defaultValue);
		}
	return value;
    }

public  void setPropertyValue(String key ,String value) throws FileNotFoundException, IOException {
	if (properties!=null) {
		properties.setProperty(key, value);
		properties.store(new FileOutputStream(filePath), "successfully added the data");
		
	}
}
public  void removeKeyValues(String key) throws FileNotFoundException, IOException {
	if (properties!=null) {
		properties.remove(key);
		properties.store(new FileOutputStream(filePath), "successfullu removed the data ");
	}
}
public  Map<String ,String> getAllKeyValues() {
	Map< String, String> map = new LinkedHashMap<String ,String >();
	if (properties!=null) {
		Set<Object> keys = properties.keySet();
		 for (Object obj : keys) {
			String key = (String)obj;
			String value = properties.getProperty(key);
			map.put(key, value);
		}
	}
	return map;


}

}
