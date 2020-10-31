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
                case MULTIPLY:
                    public static double multiply(double a, double b) {
                    double dbResult = 0;
                    dbResult = a * b;

                    return dbResult;
                }
                case DIVIDE:
                    public static double divide(double a, double b) {
                    double resultAn = 0;
                    resultAn = a / b;

                    return resultAn;
                }
                default:
                    System.out.println("Aborting, unknown operation.");
            }
        } else {
            case SIGN_CHANGE:
               public static double signChange(double a) {
                   double dbResult = 0;
                   dbResult = -a;

                   return dbResult;
            }
        }

        System.out.println("Result = " + result);
    }




}
