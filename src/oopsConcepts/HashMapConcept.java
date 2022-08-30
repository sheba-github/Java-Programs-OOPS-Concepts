package oopsConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapConcept {

	public static void main(String[] args) {
//Creating a Hashmap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Java");
		hm.put(2, "Selenium");
		hm.put(3, "Ruby");
		hm.put(4, "Python");
		System.out.println("******************");
		System.out.println(hm);

		HashMap<Integer, String> hm1 = new HashMap<Integer, String>();
		hm1.put(3, "Ruby");

		hm.putAll(hm1);
		System.out.println("******************");

		System.out.println(hm);

//Remove ->It will not shift the value to 3.
		System.out.println("******************");

		hm.remove(3);

		System.out.println(hm);
		
//Contains key or value
		
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("Python"));
//Iteration
for(Entry<Integer, String> m: hm.entrySet())	{	
		int key= m.getKey();
System.out.println("Key Value: "+ key);
System.out.println("Value is "+ m.getValue());

}
	}}

