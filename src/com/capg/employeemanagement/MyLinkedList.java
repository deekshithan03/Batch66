package com.capg.employeemanagement;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();

		list.add(10);
		list.add(30);
		list.add(20);
		list.add(2);

		// adding the value at first location
		list.addFirst(01);

		// adding the value at the last
		list.addLast(100);
		System.out.println("1:List "+list);

		//break the list to sub list
				System.out.println("23: "+list.subList(1, 3));
		// clear the data
		// list.clear();

		// copy the value from
		// dublicate of list
		LinkedList list2 = (LinkedList) list.clone();
		System.out.println("2:Cloned list "+list2);

		// value are present in the list or not
		System.out.println("3: "+list.contains(10));

		// return the head
		System.out.println("4: Head is-"+list.element());

		// list.

		// System.out.println(list);
		// printing using java 8
		System.out.println("5.Each element in each line:");
		list.forEach(System.out::println);
		
		// get the first element
		System.out.println("6: "+list.getFirst());

		// get the last element
		System.out.println("7: "+list.getLast());

		// get using index
		// list.get(9);

		// add the element at last tail
		System.out.println("8: "+list.offer(10));

		System.out.println("9: "+list.offerFirst(20));

		System.out.println("10: "+list.offerLast(30));

		// return the index of value
		System.out.println("11: "+list.indexOf(20));

		// check for list is empty or not
		System.out.println("12: "+list.isEmpty());

		// return the object of iterator class
		Iterator it = list.iterator();
		// it tell it has the next element or not
		while (it.hasNext()) {
			// it will give the value
			System.out.println("next " + it.next());
		}
		
		//return the head or first value
		//it do not the first node
		System.out.println("13: "+list.peek());
		
		//return the head or first node
		//it will delete the head also
		System.out.println("14: "+list.poll());
		
		
		System.out.println("15: "+list.peekFirst());
		System.out.println("16: "+list.peekLast());
		
		System.out.println("17: "+list.pollFirst());
		System.out.println("18: "+list.pollLast());
		
		//it will remove the head or first element
		list.remove();
		
		System.out.println("19: "+list.remove(1));
		
		System.out.println("20: "+list.removeFirst());
		
		System.out.println("21: "+list.removeLast());
		
		//remove the matching element of list
		System.out.println("22: "+list.removeAll(list2));
		
		//it will print the size of list
		System.out.println(list.size());
		
		Object[] arr=list.toArray();
		
	}
}
