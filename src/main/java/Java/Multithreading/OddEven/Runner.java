package Java.Multithreading.OddEven;

public class Runner {

    public static void main(String[] args) {

        Printer printer = new Printer();
        OddTask oddTask = new OddTask(20, printer);
        EvenTask evenTask = new EvenTask(20, printer);


        Thread oddThread = new Thread(oddTask);
        Thread evenThread = new Thread(evenTask);

        oddThread.start();
        evenThread.start();

    }
}
