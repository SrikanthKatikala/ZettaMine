package com.zettamine.java.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromAFile {

	public static void main(String[] args) {
		
		File file =  new File("D:FileOperationExample.txt");
		try {
			Scanner fileReader = new Scanner(file);
			System.err.println("---------Data in a File--------");
			while(fileReader.hasNextLine()) {
				String dataInAFile = fileReader.nextLine();
				
				System.out.println(dataInAFile);
			}
			fileReader.close();
		} catch (FileNotFoundException e) {
			System.err.println("FileNotFoundException Occurred");
			e.printStackTrace();
		}
	}
}
