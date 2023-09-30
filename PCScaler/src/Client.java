import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        ExecutorService executorService = Executors.newCachedThreadPool();
        Store store = new Store(5);

        for (int i = 1; i <= 8; ++i) {
            executorService.execute(new Producer(store));
        }

        for (int i = 1; i <= 20; ++i) {
            executorService.execute(new Consumer(store));
        }

    }
}