package io.github.narahsouzadev.bmicalculator;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("BODY MASS INDEX (BMI) CALCULATOR");
        System.out.println("================================");

        System.out.println("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();
        System.out.println("================================");

        System.out.println("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.println("================================");

        double bmi = weight / (height * height); // Body Mass Index

        System.out.printf("Your BMI is %.2f%n", bmi);

        if (bmi < 18.5) {
            System.out.println("Below 18.5: Underweight.");
        } else if (bmi < 25.0) {
            System.out.println("Between 18.5 and 24.9: Normal weight.");
        } else if (bmi < 30.0) {
            System.out.println("Between 25.0 and 29.9: Overweight.");
        } else {
            System.out.println("30.0 or higher: Obesity.");
        }

        System.out.println("================================");

        scanner.close();
    }
}
