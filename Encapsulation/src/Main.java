public class Main {
    /*
    TODO: Encapsulation is the concept of bundling data (attributes) and methods (functions) that operate on that data into a single unit,
          known as a class. It restricts access to some of an object's components while exposing others
     */



    /*
    TODO: In this example, the balance attribute is encapsulated within the BankAccount class.
          Users cannot directly modify the balance; they have to use the deposit() and withdraw() methods.
     */
    private static class BankAccount {
        private double balance;

        public BankAccount (double initialFunding) {
            balance = initialFunding;
        }
        public void deposit (double amount) {
            if (amount > 0) {
                balance += amount;
            }
        }
        public void withDraw(double amount) {
            if (amount > 0 && balance >= amount) {
                balance -= amount;
            }
        }
        public double getBalance() {
            return balance;
        }
    }
}
