package com.test.iterator_fail_fast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employee {
	/**
	 * Iterator if you try to add new element in while iterating a loop
	 * it will immediately throw concurrent modification exception.
	 * it is fail fail means it does not require any extra space in memory.
	 */

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("ABC");
		list.add("CDE");
		list.add("EFG");
		
		
		Iterator<String> empListIterator=list.iterator();
		while(empListIterator.hasNext()) {
			list.add("GHI");
			System.out.println(empListIterator.next());
		}
		
		//comment line number 27
		//outside the iterating loop you can add the element
		list.add("GHI");
		System.out.println(list);
	}
}
