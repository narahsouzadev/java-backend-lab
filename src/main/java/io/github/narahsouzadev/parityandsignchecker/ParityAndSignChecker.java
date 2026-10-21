package io.github.narahsouzadev.parityandsignchecker;
import java.util.Scanner;

public class ParityAndSignChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        double number = scanner.nextDouble();

        double module = number % 2;

        if (module == 0 && number > 0) {
            System.out.println("The number entered is even.");
        } else {
            System.out.println("The number entered is odd.");
        }
    }
}
