import java.io.*;
import java.util.*;
public class SherlockAndSquares {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int noOfTestCase=input.nextInt();
        while(noOfTestCase>0){
            noOfTestCase--;
            int input1=input.nextInt();
            int input2=input.nextInt();
            new SherlockAndSquares().doCalculation(input1,input2);
        }
    }
    public void doCalculation(int input1, int input2){
        int counter=0;
        int i=1;
        while(Math.pow(i,2)<=input2){
            for(int j=input1;j<=input2;j++){
                if(Math.pow(i,2)==j) counter++;    
            }
            i++;
        }
        System.out.println(counter);
    }
}