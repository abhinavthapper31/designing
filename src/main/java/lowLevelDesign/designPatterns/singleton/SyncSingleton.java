package lowLevelDesign.designPatterns.singleton;

public class SyncSingleton {
	// the attribute is the only instance which will be created
	// volatile so as objects read directly from memory, all
	// threads see same view of instance
	private static volatile SyncSingleton singletonInstance;

	// private default constructor, prevents normal instantiation 
	private SyncSingleton() {
		System.out.println("Instantiated");
	}

	public static SyncSingleton getInstance() {
		if (singletonInstance == null) {
			// We do not make the whole function synchronized as  we need to make
			// one the below code synchronized "singletonInstance = new SyncSingleton();"
			// we prevent blocking of other threads

			synchronized(SyncSingleton.class) {
				// multiple threads could be waiting before this synchronized, double checking.
				// to prevent re-instantiation in case multiple threads entered the previous if.
				if(singletonInstance == null) {
					singletonInstance = new SyncSingleton();
				}
			}
		}
		return singletonInstance;
	}

}
