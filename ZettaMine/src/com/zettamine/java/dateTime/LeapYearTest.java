package com.zettamine.java.dateTime;

import java.time.Year;

public class LeapYearTest {

	public static void main(String[] args) {
		Year year = Year.of(2100);
		if (year.isLeap()) {
			System.out.println("Leap year");
		} else {
			System.out.println("Not Leap Year");
		}

	}

}
