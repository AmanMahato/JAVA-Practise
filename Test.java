import java.lang.*;
public class Test{
	public static void main(String[] args){
		System.out.println(smMin(29,29,0));
}
public static int smMin(int a, int b, int c){
	if (a-b==0){
		return c+1;
	}
	return smMin(Math.max(a,b)-Math.min(a,b),Math.min(a,b),c+1);
}
}