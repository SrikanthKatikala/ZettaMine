package com.zettamine.java.stream.api;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class AverageTest {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(23,55,67,91,32,39,41,75,83);
		IntSummaryStatistics statistics = nums.stream().mapToInt(n -> Integer.valueOf(n)).summaryStatistics();
		System.out.println("count: "+statistics.getCount());
		System.out.printf("average:%3f ",statistics.getAverage());
		System.out.println("\nsum: "+statistics.getSum());
		System.out.println("max: "+statistics.getMax());
		System.out.println("min: "+statistics.getMin());
	}
}
