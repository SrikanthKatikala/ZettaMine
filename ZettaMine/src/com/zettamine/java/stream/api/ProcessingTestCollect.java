package com.zettamine.java.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProcessingTestCollect {
	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(12,3,4,54,23,67,82,90);
		System.err.println(nums);
		
		List<Integer> evenNums = nums.stream().filter(t-> t%2==0).collect(Collectors.toList());
		System.out.println(evenNums);
		
		Stream<Integer> streamNums = nums.stream().map(new Function() {
			@Override
			public Object apply(Object t) {
				Integer num = (Integer) t;
				return num;
			}
			
		});
		List<Integer> oddNums = streamNums.collect(Collectors.toList());
		System.out.println(oddNums);
		
	}
}
