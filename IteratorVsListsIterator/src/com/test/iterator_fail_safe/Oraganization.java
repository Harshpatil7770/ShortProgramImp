package com.test.iterator_fail_safe;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Oraganization {

	/**
	 * Below is the fail safe iterator, it does not throw immediately 
	 * concurrent modification.
	 * (we have used CopyOnWriteArrayList , using this if you 
	 * add element while iterating it will not part of that iteration.
	 */
	
	public static void main(String[] args) {
		List<String> orgLists=new CopyOnWriteArrayList<>();
		orgLists.add("ABC");
		orgLists.add("CDE");
		orgLists.add("EFG");
		 
		Iterator<String> iterator=orgLists.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			orgLists.add("GHI");
		}
		
		Iterator<String> newIterator=orgLists.iterator();
		
		while(newIterator.hasNext()) {
			System.out.println(newIterator.next());
		}
	}
}
