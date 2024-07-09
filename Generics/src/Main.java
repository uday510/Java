import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//        String string = Generic.doSomething("Hello World!");
//        System.out.println(string);

         Container<Integer> container = new Container<>();
         container.value = 10;
         container.show();

    }
}

class Container<T extends Number> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass().getName());
    }
}

