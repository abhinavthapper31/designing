package Java.Multithreading.producerConsumer;

import java.util.Queue;

/*
 * Simply put, calling wait() forces the current thread to wait until some other thread invokes notify() or notifyAll() on the same object.
 * */

// creates questions
public class Producer implements Runnable {

	int MAX_LIMIT = 5;
	Queue<Integer> q;
	int questionNo;

	Producer(Queue<Integer> q, int max) {
		this.q = q;
		this.MAX_LIMIT = max;
		questionNo = 0;
	}

	public void produceQuestions(int questionNo) throws InterruptedException {
		synchronized (q) {
			//while not if incase multiple thread are waiting so we use while
			while (q.size() == this.MAX_LIMIT) {
				System.out.println("Queue is full, need consumer to Consume");
				q.wait();
				// waits for consumer to consumer so it can add
			}

			q.add(questionNo);
			System.out.println("Added question number to queue : " + questionNo);
			// wait after adding a question
			Thread.sleep(100);
			q.notify();

		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				produceQuestions(questionNo);
				questionNo++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
