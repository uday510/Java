public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        Account bobsAccount = new Account(
                "12345",
                0.00,
                "Bob Brown",
                "myemail@bob.com",
                "(087) 123-4567"
        );
//        System.out.println(bobsAccount.getCustomerName());
        VipPerson person1 = new VipPerson();
        System.out.println(person1.getName());

        VipPerson person2 = new VipPerson("Bob", 2.50);
        System.out.println(person2.getName());

        VipPerson person3 = new VipPerson("Tim", 100.00, "tim@email.com");
    }

}