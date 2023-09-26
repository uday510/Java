import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private final Nums nums;

    Adder(Nums nums) {
        this.nums = nums;
    }

    public Void call() {
        for (int i = 1; i <= 10000; ++i) {

            {
                this.nums.increment(i);
            }
        }
        return null;
    }

    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";

}


