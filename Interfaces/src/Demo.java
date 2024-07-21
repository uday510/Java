class CustomException extends Exception {
    int code;
    public CustomException(String message, int code) {
        super(message);
        this.code = code;
    }
}

public class Demo {
    public static void main(String[] args) {

       int i = 9;

       int[] nums = new int[5];

       try {
         int val = 9/0;
           if (val == 0) {
               throw new ArithmeticException("Division by zero");
           }
       } catch (ArithmeticException | ArrayIndexOutOfBoundsException | ArrayStoreException e) {
           System.out.println("Error: " + e.getMessage());
       }

        System.out.println("Hello");

    }
}