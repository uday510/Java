package Basics;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


    int num = 10_000_00_00;
    double num2 = 12e10;
    System.out.println(num2);

        System.out.println("""
    STR.%d
    """.formatted(num));

    }
    public static class Calculator {

        public int add(int a, int b) {
            return a + b;
        }
    }
}
