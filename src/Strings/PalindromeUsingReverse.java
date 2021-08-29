package Strings;


import java.util.Scanner;

/**
 * A Java based Program to check if a String is Palindrome or not using reverse() method.
 * @author Shadab 
 */
public class PalindromeUsingReverse {
    public static void main(String[] args) {
        System.out.println("PALINDROME USING REVERSE");
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = ob.nextLine();
        System.out.println(isPalindrome(str) ? "The number is palindrome" : "The number is not palindrome");
    }
    
    static boolean isPalindrome(String word) {
        StringBuffer sb = new StringBuffer(word);
        return word.equals(sb.reverse().toString());
    }
}
