import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        Adder adder = new Adder(x, y);

//        ScalerThread scalerThread = new ScalerThread(adder);
//
//        scalerThread.start();

    }
}