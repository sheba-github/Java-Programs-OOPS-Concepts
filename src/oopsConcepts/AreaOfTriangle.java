package oopsConcepts;

public class AreaOfTriangle {

	public double Area(double base, double height) {
		double area = 0.5 * base * height;
		return area;

	}

	public static void main(String[] args) {
		AreaOfTriangle obj = new AreaOfTriangle();
		double areaOfTriangle = obj.Area(10, 20);
		System.out.println("Area Of Triangle: " + areaOfTriangle);

	}

}
