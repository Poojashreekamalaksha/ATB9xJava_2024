package October.ex_14102024;

public class TypeCasting_Lab006 {
    public static void main(String[] args)
    {
        int totalScore=140;
        byte Marks=(byte) totalScore;//int to byte
        System.out.println("Total Score is:"+ Marks);
        double d = 9.99;
        int i = (int) d; // double to int
        long l = (long) d; // double to long
        float f = (float) d; // double to float

        System.out.println("Explicit Casting:");
        System.out.println("double to int: " + i);
        System.out.println("double to long: " + l);
        System.out.println("double to float: " + f);
    }
}

