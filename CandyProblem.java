import java.util.*;
public class CandyProblem {
	public static void main(String[] args){
	List<Integer> sampleInput=new ArrayList<>(Arrays.asList(1,2,3,3,4,5));
	System.out.println(new CandyProblem().candy(sampleInput));
	}
	public int candy(List<Integer> ratings) {
	    int len=ratings.size();
	    int[] candyArray= new int[len];
	    candyArray[0]=1;
	    for(int i=1;i<len;i++){
	        candyArray[i]=(ratings.get(i)>ratings.get(i-1) ? (candyArray[i-1]+1) : 1 );
	    }
	    int result=candyArray[len-1];
	    for(int j=len-2;j>=0;j--){
	        int current=1;
	        if(ratings.get(j)>ratings.get(j+1)) current=candyArray[j+1]+1;
	        result=result+Math.max(current,candyArray[j]);
	        candyArray[j]=current;
	    }
	    return result;
	}
}