import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        for (int i = 10; i <= 50; i+=10) {
            set.add(i);
        }

        System.out.print("Hash Set ");
        for (Integer val : set) {
            System.out.print(val + " ");
        }
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        for (int i = 10; i <= 50; i+=10) {
            linkedHashSet.add(i);
        }

        System.out.println();
        System.out.print("Linked HashSet ");
        for (Integer val : linkedHashSet) {
            System.out.print(val + " ");
        }


    }
}
