import java.util.Iterator;
import java.util.LinkedList;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add("five");
        ll.add("six");
        ll.add("seven");
        ll.add("eight");
        ll.add("nine");
        ll.add("ten");

        printList(ll);
        ll.add("eleven");
        ll.add("twelve");
        System.out.println("-------");
        ll.add(0, "zero");
    }
    public static void printList(LinkedList<String> ll) {
        Iterator<String> i = ll.iterator();

        while(i.hasNext())
            System.out.println(i + " " + i.next());
    }
}
