package Java.Multithreading;

// the code in this class will be run by only the thread which calls it
public class Thread1 extends Thread {

    // Pass a name to the Thread class
    Thread1(String name) {
		super(name);
    }

    @Override
    public void run() {
        System.out.println("being run by a thread: " + Thread.currentThread().getName());
        System.out.println("thread Obj : " + Thread.currentThread());

    }

}
