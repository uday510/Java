import java.util.concurrent.Callable;

public class Car implements Callable<Car> {
    public int Price, Speed;

    public int compareTo(Car otherCar) {
        return Integer.compare(this.Price, otherCar.Price);
    }

    @Override
    public Car call() throws Exception {
        return null;
    }
}
