/**
 * Created by amanmahato on 3/28/17.
 */
import java.math.*;
import java.util.*;
public class BigNumberFactorial {
    public static void main(String[] args) {
        Scanner cin=new Scanner(System.in);
        String input = cin.nextLine();
        BigDecimal bd=new BigDecimal(input);
        System.out.println(new BigNumberFactorial().factorial(bd));
    }
    public BigDecimal factorial(BigDecimal obj){
        BigDecimal result=new BigDecimal("1");
        while(!obj.toString().equals("1")){
            result=result.multiply(obj);
            obj=obj.subtract(new BigDecimal("1"));
        }
        return result;
    }
}