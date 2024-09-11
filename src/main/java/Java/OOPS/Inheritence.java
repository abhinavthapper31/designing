package Java.OOPS;
// Base class
class Vehicle {

	// not inherited as it is pvt
	private String thisVarIsNotInherited = "121";
	
	// these are propogated to child classes
	public int wheels;
	public String color;

	Vehicle(int wheels, String color) {
		this.color = color;
		this.wheels = wheels;
	}

	// goes to base class
	public void applyBrake() {
		System.out.println("applying brake........");
	}
	
	// goes to base class
	public void accelerate() {
		System.out.println("accelerating........");
	}

}

// child class
class Truck extends Vehicle {

	// specific to Truck class 
	private String truckBackText;

	Truck(int wheels, String color, String truckBackText) {
		// we will have to call the base class constructor always
		super(wheels, color);
		this.truckBackText = truckBackText;

	}

	public void applyBrake() {

		System.out.println("The truck is ");
		// call the function of base class using super
		super.applyBrake();
	}

	public String getTruckText() {
		return this.truckBackText;
	}

	public void setTruckText(String truckBackTest) {
		this.truckBackText = truckBackTest;
	}

}

//child class
class Bike extends Vehicle {

	Bike(int wheels, String color) {
		// always we will have to call the base class constructor
		super(wheels, color);
	}

	public void applyBrake() {

		System.out.println("The bike is ");
		// call the function of base class using super
		super.applyBrake();
	}

}

public class Inheritence {

}
