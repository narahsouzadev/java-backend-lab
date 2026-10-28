package io.github.narahsouzadev.games;
import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void run(Scanner scanner) {

        Random random = new Random();

        System.out.println("COIN FLIP");
        System.out.println("Press 'Enter' to flip the coin or '0' to return.");

        boolean running = true;

        while (running) {

            String input = scanner.nextLine();

            if (input.isEmpty()) {
                boolean isHeads = random.nextBoolean();

                if (isHeads) {
                    System.out.println("Result: HEADS \uD83E\uDE99");
                } else {
                    System.out.println("Result: TAILS \uD83E\uDE99 ");
                }
            } else if (input.equals("0")) {
                running = false;
            } else {
                System.out.println("Invalid command, try again.");
            }
        }
    }
}
