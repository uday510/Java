import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Customer customer = new Customer("Microsoft", 23.09);
        Customer customer2;
        customer2 = customer;
        System.out.println("Balance for customer " + customer.getName()
         + " is " + customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(3);
        intList.add(4);

        System.out.println(intList);
    }
}