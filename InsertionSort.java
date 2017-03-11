public class InsertionSort{
	public InsertionSort(int[] inputNumber){
		insertionSort(inputNumber);
	}
	public static void main(String[] args){
		int[] inputArray=new int[]{1,2,3,0,1,-8};
		new InsertionSort(inputArray);
		for(int i : inputArray){
			System.out.println(i);
		}
	}
	public void insertionSort(int[] array){
		int i;
		for(int j=1;j<array.length;j++){
			int key=array[j];
			for(i=j-1;(i>=0) && (array[i]>key);i--)
				array[i+1]=array[i];
			array[i+1]=key;
		}
	}
}