package com.zettamine.java.file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteInAFile {
	static String data="In Java, a File is an abstract data type. \r\n"
			+ "A named location used to store related information is known as a File. \r\n"
			+ "There are several File Operations like creating a new File, \r\n"
			+ "getting information about File, \r\n"
			+ "writing into a File, \r\n"
			+ "reading from a File and deleting a File.";
	public static void main(String[] args) {
		
		try {
			FileWriter fileWriter = new FileWriter("D:FileOperationExample.txt");
			//To write the content in a file we use write() method
			 String data =WriteInAFile.data;
			 
			fileWriter.write(data);
			System.out.println("Writing in a file is successfull");
			fileWriter.close();
		} catch (IOException e) {
			System.err.println("An exception occured");
			e.printStackTrace();
		}
	}
}
