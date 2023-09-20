public class Client {

    public static void main(String[] args) {
        HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();

        Thread thread1 = new Thread(helloWorldPrinter);
        thread1.start();
        System.out.println(Color.ANSI_RED + Thread.currentThread().getName().toUpperCase());
    }
}
