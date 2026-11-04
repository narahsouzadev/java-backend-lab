package io.github.narahsouzadev.calculators;
import java.util.Scanner;

public class ParityAndSignChecker {
    public static void run(Scanner scanner) {

        System.out.println("Enter a number: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            scanner.next(); // Consumes the invalid token to prevent an infinite loop
            return;
        }

        int number = scanner.nextInt();

        int module = number % 2;

        boolean parityCheck = module == 0; // true: even, false: odd
        String parity;

        if (parityCheck) {
            parity = "even";
        } else {
            parity = "odd";
        }

        boolean signCheck = number > 0; // true: positive, false: negative
        boolean neutralCheck = number == 0; // true: neutral
        String sign;

        if (neutralCheck) {
            sign = "neither positive nor negative.";
        } else if (signCheck) {
            sign = "positive.";
        } else {
            sign = "negative.";
        }

        System.out.println("The number entered is " + parity + " and is " + sign);
    }
}
