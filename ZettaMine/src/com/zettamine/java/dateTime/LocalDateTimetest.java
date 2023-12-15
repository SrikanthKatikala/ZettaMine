package com.zettamine.java.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimetest {
	
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.now();
		
		DateTimeFormatter dt2 = DateTimeFormatter.ofPattern("y:m:d");
		String format = dt.format(dt2);
		System.out.println(format);
		
		LocalDate date = LocalDate.now();
		  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		  String text = date.format(formatter);
		  LocalDate parsedDate = LocalDate.parse(text, formatter);
		  System.out.println(text);
	}
}
