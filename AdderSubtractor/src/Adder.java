import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {
    private final Nums num;

    Adder(Nums num) {
        this.num = num;
    }

    public Void call() {
        for (int i = 1; i <= 1000; ++i) {
            this.num.num += 1;
        }

        return null;
    }
}
