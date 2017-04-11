/*
Author: Aman K Mahato
Fibonacci Using Momozation Table
*/

public class Fib{
	public static void main(String[] args){
		int value = Integer.parseInt(args[0]);
		while(value>0){
			System.out.println(Fib.fib(value--));
		}
		
	}

	public static int fib(int n){
		int[] fibArray = new int[n+1];
		fibArray[0]=0;
		fibArray[1]=1;
		int result=0;
		for(int i=2;i<=n;i++){
			fibArray[i]=fibArray[i-1]+fibArray[i-2];
		}
		return fibArray[n];
	}
}
