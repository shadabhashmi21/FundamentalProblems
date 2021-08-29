package Strings;


import java.util.Scanner;

/**
 * A Java based program to reverse a String.
 * @author shadab
 */
public class Reverse {
    public static void main(String[] args) {
        System.out.println("REVERSE");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String word = sc.nextLine();
        System.out.println("The reverse is " + reverseString(word));
    }
    
    static String reverseString(String word) {
        StringBuffer sb = new StringBuffer();
        char[] ch = word.toCharArray();
        
        for (int i = word.length() - 1; i >= 0; i--) {
            sb.append(ch[i]);
        }
        
        return sb.toString();
    }
}
