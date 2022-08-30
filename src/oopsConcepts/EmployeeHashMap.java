package oopsConcepts;

import java.util.HashMap;
import java.util.Map.Entry;

public class EmployeeHashMap {

	public static void main(String[] args) {
		Employee e1= new Employee("Sheba",34,"QA");
		Employee e2= new Employee("Saravanan",37,"PM");	
		Employee e3= new Employee("Niveda",25,"Lead");	

		HashMap<Integer, Employee> emp_hm= new HashMap<Integer, Employee>();
		
		emp_hm.put(1,e1);
		emp_hm.put(2,e2);
		emp_hm.put(3,e3);

		for(Entry<Integer, Employee> m: emp_hm.entrySet())
		{
			int key = m.getKey();
			System.out.println(key+" "+"Info");
			Employee emp = m.getValue();
		    System.out.println(emp.name);
		    System.out.println(emp.age);
		    System.out.println(emp.dept);

		    
		}
		
		
	
	}

}
