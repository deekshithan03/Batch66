package com.capg.employeemanagement;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {
	public static void main(String[] args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		TreeSet<Integer> set1 = new TreeSet<Integer>();

		set.add(5);
		set.add(10);
		set.add(25);
		set.add(5);
		set.add(12);
		System.out.println(set);

		set1.add(12);
		set1.add(40);
		set1.add(30);
		System.out.println(set1);

		set.addAll(set1);
		System.out.println(set);

		System.out.println("Contains:" + set.contains(5));

		System.out.println("Empty:" + set.isEmpty());

		set.remove(12);
		System.out.println(set);

		System.out.println("Size:" + set.size());
		//Returns the greatest element in the set less than or equal to the given element
		System.out.println(set.floor(29));
		System.out.println("Highest:"+set.last());
		System.out.println("Lowest:"+set.first());

		Iterator<Integer> it = set.descendingIterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		set.clear();
		System.out.println(set);
		
	}

}
