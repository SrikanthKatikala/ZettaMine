package com.zettamine.java.stream.api;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee emp = new Employee();
		List<Employee> employees = new EmployeeDAO().getAllEmpoloyeeDetails();
		 Map<Long, Long> collect = employees.stream().collect(Collectors.groupingBy(id -> emp.geteId() ,Collectors.counting()));
	 	System.out.println(collect.values());
	}
}
