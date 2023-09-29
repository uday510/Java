import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        for (int i = 1; i <= num; ++i) {

           TableCreator tableCreator = new TableCreator(num);

            ScalerThread scalerThread = new ScalerThread(tableCreator);

            scalerThread.start();
        }
    }
}
