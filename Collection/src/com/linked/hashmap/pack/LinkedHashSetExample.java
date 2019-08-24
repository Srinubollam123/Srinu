package com.linked.hashmap.pack;


	
	import java.util.LinkedHashSet;
	import java.util.Set;

	/**
	 * @author imssbora
	 *
	 */
	public class LinkedHashSetExample {
		public static void main(String[] args) {
			Set<String> set=new LinkedHashSet<>();
			
			/*Adding elements into the LinkedHashSet*/
			set.add("A");
			set.add("B");
			set.add("C");
			set.add("D");
			set.add("E");
			
			System.out.println("LinkedHashSet elements:"+set);
			
			/*Removing an element from the LinkedHashSet*/
			set.remove("A");
			System.out.println("LinkedHashSet elements after removal:"+set);
			
			/*Printing the size of the LinkedHashSet*/
			System.out.println("LinkedHashSet size:"+set.size());
			
			/*Checking if an elements exist in the LinkedHashSet or not*/
			System.out.println("Element 'D' exist in the LinkedHashSet:"+set.contains("D"));
			
			/*Removing all elements from the LinkedHashSet*/
			set.clear();
			System.out.println("Element in LinkedHashSet:"+set);
		}
	}

