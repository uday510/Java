import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(8, 1, 2, -1, 0, 4);

        ExecutorService executorService = Executors.newCachedThreadPool();

        MergeSort sortedList = new MergeSort(list, executorService);

        Future<List<Integer>> res = executorService.submit(sortedList);

        System.out.println(res.get());

    }
}