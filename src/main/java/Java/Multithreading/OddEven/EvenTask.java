package Java.Multithreading.OddEven;

public class EvenTask implements Runnable {

    private int limit;
    private Printer printer;

    EvenTask(int limit, Printer printer) {
        this.limit = limit;
        this.printer = printer;
    }

    @Override
    public void run() {
        int evenNumber = 2;
        while (evenNumber <= limit) {
            printer.printEven(evenNumber);
            System.out.println("Incrementing even");
            evenNumber = evenNumber + 2;
        }

    }
}
