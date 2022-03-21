package com.capg.employeemanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class MyArrayList3 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Double> list2 = new ArrayList<Double>();
		String name;
		int id;
		double salary;
		int c = 1;
		System.out.println("Enter the number of input:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter name "+ c);
			name = input.next();
			list.add(name);
			System.out.println("Enter ID "+ c);
			id = input.nextInt();
			list1.add(id);
			System.out.println("Enter Salary 3"+ c);
			salary = input.nextDouble();
			list2.add(salary);
			c=c+1;
		}	
		System.out.println("Name: "+list);
		System.out.println("ID: "+list1);
		System.out.println("Salary: "+list2);
		
	}

}
