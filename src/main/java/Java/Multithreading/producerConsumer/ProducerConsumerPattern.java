package Java.Multithreading.producerConsumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerPattern {

	public static void main(String args[]) {

		// can make this a blocking q
		Queue<Integer> q = new LinkedList<>();

		Thread t1 = new Thread(new Producer(q, 5));
		Thread t2 = new Thread(new Consumer(q, 5));

		t1.start();
		t2.start();

	}

}
