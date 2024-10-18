package Task.task_18102024;

import java.util.Scanner;

public class Lab003_Convertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter conversion option ");
        System.out.println("1-Kilometers to miles ");
        System.out.println("2-Celsius to Fahrenheit ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Scanner km = new Scanner(System.in);
                System.out.println("Enter the Killometer ");
                double km1 = km.nextDouble();
                System.out.println("The Killometers in miles is " + (km1 * 0.621371));
                break;
            case 2:
                Scanner cs = new Scanner(System.in);
                System.out.println("Enter the celsius ");
                double cs1 = cs.nextDouble();
                System.out.println("The Celsius in Fahrenheit is " + ((cs1 * 1.8) + 32));
                break;
            default:
                System.out.println("Invalid input provided");
                break;
            // Write a program that converts between different units
            // (e.g., kilometers to miles, Celsius to Fahrenheit) based on user selection using a switch statement.

        }
    }
}
