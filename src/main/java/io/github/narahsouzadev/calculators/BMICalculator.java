package io.github.narahsouzadev.calculators;
import java.util.Scanner;
import java.util.Locale;

public class BMICalculator {
    public static void run(Scanner scanner) {
        scanner.useLocale(Locale.US);

        String invalidInputMessage = "Invalid input. Please enter a valid number.";
        String invalidValueMessage = "The value entered must be greater than zero.";

        System.out.println("Body Mass Index (BMI)");
        double weight = 0;
        while (true) {
            System.out.println("Enter your weight in kilograms: ");

            if (scanner.hasNextDouble()) {
                weight = scanner.nextDouble();
                if (weight > 0) {
                    break;
                }
                System.out.println(invalidValueMessage);
            } else {
                System.out.println(invalidInputMessage);
                scanner.next();
            }

        }

        int height = 0;
        while (true) {
            System.out.println("Enter your height in centimeters: ");

            if (scanner.hasNextInt()) {
                height = scanner.nextInt();
                if (height > 0) {
                    break;
                }
                System.out.println(invalidValueMessage);
            } else {
                System.out.println(invalidInputMessage);
                scanner.next();
            }

        }
         double heightInMeters = height / 100.0;
         double bmi = weight / (heightInMeters * heightInMeters); // Body Mass Index

         System.out.printf(Locale.US,"Your BMI is %.2f%n", bmi);

         if (bmi < 18.5) {
            System.out.println("Below 18.5: Underweight.");
         } else if (bmi < 25.0) {
            System.out.println("Between 18.5 and 24.9: Normal weight.");
         } else if (bmi < 30.0) {
            System.out.println("Between 25.0 and 29.9: Overweight.");
         } else {
            System.out.println("30.0 or higher: Obesity.");
         }
    }
}
