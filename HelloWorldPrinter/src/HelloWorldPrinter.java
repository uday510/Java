public class HelloWorldPrinter implements Runnable {

    public void doSomething() {
        System.out.println(Color.ANSI_BLUE + "doSomething() "  + Thread.currentThread().getName().toUpperCase());
    }
    public void run() {
        System.out.println(Color.ANSI_PURPLE + "run() " + Thread.currentThread().getName().toUpperCase());
        doSomething();
    }
}
