package oopsConcepts;

import java.util.Iterator;
import java.util.Vector;

public class VectorConcept {

	public static void main(String[] args) {
  Vector<Integer> vect1= new Vector<Integer>();
  vect1.add(10);
  vect1.add(20);
  vect1.add(30);
  vect1.add(40);
  vect1.add(10);
  
  System.out.println(vect1);
  System.out.println("********************");
  System.out.println(vect1.capacity());
  System.out.println("********************");

  Vector<Integer> vect2= new Vector<Integer>();
  vect2.add(11);
  vect2.add(12);
  System.out.println(vect2);
  System.out.println("********************");
  vect1.addAll(vect2);
  System.out.println(vect1);
  System.out.println("********************");

  System.out.println("Boolean value "+vect1.contains(10));
  
  System.out.println("********************");

  System.out.println(vect1.remove(1));
  System.out.println(vect1);
  
  System.out.println("********************");

  for(int i: vect1)
  {
	  System.out.println(i);
  }
  
  System.out.println("********************");

 int num =0;
  while(vect1.size()>num)
  {
	  System.out.println(vect1);
	  num++;
  }
  System.out.println("********************");
Iterator<Integer> it = vect1.iterator();
while(it.hasNext())
{
	System.out.println(it.next());
	
	}

System.out.println("*********String vector***********");

Vector<String> strVector1=new Vector<String>();
strVector1.add("Python");
strVector1.add("Ruby");
strVector1.add("Java");

Vector<String> strVector2=new Vector<String>();
strVector2.add("Python");
strVector2.add("Selenium");
strVector2.add("QTP");

strVector1.retainAll(strVector2);
System.out.println(strVector1);
	}

}
