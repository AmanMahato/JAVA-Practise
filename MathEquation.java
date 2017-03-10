import java.util.*;
import java.lang.*;
public class MathEquation{
	public static void mian(String[] args){
		//int upto=1000;
		findSolutions();
	}

	public static void findSolutions(){
		for(int a=1;a<=100;a++){
			for(int b=1;b<=100;b++){
				for(int c=1;c<=100;c++){
					for(int d=1;d<=100;d++){
						if((Math.pow(a,3)+Math.pow(b,3))==(Math.pow(c,3)+Math.pow(d,3))){
							System.out.println(a);
							System.out.println(b);
							System.out.println(c);
							System.out.println(d);
						}else{
							System.out.println("No Solution found.");
						}
					}
				}
			}
		}
	}
}