package com.zettamine.java.day6.a8;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<String> set = new TreeSet<String>(new NewComparator());
		
		set.add("Pankaj Kumar");
		set.add("Runil");
		set.add("Tnnil");
		set.add("Bnnil");
		set.add("Srinivas");
		set.add("Tnnil");
		System.out.println(set);
		
		Test<Integer> test = new Test<Integer>();
		Number add = test.add(12, 14);
		System.out.println(add);
	}
}
class NewComparator implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {

		if(o1.length()==o2.length()) {
			return o1.compareTo(o2);
		}
		else return o1.length()-o2.length();
	}
	
}

class Test<JayaKrishna extends Number>{
	public Number add(JayaKrishna j1,JayaKrishna j2) {
		return Integer.valueOf(j1.intValue()+j2.intValue());
	}
}
