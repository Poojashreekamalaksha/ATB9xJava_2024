package Task.task_15102024;

public class Lab003_IncrementDecrement {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);//18
        System.out.println(a);//8
        //--a=19    a=19
        //a++=19  a=20
        //a--=20   a=19
        //58       //19
    }
}

