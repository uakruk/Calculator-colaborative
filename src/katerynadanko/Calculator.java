package katerynadanko;

import java.util.Scanner;

public class Calculator {

    enum Operation {
        PLUS,
        MINUS,
        MULTIPLY,
        DIVIDE,
        MODULUS,
        POW,
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
                operation = Operation.POW;
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
                case POW:
                    System.out.println("Result = " + pow(firstNumber, secondNumber));
                    break;

                    // and so on and so on
                default:
                    System.out.println("Aborting, unknown operation.");
                    break;
            }
        } else {
            System.out.println("Result = " + signChange(firstNumber));
            // call the signChange() method here
        }

//        System.out.println("Result = " + result);
    }

    public static double plus(double a, double b) {
        double resKD;
        resKD = a+b;
        return resKD;
    }
    public static double minus(double a, double b) {
        double resKD;
        resKD = a-b;
        return resKD;
    }
    public static double multiply(double a, double b) {
        double resKD;
        resKD = a*b;
        return resKD;
    }
    public static double divide(double a, double b) {
        double resKD;
        resKD = a/b;
        return resKD;
    }
    public static double modulus(double a, double b) {
        double resKD;
        resKD = a%b;
        return resKD;
    }
    public static double pow(double a, double b) {
        double resKD = 1;
        for (int i = 0; i < b; i++){
            resKD = resKD * a;
        }
        return resKD;
    }
    public static double signChange(double a) {
        double resKD;
            resKD = -a;
            return resKD;
    }

}
