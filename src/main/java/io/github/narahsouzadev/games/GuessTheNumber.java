package io.github.narahsouzadev.games;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void run(Scanner scanner) {
        System.out.println("GUESS THE NUMBER");
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("Type '0' at any time to return to the main menu.");

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;

        boolean running = true;

        while (running) {
            System.out.print("\nEnter your guess: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input, try again.");
                scanner.next();
                continue;
            }

            int input = scanner.nextInt();
            scanner.nextLine(); // Consumes the remaining newline in the buffer

            if (input == 0) {
                System.out.println("Exiting Guess The Number.");
                running = false;
            } else if (input == randomNumber) {
                System.out.println("\uD83C\uDF89 Congratulations, you guessed it right!");
                running = false;
            } else if (input < randomNumber) {
                System.out.println("Too low, try a higher number.");
            } else {
                System.out.println("Too high, try a lower number.");
            }
        }
    }
}
