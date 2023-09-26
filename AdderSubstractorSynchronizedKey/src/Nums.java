public class Nums {

    public int num;
    public Nums() { }
    public Nums(int num) {
        this.num = num;
    }

    public synchronized void increment(int num) {
        this.num += num;
    }
    public synchronized void decrement(int num) {
        this.num -= num;
    }

    public int getNum() {
        return this.num;
    }

}
