package io.github.narahsouzadev.tallycounter;
import java.util.Scanner;

public class TallyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("=== TALLY COUNTER ===");
        System.out.println("Press ENTER to increment or type 'q' to quit.");

        while (true) {
            System.out.println("Current count: " + count);
            System.out.print("> ");
            // scanner.nextLine() captures everything typed before the Enter key is pressed.
            // If the user only presses Enter, 'input' stores an empty String ("").
            String input = scanner.nextLine();

            // equalsIgnoreCase checks if 'input' matches "q" or "Q" regardless of letter casing.
            if (input.equalsIgnoreCase("q")) {
                System.out.println("Exiting counter. Final count: " + count);
                break;
            }

            // At this point, any input other than 'q' ends up reaching this line.
            count += 1;
        }

        scanner.close();
    }
}
