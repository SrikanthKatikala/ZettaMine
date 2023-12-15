package com.zettamine.java.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProcessByForEach {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("sanjay", "Praveen", "surya", "aravind", "anu", "Bharath", "Aby");
		//forEach() in stream()
		names.stream().forEach((name)->System.out.print("name: "+name+"  \n"));
		//The forEach Method in map()		
		names.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name));
		List<Integer> nums = Arrays.asList(65, 82, 76, 60, 92, 81, 50);
		//filter() sorted() forEach()
		nums.stream().filter(num -> num%2==0).sorted(Comparator.reverseOrder()).forEach(num -> System.out.println(num));
	}
}
