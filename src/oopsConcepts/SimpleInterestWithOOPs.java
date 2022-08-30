package oopsConcepts;

public class SimpleInterestWithOOPs {
	float principal;
	float rateOfInterest;
	int years;
	
	
	
	public double SimpleInterest(double principal,double roi, double years)
	{
		double simpleInterest= (0.01* principal*roi*years); 
		System.out.println("Principal "+principal);
		System.out.println("rateOfInterest "+roi);
		System.out.println("years "+years);
		return simpleInterest;
	}

	public static void main(String[] args) {

		SimpleInterestWithOOPs obj = new SimpleInterestWithOOPs();
		System.out.println("The default values of Principal,rateOfInterest and years are: ");
        System.out.println(obj.principal);
        System.out.println(obj.rateOfInterest);
        System.out.println(obj.years);
        double SI = obj.SimpleInterest(1000, 3.5, 5);
        
		System.out.println("Simple Interest is "+ SI);
	}

}
