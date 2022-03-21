package com.capg.employeemanagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class EmployeeMainList {
	public static void main(String[] args) {

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String newdate = dateFormat.format(date);

		List<Employee> ls = new ArrayList<Employee>();
		Employee aa = new Employee(1001, "Zues", 25000, newdate);
		Employee bb = new Employee(1005, "Matt", 12000, newdate);
		Employee cc = new Employee(1021, "Cassie", 15000, newdate);
		Employee dd = new Employee(1012, "Tom", 30000, newdate);
		Employee ee = new Employee(1010, "Mary", 21000, newdate);

		// adding to list
		ls.add(aa);
		ls.add(bb);
		ls.add(cc);
		ls.add(dd);
		ls.add(ee);
		
		
		/*
		 while using Comparable
		Collections.sort(ls,Collections.reverseOrder()); 
		Collections.sort(ls); // this can be used only when 'public int compareTo()' is defined in Employee
					       	 // id is sorted when id is compared
		                    //similarly name and salary will be sorted when they are compared 
		//System.out.println("Sorted ID");
		//System.out.println("Sorted Salary");
		System.out.println("Sorted Name");
		for (Employee e : ls) {
			System.out.println(e);
		}*/
		
		// using Comparator  
		//for sorting ID
		SortByID byID = new SortByID();
		Collections.sort(ls,byID);           //reverse the sign <> in SorByID to change the order
		System.out.println("By ID:");
		for (Employee e : ls) {
			System.out.println(e);
		}
		
		//sorting salary
		SortBySalary bySalary = new SortBySalary();
		Collections.sort(ls,bySalary);
		System.out.println("By Salary:");
		for (Employee e : ls) {
			System.err.println(e);
		}
		
		//sorting name
		SortByName byName = new SortByName();
		Collections.sort(ls,byName);
		System.out.println("By Name:");
		for (Employee e : ls) {
			System.out.println(e);
		}
	}

}
