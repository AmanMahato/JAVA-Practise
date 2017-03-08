/*
Created By Aman Mahato
Date: Mar 8 2017
*/
public class Fibonacci{
	//1,1,2,3,5,8
	public static void main(String[] args){
		for (int i=0;i<5;i++){
					System.out.println(new Fibonacci().fibonacci(i));
		}
		//new Fibonacci().fibonacci(5); //for not recusrsion, call this and comment 4 through 6
	}


	//with recursion
	public int fibonacci(int uptoNumber){
		if(uptoNumber==0 || uptoNumber==1){
			return 1;
		}else{
			return (fibonacci(uptoNumber-1)+fibonacci(uptoNumber-2));
		}
	}

	//without using recursion

	//public void fibonacci(int count){
	//	int n1=0,n2=1,tempHolder;
	//	System.out.println(1);
	//	while(count>0){
	//		count--;
	//		tempHolder=n1+n2;
	//		System.out.println((tempHolder));
	//		n1=n2;
	//		n2=tempHolder;
	//	}
	//}
}