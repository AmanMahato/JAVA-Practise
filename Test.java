import java.util.*;
import java.lang.*;
public class Test {
   public static void main(String[] args)
    {
       int x=8;        
       Boolean a=isPowerOfTwo(323);
       System.out.println(a);        

    }

    public static Boolean isPowerOfTwo(int input){
        return((input & (input-1))==0 ? true :false);
    }

}