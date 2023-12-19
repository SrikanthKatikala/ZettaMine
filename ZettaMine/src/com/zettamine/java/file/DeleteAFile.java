package com.zettamine.java.file;

import java.io.File;

public class DeleteAFile {
	
	public static void main(String[] args) {
		
		File file = new File("D:FileOperationExample1.txt");
		
		if(file.delete())
		{
			System.out.println("File "+file.getName()+" is deleted successfully");
		}
		else
		{
			System.out.println("An unexpected Error Occured");
		}
	}
}
