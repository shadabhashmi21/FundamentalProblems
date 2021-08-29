package Strings;

import java.util.Scanner;

/**
 * A Java based Program to check if a String is Palindrome or not.
 * @author shadab
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("PALINDROME");
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = ob.nextLine();
        System.out.println(isPalindrome(str) ? "The number is palindrome" : "The number is not palindrome");
    }
    
    static boolean isPalindrome(String word){
        char[] ar = word.toCharArray();
        StringBuilder sb = new StringBuilder(word.length());
        
        for(int i = word.length() - 1 ; i >= 0 ; i--) {
            sb.append(ar[i]);
        }
        
        return word.equals(sb.toString());
    }
}
