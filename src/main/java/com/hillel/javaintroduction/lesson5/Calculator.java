package com.hillel.javaintroduction.lesson5;

import java.util.Scanner;

public class Calculator {

    enum Operation {
        PLUS,
        MINUS,
        MULTIPLY,
        DIVIDE,
        MODULUS,
        STEPEN,
        SIGN_CHANGE;
    }

    public static void main(String[] args) {

        Operation operation = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operation you want to perform:");

        String read = scanner.nextLine();
        char operationChar = read.charAt(0);

        switch (operationChar) {
            case '+':
                operation = Operation.PLUS;
                break;
            case '-':
                operation = Operation.MINUS;
                break;
            case '/':
                operation = Operation.DIVIDE;
                break;
            case '*':
                operation = Operation.MULTIPLY;
                break;
            case '%':
                operation = Operation.MODULUS;
                break;
            case '^':
                operation = Operation.STEPEN;
                break;
            case '~':
                operation = Operation.SIGN_CHANGE;
                break;
            default:
                System.out.println("Unkonwn operation, aborting.");
                System.exit(0);
        }

        double firstNumber, secondNumber;

        boolean requiresSecondNumber = true;
        if (operation == Operation.SIGN_CHANGE) {
            requiresSecondNumber = false;
        }

        System.out.println("Enter the first number: ");
        firstNumber = Double.parseDouble(scanner.nextLine());

        double result = 0;

        if (requiresSecondNumber) {
            System.out.println("Enter the second number: ");
            secondNumber = Double.parseDouble(scanner.nextLine());

            switch (operation) {
                // your operations
                case PLUS:
                    // and so on and so on
                default:
                    System.out.println("Aborting, unknown operation.");
            }
        } else {
            // call the signChange() method here
        }

        System.out.println("Result = " + result);

    }
    public  static double signChange(double signChange) {
        signChange = 0;
        double resultBer = -signChange;
        System.out.println(resultBer);
        return resultBer;

    }
    public static double modulus(double a, double b){
        double resultMod = a % b;
        System.out.println(resultMod);
        return resultMod;
    }
    public static double minus (double a, double b) {

        double resultKrol = 0;
        resultKrol = a - b;
        return resultKrol;
    }
    public static double plus (double a, double b){
        double resultViktor = 0;
        resultViktor = a + b;
        return resultViktor;
    }
  }



