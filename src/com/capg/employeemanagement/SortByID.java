package com.capg.employeemanagement;

import java.util.Comparator;

//using comparator
public class SortByID implements Comparator<Employee> {

	@Override
	public int compare(Employee obj1, Employee obj2) {
		if (obj1.getId() > obj2.getId()) {
			return 1;
		} 
		else if (obj1.getId() < obj2.getId()) {
			return -1;
		} 
		else
			return 0;
	}

}
