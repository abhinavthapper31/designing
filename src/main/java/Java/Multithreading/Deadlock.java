package Java.Multithreading;

public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main is starting");
		
		/*
		 * 
		 * Deadlock in Java is a part of multithreading. Deadlock can occur in a situation
		 *  when a thread is waiting for an object lock, that is acquired by another thread 
		 *  and second thread is waiting for an object lock that is acquired by first thread. 
		 *  Since, both threads are waiting for each other to release the lock, the condition is called deadlock.
		 * 
		 * */

		String lock1 = "lock1";
		String lock2 = "lock2";

		Thread t1 = new Thread(() -> {

			synchronized (lock1) {
				// this sleep is mandatory else t1 will quickly acquire both locks
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("ACQUIRED");

				}

			}

		}, "t1");

		Thread t2 = new Thread(() -> {

			synchronized (lock2) {
				try {
					Thread.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("ACQUIRED");

				}

			}

		}, "t2");

		t1.start();
		t2.start();

	}

}
