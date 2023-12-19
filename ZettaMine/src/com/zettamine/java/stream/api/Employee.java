package com.zettamine.java.stream.api;

public class Employee {
	private long eId;
	private String eName;
	private String dName;
	public Employee(long eId, String eName, String dName) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.dName = dName;
	}
	public Employee() {
		super();
	}
	public long geteId() {
		return eId;
	}
	public void seteId(long eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteSal() {
		return dName;
	}
	public void seteSal(String eSal) {
		this.dName = eSal;
	}
	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", eSal=" + dName + "]";
	}
	
	
}
