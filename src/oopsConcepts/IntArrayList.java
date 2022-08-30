package oopsConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class IntArrayList {

	public static void main(String[] args) {
        ArrayList<Integer> ar= new ArrayList<Integer>();
        //To add
        ar.add(30);
        ar.add(10);
        ar.add(20);
//Length 
        System.out.println("Length: "+ar.size());
//To get the item at 2nd index
        System.out.println("The element in 2nd index"+ar.get(2));
//To loop using for loop
        System.out.println("Using enhanced for loop");
        for(int i:ar)
        {System.out.println(i);
        }
        System.out.println("Using for loop");
        for(int i=0;i<ar.size();i++)
{
	System.out.println(ar.get(i));
	}
System.out.println("Using Iterator");

Iterator<Integer> it =ar.iterator();
while(it.hasNext())
{
System.out.println(it.next());	
}
//To remove

ar.remove(2);
System.out.println("Using enhanced for loop");
for(int i:ar)
{System.out.println(i);
}
//tO Convert collection  to array
Object[] array = ar.toArray();
//To check the length of array
System.out.println("The length of array "+array.length);
System.out.println("Displaying Array");

for(Object i:array)
{System.out.println(i);
}
//To clear elements
ar.clear();
System.out.println("The elements in arrayList after clearing:");
//ar.add(40);
//ar.add(50);
//ar.add(60);
//for(int i:ar)
//{
	System.out.println(ar);
//}


}


	}


