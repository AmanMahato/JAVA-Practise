// Created By: Aman Mahato
//Date: 03/10/2017
public class Factorial{
	public static void main(String[] args){
	System.out.println(new Factorial().findFactorial(5));
	}
	public int findFactorial(int inputNumber){
		return (inputNumber==0 ? 1 : (findFactorial(inputNumber-1)*inputNumber));
	}
}