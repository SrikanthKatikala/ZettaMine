package com.zettamine.java.stream.api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessingBySorting {

	public static void main(String[] args) {
		List<Integer> nums =Arrays.asList(73,54,98,23,72,14,56);
		System.out.println(nums);
		List<Integer> numsAsc = nums.stream().sorted().collect(Collectors.toList());
		System.out.println("Acending : "+numsAsc);
		List<Integer> numsDesc = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Decending "+numsDesc);
		
	}
}
