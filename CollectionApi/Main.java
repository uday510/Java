package CollectionApi;

import java.util.*;
import java.util.stream.IntStream;

class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Student s) {
        return this.age - s.age;
    }
}


public class Main {
    public static void main(String[] args) {

        /*
         *  List
         *  Queue
         *  Stack
         *  Set
         *  Map
         *
         *  List - ArrayList, LinkedList, Vector
         *  Queue - PriorityQueue, ArrayDeque
         *  Stack - Stack
         *  Set - HashSet, LinkedHashSet, TreeSet
         *  Map - HashMap, LinkedHashMap, TreeMap
         */


//        Collection<Integer> collection = new ArrayList<>();
//
        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        System.out.println(list);


        list.sort((a, b) -> b - a);

        int[] arr = {1, 2, 3, 4, 5, 0};


       arr = IntStream.of(arr).boxed().sorted((a, b) -> b-a).mapToInt(i -> i).toArray();

        System.out.println(Arrays.toString(arr));


        Student s1 = new Student("A", 10);
        Student s2 = new Student("B", 20);
        Student s3 = new Student("C", 30);
        Student s4 = new Student("D", 40);


        List<Student> students = new ArrayList<>(List.of(s1, s2, s3, s4));

        System.out.println(students);
    }
}


