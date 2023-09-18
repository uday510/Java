import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
////        System.out.println("Hello world!");
//
//        String bulletIt = "Print a Bulleted List: \n" +
//                "\t\t\t\t\t\t \u2022  First Point \n" +
//                "\t\t\t\t\t\t \u2022  Sub Point";
//
//        System.out.println(bulletIt);
//
//        System.out.println(" _ _ _ _ _ _ _ _ _ _ _  _  _  _  _ ");
//
//        String textBlock = """
//                Print a Bulleted List:
//                                        \u2022 First Point
//                                        \u2022 Sub Point""";
//
//        System.out.println(textBlock);
//
//        System.out.println(" _ _ _ _ _ _ _ _ _ _ _  _  _  _  _ ");
//
//
//        int age = 35;
//        System.out.printf("Your age is %d\n", age);
//
//        System.out.println(" _ _ _ _ _ _ _ _ _ _ _  _  _  _  _ ");
//
//
//        int yearOfBirth = 2023 - age;
//        System.out.printf("Age= %d, Birth year = %d", age, yearOfBirth);
//
//        System.out.println(" _ _ _ _ _ _ _ _ _ _ _  _  _  _  _ ");
//        LocalTime time = LocalTime.now(); // Current time
//
//
////        System.out.println(time);
//        System.out.println(" _ _ _ _ _ _ _ _ _ _ _  _  _  _  _ ");
//
//        for (int i = 1; i <= 100; i *= 10) {
//            System.out.printf("Printing %d %n", i);
//        }
//
//        String formattedString = String.format("Your age is %d", age);
//        System.out.println(formattedString);


        String str = "Hello World";

//        printInformation(str);
//        printInformation("");
        printInformation("    ");


//        System.out.printf("index of r = %d %n", str.indexOf('r'));
        System.out.printf("index of world = %d %n", str.indexOf("World"));

    }

    public static void printInformation(String string) {

        int length = string.length();
        System.out.printf("Length = %d %n", length);


        if (string.isBlank()) {
            System.out.println("String is blank");
            return;
        }
        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        System.out.printf("First char = %c %n", string.charAt(0));


        System.out.printf("Last char = %c %n", string.charAt(length - 1));



    }
}