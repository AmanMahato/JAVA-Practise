//Author: Aman Mahato
//Date: 03.29.2017
public class SubSets{
	public static void main(String[] args){
		String input=new String("abc");
		new SubSets().findSubSets(input);
	}
	public void findSubSets(String input){
		char[] inputArray=input.toCharArray();
		String output="";
		int len=inputArray.length;
		for(int i=0;i<(1<<len);i++){
			System.out.print("{");
			for(int j=0;j<len;j++){
				if((i&(1<<j))>0){
					System.out.print(inputArray[j]);
				}
			}
			System.out.println("}");
		}
	}
}