public class LargestPowerOf2{
	public static void main(String[] args){
		Boolean status;
		int value=555;
		while (value>0){
			status=isPowerOfTwo(value--);
			if (status==true){
				System.out.println(value+1);
				break;
			}
		}
	}
	public static Boolean isPowerOfTwo(int input){
		return((input & (input-1))==0 ? true :false);
	}
}