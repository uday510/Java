public class Main {
    public static void main(String[] args) {

        int myValue = 1000000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
//        System.out.println("Integer Minimum Value" + myMinIntValue);
//        System.out.println("Integer Maximum Value" + myMaxIntValue);
//        System.out.println("Busted MAX value" + (myMaxIntValue + 1));
//        System.out.println("Busted MIN value" + (myMinIntValue - 1));
//        System.out.println(Byte.MIN_VALUE +" "+Byte.MAX_VALUE);
//        System.out.println(Byte.MIN_VALUE +" "+Byte.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE +", " + Long.MIN_VALUE);

//        BigInteger bigInteger1 = new BigInteger("123456789023456789345678");
//        BigInteger bigInteger2 = new BigInteger("987654398765432");

        /**
         * Primitive Types
         * byte -- 8 bits
         * short -- 16 bits
         * int -- 32 bits
         * long -- 64 bits
         */
        byte myByte = (byte)(Integer.MIN_VALUE / 2);
        System.out.println(myByte +" "+ Integer.MIN_VALUE / 2);
    }
}