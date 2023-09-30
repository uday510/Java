import java.util.concurrent.*;
import java.util.concurrent.Future;
import java.util.concurrent.locks.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Lock lock = new ReentrantLock();

        Nums nums = new Nums();
        Adder adder = new Adder(nums, lock);
        Subtractor subtractor = new Subtractor(nums, lock);
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Void> adderTask = executorService.submit(adder);
        Future<Void> subtractorTask = executorService.submit(subtractor);

        adderTask.get();
        subtractorTask.get();

        System.out.println(nums.num);
    }
}