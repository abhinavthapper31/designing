package Java.Multithreading;

public class StackTester {

	public static void main(String[] args) {
		
		/* 
		Stack stk = new Stack(5);
			
		
		new Thread(() -> {
			int count=0 ;
			while(count < 10) {
				System.out.println("Pushed : " + stk.push(100));
				count++ ;
			}

		} , "PusherThread").start();;
		
		new Thread(() -> {
			int count=0 ;
			while(count < 10) {
				System.out.println("Popped : " + stk.pop());
				count--;
			}		} , "PopperThread").start();
		
		/*
		 * Above Code 
		 * Will give an index out of bound behavior or inconsistent results
		 * 
		 * */
		
		
		
		
		
		StackSynchronizedByLock stk1 = new StackSynchronizedByLock(5);
		
		// passing runnable
		Thread t1 = new Thread(() -> {
			int count=0 ;
			while(count < 10) {
				System.out.println("Pushed : " + stk1.push(100));
				count++ ;
			}

		} , "PusherThread");
		t1.start();
		
		new Thread(() -> {
			int count=0 ;
			while(count < 10) {
				System.out.println("Popped : " + stk1.pop());
				count++ ;
			}		} , "PopperThread").start();
		
		 
		
	}

}
