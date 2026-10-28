package io.github.narahsouzadev.games;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nWelcome to Java CLI Games!");

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("What do you want to play?");
            System.out.println("1 - Coin Flip");
            System.out.println("2 - Dice Roller");
            System.out.println("3 - Guess The Number");
            System.out.println("Enter the game number or '0' to exit: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid command, try again.");
                scanner.close();
                return;
            }

            int input = scanner.nextInt();
            scanner.nextLine();

            switch (input) {
                case 1 -> CoinFlip.run(scanner);
                case 2 -> DiceRoller.run(scanner);
                case 3 -> GuessTheNumber.run(scanner);
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
