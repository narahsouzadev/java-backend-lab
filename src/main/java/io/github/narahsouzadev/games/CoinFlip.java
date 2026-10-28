package io.github.narahsouzadev.games;
import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void run() {

        Random random = new Random();
        Scanner scanner = new Scanner (System.in);

        System.out.println("COIN FLIP");

        while (true) {
            boolean isHeads = random.nextBoolean();

            if (isHeads) {
                System.out.println("Result: \uD83E\uDE99 HEADS");
            } else {
                System.out.println("Result: \uD83E\uDE99 TAILS");
            }

            System.out.println("Flip the coin again? ");
            System.out.println("1 - Yes");
            System.out.println("2 - No");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid option! ⚠");
                return;
            }

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    break;
                case 2:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option! ⚠");
                    return;
            }
        }
    }
}
