import java.lang.*;
import java.util.*;
public class PlusOne {
	public static void main(String[] args){
		ArrayList<Integer> testArrayList=new ArrayList<Integer>();
		//testArrayList.add(1);
		testArrayList.add(2);
		testArrayList.add(3);
		testArrayList.add(4);
		testArrayList.add(5);
		testArrayList.add(6);
		System.out.println(testArrayList.get(0));		
		System.out.println(PlusOne.plusOne(testArrayList));
	}
	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
	    int power=a.size()-1;
	    int originalNumber=0;
	    int newNumber=0;
	    ArrayList<Integer> solution=new ArrayList<Integer>();
	    for(Integer individualElement: a){
	        int exponent=(int)Math.pow(10,power--);
	        originalNumber=originalNumber+(individualElement*exponent);
	    }
	    newNumber=originalNumber+1;
	    while(newNumber>0){
	        int individualDigit=newNumber%10;
	        solution.add(individualDigit);
	        newNumber=newNumber/10;
	    }
	    Collections.reverse(solution);
	    return solution;
	}
}
