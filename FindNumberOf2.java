public class FindNumberOf2{
	public static void main(String[] args){
		System.out.println("The number of 2's are"+" "+numberOf2(30));
	}
	public static int numberOf2(int input){
		int count=0;
		for(int i=1;i<input;i++){
			int j=i;
			while(j>0){
				int extractDigit=i%10;
				j=j/10;
				if(extractDigit==2) count++;
			}
		}
		return count;
	}
}