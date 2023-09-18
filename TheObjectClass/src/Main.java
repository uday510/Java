import java.sql.Struct;

public class Main extends Object {

    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Student max = new Student("Max", 21);
        System.out.println(max.toString());


    }
}

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
//
//    @Override
//    public String toString() {
//        return super.toString();
//    }


    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}



