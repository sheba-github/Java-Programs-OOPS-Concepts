package oopsConcepts;

public class StringConcatenationWithOOPs {
	String str ="Sheba";
	public String StringConcat(String str1) {
		String s= str.concat(str1);
		return s;
	}
	
	public static void main(String[] args) {

		StringConcatenationWithOOPs obj= new StringConcatenationWithOOPs();
		String s = obj.StringConcat(" Saravanan");
		System.out.println(s);
	}

}
