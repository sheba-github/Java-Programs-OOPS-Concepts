package oopsConcepts;

public class StaticDemo {

	public static void main(String[] args) {

		StaticSoftwares software1 = new StaticSoftwares("Java");
		System.out.println("Software 1: "+software1.getPgmLanguage());
		System.out.println("InstanceCount : "+ software1.getInstanceCount());
		
		StaticSoftwares software2 = new StaticSoftwares("Java");
		System.out.println("Software 2: "+software2.getPgmLanguage());
		System.out.println("Intance Count : "+ software2.getInstanceCount());
		
	}

}
