package October.ex_15102024_IncrementDecrement;

public class Lab002 {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a++ + a++ + ++a);//19
        System.out.println(a);//8
        //a++=5   a=6
        //a++=6   a=7
        //++a=8   a=8
    }
}

