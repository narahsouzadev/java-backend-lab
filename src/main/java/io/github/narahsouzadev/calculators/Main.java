package io.github.narahsouzadev.calculators;
import io.github.narahsouzadev.games.CoinFlip;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Java CLI Calculators!");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWhat do you want to calculate?");
            System.out.println("1 - Body Mass Index (BMI)");
            System.out.println("Enter the option number or '0' to exit: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid command, try again.");
                scanner.next(); // Consumes the invalid token to prevent an infinite loop
                continue;
            }

            int input = scanner.nextInt();
            scanner.nextLine(); // Consumes the remaining newline in the buffer

            switch (input) {
                case 1 -> BMICalculator.run(scanner);
                case 0 -> {
                    System.out.println("Goodbye!");
                    scanner.close();
                    running = false;
                }
                default -> System.out.println("Invalid command, try again.");
            }
        }
    }
}
