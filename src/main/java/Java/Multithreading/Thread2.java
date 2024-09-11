package Java.Multithreading;

public class Thread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread made via Runnable, thread name : " + Thread.currentThread().getName());

    }

}
