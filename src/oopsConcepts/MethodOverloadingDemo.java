package oopsConcepts;

public class MethodOverloadingDemo {

	//1.Default add
	public void add() {
		int a=10,b=20,c;
		c=a+b;
		System.out.println("Default method");
		System.out.println(c);
		
		}
    //
	public void add(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("******With 3 parameters********");
		System.out.println(c);
		
	}
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println("******With 2  int parameters********");
		System.out.println(c);
		
	}
	
	public void add(int a, double b)
	{
		double c = a+b;
		System.out.println("*******With int and float parameters*******");
		System.out.println(c);
	}
	
	public void add(double a, int b)
	{
		double c = a+b;
	System.out.println("*******With float and int parameters*******");
	System.out.println(c);
		
	}
}
