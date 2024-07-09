import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Value value = new Value();
//
//        ExecutorService executorService = Executors.newCachedThreadPool();
//
//        Lock l = new ReentrantLock();
//
//        Callable<Void> adder = () -> {
//          for (int i = 1; i <= 500000; ++i) {
//              l.lock();
//              value.v += i;
//              l.unlock();
//          }
//          return null;
//        };
//
//        Callable<Void> subtractor = () -> {
//            for (int i = 1; i <= 500000; ++i) {
//                l.lock();
//                value.v -= i;
//                l.unlock();
//            }
//            return null;
//        };
//
//        Future<Void> adderFuture = executorService.submit(adder);
//        Future<Void> subtractorFuture = executorService.submit(subtractor);
//
//        adderFuture.get();
//        subtractorFuture.get();
//
//        System.out.println(value.v);
//
//        MathematicalOperation multiplication = (x, y) -> x * y;
//        MathematicalOperation addition = Integer::sum;
//        MathematicalOperation subtraction = (x, y) -> x - y;


//        Integer res = multiplication.operate(2, 3);

//        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
//
//        Stream<Integer> stream = list.stream();
//
//        List<Integer> res = stream.filter((num) -> num % 2 == 0).toList();
//

//        System.out.println(res);
        //Intermediate operations

        // Terminal operations


    }
}