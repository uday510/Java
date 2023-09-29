public class TableCreator extends Thread {


    int num;

    TableCreator (int num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; ++i) {
            System.out.println(this.num +" times " + i + " is " + i * this.num);
        }
    }
}
