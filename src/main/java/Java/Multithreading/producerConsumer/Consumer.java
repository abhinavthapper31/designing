package Java.Multithreading.producerConsumer;

import java.util.Queue;

// creates questions
public class Consumer implements Runnable {

	int MAX_LIMIT = 5;
	Queue<Integer> q;

	Consumer(Queue<Integer> q, int max) {
		this.q = q;
		this.MAX_LIMIT = max;
	}

	public void consumerQuestions() throws InterruptedException {
		synchronized (q) {
			// incase multiple thread are waiting so we use while
			while (q.size() == 0) {
				System.out.println("Queue is empty, need producer to Produce");
				q.wait();
				// waits for producer to add questions
			}

			System.out.println("Answered Question number : " + q.poll());
			// wait after answering a question
			Thread.sleep(1000);
			q.notify();

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				consumerQuestions();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
