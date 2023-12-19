package com.zettamine.java.stream.api;

import java.util.Arrays; 
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupBytest {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("sanjay", "Praveen", "surya", "aravind", "anu", "Bharath", "Aby","aby");
		Map<String, Long> collect = names.stream().collect(Collectors.groupingBy(name -> name.toLowerCase(), Collectors.counting()));
		System.out.println(collect);
	}
}
