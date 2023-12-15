package com.zettamine.java.lambda;

public class Main {
	
	public static void main(String[] args) {
		Nums num = new NumImpl();
		num.add(4,6);
		System.out.println();
		
		Nums ref1= (x,y)->{
			System.out.println(x+y);
		};
		ref1.add(23, 21);
	}
}
