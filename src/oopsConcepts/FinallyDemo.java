package oopsConcepts;

public class FinallyDemo {

	public static void main(String[] args)
	{
		int x=5,y=1000;
		try {
			
			float z = (float)x/(float)y;
			if(z<0.01)
			{
				throw new RuntimeException("Number is too small");
			}
			
		}
		catch(RuntimeException e)
		{
			System.out.println("Caught my exception");
			System.out.println(e.getMessage());
			
		}
		
		finally {
			
			System.out.println("I am always here");
		}
		
	}
	
}
