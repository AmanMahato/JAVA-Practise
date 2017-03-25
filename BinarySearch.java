public class BinarySearch{
	public static void main(String[] args){
		int[] sampleInput={1,2,3,4,5,6,7,9,10};
		BinarySearch binarySearchObject=new BinarySearch();
		System.out.println(binarySearchObject.binarySearch(sampleInput,9));
	}
	public int binarySearch(int[] inputArray, int element){
		int lowIndex=0;
		int highIndex=inputArray.length-1;
		while(lowIndex<=highIndex){
			int mid=(lowIndex+highIndex)/2;
			if(element==inputArray[mid]){
				return mid;
			}else if(element>inputArray[mid]){
				lowIndex=mid+1;
			}else{
				highIndex=mid-1;
			}
		}
		return -1;
	}
}