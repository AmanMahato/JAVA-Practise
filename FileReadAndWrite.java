import java.util.*;
import java.io.*;
public class FileReadAndWrite{
	public static void main(String[] args){
		List<String> wordList=new ArrayList<>();
		try(Scanner scan=new Scanner(new File("/Users/amanmahato/Desktop/Test.txt"))){
			int count=0;
			while(scan.hasNext() && count++<5){
				wordList.add(scan.next());
			}
		}catch(FileNotFoundException fnfe){
			System.out.println(fnfe.getMessage());
		}
		wordList.forEach(s->System.out.println(s));
		/*for(int i=0;i<wordsArray.length;i++){
			System.out.println(wordsArray[i]);
		}*/
	}
}