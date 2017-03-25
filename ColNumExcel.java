public class ColNumExcel{
	public static void main(String[] args){
		System.out.println(findColNum("AA"));
	}
	public static int findColNum(String input){
		int value=0;
		for(int i=0;i<input.length();i++){
			value=value*26;
			value=value+(input.charAt(i)-64);
		}
		return value;
	}
}