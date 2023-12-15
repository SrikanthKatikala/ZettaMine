package com.zettamine.java.optional;

import java.util.Optional;

public class OptionalTest {
	public static void main(String[] args) {
		String str[] = new String[5];
		str[1]="oiuwegf";
		Optional<String> opt = Optional.of(str[1]);
		System.out.println(opt.isEmpty());
		String ss = opt.get();
		System.out.println(ss);
	}
}
