package com.zettamine.java.stream.api;

import java.util.Arrays;
import java.util.List;

public class ProcessByToArray {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(72,55,92,76,19,04,78);
		
		Object[] objArray = nums.stream().toArray();
		System.out.println(Arrays.toString(objArray));
		
		Integer[] intArray = nums.stream().sorted().toArray(Integer[]::new);
		System.out.println(Arrays.toString(intArray));
	}
}
