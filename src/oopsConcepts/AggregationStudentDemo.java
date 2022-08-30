package oopsConcepts;

public class AggregationStudentDemo {
		
			   int rollNum;
			   String studentName;
			   //Creating HAS-A relationship with Address class
			   AggregationStudent studentAddr; 
			   AggregationStudentDemo (int roll, String name,  AggregationStudent addr){
			       this.rollNum=roll;
			       this.studentName=name;
			       this.studentAddr = addr;
			   }
			   
			   public static void main(String args[]){
				   AggregationStudent ad = new AggregationStudent(55, "Agra", "UP", "India");
				   AggregationStudentDemo obj = new AggregationStudentDemo(123, "Chaitanya", ad);
			       System.out.println(obj.rollNum);
			       System.out.println(obj.studentName);
			       System.out.println(obj.studentAddr.streetNum);
			       System.out.println(obj.studentAddr.city);
			       System.out.println(obj.studentAddr.state);
			       System.out.println(obj.studentAddr.country);
	}

}
