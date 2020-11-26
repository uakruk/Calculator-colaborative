package com.hillel.javaintroduction.homework7;

public class Recursion2 {
    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 2) + fibonacci(n - 1);
    }


    // Перевірка методу
    public static void main (String args[]) {
        int n = 3;
        System.out.println(fibonacci(n));
    }
}

