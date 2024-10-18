package Task.task_17102024;

import java.util.Scanner;

public class Lab001_GradeCalculator {
    public static void main(String[] args) {
        // Grade Calculator:
        // Write a program that calculates and displays the letter grade
        // for a given numerical score (e.g., A, B, C, D, or F)
        // based on the following grading scale:
        //
        // A: 90-100
        // B: 80-89
        // C: 70-79
        // D: 60-69
        // F: 0-59

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int marks = sc.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered. Please enter a value between 0 and 100.");
        } else if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 70) {
            System.out.println("Grade C");
        } else if (marks >= 60) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");

            sc.close();
        }
    }
}
