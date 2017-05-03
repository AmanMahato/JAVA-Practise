//Author: Aman K Mahato
// Date: 05/02/2017
//Brute Force
import java.util.*;
import java.lang.*;
public class FindMaxTime{
	static List<String> allPossible=new ArrayList<>();
	public static void main(String[] args){
		int[] sampleInput={1,2,3,4};
		FindMaxTime findMaxTimeObj=new FindMaxTime();
		List<Integer> combiOfTwo=findMaxTimeObj.convertToInteger(findMaxTimeObj.allTwoDigitCombination(sampleInput));
		String hour=findMaxTimeObj.maxHour(combiOfTwo);
		String minute=findMaxTimeObj.maxMin(combiOfTwo);
		System.out.println(hour+":"+minute);
	}
	public List<String> allTwoDigitCombination(int[] input){
		int len=input.length;
		int oneNumber=0;
		int j=1;
		for(int i=len-1;i>=0;i--){
			oneNumber=oneNumber+(input[i]*j);
			j=j*10;
		}
		char[] inputToChar=new Integer(oneNumber).toString().toCharArray();	
		for(int i=0;i<Math.pow(2,input.length);i++){
			String temp="";
			for(int k=0;k<input.length;k++){
				if((i&(1<<k))>0){
					temp=temp+inputToChar[k];
				}
			}
			FindMaxTime.allPossible.add(temp);
		}
		Iterator<String> itr=FindMaxTime.allPossible.iterator();
		while(itr.hasNext()){
			if(itr.next().length()!=2){
				itr.remove();

			}
		}	
		return FindMaxTime.allPossible;
	}
	public List<Integer> convertToInteger(List<String> twoCombString){
		List<Integer> returnList = new ArrayList<>(twoCombString.size());
		twoCombString.forEach(s->returnList.add(Integer.valueOf(s)));
		return returnList;
	}
	public String maxHour(List<Integer> twoCombString){
		Collections.sort(twoCombString);
		int len=twoCombString.size();
		Integer toBeDeleted=0;
		int i=0;
		for(i=len-1;i>=0;i--){
			if(twoCombString.get(i)<24){
			FindMaxTime.allPossible.remove(twoCombString.get(i));
			return twoCombString.get(i).toString();
			}
		}
		return ("0");
	}
	public String maxMin(List<Integer> twoCombString){
		Collections.sort(twoCombString);
		int len=twoCombString.size();
		for(int i=len-1;i>=0;i--){
			if(twoCombString.get(i)<=60){
				return(twoCombString.get(i).toString());
			}
		}
		return ("0");
	}
}