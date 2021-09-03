package Strings;

import java.util.Scanner;

/**
 * A Java based program to remove WhiteSpaces from a String.
 * @author shadab
 */
public class WhiteSpaces {
    public static void main(String[] args) {
        System.out.println("REMOVE WHITESPACES");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("String after removing white spaces is " + removeWhiteSpace(str));
    }
    
    static String removeWhiteSpace(String word){
        StringBuilder sb = new StringBuilder();
        
        char[] ch = word.toCharArray();
        
        for(char c : ch) {
            if(!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
