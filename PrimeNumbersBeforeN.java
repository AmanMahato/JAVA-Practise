import java.util.*;
public class PrimeNumbersBeforeN {
    public List<Integer> primeNumbers(int n){
        List<Integer> result = new ArrayList<Integer>();
        result.add(2);
        boolean flag = false;
        for(int i=3; i < n; i+=2){
            for(int r : result){
                if(2*r > i){
                    break;
                }
                if(i % r == 0){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                result.add(i);
            }
            flag = false;
        }
        return result;
    }
    public static void main(String args[]){
        PrimeNumbersBeforeN pnb = new PrimeNumbersBeforeN();
        List<Integer> result = pnb.primeNumbers(50);
        result.forEach(i -> System.out.print(i + " "));
    
    }
}