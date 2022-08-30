package oopsConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class EnumArrayList {

public static void main(String[] args) {
Employee e1= new Employee("Sheba",34,"QA");
Employee e2= new Employee("Saravanan",37,"PM");

ArrayList<Employee> emp_arl= new ArrayList<Employee>();
emp_arl.add(e1);
emp_arl.add(e2);
//To traverse
Iterator<Employee> it = emp_arl.iterator();
while(it.hasNext())
{
Employee emp= it.next();	
System.out.println(emp.name);
System.out.println(emp.age);
System.out.println(emp.dept);
}

	}

}
