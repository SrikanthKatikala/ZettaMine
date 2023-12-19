package com.zettamine.java.file;

import java.io.File;
import java.io.IOException;

public class GetFileInformation {
	public static void main(String[] args) {
		
		File file  = new File("D:FileOperationExample.txt");
		if (file.exists()) {
			System.out.println("File name: "+file.getName());	
			System.out.println("File Absolute Path: "+file.getAbsolutePath());
			try {
				System.out.println("File Canonical Path: "+file.getCanonicalPath());
			} catch (IOException e) {
				System.out.println("Does not give Canonical path");
				e.printStackTrace();
			}
			System.out.println("File Parent: "+file.getParent());
			System.out.println("File Length: "+file.length());
			System.out.println("File can read: "+file.canRead());
			System.out.println("File can write: "+file.canWrite());
			System.out.println("File free space: "+file.getFreeSpace());
			System.err.println("File deleted...!");
			//file.deleteOnExit();
		}
		else
		{
			System.out.println("File Does Not exists");
		}
	}
}
