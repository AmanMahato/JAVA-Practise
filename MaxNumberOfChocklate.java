// Author: Aman K Mahato
// https://www.martinkysel.com/hackerrank-save-the-prisoner-solution/
import java.util.*;
public class MaxNumberOfChocklate{
	public static void main(String[] args){
		int COST_OF_CHOCKLATE=5;
		Scanner inputObj=new Scanner(System.in);
		int money=inputObj.nextInt();
		int wrapperNum=inputObj.nextInt();
		int chocklateWithMoney=money/COST_OF_CHOCKLATE;
		int chocklateFromWrap=chocklateWithMoney/wrapperNum;
		int totalChocklate=chocklateWithMoney+chocklateFromWrap;
		System.out.println(totalChocklate);
	}
	
}