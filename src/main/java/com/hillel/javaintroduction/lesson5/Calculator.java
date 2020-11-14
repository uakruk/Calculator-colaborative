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

        double firstNumber = 0, secondNumber = 0;

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
                    System.out.println("Result = " + plus(firstNumber, secondNumber));
                    break;
                case MINUS:
                    System.out.println("Result = " + minus(firstNumber, secondNumber));
                    break;
                case DIVIDE:
                    System.out.println("Result = " + divide(firstNumber, secondNumber));
                    break;
                case MULTIPLY:
                    System.out.println("Result = " + multiply(firstNumber, secondNumber));
                    break;
                case MODULUS:
                    System.out.println("Result = " + modulus(firstNumber, secondNumber));
                    break;

                // and so on and so on
                default:
                    System.out.println("Aborting, unknown operation.");
            }
        } else {
            System.out.println("Result = " + signChange(firstNumber));
        }
    }
    public static double signChange(double a) {
        double resultBer;
        resultBer = -a;
        return resultBer;

    }
    public static double modulus(double a, double b){
        double resultMod;
        resultMod = a % b;
        return resultMod;
    }
    public static double plus (double a, double b){
        double resultPlus;
        resultPlus = a + b;
        return resultPlus;
    }
    public static double minus (double a, double b){
        double resultMinus;
        resultMinus = a - b;
        return resultMinus;
    }
    public static double divide (double a, double b){
        double resultDivide;
        resultDivide = a / b;
        return resultDivide;
    }
    public static double multiply (double a, double b){
        double resultMultiply;
        resultMultiply = a * b;
        return resultMultiply;
    }


}