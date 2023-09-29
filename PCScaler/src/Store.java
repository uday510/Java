import java.util.ArrayList;
import java.util.List;

public class Store {
    private final int MAX_SIZE;
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    private final List<Object> items;

    Store(int size) {
        MAX_SIZE = size;
        this.items = new ArrayList<>();
    }

    public int getMaxSize() {
        return this.MAX_SIZE;
    }

    public List<Object> getItems() {
        return items;
    }

    public void addItem () {
        this.items.add(new Object());
        System.out.println(ANSI_GREEN + "Producer produced, SIZE: " + this.items.size());
    }

    public void removeItem() {
        this.items.remove(this.items.size() - 1);
        System.out.println(ANSI_RED + "Consumed consumed, SIZE: " + this.items.size());
    }

}
