/* 
Given a list of non negative integers, arrange them such that they form the largest number.
Created By: Aman Mahato
Date: 03/07/2017 
*/
import java.util.*;
import java.lang.*;
public class LargestNumberFormation{
	public static void main(String[] args){
		List<Intefer> testList = new ArrayList<Integer>(Arrays.asList(3,30,34,5,9));
		System.out.println(new LargestNumberFormation().largestNumberFormed(testList));



	}
	
	public Integer largestNumberFormed(List<Integer> inputList){
		Integer finalNumber=inputList.get(0);
		Integer firstCombination=finalNumber;
		Integer secondCombination=0;
		for(int i=1;i<inputList.size();i++){
			String firstCombinationInString=Integer.toString(finalNumber)+Integer.toString(inputList.get(i));
			String firstCombinationInString=Integer.toString(inputList.get(i))+Integer.toString(finalNumber);
			if(Integer.valueOf(firstCombinationInString)>Integer.valueOf(secondCombinationInString)){
				finalNumber=Integer.valueOf(firstCombinationInString);
			}else{
				finalNumber=Integer.valueOf(secondCombinationInString);
			}
		}
		return finalNumber;
	}
}
