package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Creating 3 variables, initialized at 0
        float floatVariable = 0.0f;
        double doubleVariable = 0.0;
        BigDecimal bigDecimalVariable = BigDecimal.ZERO;

        // Looping 10 times, adding 10 cents
        System.out.println("\n=== Looping 10 times, 10 cents++ ===");
        for (int i = 1; i <= 10; i++) {
            floatVariable += 0.10f;
            doubleVariable += 0.10;
            bigDecimalVariable = bigDecimalVariable.add(new BigDecimal("0.10"));

            System.out.println("Iteration " + i);
            System.out.println("Float: " + floatVariable);
            System.out.println("Double: " + doubleVariable);
            System.out.println("BigDecimal: " + bigDecimalVariable);
            System.out.println();
        }

        // Setting variables back to 0
        floatVariable = 0.0f;
        doubleVariable = 0.0;
        bigDecimalVariable = BigDecimal.ZERO;
        System.out.println("\n=== Looping 1000 times, 19.99++ ===");
        // Looping 1000 times, adding 19.99
        for(int i = 0; i < 1000; i++) {
            floatVariable += 19.99f;
            doubleVariable += 19.99;
            bigDecimalVariable = bigDecimalVariable.add(new BigDecimal("19.99"));

        }
        System.out.println("Float(1000x): " + floatVariable);
        System.out.println("Double(1000x): " + doubleVariable);
        System.out.println("BigDecimal(1000x): " + bigDecimalVariable);
        System.out.println();
    }
}
