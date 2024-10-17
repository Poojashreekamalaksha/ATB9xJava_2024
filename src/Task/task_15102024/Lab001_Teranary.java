package Task.task_15102024;

public class Lab001_Teranary {
    public static void main(String[] args)
    {
        int a, b,c;
        a=10;
        b=60;
        c=40;
        String result= a>b && a>c?"a is greater":b>c?"b is greater":"c is greater";
        System.out.println(result);
    }
}


