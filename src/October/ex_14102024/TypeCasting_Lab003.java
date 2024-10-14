package October.ex_14102024;

public class TypeCasting_Lab003 {
    public static void main(String[] args)
    {
        byte food = 120;
        short transportation = 150;
        int rent = 1200;
        long utilities = 300;
        float entertainment = 100.5f;
        double totalExpenses = food + transportation + rent + utilities + entertainment;

        System.out.println("Total Monthly Expenses:"+ totalExpenses);
    }
}
