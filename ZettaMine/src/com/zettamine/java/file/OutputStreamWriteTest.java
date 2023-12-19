package com.zettamine.java.file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriteTest {
	
	public static void main(String[] args) throws IOException {
		
		try {
			OutputStream outputStream = new FileOutputStream("D:FileOperationExample.txt");
			Writer fileWriter = new OutputStreamWriter(outputStream);
			String previousData = WriteInAFile.data; //getting data previous class
			
			fileWriter.append(previousData);// prevent previous data
			fileWriter.write("\nGood Morning");
			System.out.println("Data written in a file successfully");
			fileWriter.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("Exception Occurred");
			e.printStackTrace();
		}
		
	}
}
