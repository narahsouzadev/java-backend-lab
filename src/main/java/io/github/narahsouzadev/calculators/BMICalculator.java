package io.github.narahsouzadev.calculators;
import java.util.Scanner;
import java.util.Locale;

public class BMICalculator {
    public static void run(Scanner scanner) {
        scanner.useLocale(Locale.US);

        String invalidInputMessage = "Invalid input. Please enter a valid number.";
        String invalidValueMessage = "The value entered must be greater than zero.";

        System.out.println("Body Mass Index (BMI)");

        System.out.println("Enter your weight in kilograms: ");

        if (!scanner.hasNextDouble()) {
            System.out.println(invalidInputMessage);
            scanner.next();
            return;
        }

        double weight = scanner.nextDouble();

        if (weight <=0) {
            System.out.println(invalidValueMessage);
            return;
        }

        System.out.println("Enter your height in centimeters: ");

        if (!scanner.hasNextInt()) {
            System.out.println(invalidInputMessage);
            scanner.next();
            return;
        }
        int height = scanner.nextInt();

         if (height <=0) {
            System.out.println(invalidValueMessage);
            return;
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
