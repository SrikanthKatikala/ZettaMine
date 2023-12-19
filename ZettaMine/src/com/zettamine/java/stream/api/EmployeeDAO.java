package com.zettamine.java.stream.api;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	public List<Employee> getAllEmpoloyeeDetails(){
		List<Employee> emps = new ArrayList<Employee>();
		emps.add(new Employee(36732,"iwquf","ofgiciw"));
		emps.add(new Employee(64376,"lkwef","kaeisz"));
		emps.add(new Employee(36732,"piew","miwifw"));
		emps.add(new Employee(92173,"cviqA","zgrpaa"));
		emps.add(new Employee(36732,"ieoaae","aaliva"));
		return emps;
	}
}
