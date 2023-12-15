package com.zettamine.java.oops;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(1,"java");
		Student s2 = new Student(1,"java");
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		System.out.println(s1.equals(s2));
	}
}
