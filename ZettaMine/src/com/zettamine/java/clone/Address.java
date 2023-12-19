package com.zettamine.java.clone;

public class Address //implements Cloneable
{
	String address;

	public Address(String address) {
		super();
		this.address = address;
	}
	

	@Override
	public String toString() {
		return address;
	}
	
//	public Address clone() {
//		return new Address(this.address);
//	}
}
