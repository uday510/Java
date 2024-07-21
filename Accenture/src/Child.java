package Accenture.src;

public class Child extends Parent {
    protected int num = 10;
    protected int num1 = 20;

    public void play() {
        System.out.println("Parent Dancing");
    }

    public void sleep() {
        System.out.println("Parent sleeping");
    }
    public void fight() {
        System.out.println("Child fighting");
    }

    static protected void eat() {
        System.out.println("Child eating");
    }

    protected void fun(){
        System.out.println("C's fun");
    }

}
