package com.capg.employeemanagement;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();

		list.add("hello");
		list.add("how");
		list.add("are you");

		// for(String obj:list)
		// {
		System.err.println(list);
		// }
		
		System.out.println(list.indexOf("are you"));
		
		System.out.println(list.get(1));
		
		//list.remove(2);
		System.out.println(list.contains("are you"));
		
		Collections.sort(list);
		System.out.println("Sorting in asc: " + list);

		// to sort is descending order using collections.sort reverse order
		Collections.sort(list, Collections.reverseOrder());
		System.out.println("Sorting in des: " + list);
		
		list.set(2,"good");
		System.err.println(list);
		
		list.clear();
		//list.add("im good");
		System.err.println(list);

	}
}
