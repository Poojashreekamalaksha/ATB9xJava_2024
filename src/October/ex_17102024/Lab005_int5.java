package October.ex_17102024;

import java.util.Scanner;

public class Lab005_int5 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number1");
        int num1=sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the number2");
        int num2=sc2.nextInt();
        if(num1>num2)
        {
            System.out.println("Number1 is greater");
        } else if (num2>num1) {
            System.out.println("Number2 is greater");

        }
        else
        {
            System.out.println("Both are equal68");
        }
    }
}
