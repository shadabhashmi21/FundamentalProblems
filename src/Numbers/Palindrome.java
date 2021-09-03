package Numbers;

import java.util.Scanner;

/**
 * A Java based program to check a integer is Palindrome or not.
 * @author shadab
 */
public class Palindrome {
    public static void main(String[] args) {
        System.out.println("PALINDROME");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(isPalindrome(n) ? "The number is palindrome" : "The number is not palindrome");
    }
    
    static boolean isPalindrome(int number){
        int palindrome = number, reverse = 0; 
        
        while (palindrome != 0) {            
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }
        
        if(number == reverse){
            return true;
        }
        return false;
    }
}
