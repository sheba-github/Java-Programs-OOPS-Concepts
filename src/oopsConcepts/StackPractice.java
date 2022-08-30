package oopsConcepts;

import java.util.Stack;

public class StackPractice {

	public static void main(String[] args) {
Stack<String> stac= new Stack<String>();
stac.push("Java");
stac.push("Objects");
stac.push("Multithreading");
stac.push("Interface");
stac.push("Inheritance");

System.out.println("Top element in stack "+stac.peek());
System.out.println("Popped  element in stack "+stac.pop());
System.out.println("Elements in Stack "+stac);
System.out.println("Elements having er "+stac.search("Java"));


	
	
	}

}
