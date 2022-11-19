public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        System.out.println(digitSum(120));
    }

    private static int digitSum(int num) {
        if(num < 10) return -1;
        int digitSum = 0;
//        digitSum += num % 10;
//        digitSum += num / 10;

        while(num > 0) {
              // extract least significant digit
            int digit = num % 10;
            digitSum += digit;

            //drop the least-significant digit.
            num /= 10;
        }
        return digitSum;
    }
    private static int numberPalindrome(int num) {

    }
}