package com.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * HashSet class implements the Set interface, backed by a hash table which is actually a HashMap instance.
 *Few important features of HashSet are:

	Implements Set Interface.
	Underlying data structure for HashSet is hashtable.
	As it implements the Set Interface, duplicate values are not allowed.
	Objects that you insert in HashSet are not guaranteed to be inserted in same order. Objects are inserted based on their hash code.
	NULL elements are allowed in HashSet.
	HashSet also implements Searlizable and Cloneable interfaces.
 */


public class Filter_DuplicateElements_Array {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		
		// Form a list of numbers from 0-9.
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}

		// Insert a new set of numbers from 0-5.
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("Input list : " + list);
		
		//copy Array list elements to hash set
		HashSet<String> s = new HashSet<String>(list);
		
		System.out.println("\nFiltered duplicates : " + s);
	}

	/*public static Set<String> processList(List<String> listContainingDuplicates) {

		final Set<String> resultSet = new HashSet<String>();
		final Set<String> tempSet = new HashSet<String>();

		/*for (String yourInt : listContainingDuplicates) {
			if (!tempSet.add(yourInt)) {
				resultSet.add(yourInt);
			}
		}
		return resultSet;
	}*/
}
