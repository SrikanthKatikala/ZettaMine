package com.zettamine.java.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("java","python","php","ruby","angular","spring");
		System.out.println(list.hashCode());
		
		 Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.compareTo(o2)>0) {
					return -1;
				} else {
					return 1;
				}
				
			}
		});
		System.out.println(list.hashCode());

	}

}
