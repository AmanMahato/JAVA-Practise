/** Created By Aman Mahato **/

public class UniqueCharacterChecker{

	public static void main(String[] args){
		String testString=args[0];
		if(new UniqueCharacters().isUnique(testString)==true){
			System.out.println("All the characters in this is unique");
		}else{
			System.out.println("All the charactes are not unique");
		}

	}

	public boolean isUnique(String inputString){
		boolean[] allValues=new boolean[inputString.length()];
		int asciiVal=0;
		for(int i=0;i<inputString.length();i++){
			asciiVal=inputString.charAt(i);
			if(allValues[i]) return false;
			allValues[i]=true;
		}
		return true;
	}
}