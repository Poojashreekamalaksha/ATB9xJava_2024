package Task.task_18102024;

import java.util.Scanner;

public class Lab001_Calculator {
    public static void main(String[] args) {
        //Create a simple calculator
        // Performs addition, subtraction, multiplication, and division, modulus based on user input
        //Inputs :   num 1, num 2, +
        //Output :  num1+num2 → print information.
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number1");
        double num1 = sc1.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the number2");
        double num2 = sc2.nextDouble();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the operator");
        String operator1 = sc3.next();
        String operator = operator1.toLowerCase();
        switch (operator) {
            case "addition":
                System.out.println(num1 + num2);
                break;
            case "substraction":
                System.out.println(num1 - num2);
                break;
            case "division":
                System.out.println(num1 / num2);
                break;
            case "multiplication":
                System.out.println(num1 * num2);
                break;
            case "modulus":
                System.out.println(num1 % num2);
                break;
            default:
                break;


        }
    }


}