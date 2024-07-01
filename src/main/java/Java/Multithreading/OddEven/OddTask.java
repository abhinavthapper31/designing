package Java.Multithreading.OddEven;

public class OddTask implements Runnable {

    private int limit;
    private Printer printer;

    OddTask(int limit, Printer printer) {
        this.limit = limit;
        this.printer = printer;
    }


    @Override
    public void run() {
        int oddNumber = 1;
        while (oddNumber <= limit) {
            printer.printOdd(oddNumber);
            System.out.println("Incrementing odd");
            oddNumber = oddNumber + 2;
        }
    }
}

