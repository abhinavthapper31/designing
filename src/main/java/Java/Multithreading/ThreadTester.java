package Java.Multithreading;

public class ThreadTester {

    public static void main(String[] args) {

        System.out.println("Begin Main");
		
		/*
		// normal using thread class
		 
		Thread t1 = new Thread1("THREAD-1") ; 
		
		t1.start();

		 * above code can give output : 
		 * Begin Main
		   End Main
           being run by a thread
		 * 
		 * As start immediatly doesn't start, JVM just knows it has to start, but it depends on JVM as to when
		 * */

        // Executing a Daemon Thread
        Thread t2 = new Thread1("THREAD-2");

        // to set to daemon thread, low priority, JVM terminates if daemon thread is the only thread executing remaining,
        // but if user thread is there, JVM waits
        t2.setDaemon(true);
        t2.start();

        // thread made via runnable class, Best way to create Threads, thread2 implements runnable interface
        // we can also do : new Thread(()-> System.out.println("LoremIpsum"),"THREAD-3") ;
        Thread t3 = new Thread(new Thread2(), "THREAD-3");
        t3.start();

        //https://stackoverflow.com/questions/2674174/what-is-the-difference-between-thread-start-and-thread-run

        /*
         * Two ways threads are working :
         * 1.  Pass a Runnable instance to set target in Thread class and passed objs run will work (Via class or via lambda)
         * 2.  Extend Thread class in another class and Override the run method
         * */

        System.out.println("End Main");


    }

}
