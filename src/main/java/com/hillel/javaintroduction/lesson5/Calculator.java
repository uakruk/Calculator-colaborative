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
//                result = stepen(firstNumber, (int) secondNumber);
                break;
            case '~':
                operation = Operation.SIGN_CHANGE;
//                result = signChange(firstNumber);
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
                    //  sgseg
                    // and so on and so on
                    break;
                case STEPEN:
                    result = stepen(firstNumber, (int)secondNumber);
                default:
                    System.out.println("Aborting, unknown operation.");
            }
        } else {
            // call the signChange() method here
        }
            System.out.println(fibonachy(6));
    }

    public static double faktorial(double number) {
        if (number <= 1 ) {
            return 1;
        } else {
            int n = 1;
            for (int i = 2; number >= i; i++) {
                n = n * i;
            }
            return n;
        }
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

    public static int fibonachy(int index) {
        int [] array = new int [index+1];
        for(int i = 0 ; i <= index; i++) {
            System.out.println("I = " + i);
            if(i < 2) {
                array[i] = i;
            } else {
                array[i] = array[i-1] + array[i-2];
            }
        }
        return array[index];
    }

    public static int fibonachyRec(int index) {
        int fib = 0;
        if(index == 1) {
            return 0;
        } else if(index == 2) {
            return 1;
        } else  {
            for (int i = 2; i < index; i++) {
                fib = fibonachyRec(i) + fibonachyRec(i-1);
            }
            return fib;
        }
    }
}