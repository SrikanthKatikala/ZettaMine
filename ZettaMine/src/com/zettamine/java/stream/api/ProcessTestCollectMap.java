package com.zettamine.java.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessTestCollectMap 
{
	public static void main(String[] args) {
		
		List<String> courses = Arrays.asList("Java","Spring","advance java","Spring boot","Microservices","Spring Maven");
		
		courses.stream().map(st-> String.format("%-13s - %d", st.toUpperCase(),st.length())).collect(Collectors.toList()).forEach(System.out::println);
		
//		for (String course: newCurses)
//		{
//			System.out.println(course);
//		}
	}
}
