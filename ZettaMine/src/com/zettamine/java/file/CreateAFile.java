package com.zettamine.java.file;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
	public static void main(String[] args) {
		
		File file1 = new File("D:FileOperationExample1.txt");
		try {
			if(file1.createNewFile())
			{
				System.out.println("File "+file1.getName()+" is created");
			}
			else
			{
				System.out.println("File is not ceated or already exists");
			}
		} catch (IOException e) {
			System.out.println("Exception is occured");
			e.printStackTrace();
		}
	}
}
