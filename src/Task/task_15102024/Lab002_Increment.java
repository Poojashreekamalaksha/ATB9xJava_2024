package Task.task_15102024;

public class Lab002_Increment {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++); //34
        System.out.println(a); //13
        //++a=11   a=11
        //a++=11   a=12
        //a++=12   a=13
        //34     //13
    }
}

