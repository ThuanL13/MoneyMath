package com.pluralsight;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // Creating 3 variables, initialized at 0
        float floatVariable = 0.0f;
        double doubleVariable = 0.0;
        BigDecimal bigDecimalVariable = BigDecimal.ZERO;

        // Looping 10 times, adding 10 cents
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
    }
}
