import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student {

    int id;
    int age;
    String name;
    double psp;

    public Student(int id, int age, String name, double psp) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.psp = psp;
    }

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(List.of(
             new Student(1, 2, "abcd", 75),
             new Student(2, 3, "efgh", 76),
             new Student(3, 4, "ijkl", 77)
        ));

        Collections.sort(studentList, (a, b) -> a.age - b.age);
    }
}
