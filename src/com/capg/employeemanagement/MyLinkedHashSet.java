package com.capg.employeemanagement;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class MyLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(2);
		set.add(30);

		System.out.println(set);

		set2.add(14);
		set2.add(19);
		set.addAll(set2);
		System.out.println("After merging:" + set);
		// contains
		System.out.println("Contains:" + set.contains(5));
		// clone
		System.out.println(set.clone());
		// empty
		System.out.println("Empty:" + set.isEmpty());
		// remove element
		set.remove(20);
		System.out.println(set);

		System.out.println("Size:" + set.size());

		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());

		}
		set.clear();
		System.out.println(set);

	}

}
