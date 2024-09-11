package Java.Multithreading;

public class StackSyncchronised {
	int[] arr;
	static int stackTop;
	int capacity;

	StackSyncchronised(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
		stackTop = -1;

	}

	public boolean isEmpty() {
		return stackTop < 0;
	}

	/*
	 * 
	 * synchronised keyword is equivalent to
	 * 
	 * synchronised(this){
	 *
	 * }
	 * this keyword is used as a lock
	 * 
	 * so all methods in a class have one lock this.
	 * the thread accessing the object accessing only has access to all the synced methods in this class
	 * for one object only one thread can access.
	 * Instance methods are synchronized over the instance of
	 * the class (Eg Person.class) owning the method, which means only one thread per instance of the class can execute this method.
	 *
	 * in case of static methods is equal to 
	 * Synchronised(StackSyncchronised.class){
	 *
	 * } ->  block
	 *
	 * These methods are synchronized on the Class object associated with the class. Since only one Class object
	 * exists per JVM per class, only one thread can execute inside a static synchronized method per class,
	 * irrespective of the number of instances it has.
	 *https://www.baeldung.com/java-synchronized
	 * */
	public synchronized void push(int val) {
		if (stackTop == capacity) {
			System.out.println("Overflow !!");
			return;
		}
		stackTop++;
		arr[stackTop] = val;

	}

	public synchronized int pop() {
		if (isEmpty()) {
			System.out.println("Empty !!");
			return -1;
		}
		int x = arr[stackTop];
		arr[stackTop] = Integer.MAX_VALUE;
		stackTop--;
		return x;
	}

	public int peek() {
		if (isEmpty() == false) {
			return arr[stackTop];
		}
		return -1 ;
	}
	
	public synchronized static void print() {
		synchronized (StackSyncchronised.class) {
			System.out.println(stackTop);

		}
	}

}
