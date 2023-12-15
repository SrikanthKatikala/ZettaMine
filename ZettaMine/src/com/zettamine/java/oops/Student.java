package com.zettamine.java.oops;

import java.util.Objects;

public class Student {
	private int id;
	private String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (obj==this) {
			return true;
		} 
		if(obj.getClass()!=getClass()) {
			return false;
		}
		if (obj==null) {
			return false;
		}
		Student std = (Student)obj;
		return id==std.id && Objects.equals(name, std.name);
	}
}
