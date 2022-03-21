package com.capg.employeemanagement;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		// Array of object
		Employee list[] = new Employee[10];
		double max = 0;
		double min = 0;
		int counter = 0;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter Choice !");
			System.out.println("Press 1 for Add Employee ");
			System.out.println("Press 2 for Edit Employee ");
			System.out.println("Press 3 for Print maximum Salary Employee ");
			System.out.println("Press 4 for Print minimum Salary Employee ");
			System.out.println("Press 5 for Print Sort the Salary of Employee ");
			System.out.println("Press 6 for Print Sort the Name of Employee ");
			System.out.println("Press 7 for Display the List");
			System.out.println("Press 8 exit");

			int choice = sc.nextInt();

			if (choice == 1) {

				System.out.println("Enter the employee name");
				String name = sc.next();

				System.out.println("Enter the employee id");
				int id = sc.nextInt();

				System.out.println("Enter the employee salary");
				double salary = sc.nextDouble();

				// taking the current date starts

				DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				Date date = new Date();
				// System.out.println(dateFormat.format(date));
				// current date logic ends

				String newdate = dateFormat.format(date);
				Employee employee = new Employee(id, name, salary, newdate);
				list[counter] = employee;
				counter = counter + 1;

			} else if (choice == 2) {
				int count = 0;
				for (Employee e : list) {
					if (e != null) {
						System.err.println("Press " + count + " to edit " + e);
						count = count + 1;
					}
				}
				count = sc.nextInt();

				System.out.println("Press One to edit name");
				System.out.println("Press Two to edit salary");
				System.out.println("Press Three to edit ID");

				// Employee object = list[count];
				// String name = object.getName();
				
				int editOption = sc.nextInt();
				if (editOption == 1) {
					System.out.println("Enter new name");
					list[count].setName(sc.next());
					System.out.println("Name has been updated");
				} else if (editOption == 2) {
					System.out.println("Enter new salary");
					list[count].setSalary(sc.nextDouble());
					System.out.println("Salary has been updated");
				} else if (editOption == 3) {
					System.out.println("Enter new ID");
					list[count].setId(sc.nextInt());
					System.out.println("ID has been updated");
				} else {
					System.out.println("Wrong Choice");
				}
			} else if (choice == 3) {
				max = 0;
				for (Employee e : list) {
					if (e != null && e.getSalary() > max) {
						max = e.getSalary();
					}
				}
				System.out.println("Maximum Salary : " + max);
			} else if (choice == 4) {
				min = list[0].getSalary();
				for (Employee e : list) {
					if (e != null && e.getSalary() < min) {
						min = e.getSalary();
					}
				}
				System.out.println("Minimum Salary : " + min);
			} else if (choice == 5) {
				System.out.println("Sorted salary: ");
				for (int i = 0; i < list.length - 1; i++) {
					for (int j = i + 1; j < list.length; j++) {
						if (list[i] == null || list[j] == null)
							break;
						if (list[i].getSalary() > list[j].getSalary()) {
							Employee temp = list[i];
							list[i] = list[j];
							list[j] = temp;
						}
					}
				}
				/*
				 * for(Employee e: list) { if(e!=null){ System.out.println(e); } }
				 */
				for (int i = 0; i < list.length; i++) {
					if (list[i] != null)
						System.out.println(list[i]);
				}
			} else if (choice == 6) {
				System.out.println("Sorted name: ");
				for (int i = 0; i < list.length - 1; i++) {
					for (int j = i + 1; j < list.length; j++) {
						if (list[i] == null || list[j] == null)
							break;
						if (list[i].getName().compareToIgnoreCase(list[j].getName()) > 0) {
							Employee temp = list[i];
							list[i] = list[j];
							list[j] = temp;
						}
					}
				}
				for (int i = 0; i < list.length; i++) {
					if (list[i] != null)
						System.out.println(list[i]);
				}
			}
			else if (choice == 7) {
				for (Employee e : list) {
					if (e != null) {
						System.err.println(e);
					}
				}
			} 

			else if (choice == 8) {
				// continue--which will run with next iteration and skip the current iteration
				// break will end the loop
				break;
			} else {
				System.out.println("Wrong chocie try again");
			}

		}

	}

}
