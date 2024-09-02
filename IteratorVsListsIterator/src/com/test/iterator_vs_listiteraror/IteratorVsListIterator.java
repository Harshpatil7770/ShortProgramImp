package com.test.iterator_vs_listiteraror;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class IteratorVsListIterator {

	public static void main(String[] args) {
		
		
		/**
		 * **************************************************************
		 * 1) Iterator is used to traverse the element in forward direction
		 * 2) Iterator is getting used with list, set , arrays
		 * 3) Iterator has more control over the list than the for loop because
		 *    it has it's own method.
		 * 4) Iterator is fail fast or fail safe , it is depends upon
		 *    which list, set or array are you iteration 
		 *    for eg- 
		 *    if you Iterating a normal list of String in , while performing iteration 
		 *    if you try to add new element using list.add() ; it will
		 *    immediately throw concurrent modification exception.i.e., fail - fast means it does not
		 *    require any extra space in memory.
		 *    whereas if you are iterating CopyArrayAsList
		 *    whereas if 
		 *    if you try to modify list in loop
		 */
		
		
		List<Integer> empNumber=new ArrayList<Integer>();
		
		empNumber.add(1);
		empNumber.add(2);
		empNumber.add(3);

		
		Set<String> empNames = new HashSet<String>();

		empNames.add("A");
		empNames.add("A");
		empNames.add("B");
		
		Iterator<Integer> empNumberItr=empNumber.iterator();
		while (empNumberItr.hasNext()) {
			System.out.println(empNumberItr.next());
		}
		
		Iterator<String> empNamesItr=empNames.iterator();
		while(empNamesItr.hasNext()) {
			System.out.println(empNamesItr.next());
		}
		
		
		/**
		 * **************************************************************
		 * 1) ListIterator is used to traverse the element is forward and reverse direction
		 * 2) ListIterator is getting used only for list
		 * 3) ListIterator able to perform add, remove and delete operation
		 */
		
		ListIterator empNumberLists=empNumber.listIterator();
		while(empNumberLists.hasNext()) {
			System.out.println(empNumberLists.next());
			empNumberLists.add(30);
		}
		
		while(empNumberLists.hasPrevious()) {
			System.out.println(empNumberLists.previous());
			empNumberLists.remove();
			
		}
	}
}
