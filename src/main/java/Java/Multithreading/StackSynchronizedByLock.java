package Java.Multithreading;

public class StackSynchronizedByLock {
	int[] arr;
	int stackTop;
	int capacity;

	StackSynchronizedByLock(int capacity) {
		this.capacity = capacity;
		this.arr = new int[capacity];
		stackTop = -1;

	}

	public boolean isEmpty() {
		return stackTop < 0;
	}

	
	/*
	 * When we use a synchronized block, Java internally uses a monitor lock to provide synchronization. These monitors are bound to an object; 
	 *  therefore, all synchronized blocks of the same object can have only one thread executing them at the same time.
	 *  
	 * In a static class we will pass the class as lock Object.class
	 * Used to provide specific code level locking
	 * 
	 * */
	public boolean push(int val) {

		synchronized (this) {
			if (stackTop == capacity) {
				System.out.println("Overflow !!");
				return false;
			}
			stackTop++;

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			arr[stackTop] = val;
			return true;
		}

	}

	public int pop() {
		synchronized (this) {
			if (isEmpty()) {
				System.out.println("Empty !!");
				return -1;
			}
			int x = arr[stackTop];
			arr[stackTop] = Integer.MAX_VALUE;
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			stackTop--;
			return x;
		}

	}

	public int peek() {
		if (isEmpty() == false) {
			return arr[stackTop];
		}
		return -1;
	}

}
