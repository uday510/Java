import java.util.concurrent.atomic.AtomicInteger;

public class Nums {

    public int num;
    public AtomicInteger atomicInteger = new AtomicInteger(0);

    public Nums() { }
    public Nums(int num) {
        this.num = num;
        this.atomicInteger = new AtomicInteger(num);
    }

}
