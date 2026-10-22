package io.github.narahsouzadev.coinflip;
import java.util.Random;
import java.util.Scanner;

public class CoinFlip {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner (System.in);

        String dividingLine = "----------------------";

        System.out.println(dividingLine);
        System.out.println("|     COIN FLIP      |");
        System.out.println(dividingLine);

        while (true) {
            boolean isHeads = random.nextBoolean();

            System.out.println(dividingLine);
            System.out.println(" Flipping the coin...");
            System.out.println(dividingLine);

            if (isHeads) {
                System.out.println("|  Result: \uD83E\uDE99 HEADS  |");
            } else {
                System.out.println("|  Result: \uD83E\uDE99 TAILS  |");
            }
            System.out.println(dividingLine);
            System.out.println(dividingLine);
            System.out.println(" Flip the coin again? ");
            System.out.println("    1.YES | 2.NO ");
            System.out.println(dividingLine);

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid option! ⚠");
                scanner.close();
                return;
            }

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    break;
                case 2:
                    System.out.println(dividingLine);
                    System.out.println("       Goodbye!");
                    System.out.println(dividingLine);
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option! ⚠");
                    scanner.close();
                    return;
            }
        }
    }
}
