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
                case 1 -> {
                    System.out.println("\nHow many values do you want to calculate the average of?");

                    if (!scanner.hasNextInt()) {
                        System.out.println("Invalid input, please try again.");
                        scanner.next(); // Consumes the invalid token to prevent an infinite loop
                        continue;
                    }

                    int valuesQuantity = scanner.nextInt();

                    if (valuesQuantity < 2) {
                        System.out.println("The quantity must be greater than one.");
                        continue;
                    }

                    double valuesSum = 0.0;

                    for (int i = 1; i <= valuesQuantity; i++) {
                        System.out.println("Enter the " + i + "º value: ");

                        if (scanner.hasNextDouble()) {
                            double nextValue = scanner.nextDouble();
                            valuesSum += nextValue;
                        } else {
                            scanner.next();
                            System.out.println("Invalid input, please try again.");
                            break;
                        }
                    }
                    double average = valuesSum / valuesQuantity;
                    System.out.println("Average: " + average);
                }
                case 2 -> System.out.println("\nCalculation of Weighted Average");
                default -> System.out.println("\nInvalid option, try again.");
            }


        }
    }
}
