package Strings;

import java.util.Scanner;

/**
 * A Java based program to check if vowel is present or not in a given string.
 * @author shadab
 */
public class ContainsVowel {
    public static void main(String[] args) {
        System.out.println("CONTAINS VOWEL");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println(doesContainVowel(str) ? "String contains vowel" : "String doesn't contain vowel");
    }
    
    static boolean doesContainVowel(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }
}
