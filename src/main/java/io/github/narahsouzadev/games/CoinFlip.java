package io.github.narahsouzadev.games;
import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void run() {

        Random random = new Random();
        Scanner scanner = new Scanner (System.in);

        System.out.println("COIN FLIP");
        System.out.println("Press 'Enter' to roll de dice.");
        System.out.println("Type 'q' and press 'Enter' to quit.");

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
            } else if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting Coin Flip");
                running = false;
            } else {
                System.out.println("Invalid command, try again.");
            }
        }
    }
}
