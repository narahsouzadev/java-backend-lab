package io.github.narahsouzadev.bmicalculator;
import java.util.Scanner;
import java.util.Locale;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        String dividingLine = "============================================";
        String invalidInputMessage = "Invalid input. Please enter a valid number.";
        String invalidValueMessage = "The value entered must be greater than zero.";

        System.out.println(dividingLine);
        System.out.println("===== BODY MASS INDEX (BMI) CALCULATOR =====");
        System.out.println(dividingLine);

        System.out.println("Enter your weight in kilograms: ");

        if (!scanner.hasNextDouble()) {
            System.out.println(invalidInputMessage);
            System.out.println(dividingLine);
            scanner.close();
            return;
        }

        double weight = scanner.nextDouble();
        System.out.println(dividingLine);

        if (weight <=0) {
            System.out.println(invalidValueMessage);
            System.out.println(dividingLine);
            scanner.close();
            return;
        }

        System.out.println("Enter your height in centimeters: ");

        if (!scanner.hasNextInt()) {
            System.out.println(invalidInputMessage);
            System.out.println(dividingLine);
            scanner.close();
            return;
        }
        int height = scanner.nextInt();
        System.out.println(dividingLine);

         if (height <=0) {
            System.out.println(invalidValueMessage);
            System.out.println(dividingLine);
            scanner.close();
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

        System.out.println(dividingLine);

         scanner.close();
    }
}
