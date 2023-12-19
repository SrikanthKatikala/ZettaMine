package com.zettamine.java.dateTime;

import java.time.LocalDate; 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTimetest {
	
	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		
		System.out.println("Local date time: "+localDateTime);
		
		DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("y: m: d");
		
		System.out.println(localDateTime.format(formatter));
		
		LocalDate date = LocalDate.parse("2022-12-27");
		System.out.println(date);
		
		
		
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd MMM uuuu");	 
        // create a LocalDate object and
        LocalDate lt= LocalDate.parse("31 Dec 2018", formatter1);
        // print result
        System.out.println("LocalDate1 : "+ lt.toString());

        
        
		DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd MMM uuuu");
		System.out.println(date.format(formatter2));
		LocalDate dt2 = LocalDate.parse("12 Dec 2000", formatter2); //Exception Occurres
		System.out.println("Local Data2: "+dt2.toString());
		
	}
}
//LocalDateTime dt = LocalDateTime.now();
//
//DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("y:m:d");
//String format = dt.format(dt2);
//System.out.println(format);
//
//LocalDate date = LocalDate.now();
//  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
//  String text = date.format(formatter);
//  LocalDate parsedDate = LocalDate.parse(text, formatter);
//  System.out.println(text);
// 
// LocalDateTime current = LocalDateTime.now();
// 
// LocalDateTime plus = current.plus(27, ChronoUnit.CENTURIES);
// System.out.println(plus);