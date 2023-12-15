package com.zettamine.java.dateTime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Locale;
import java.util.Set;

public class LocalDateTest {
	public static void main(String[] args) {
		LocalDate dt = LocalDate.now();
		System.out.println(dt);
		LocalTime ti = LocalTime.now();
		System.out.println(ti);
		Month mon =  dt.getMonth();
		System.out.println(mon.getValue());
		System.out.println(mon.getDisplayName(null, null));
		Set<String> zone = ZoneId.getAvailableZoneIds();
		int count=1;
		for(String s:zone) {
			System.out.println(count+++". "+s);
			//count++;
		}
	}
}
