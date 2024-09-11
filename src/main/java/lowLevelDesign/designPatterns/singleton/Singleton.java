package lowLevelDesign.designPatterns.singleton;

// Ensures a class has only 1 object and this object is point of Global ref
// All objects in Spring are singleton
public class Singleton {

	// the attribute is the only instance which will be created, hence static
	private static Singleton singletonInstance;

	// private constructor, so created via constructor only
	// also we do not want to allow call to public constructor directly.
	private Singleton() {
		System.out.println("Instantiated");
	}

	// using static class because we can not create obj directly
	// all instantiations via this fn
	public static Singleton getInstance() {
		if (singletonInstance == null) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}

}
