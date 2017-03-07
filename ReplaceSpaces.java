//Write a method to replace all spaces in a string with ‘%20’.
//created by amanmahato 

public class ReplaceSpaces{
	public static void main(String[] args){
		String testString="Welcome to the world of Aman. United States of America";
		System.out.println(new ReplaceSpaces().replaceSpaces(testString));
	}

	public String replaceSpaces(String inputString){
		int len=inputString.length();
		int numberOfSpaces=0;
		char[] stringCharacters=inputString.toCharArray();
		for(int i=0;i<len;i++){
			if(stringCharacters[i]==' ') numberOfSpaces++;
		}
		int newArraySize=(numberOfSpaces*2)+len;
		char[] newStringCharacters=new char[newArraySize];
		int newArrayIndex=0;
		for(int j=0;j<len;j++){
			if(stringCharacters[j]!=' '){
				newStringCharacters[newArrayIndex++]=stringCharacters[j];
			}else{
				newStringCharacters[newArrayIndex++]='%';
				newStringCharacters[newArrayIndex++]='2';
				newStringCharacters[newArrayIndex++]='0';
			}
		}
		return new String(newStringCharacters);
	}
}