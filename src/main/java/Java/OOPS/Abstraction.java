package Java.OOPS;

// https://www.geeksforgeeks.org/abstraction-in-java-2/
abstract class Shape {

	private String color;

	abstract double area();

	public abstract String toString();

	public Shape(String color) {
		System.out.println("Shape constructor called with color : " + color);
		this.color = color;
	}

	public String getColor() {
		return this.color;
	}

}

class Circle extends Shape {
	private double radius;

	Circle(int radius, String color) {
		super(color);
		this.radius = radius;
	}

	@Override
	public double area() {
		System.out.println("Calculating circle area");
		return 3.14 * (this.radius * this.radius);
	}

	@Override
	public String toString() {
		return "Circle color is " + super.getColor() + " and area is : " + area();

	}

}

public class Abstraction {

	public static void main(String argsp[]) {
		Circle c1 = new Circle(3, "Blue");
		String ans = c1.toString();
		System.out.println(ans);
	}

}
