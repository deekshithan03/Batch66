package com.capg.employeemanagement;

import java.util.HashSet;
import java.util.Iterator;

public class MySet {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> set1 = new HashSet<Integer>();
		// adding elements to set
		// will not maintain order
		set.add(1);
		set.add(12);
		set.add(5);
		set.add(100);
		set.add(4);
		set.add(4); // duplicate elements will not be printed
		set.add(30);

		System.out.println(set);
		set1.add(25);
		set1.add(28);
		set1.add(63);
		set1.add(45);
		System.out.println(set1);

		set.addAll(set1);
		System.out.println("After merging:" + set);
		// empty
		System.out.println("Empty:" + set.isEmpty());
		// contains
		System.out.println("Contains:" + set.contains(28));
		// equals
		System.out.println("Equal:" + set.equals(set1));
		// remove - returns true if set contains the element
		System.out.println("Remove:" + set.remove(3));
		// size
		System.out.println("Size:" + set.size());

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		set.clear();
		System.out.println(set);

	}

}
