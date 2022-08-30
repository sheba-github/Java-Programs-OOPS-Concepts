package oopsConcepts;

public class MethodOverloadingTest {

	public static void main(String[] args) {
		MethodOverloadingDemo obj= new MethodOverloadingDemo();
		obj.add();
		obj.add(10,20,30);
		obj.add(50,40);
		obj.add(10,20.50);
		obj.add(30.50,20);
		
	}

}
