package oopsConcepts;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class LinkedList {

	public static void main(String[] args) {
		java.util.LinkedList<String> ll = new java.util.LinkedList<String>();
//To add data in Linkedlist
		ll.add("Test");
		ll.add("Selenium");
		ll.add("QTP");
		ll.add("Dev");
//To get size
		System.out.println("Size of Linkedlist " + ll.size());
//To print all items
		System.out.println(ll);
//To add in index
		ll.add(2, "Python");
		System.out.println(ll);
//To add as first
		ll.addFirst("Java");
		System.out.println(ll);
//To add as last
		ll.addLast("Ruby");
		System.out.println(ll);
//Adding another Linkedlist
		
		java.util.LinkedList<String> ll2= new java.util.LinkedList<String>();
		ll2.add("Cucumber");
		ll2.add("Maven");
		ll2.add("Jenkins");
		ll.addAll(ll2);
		System.out.println(ll);
//To get a particular value
		System.out.println(ll.get(5));
//to set 2nd one as protractor
		ll.set(1, "Protractor");
		System.out.println(ll);
//to add duplicates
		ll.add("Maven");
		System.out.println(ll);
//remove last occurance element
		ll.removeLastOccurrence("Maven");
		System.out.println(ll);
//remove on index
		ll.remove(1);
		System.out.println(ll);
//To print using enhanced for loop
		for(String i :ll)
		{
			System.out.println(i);
			
		}
		
		
		

	}

}
