/**
 * Write your solution in this file.
 *
 * You can build, execute, and test your answer by either pressing 'Try Answer' in the side panel,
 * or by running the following commands on the command line:
 *
 * To build your answer:
 *            gradle build
 * To run the previously built executable:
 *            gradle run -q -P "appArgs='<test_case_path>'"
 * For example:
 *            gradle run -q -P "appArgs='tests/input_1.json'"
 *
 * You can organize your code as you wish (eg, use auxiliary files) as long as `TestAnswer`
 * produces the expected output.
 */
import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashSet;
import java.lang.*;
import java.util.*;
public class Answer {
    Hashset<String> hashset=new HashSet<>();
    StringBuilder sb=new StringBuilder();
    ArrayList<String> validWords=new ArrayList<>();
    /**
     * Implement your solution here.
     *
     * @param boggle_board Representation of a boggle board.
     * @param list_path Path to a .txt file containing the list of valid words to consider
     * @return List of valid words found in the given boggle board.
     */
    boolean isWord(String str)
    {
        // Linearly search all words
        if (stringHashMap.contains(str))
            return true;
        return false;
    }

    // A recursive function to print all words present on boggle
    void findWordsUtil(char boggle[][], boolean visited[][], int i,
                       int j)
    {
        // Mark current cell as visited and append current character
        // to str
        visited[i][j] = true;
        sb.append(boggle[i][j]);

        // If str is present in dictionary, then print it
        if (isWord(sb.toString()))
            validWords.add(sb.toString());

        // Traverse 8 adjacent cells of boggle[i][j]
        for (int row=i-1; row<=i+1 && row<boggle[0].length; row++)
            for (int col=j-1; col<=j+1 && col<boggle[0].length; col++)
                if (row>=0 && col>=0 && !visited[row][col])
                    findWordsUtil(boggle,visited, row, col);

        // Erase current character from string and mark visited
        // of current cell as false
        sb.setLength(sb.length()-1);
        visited[i][j] = false;
    }

    // Prints all words present in dictionary.
    void findWords(char boggle[][])
    {
        // Mark all characters as not visited
        boolean visited[][]=new boolean[boggle[0].length][boggle[0].length];
        for (int i=0;i<visited[0].length;i++){
            Arrays.fill(visited[i],false);
        }
        // Initialize current string


        // Consider every character and look for all words
        // starting with this character
        for (int i=0; i<boggle[0].length; i++)
            for (int j=0; j<boggle[0].length; j++)
                findWordsUtil(boggle, visited, i, j);
    }

    public static String[] find_words(String[] boggle_board, String list_path) {
        try(FileReader fileReader = new FileReader(list_path)){
            for (String line:fileReader){
                hashset.add(line);
                Answer answer=new Answer();
                char charArray[][]=new char[boggle_board.length][boggle_board.length];
                for (int i=0;i<boggle_board.length;i++){
                    charArray[i]=boggle_board[i].toCharArray();
                }
            }
                answer.find_words(charArray);
                String valid[]=new String[validWords.length()];
                for (int i=0;i<validWords.length();i++){
                    valid[i]=validWords.get(i);
                }
            return valid;
        }
        catch (Exception e){
            return null;
        }
    }

    public static void main(String[] args) {
        find_words({{"RIShI","AMAN"}});
    }

    }
}
