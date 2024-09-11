package Java.Multithreading;

public class Stack {
	int[] arr;
	int stackTop;
	int capacity;

	Stack(int capacity) {
		System.out.println("Initialised !!");
		this.capacity = capacity;
		this.arr = new int[capacity];
		stackTop = -1;

	}

	public boolean isEmpty() {
		return stackTop < 0;
	}

	public boolean push(int val) {
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
		System.out.println("Pushed !!");
		return true ;
	}

	public int pop() {
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
		System.out.println("Popped !!");
		return x;
	}

	public int peek() {
		if (isEmpty() == false) {
			return arr[stackTop];
		}
		return -1 ;
	}

}
