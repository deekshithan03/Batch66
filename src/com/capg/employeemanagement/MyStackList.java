package com.capg.employeemanagement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MyStackList {
	public static void main(String[] args) {
		// creating the list
		Stack<Integer> list = new Stack<Integer>(); // Generic:Any data type can be used
		Stack<Integer> list2 = new Stack<Integer>();
		// adding the data to list
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		// adding the data to list 2
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		
		list.push(11);
		System.out.println("After push: " + list);
		//System.out.println(list.push(11));
		list.addAll(list2);
		System.out.println("After merging: " + list);
		list.pop();
		System.out.println("After pop: " + list);
		// get the value using index
		System.out.println("1: " + list.get(0));

		// search for given item
		// if found return true
		// if not found return false
		System.out.println("2: " + list.contains(8));

		System.out.println("3: " + list.indexOf(3)); // will return -1 if value is not found

		// delete the data for index
		System.out.println("4: " + list.remove(1) + " is removed");
		System.out.println("5: After removing- " + list);

		// to get values in each line
		// for(int obj:list)
		// {
		// System.out.println(obj);
		// }

		// to sort is ascending order using collections.sort
		Collections.sort(list);
		System.out.println("Sorting in asc: " + list);

		// to sort is descending order using collections.sort reverse order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorting in des: " + list);

		// to update any new element list,set(indexNum, element)

		list.set(3, 50);
		System.out.println("Updated List: " + list);

		// delete all the element of list
		list.clear();
		System.out.println("6: " + list);

	}
}
