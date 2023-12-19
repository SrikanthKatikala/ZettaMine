package com.zettamine.java.lambda;

import java.util.LinkedList;

public class LamdaTest1 {
	public static void main(String[] args) {
		int a=20;
		Nums ref1= (x,y)->{
			//int a=7;
			System.out.println(x+a);
		};
		ref1.add(23, 21);
	}
	LinkedList<Integer> es =new LinkedList<>();
}
