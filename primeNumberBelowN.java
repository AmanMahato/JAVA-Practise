/**
 * Created by amanmahato on 3/24/17.
 */
import java.util.*;
public class PrimeNumberBelowN{
    Boolean flag=false;
    public static void main(String[] args){
        System.out.println("Hello");
        List<Integer> result=new PrimeNumberBelowN().primeNumber(50);
        result.forEach(i->System.out.print(i+" "));
    }
    public List<Integer> primeNumber(Integer n){
        List<Integer> returnArray=new ArrayList<>();
        returnArray.add(2);
        for(int possiblePrime=3;possiblePrime<n;possiblePrime+=2){
            for(Integer prime : returnArray){
                if(possiblePrime%prime==0){
                    flag=true;
                    break;
                }
            }
            if(!flag) returnArray.add(possiblePrime);
            flag=false;
        }
        return returnArray;
    }
}