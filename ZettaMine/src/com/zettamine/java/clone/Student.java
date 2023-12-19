package com.zettamine.java.clone;

import java.util.Objects;

public class Student implements Cloneable{
	int id;
	String name;
	Address address;
	
	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = new Address(address.address);
	}
	
	public Student(Student s) {
		this(s.id, s.name, s.address);
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Student student1 = new Student(1,"jaya",new Address("Hyd"));
//		Student student2 = new Student(student1);
//		System.out.println(student1==student2);
		
//		System.out.println(student1);
//		System.out.println(student2);
//		
//		System.out.println("modification");
//		student1.address.address = "Vizag";
//		System.out.println("shallow copy");
//		System.out.println(student1);
//		System.out.println(student2);
		
		System.out.println("using cloneable");
		
		Student student2 = student1.clone();
		student1.address.address = "Vizag";
		
		System.out.println(student1);
		System.out.println(student2);
		
		Objects.hash(args);
		student1.hashCode();
	}
	
	

//	@Override
//	public int hashCode() {
//		return Objects.hash(address, id, name);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address, other.address) && id == other.id && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	public Student clone() throws CloneNotSupportedException {
		return new Student(this.id,this.name,new Address(this.address.address));
	}
//	public Student clone() throws CloneNotSupportedException {
//		return new Student(this.id,this.name,this.address.clone());
//	}
}
