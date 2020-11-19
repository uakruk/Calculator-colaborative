package com.hillel.javaintroduction.homework7;

public class Recursion1 {

    public static void printFibonacciNumbers(int upperBound) {

        int[] f = new int[upperBound];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < upperBound; ++i) {
            f[i] = f[i - 1] + f[i - 2];
        }
        for (int i = 0; i < upperBound; ++i) {
            System.out.print(f[i] + " ");
        }


        // Перевірка методу
    }
    public static void main (String args[]) {
        printFibonacciNumbers(10);
    }
}

