/**
 * Created by amanmahato on 4/12/17.
 * Print All the Possible Combinations from the given set of array which sum up to the target value.
 */
import java.util.*;
import java.lang.*;
public class SumSet{
    public static void main(String[] args){
        int[] sampleInput={1,2,3,4,5,6,7,8};
        int target=8;
        List<List<Integer>> allTheCombinations=sumSet(sampleInput);
        List<List<Integer>> result=targetCombination(allTheCombinations,target);
        result.forEach(i-> System.out.println(i));
    }
    public static List<List<Integer>> sumSet(int[] input){
        List<List<Integer>> list=new ArrayList<>();
        int len=input.length;
        for(int i=0;i<Math.pow(2,len);i++) {
            List<Integer> tempList = new ArrayList<>();
            for (int j = 0; j < len; j++) {
                if ((i & (1 << j)) > 0)
                    tempList.add(input[j]);
            }
            list.add(tempList);
        }
        return list;
    }
    public static List<List<Integer>> targetCombination(List<List<Integer>> allTheCombinations, int target){
        List<List<Integer>> result=new ArrayList<>();
        for(List<Integer> singleList : allTheCombinations){
            int sum=0;
            for(Integer eachElement: singleList){
                sum=sum+eachElement;
            }
            if(sum==target) result.add(singleList);
        }
        return result;

    }
}