package com.zettamine.java.day6.a7;

import java.util.Set;

public class Student {
	private String rollNo;
	private String stdName;
	private Set subjectMarksHS;
	private Set subjectMarksTS;
	public Student(String rollNo, String stdName, Set subjectMarksHS, Set subjectMarksTS) {
		super();
		this.rollNo = rollNo;
		this.stdName = stdName;
		this.subjectMarksHS = subjectMarksHS;
		this.subjectMarksTS = subjectMarksTS;
	}
	public String getRollNo() {
		return rollNo;
	}
	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public Set getSubjectMarksHS() {
		return subjectMarksHS;
	}
	public void setSubjectMarksHS(Set subjectMarksHS) {
		this.subjectMarksHS = subjectMarksHS;
	}
	public Set getSubjectMarksTS() {
		return subjectMarksTS;
	}
	public void setSubjectMarksTS(Set subjectMarksTS) {
		this.subjectMarksTS = subjectMarksTS;
	}
	
}
