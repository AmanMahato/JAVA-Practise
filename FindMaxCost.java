import java.util.*;
import java.lang.*;
public class FindMaxCost{

	public static void main(String[] args){
		int[] cost=new int[]{0,1,5,8,9,10,17,17,20};
		System.out.println(new FindMaxCost().findMaxCost(cost,8));
	}

	public int findMaxCost(int[] cost,int lenOfRod){
		List<Integer> list=new ArrayList<Integer>();
		int n=lenOfRod;
		int firstIndex=1;
		for(int i=1;i<=(lenOfRod/2);i++){
			list.add(cost[i]+cost[n-i]);
		}
		Collections.sort(list);
		return(list.get(list.size()-1));
	}
	
}