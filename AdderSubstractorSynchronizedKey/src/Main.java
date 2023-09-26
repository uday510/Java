import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

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