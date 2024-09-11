package Java.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Executor {

	public static void fixedThreadPool() {

		/*
		 * Params
		 * CorePool Size : fixed number of core threads that are kept inside all the time.
		 * max Pool SIZE : if all core threads are busy and the internal queue is full, the pool is allowed to grow up to maximumPoolSize.
		 * keepAlive time: keepAliveTime parameter is the interval of time for which the excessive threads (instantiated in excess of the corePoolSize) 
		 * are allowed to exist in the idle state
		 * 
		 * If tasks execeed Max size they have to wait in unbounded Queue
		 * 
		 * */
		
		// execute methods takes a Runnable or Callable(if we return value)
		ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
		
		// taking in a runnable
		executor.submit(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		// taking in a callable (Callable can return value and throw exception)
		executor.submit(() -> {
			Thread.sleep(1000);
			return null;
		});
		
		//will wait
		executor.submit(() -> {
			Thread.sleep(1000);
			return null;
		});
		executor.shutdown();

	}
	
	public static void cachedThreadPool() {

		/*
		 * Params :
		 * This method does not receive a number of threads at all. We set the corePoolSize to 0 and set the maximumPoolSize to Integer.MAX_VALUE. 
		 * Finally, the keepAliveTime is 60 seconds:
		 * The main concern with a CachedThreadPool is that it will create up to Integer.MAX_VALUE \
		 * number of threads as it will always spawn a new thread if an unused one does not exist in the cache. 
		 * So if you have long running tasks it is then more likely that you could grow the number of concurrent 
		 * threads more than you desire since this type of thread pool will not limit how many execute concurrently itself. 
		 * This does not seem to be a problem for your use case as described, but it is something to be aware of.
		 * 
		 * */
		
		// execute methods takes a Runnable or Callable(if we return value)
		ExecutorService executor =  Executors.newCachedThreadPool();
		
		// taking in a runnable
		executor.submit(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		// taking in a callable (Callable can return value and throw exception)
		executor.submit(() -> {
			Thread.sleep(1000);
			return null;
		});

		executor.shutdown();

	}
	
	public static void scheduledThreadPool() {

		/*
		 * Params :
	
		 * 
		 * */
		
		// execute methods takes a Runnable or Callable(if we return value)
		ExecutorService executor =  Executors.newCachedThreadPool();
		
		// taking in a runnable
		executor.submit(() -> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		
		// taking in a callable (Callable can return value and throw exception)
		executor.submit(() -> {
			Thread.sleep(1000);
			return null;
		});

		executor.shutdown();

	}

	public static void main(String[] args) {
		/*
		 * ExecutorService is a JDK API that simplifies running tasks in asynchronous
		 * mode. Generally speaking, ExecutorService automatically provides a pool of
		 * threads and an API for assigning tasks to it.
		 * 
		 */
		fixedThreadPool();

	}

}
