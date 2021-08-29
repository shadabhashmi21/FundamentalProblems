package Strings;


import java.util.Scanner;

/**
 * A Java based program to count the occurrence of a specific character in a String.
 * @author shadab
 */

public class Occurence {
    public static void main(String[] args) {
        System.out.println("OCCURENCE");
        
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the string");
        String word = ob.nextLine();
        System.out.println("Enter the letter to find occurence");
        char ch = ob.next().charAt(0);
        int count = countOccurence(ch, word);
        System.out.println("The occurence of letter " + ch + " is " + count);
    }
    
    static int countOccurence(char letter, String word) {
        int count = 0;
        char[] arr = word.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (letter == arr[i]) {
                count++;
            }
        }
        return count;
    }
}
