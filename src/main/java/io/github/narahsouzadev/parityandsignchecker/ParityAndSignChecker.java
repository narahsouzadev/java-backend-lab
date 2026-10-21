package io.github.narahsouzadev.parityandsignchecker;
import java.util.Scanner;

public class ParityAndSignChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

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
            sign = "neutral.";
        } else if (signCheck) {
            sign = "positive.";
        } else {
            sign = "negative.";
        }

        System.out.println("The number entered is " + parity + " and " + sign);
        scanner.close();
    }
}
