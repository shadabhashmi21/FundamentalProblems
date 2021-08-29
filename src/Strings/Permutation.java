package Strings;

import java.util.Scanner;

/**
 * A Java based program to permute string.
 * @author shadab
 */
public class Permutation {
    public static void main(String[] args) {
        System.out.println("PERMUTATION");
        
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the String to be permuted");
        String word = ob.nextLine();
        System.out.println("The permuted strings are : ");
        permutation("", word);
    }
    
    static void permutation(String perm, String word) {
        if(word.isEmpty()) {
            System.out.println(perm + word);
        }
        else {
            for (int i = 0; i < word.length(); i++) {
                permutation(perm + word.charAt(i), word.substring(0,i) + word.substring(i+1, word.length()));
            }
        }
    }
}
