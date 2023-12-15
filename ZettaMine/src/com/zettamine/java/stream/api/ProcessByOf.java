package com.zettamine.java.stream.api;

import java.util.Arrays;
import java.util.stream.Stream;

public class ProcessByOf {
	public static void main(String[] args) {
		Stream<Integer> str1 = Stream.of(23,55,67,91,32,39,41,75,83);
		str1.forEach(n -> System.out.print(n+" "));
		System.out.println();
		
		Double[] data = {10.0, 15.9, 20.8, 45.5, 50.9};
		Stream<Double> str2 = Stream.of(data);
		str2.forEach(System.out::println);
		
		Stream<Double> stream = Arrays.stream(data);
		System.out.println("data = " + stream.count());
	}
}
