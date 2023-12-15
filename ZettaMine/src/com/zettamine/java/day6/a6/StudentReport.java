package com.zettamine.java.day6.a6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class StudentReport {
	private static Student student;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean status =true;
		List<Student> stds = new ArrayList<Student>();
		while(status)
		{
			
			System.out.print("Enter Student name: ");
			String studentName = sc.nextLine();
			System.out.print("Enter Location: ");
			String studentLocation = sc.nextLine();
			System.out.print("Enter Student email: ");
			String studentEmail = sc.nextLine();
			System.out.print("Enter Student Phone Number: ");
			long phonenumber = sc.nextLong();
			
			student = new Student(studentName, studentLocation, studentEmail, phonenumber);
			
			stds.add(student);
			System.out.println("Do you want to add more students[Y/N]: ");
			String sts= sc.next();
			if (sts.equalsIgnoreCase("Y")) {
				do {
					sc.nextLine();
				} while (false);
				continue;
			} else {
				status=false;
			}
		}
		
		//System.out.println(stds);
		HashMap<String, Integer> map = getReport(stds);
		//System.out.println(map.size());
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	static HashMap<String, Integer> getReport(List<Student>  studentlist) {
		
		HashMap<String, Integer> report = new HashMap<>();
		for(Student s:studentlist) {
			Integer returnedValue = report.put(s.getLocation(), 1);
			if(returnedValue!=null) report.put(s.getLocation(), returnedValue+1);
		}
//		report.put(student.getLocation(), count(studentlist));
		
		return report;
		
	}
}
//	map.keySet(),map.values()