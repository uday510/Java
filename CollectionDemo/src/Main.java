import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((a, b) -> a.i - b.i);

        priorityQueue.offer(new Pair('a', 10));
        priorityQueue.offer(new Pair('b', 10));
        priorityQueue.offer(new Pair('a', 0));
        priorityQueue.offer(new Pair('c', 2));

        while (!priorityQueue.isEmpty()) {
            Pair p = priorityQueue.poll();

            System.out.println(p.c  + " " + p.i);
        }


        System.out.println(priorityQueue);

    }

    static class Pair {
        char c;
        int i;

        Pair(char c, int i) {
            this.c = c;
            this.i = i;
        }
    }

}

