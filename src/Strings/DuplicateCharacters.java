package Strings;


import java.util.Scanner;

/**
 * A Java based program to print duplicate characters from String
 * @author shada
 */
public class DuplicateCharacters {
    public static void main(String[] args) {
        System.out.println("DUPLICATE STRING");
        
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = ob.nextLine();
        String s = findDuplicateCharacters(word);
        System.out.println(s.isEmpty() ? "There are no duplicate characters" : "The duplicate characters are " + s);
    }
    
    static String findDuplicateCharacters(String word){
        char[] ch = word.toCharArray();
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < word.length(); i++) {
            for (int j = i+1; j < word.length(); j++) {
                if(ch[i] == ch[j]) {
                    sb.append(ch[j]);
                }
            }
        }
        return sb.toString();
    }
}
