package com.zettamine.java.dateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeCalculator {
	public static void main(String[] args) {
		LocalDate dat = LocalDate.now();
		LocalDate dob = LocalDate.of(2000, 11, 27);
		Period period = Period.between(dob, dat);
		//DateTimeFormatter dt = DateTimeFormatter.ofPattern(period);
//		System.out.println(period);
		System.out.println(period.getYears()+" "+period.getMonths()+" "+period.getDays());
	}
}
