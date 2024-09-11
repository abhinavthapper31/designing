package Java.Multithreading;

public class PrintOdd implements Runnable {
	
	int oddCounter = 1 ;

	@Override
	public void run() {
		printOdd() ;
		
	}

	private synchronized void printOdd() {
		System.out.println(oddCounter);
		oddCounter += 2 ;
		try {
			wait() ;
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
