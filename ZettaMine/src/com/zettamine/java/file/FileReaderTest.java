package com.zettamine.java.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	public static void main(String[] args) 	throws IOException{
		try {
			FileReader fileReader = new FileReader("D:FileOperationExample.txt");
			int i=fileReader.read();
			while(i!=-1) {
				System.out.print((char)i);
				i=fileReader.read();
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
	}
}
