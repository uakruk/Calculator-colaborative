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

        double result = 0;
        double firstNumber;
        double secondNumber = 0;
        boolean requiresSecondNumber = true;
        Operation operation = null;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the operation you want to perform:");

        String read = scanner.nextLine();
        char operationChar = read.charAt(0);


        System.out.println("Enter the first number: ");
        firstNumber = Double.parseDouble(scanner.nextLine());

        if (requiresSecondNumber) {
            System.out.println("Enter the second number: ");
            secondNumber = Double.parseDouble(scanner.nextLine());
        }

        switch (operationChar) {
            case '+':
                operation = Operation.PLUS;
//                result = plus(firstNumber, secondNumber);
                break;
            case '-':
                operation = Operation.MINUS;
//                result = minus(firstNumber, secondNumber);
                break;
            case '/':
                operation = Operation.DIVIDE;
//                result = divide(firstNumber,secondNumber);
                break;
            case '*':
                operation = Operation.MULTIPLY;
//                result = multiply(firstNumber,secondNumber);
                break;
            case '%':
                operation = Operation.MODULUS;
//                result = modules(firstNumber, secondNumber);
                break;
            case '^':
                operation = Operation.STEPEN;
                result = stepen(firstNumber, (int) secondNumber);
                break;
            case '~':
                operation = Operation.SIGN_CHANGE;
//                result = signChange(firstNumber);
                break;
            default:
                System.out.println("Unkonwn operation, aborting.");
                System.exit(0);
        }

        if (operation == Operation.SIGN_CHANGE) {
            requiresSecondNumber = false;
        }

        switch (operation) {
            default:
                System.out.println("Aborting");
        }

        System.out.println("Result = " + result);
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
}