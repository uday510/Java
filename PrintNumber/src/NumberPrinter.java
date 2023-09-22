public class NumberPrinter implements Runnable {
    private int numToPrint;
    public void run() {
        System.out.println(Color.ANSI_RED + "Running " + Thread.currentThread().getName().toUpperCase() + "..."  + numToPrint );
    }

    NumberPrinter(int num) {
        numToPrint = num;
    }

}
