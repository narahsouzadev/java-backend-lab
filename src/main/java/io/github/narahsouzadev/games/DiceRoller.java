package io.github.narahsouzadev.games;
import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void run() {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("DICE ROLLER");
        System.out.println("Press 'Enter' to roll de dice");

        String input = scanner.nextLine();

        if (input.isEmpty()) {
            int dice = random.nextInt(6);
            int diceResult = dice + 1;

            System.out.println("Result: " + diceResult + " \uD83C\uDFB2");
        } else {
            System.out.println("Invalid option! ⚠");
        }
        scanner.close();
    }
}
