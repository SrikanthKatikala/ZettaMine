package com.zettamine.java.dateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class CountryTimes {
	public static void main(String[] args) {
//		ZoneId zone =ZoneId.of("America/Chicago");
		ZoneId zone =ZoneId.of("Austraila/Sydney");
		ZonedDateTime zdt = ZonedDateTime.now(zone);
		System.out.println(zdt);
	}
}
