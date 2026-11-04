package io.github.narahsouzadev.calculators;
import java.util.Scanner;

public class BasicOperations {
    public static void run(Scanner scanner) {
        System.out.println("Basic Calculator");

        while (true) {
            System.out.println("\nWhat do you want to calculate?");
            System.out.println("1 - Addition");
            System.out.println("2 - Subtraction");
            System.out.println("3 - Multiplication");
            System.out.println("4 - Division");
            System.out.println("Enter the option number or '0' to exit: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid command, try again.");
                scanner.next(); // Consumes the invalid token to prevent an infinite loop
                continue;
            }

            int input = scanner.nextInt();
            scanner.nextLine(); // Consumes the remaining newline in the buffer

            if (input == 0) {
                System.out.println("Returning to main menu...");
                return;
            }

            System.out.println("Enter the first number");

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid command, try again.");
                scanner.next(); // Consumes the invalid token to prevent an infinite loop
                continue;
            }

            double firstNumber = scanner.nextDouble();
            scanner.nextLine(); // Consumes the remaining newline in the buffer

            System.out.println("Enter the second number");

            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid command, try again.");
                scanner.next(); // Consumes the invalid token to prevent an infinite loop
                continue;
            }

            double secondNumber = scanner.nextDouble();
            scanner.nextLine(); // Consumes the remaining newline in the buffer

            double result = 0.0;

            switch (input) {
                case 1 -> {
                    result = firstNumber + secondNumber;
                    System.out.println("Result = " + result);
                }
                case 2 -> {
                    result = firstNumber - secondNumber;
                    System.out.println("Result = " + result);
                }
                case 3 -> {
                    result = firstNumber * secondNumber;
                    System.out.println("Result = " + result);
                }
                case 4 -> {
                    if (secondNumber == 0) {
                        System.out.println("Division by zero is impossible.");
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println("Result = " + result);
                    }
                }
                default -> System.out.println("Invalid command, try again.");
            }
        }
    }
}
