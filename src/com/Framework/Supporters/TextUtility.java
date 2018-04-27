package com.Framework.Supporters;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import com.gargoylesoftware.htmlunit.javascript.host.file.FileReader;

public class TextUtility {
	private String filePath;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	private BufferedReader bufferedReader;
	 private java.io.FileReader fileReader;
	 
	public TextUtility(String filePath) throws IOException {
		this.filePath = filePath;
		File file = new File(filePath);
		if (file.createNewFile()) {
			System.out.println("New file is created");
          }
		else 
			System.out.println("Return existing one ");
		fileWriter = new FileWriter(file);
		bufferedWriter = new BufferedWriter(fileWriter);
		fileReader = new java.io.FileReader(file);
		bufferedReader = new BufferedReader(fileReader);
		}
	
	public   void writeIntData(int data) throws IOException {
		if (bufferedWriter!=null) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
		}
      }
	public  void   writeStringData(String data) throws IOException {
		if (bufferedWriter!=null) {
			bufferedWriter.write(data);
			bufferedWriter.flush();
			
		}
	 }
	public String  readOneLine() throws IOException {
		String data= null;
		if (bufferedReader!=null) {
			data = bufferedReader.readLine();
			
		}
     return data;
	}
	
	
	

}
