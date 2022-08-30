package oopsConcepts;

public class MethodOveridingCarBMW_Test {

	public static void main(String[] args) {

		BMW_MethodOverridingConceptTest obj = new BMW_MethodOverridingConceptTest();
		obj.Start();
		obj.theftsafety();
		System.out.println(obj.speedlimit);
		System.out.println("*******************");
		Car obj1= new Car();
		obj1.Start();
		obj1.Stop();
		obj1.refuel();
		System.out.println("*******************");
		
//Dynamic Polymorphism

		Car obj2= new BMW_MethodOverridingConceptTest();
		obj2.Start();
		obj2.Stop();
		obj2.refuel();
		//Here the Parent class variable itself is called
		System.out.println(obj2.speedlimit);
		
		
	}

}
