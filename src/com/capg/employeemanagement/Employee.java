package com.capg.employeemanagement;

import java.sql.Date;

//POJO
public class Employee   //implements Comparable<Employee> ( removed while using comparator )
{
	// local variable
	private int id;
	private String name;
	private double salary;
	private String doj;

	// default constructor
	public Employee() {
	}

	// constructor with parameters
	public Employee(int id, String name, double salary, String doj) {

		this.id = id;
		this.name = name;
		this.salary = salary;
		this.doj = doj;
	}

	// getter and setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	// toString method for printing
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", doj=" + doj + "]";
	}

	
	//Comparable (removed while using comparator)
	/*@Override
	public int compareTo(Employee obj2) {
		// need to compare two class objects here
		// one object we are receiving as parameters obj2
		// use "this" keyword to access the class variable
		// return 1 if first object has greater than obj2
		// return -1 if first object is lesser than obj2
		// return 0 if both are equal
		
		//ID
		/*if (this.getId() > obj2.getId()) {
			return 1;
		}
		if (this.getId() < obj2.getId()) {
			return -1;
		} 
		else {
			return 0;
			
		}*/
		
		//SALARY
		/*if (this.getSalary() > obj2.getSalary()) {
			return 1;
		}
		if (this.getSalary() < obj2.getSalary()) {
			return -1;
		} 
		else {
			return 0;
			
		}*/
	    //NAME
		/*return obj1.getName().compareTo(obj2.getName()); */ 	
	
}
