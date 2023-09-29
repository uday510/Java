public class Adder extends Thread {

    private final int a, b;

    public Adder(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public void run() {
        System.out.println(a+b);
    }
}