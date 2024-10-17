package October.ex_15102024_Ternary;

public class Lab003 {
    public static void main(String[] args)
    {
      //  condition?expression1:expression2
       // 100F?"Heat alert":"Temparature is Normal"
        int temparature = 110;
        String temparatureCheck=temparature>100?"Heat alert":"Tempartaure is Normal";
        System.out.println(temparatureCheck);
    }
}

