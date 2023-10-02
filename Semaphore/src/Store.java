import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

public class Store {
    private final int MAX_SIZE;
    public static final String ANSI_GREEN = "\u001B[32m", ANSI_RED = "\u001B[31m";
    private final ConcurrentLinkedDeque<Object> items;

    Store(int size) {
        MAX_SIZE = size;
        this.items = new ConcurrentLinkedDeque<>();
    }

    public int getMaxSize() {
        return this.MAX_SIZE;
    }

    public Object getItems() {
        return items;
    }

    public void addItem () {
        this.items.add( new Object());
        System.out.println(ANSI_GREEN + "Producer produced, CURR_SIZE " + this.items.size());
    }

    public void removeItem() {
        this.items.remove();
        System.out.println(ANSI_RED + "Consumed consumed, CURR_SIZE " + this.items.size());
    }
}
