package lowLevelDesign.designPatterns.singleton;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    public static void main(String[] args) {

//        Singleton single1 = Singleton.getInstance();
//        Singleton single2 = Singleton.getInstance();
//
//        System.out.println(single1);
//        System.out.println(single2);

        // Above will fail in the case of multi threading, Eg

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> Singleton.getInstance());
        executorService.execute(() -> Singleton.getInstance());

    }
}
