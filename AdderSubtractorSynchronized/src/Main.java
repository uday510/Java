import java.util.concurrent.*;
import java.util.concurrent.Future;
import java.util.concurrent.locks.*;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Nums nums = new Nums();
        Adder adder = new Adder(nums);
        Subtractor subtractor = new Subtractor(nums);
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<Void> adderTask = executorService.submit(adder);
        Future<Void> subtractorTask = executorService.submit(subtractor);

        adderTask.get();
        subtractorTask.get();

        System.out.println(nums.num);
    }
}