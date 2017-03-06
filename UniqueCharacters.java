//Implement an algorithm to determine if a string has all unique characters.
public class UniqueCharacters{

	int count=0;

	public static void main(String[] args){

		String testString=args[0];
		if(new UniqueCharacters().isUnique(testString)==true){
			System.out.println("All the characters in this is unique");
		}else{
			System.out.println("All the charactes are not unique");
		}

	}

	Boolean isUnique(String inputString){
		for(int i=0;i<inputString.length();i++){
			for(int j=i+1;j<inputString.length();j++){
				if (inputString.charAt(i)==inputString.charAt(j)){
					count++;
				}
			}

		}
		if(count !=0){
			return false;
		}else{
			return true;
		}
	}
}