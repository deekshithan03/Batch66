package com.capg.employeemanagement;

import java.util.Comparator;

//using comparator
public class SortByName implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {

		return obj1.getName().compareTo(obj2.getName());

	}
}