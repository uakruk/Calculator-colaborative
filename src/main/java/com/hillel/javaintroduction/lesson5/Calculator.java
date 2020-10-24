package com.hillel.javaintroduction.lesson5;

public class Calculator {

    public static void main(String[] args) {
        stepen(3, 2);
        stepen(3, 1);
        stepen(2,3);
        stepen(3,0);
        stepen(3, -1);

    }

    public static double stepen(double number, int degree) {
        if (degree > 0) {
            for (int i = 1; i < degree; i++) {
                number = number * number;
            }
        } else {
            number = 0;
        }
        System.out.println(number);
        return number;
    }
}
