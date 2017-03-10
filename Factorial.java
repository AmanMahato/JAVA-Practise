public class Factorial{
	public static void main(String[] args){
	System.out.println(new Factorial().findFactorial(5));
	}
	public int findFactorial(int inputNumber){
		return (inputNumber==0 ? 1 : (findFactorial(inputNumber-1)*inputNumber));
		//*if(inputNumber==0) return 1;
		//else{
		//	return (findFactorial(inputNumber-1)*inputNumber);
		//}
	}
}