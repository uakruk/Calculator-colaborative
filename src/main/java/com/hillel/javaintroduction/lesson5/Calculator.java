package com.hillel.javaintroduction.lesson5;

public class Calculator {

    public static void main(String[] args) {
    }

    public static double divide(double a, double b){
        double resultAn = 0;
        resultAn = a / b;

        return resultAn;
    }

    public static double multiply(double a, double b) {
        double resultAn = 0;
        resultAn = a * b;

        return resultAn;
    }
    public static double modules(double a, double b) {
        double psresult;

        psresult = a % b;
        System.out.println(psresult);
        return psresult;
    }

    public static double stepen(double number, int degree) {
        if (degree > 0) {
            for (int i = 1; i < degree; i++) {
                number = number * number;
            }
        } else {
            number = 1;
        }
            return number;
    }

    public static double signChange(double signChange){
      signChange = 0;
      double resultBer = - signChange;
      System.out.println(resultBer);
      return resultBer;


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