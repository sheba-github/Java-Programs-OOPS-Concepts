package oopsConcepts;

public class ThreadB extends Thread {
public void run() {
		
		for(int i=0;i<=5;i++) {
			
			System.out.println("From thread B "+ i);
			
		}
		System.out.println("Exit from B");
}}
