import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 1; i <= 10; ++i) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            System.out.println(Color.ANSI_CYAN + "Running " + Thread.currentThread().getName().toUpperCase() + "...");
            Thread thread = new Thread(numberPrinter);

            executorService.execute(thread);
        }
    }
}