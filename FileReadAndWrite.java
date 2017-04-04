import java.util.*;
import java.io.*;
public class FileReadAndWrite {
	//String[] wordsArray=null;
	public static void main(String[] args){
		List<String> wordList=new ArrayList<>();
		try(Scanner scan=new Scanner(new File("/Users/amanmahato/Desktop/Test.txt"))){
			int count=0;
			while(scan.hasNext()){
				wordList.add(scan.next());
			}
		}catch(FileNotFoundException fnfe){
			System.out.println(fnfe.getMessage());
		}
		wordList.forEach(s->System.out.println(s));
		try(FileWriter writer = new FileWriter("/Users/amanmahato/Desktop/output.txt")){ 
		for(String str: wordList) {
  			writer.write(str);
		}
		}catch(IOException ioe){
			ioe.getMessage();
		}
	}
}