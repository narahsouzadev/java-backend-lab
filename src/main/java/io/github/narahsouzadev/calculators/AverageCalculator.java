package io.github.narahsouzadev.calculators;
import java.util.Scanner;

public class AverageCalculator {
    public static void run(Scanner scanner) {
        System.out.println("Average Calculator");

        while (true) {
            System.out.println("\nWhat do you want to calculate?");
            System.out.println("1 - Arithmetic Mean");
            System.out.println("2 - Weighted Average");
            System.out.println("Enter the option number or '0' to return.");

            // Select operation
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid command, try again.");
                scanner.next(); // Consumes the invalid token to prevent an infinite loop
                continue;
            }

            int input = scanner.nextInt();

            if (input == 0) {
                System.out.println("Returning to main menu...");
                return;
            }

            switch (input) {
                case 1 -> System.out.println("\nCalculation of Arithmetic Mean");
                case 2 -> System.out.println("\nCalculation of Weighted Average");
                default -> System.out.println("\nInvalid option, try again.");
            }
        }
    }
}
