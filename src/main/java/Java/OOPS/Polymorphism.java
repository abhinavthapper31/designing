package Java.OOPS;

/*
 * This is static or compile time polymorphism
 * Static or Compile-time Polymorphism when the compiler 
 * is able to determine the actual function, it’s called 
 * compile-time polymorphism. Compile-time polymorphism can
 *  be achieved by method overloading in java. When different 
 *  functions in a class have the same name but different signatures,
 *  it’s called METHOD OVERLOADING. A method signature contains the
 *  name and method arguments. So, overloaded methods have different arguments.
 *   The arguments might differ in the numbers or the type of arguments.
 * 
 * */
class Car {

	public void speed() {
	}

	public void speed(String accelerator) {
	}

	public int speed(String accelerator, int speedUp) {
		return 100;
	}
}

// Parent class
class DeliveryBoy {

	private int id;

	DeliveryBoy(int id) {
		this.id = id;
	}

	public void deliver() {
		System.out.println("Delivering Item");
	}

}

class Postman extends DeliveryBoy {
	Postman(int id) {
		super(id);
	}

	@Override
	public void deliver() {
		System.out.println("Delivering Letters");
	}
}

class FoodDeliveryBoy extends DeliveryBoy {
	FoodDeliveryBoy(int id) {
		super(id);
	}

	@Override
	public void deliver() {
		System.out.println("Delivering Food");
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		DeliveryBoy db = new DeliveryBoy(3);
		db.deliver();

		// Prints its own implementation, identified at runtime
		FoodDeliveryBoy fdb = new FoodDeliveryBoy(2);
		fdb.deliver();

		Postman p = new Postman(1);
		p.deliver();

	}

}
