package com.zettamine.java.stream.api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestOnArrayUsingStream {
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(4,3,2,13,11,4,21,4,4,2,4,2,6);
		Integer reduce = asList.stream().distinct().filter(n -> n%2==0).mapToInt(n -> 
		{int temp=1;for(int i=1; i<=n; i++){temp *=i;}return temp;}
		).sum();//reduce(0, (x,n) -> x+n);
		System.out.println(reduce);
	}
}
