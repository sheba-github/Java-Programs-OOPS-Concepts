package oopsConcepts;

public class B extends A{
int i = 20;

public B() {
	super();
	System.out.println("Constructor of B");
	}

public B(int i) {
	super(i);
	System.out.println("Constructor of B with single para"+i);
}

public B(int i,int j) {
	super(i,j);
	System.out.println("Constructor of B with multi para"+i+" , "+j);
}
public void stop() {
	
System.out.println("Stop execution");
System.out.println("Parent variable: "+super.i);
}
}


