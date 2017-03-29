//created by AmanMahato
public class SubStringCheck{
	public static void main(String[] args){
		String mainString="Hello World";
		String toBeChecked="orld";
		System.out.println("The given substring is there: "+new SubStringCheck().isSubString(mainString,toBeChecked));
	}
	public Boolean isSubString(String main, String input){
		int inputIndex=0;
		int counter=0;
		for(int i=0;i<main.length() && inputIndex<input.length();i++){
			if(main.charAt(i)==input.charAt(inputIndex++)){
				counter++;
			}else{
				inputIndex=0;
				counter=0;
			}
		}
		return (counter==input.length() ? true : false);
	}
}