import java.util.*;
import java.lang.*;
public class Test {
    int a=10;
    public static void main(String args[]) 
    { 
      System.out.println(new Test().proveIt()); 
      System.out.println(new Test().a);
    }
    public int proveIt()
    {
      try {  
              System.out.println("Try method");
              a=a+8;
              return a;  
      }  
      finally {  
          System.out.println("finally block is run before method returns.");
          a=a+5;
          //return a;
      }
    }
}