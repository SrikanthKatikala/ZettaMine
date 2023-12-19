package com.zettamine.java.dateTime;

import java.io.OutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateparse {
	public static void main(String[] args) {
//		LocalDate lt= LocalDate.parse("2018-12-27");
//
//    // print result
//		System.out.println("LocalDate : "+ lt);
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-y");
		 
        // create a LocalDate object and
        LocalDate lt= LocalDate.parse("31-Dec-2018", formatter);
 
        // print result
        System.out.println("LocalDate : "+ lt.toString());
        
        
        PrintStream ps = System.out;
        ps.print(ps instanceof OutputStream);
	}
}
