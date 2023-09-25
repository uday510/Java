import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Subtractor implements Callable<Void> {
    private final Nums nums;
    private final Lock lock;

    Subtractor(Nums num, Lock lock) {
        this.nums = num;
        this.lock = lock;
    }

    public Void call() {
        for (int i = 1; i <= 10; ++i) {

            System.out.println(ANSI_RED + "Subtractor locked: " + i);
            this.lock.lock();
            this.nums.num -= 1;
            this.lock.unlock();
            System.out.println(ANSI_GREEN + "Subtractor un-locked: " + i);
        }
        return null;
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
}
