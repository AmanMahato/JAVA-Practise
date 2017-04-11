import java.lang.*;
import java.util.*;
public class UniqueCharacterCheckerASCII{
	public static void main(String[] args){
		System.out.println("IS UNIQUE: " + new UniqueCharacterCheckerASCII().isUnique(args[0]));

	}
	public boolean isUnique(String input){
		Boolean[] initialStage = new Boolean[255];
		Arrays.fill(initialStage,false);
		for(char individualCharacter : input.toCharArray()){
			if(!initialStage[individualCharacter]){
				initialStage[individualCharacter]=true;
			}else{
				return false;
			}
		}
		return true; 
	}
}