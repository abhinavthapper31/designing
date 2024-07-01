package Java.Multithreading.OddEven;

public class Printer {

    boolean oddPrinted = false;


    public  synchronized void printOdd(int number) {
        // if odd has been printed i will wait for even
        while(oddPrinted){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Odd thread prints : " + number);
        oddPrinted = true;
        notify();
    }


    public  synchronized void printEven(int number) {

        while(!oddPrinted){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Even thread prints : " + number);
        this.oddPrinted = false;

        notify();
    }
}
