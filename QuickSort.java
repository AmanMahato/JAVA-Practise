// Created By: Aman Mahato
//Date: 03/10/2017
public class QuickSort{
	public QuickSort(int[] inputNumber){
		this(inputNumber,0,(inputNumber.length-1));
	}
	public QuickSort(int[] inputNumber, int low, int high){
		quickSort(inputNumber,low,high);
	}
	public static void main(String[] args){
		int[] sampleInput={1,2,3,1,2,3,1,0,-5,2};
		QuickSort sort=new QuickSort(sampleInput);
		PrintedSortedArray(sampleInput);
	}
	public void quickSort(int[] inputNumber, int low, int high){
		if(low>=high) return;
		int position=split(inputNumber,low,high);
		quickSort(inputNumber,low,position-1);
		quickSort(inputNumber,position+1,high);
	}
	public static void PrintedSortedArray(int[] Array){
		for(int individualElement : Array){
			System.out.println(individualElement);
		}
	}
	public int[] swap(int[] array,int i,int j){
		int tempHolder=array[i];
		array[i]=array[j];
		array[j]=tempHolder;
		return array;
	}
	public int split(int[] array,int low,int high){
		int pivot=low;
		int lowIndex=low+1;
		int highIndex=high;
		while(lowIndex<=highIndex){
		if(array[lowIndex]<=array[pivot]){
			lowIndex++;
			continue;
		}
		if(array[highIndex]>array[pivot]){
			highIndex--;
			continue;
		}
		swap(array,lowIndex++,highIndex--);
	}
	if(array[pivot]<array[highIndex]){
	return highIndex;
	}
	return pivot;
}
}