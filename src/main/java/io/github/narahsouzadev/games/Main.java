package io.github.narahsouzadev.games;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Java CLI Games!");
        System.out.println("What do you want to play?");
        System.out.println("1 - Coin Flip");
        System.out.println("2 - Dice Roller");
        System.out.println("3 - Guess The Number");
        System.out.println("Enter the game number: ");

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        switch (input) {
            case 1 -> CoinFlip.run();
            case 2 -> DiceRoller.run();
            case 3 -> System.out.println("3 - Guess The Number");
            default -> System.out.println("Invalid option! ⚠");
        }

        scanner.close();
    }
}
