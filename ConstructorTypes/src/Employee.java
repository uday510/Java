public class Employee {
    int id;
    String name;
    String dept;

    public Employee(int id) {
        this.id = id;
        this.name = null;
        this.dept = null;

    }

    public Employee(int id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }
}
