import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private final Nums num;
    private final Lock lock;

    Adder(Nums num, Lock lock) {
        this.num = num;
        this.lock = lock;
    }

    public Void call() {
        for (int i = 1; i <= 10000; ++i) {
            this.num.atomicInteger.addAndGet(i);
        }

        return null;
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

}


