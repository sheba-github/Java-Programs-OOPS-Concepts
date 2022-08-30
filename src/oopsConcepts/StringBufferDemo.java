package oopsConcepts;

public class StringBufferDemo {
	//String str;

	//public StringBufferDemo(String string) {
		
		//str=string;
	//}

	public static void main(String[] args) {
		StringBuffer obj = new StringBuffer("Hello");
		System.out.println("buffer "+obj);
		System.out.println("length "+obj.length());
		System.out.println("capacity "+obj.capacity());

	
	}

}
