package oopsConcepts;

public class ThreadA extends Thread implements Runnable{

	public void run() {
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("From thread A "+ i);
			
		}
		System.out.println("Exit from A");
		
	}
	
}
