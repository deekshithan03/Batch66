package com.capg.employeemanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MyArrayList2 {
	public static void main(String args[]) {
		ArrayList list = new ArrayList();
		int a;
		System.out.println("Enter the no. of input:");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for (int i = 0; i < n; i++) {
			a = input.nextInt();
			list.add(a);
		}
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);

	}
}
