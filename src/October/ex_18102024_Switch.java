package October;

import java.util.Scanner;

public class ex_18102024_Switch {
    public static void main(String[] args) {
        //Days: 1-7
        //1: Monday
        //2: Tuesday
        //... 7:Friday
        //day <0 || day>7 : Invalid day
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc1.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("The day is invalid");
                break;


        }


    }
}

