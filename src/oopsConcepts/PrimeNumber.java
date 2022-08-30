package oopsConcepts;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int num=input.nextInt();
		
		boolean isPrime=true;
		int n;
		n=(int)Math.sqrt(num);
		for(int i=0;i<=n;i++)
		{
			if(num%i==0)
			{
				
				isPrime=false;
			}
			else {
				
				isPrime=true;

			}
						
		}
		if(isPrime)
		{
			System.out.println("Number is prime");
		}
		else
			System.out.println("Number is not prime");		
	
		input.close();
	}

}
