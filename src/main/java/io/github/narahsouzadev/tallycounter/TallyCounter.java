package io.github.narahsouzadev.tallycounter;
import java.util.Scanner;

public class TallyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("=======================================");
        System.out.println("TALLY COUNTER");
        System.out.println("=======================================");

        System.out.println("INSTRUCTIONS:");
        System.out.println("Press ENTER to increment.");
        System.out.println("Type '-' and press ENTER to decrement.");
        System.out.println("Type 'r' and press ENTER to reset.");
        System.out.println("Type 'q' and press ENTER to quit.");
        System.out.println("=======================================");

        while (true) {
            System.out.println("Current count: " + count);
            System.out.println("=======================================");
            System.out.print("> ");
            // scanner.nextLine() captures everything typed before the Enter key is pressed.
            // If the user only presses Enter, 'input' stores an empty String ("").
            String input = scanner.nextLine();

            if (input.isEmpty()) {
                count += 1;
            } else if (input.equals("-")) {
                count -= 1;
            } else if (input.equalsIgnoreCase("r")) {
                System.out.println("The counter has been reset.");
                count = 0;
            } else if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting counter. Final count: " + count);
                break;
            } else {
                System.out.println("Invalid command, try again.");
            }
        }

        scanner.close();
    }
}
