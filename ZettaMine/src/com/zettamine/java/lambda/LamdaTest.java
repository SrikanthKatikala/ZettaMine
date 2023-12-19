package com.zettamine.java.lambda;

public class LamdaTest {
	
	public static void main(String[] args) {
		
		int  a=7;
		LamdaTest test = new LamdaTest() {
			int a = 23;
			private void disp() {
				// TODO Auto-generated method stub
				System.out.println(a);
			}
			
		};
		display();
		
		System.out.println();
	}

	private static void display() {
		
		
	}
}
