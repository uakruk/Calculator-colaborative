package com.hillel.javaintroduction.lesson5.pavelkim;

import java.util.Arrays;

public class Fibonacci {

    public static void main(String [] args) {
        System.out.println(Arrays.toString(fibonacciMassive(10)));
        System.out.println(fibonacci(6));
        System.out.println( fibonacciRec(6));
    }

    public static int fibonacci (int index) {
        int fists = 0;
        int second = 1;
        int value = 0;
        for (int i = 0; i <= index; i++) {

            if (i < 2) {
                value = i;
            } else {
                value = second + fists;
                fists = second;
                second = value;
            }
        }
        return value;
    }

    public static int fibonacciRec (int index) {
        int value = 0;
        for (int i = 0; i <= index; i++) {

            if (i < 2) {
                value = i;
            } else {
                value = fibonacciRec(i-1) + fibonacciRec(i-2);
            }
        }
        return value;
    }

    public static int [] fibonacciMassive (int length) {
        int [] fibonacci = new int [length];
        for(int i=0; i<length; i++) {
            if (i<2) {
                fibonacci[i] = i;
            } else {
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
        }
        return fibonacci;
    }
}
