package oopsConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
//*****To add objects*****

		list.add("Sheba");
		list.add("Saravanan");
		list.add("Ridhi");
		list.add("10");
		
		System.out.println(list);

//To iterate through the objects

	/*	Iterator<String> it = list.iterator();
		System.out.println("The elements in ArrayList are: ");
		while (it.hasNext()) {
			System.out.println(it.next());}*/
//To know the length of ArrayList
			
/*		System.out.println("length: "+list.size());
//To know the value at particular location
		
        System.out.println("First element in ArrayList "+list.get(0));*/
//To add a Collection using addall
        
        ArrayList<String> ar1= new ArrayList<String>();
      ar1.add("Nivu");
      ar1.add("Nakshu");
      ar1.add("Shanta");
      ar1.add("Sheba");
      
      list.addAll(ar1);
      System.out.println("After adding ar1");
      Iterator<String> it1 = list.iterator();
     while(it1.hasNext())
     {
    	 System.out.println(it1.next());
    	 
     }
 //Remove
     System.out.println("Removing collection");
     
     list.removeAll(ar1);
     for(int i=0;i<list.size();i++)
     {
    	 System.out.println(list.get(i));
    	 
     }
     System.out.println("Adding collection");
     ar1.add("Nivu");
     ar1.add("Nakshu");
     ar1.add("Shanta");
     ar1.add("Sheba");
     
 // Removing invoking collection using retain All
     System.out.println("ArrayList after retain");

     
     ArrayList<String> ar3= new ArrayList<String>();
     ar3.add("Test");
     ar3.add("Selenium");
     
     ArrayList<String> ar4= new ArrayList<String>();
     ar4.add("Test");
     ar4.add("QTP");
     
     
     ar3.retainAll(ar4);
     for(int i=0;i<ar3.size();i++)
     {
    	 System.out.println(ar3.get(i));
     }     
 //remove item from array list
//	cars.remove(size -1);
  System.out.println("***************************");
     
  list.remove((list.size())
		  -1);   
  for(int i=0;i<list.size();i++)
  {
 	 System.out.println(list.get(i));
  }      
	
	
	
//Using streams.
	  System.out.println("***********Streams****************");
list.forEach((s)->System.out.println(s));

	
	}
}
