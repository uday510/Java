import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    private final Nums nums;

    Subtractor(Nums num) {
        this.nums = num;
    }

    public Void call() {
        for (int i = 1; i <= 1000; ++i) {
            this.nums.num -= 1;
        }
        return null;
    }
}
