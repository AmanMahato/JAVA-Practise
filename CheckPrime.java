import java.math.*;
public class CheckPrime{
	public static void main(String[] args){
		CheckPrime cp=new CheckPrime(Integer.parseInt(args[0]));
	}

	public CheckPrime(int n){
		isPrime(n);
	}

	public void isPrime(int n){
		BigInteger bigInt=new BigInteger(String.valueOf(n));
		Boolean ans=(bigInt.isProbablePrime(1));
		System.out.println(ans);
	}
}