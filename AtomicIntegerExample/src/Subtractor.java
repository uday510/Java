import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private final Nums nums;
    private final Lock lock;

    Subtractor(Nums num, Lock lock) {
        this.nums = num;
        this.lock = lock;
    }

    public Void call() {
        for (int i = 1; i <= 10000; ++i) {
            this.nums.atomicInteger.addAndGet(-i);
        }
        return null;
    }
}
