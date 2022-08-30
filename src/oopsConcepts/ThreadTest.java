package oopsConcepts;

public class ThreadTest {

	public static void main(String[] args) {
ThreadA obj = new ThreadA();
obj.start();

ThreadB obj1 = new ThreadB();
obj1.start();
	}

}
