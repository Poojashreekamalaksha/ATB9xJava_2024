package October.ex_14102024;

public class TypeCasting_Lab002 {
    public static void main(String[] args)
    {
        int heightInInches = 70;
        // Convert height to feet
        double heightInFeet = heightInInches / 12.0;//converting int to double

        System.out.printf("Height: %.2f feet%n", heightInFeet);
    }

}


