public class MinimumNumberOfSquares{
	public static void main(String[] args){
		System.out.println(new MinimumNumberOfSquares().minimumNumberOfSquares(13,29));
	}
	public int minimumNumberOfSquares(int a,int b){
		if (a==b) return 1;
		else
			return(1+minimumNumberOfSquares(Math.min(a,b),(Math.max(a,b)-Math.min(a,b))));
	}
}