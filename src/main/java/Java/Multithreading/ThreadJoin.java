package Java.Multithreading;

public class ThreadJoin {

	public static void main(String[] args) {

		/*
		 * java.lang.Thread class provides the join() method which allows one thread to
		 * wait until another thread completes its execution.
		 * If t is a Thread object whose thread is currently executing, then t.join() will make sure that t is
		 * terminated before the next instruction is executed by the program. If there
		 * are multiple threads calling the join() methods that means overloading on
		 * join allows the programmer to specify a waiting period. However, as with
		 * sleep, join is dependent on the OS for timing, so you should not assume that
		 * join will wait exactly as long as you specify
		 */
		System.out.println("Entering main") ;

		Thread t1 = new Thread(() -> {
			System.out.println("thread 1");
		}, "T1");
		
		t1.start();
		
		// ensure t1 executes before t2 and main
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		Thread t2 = new Thread(() -> {
			System.out.println("thread 2");
		}, "T2");
		
		t2.start();
		
		// ensure t2 executes before main
		try {
			t2.join() ;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Exiting main") ;


	}

}
