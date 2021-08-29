package Strings;


import java.util.Scanner;

/**
 * A Java based program to check if two string are Anagram or not.
 *
 * @author shadab
 */
public class Anagram {

    public static void main(String[] args) {
        System.out.println("ANAGRAM");

        Scanner ob = new Scanner(System.in);
        System.out.println("Enter two strings");
        String word = ob.nextLine();
        String anagram = ob.nextLine();
        System.out.println(isAnagram(word, anagram) ? "These strings are anagram" : "These strings are not anagram");
    }

    static boolean isAnagram(String word, String anagramString) {
        if (word.length() != anagramString.length()) {
            return false;
        }

        char[] chars = word.toCharArray();

        for (char c : chars) {
            int index = anagramString.indexOf(c);
            if (index != -1) {
                anagramString = anagramString.substring(0, index) + anagramString.substring(index + 1, anagramString.length());
            } else {
                return false;
            }
        }
        return anagramString.isEmpty();
    }
}
