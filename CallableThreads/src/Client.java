import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayCreator arrayCreator = new ArrayCreator(n);
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<List<Integer>> list = executorService.submit(arrayCreator);
        System.out.println(list.get());
    }
}