import java.awt.*;
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
            this.lock.lock();
            System.out.println(ANSI_RED + "Adder locked: " + i);
            this.num.num += 1;
            this.lock.unlock();
            System.out.println(ANSI_GREEN + "Adder un-locked: " + i);
        }

        return null;
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

}


