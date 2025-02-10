package lowLevelDesign.designPatterns.singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void main(String[] args) {

        // this is some work
        Runnable task = () -> {
            SyncSingleton singleton = SyncSingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + ": " + singleton);
        };

        // Create multiple threads
        Thread thread1 = new Thread(task, "Thread 1");
        Thread thread2 = new Thread(task, "Thread 2");
        Thread thread3 = new Thread(task, "Thread 3");


        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();

//        // Wait for all threads to finish
//        try {
//            thread1.join();
//            thread2.join();
//            thread3.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        System.out.println("All threads have finished execution.");
    }
}
