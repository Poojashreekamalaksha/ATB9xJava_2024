package Task.task_17102024;

import java.util.Scanner;

public class Lab002_Traingle {
    public static void main(String[] args) {
        // Write a program that classifies a triangle based on its side lengths
        // Given three input values representing the lengths of the sides-> Length(3 input)
        //determine if the triangle is equilateral (all sides are equal), (A=B=C)
        // isosceles (exactly two sides are equal), or (A=B OR B=C OR C=A)
        // scalene (no sides are equal). (A!=B!=C)
        // Use an if-else statement to classify the triangle.
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the length of the side 1");
        double side1 = sc1.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the length of the side 2");
        double side2 = sc2.nextDouble();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the length of the side 3");
        double side3 = sc3.nextDouble();

        if (side1 == side2 && side2 == side3) {
            System.out.println("It is equilateral traingle");
        } else if (side1==side2 || side2==side3|| side3==side1) {
            System.out.println("It is isosceles traingle");
        }
        else
        {
            System.out.println("It is scalene");
        }
    }
}
