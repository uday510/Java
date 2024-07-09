public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

        Parent parent = new Child();

        System.out.println(parent.num);

        parent.eat();

        parent.fun();
    }
}