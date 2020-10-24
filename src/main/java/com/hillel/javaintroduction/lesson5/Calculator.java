package com.hillel.javaintroduction.lesson5;

public class Calculator {

    public static void main(String[] args) {
    }

    public static double stepen(double number, int degree) {
        if (degree > 0) {
            for (int i = 1; i < degree; i++) {
                number = number * number;
            }
        } else {
            number = 1;
        }
        System.out.println(number);

        return number;
    }

    public static double plus(double a, double b) {

        return a + b;
    }

    public static double minus(double a, double b) {

        double resultKrol = 0;
        resultKrol = a - b;
        return resultKrol;
    }
}