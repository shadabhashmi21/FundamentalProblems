package Strings;


import java.util.Scanner;

/**
 * A Java based program to remove a substring from a entered string.
 * @author shadab
 */
public class RemoveSubstring {
    public static void main(String[] args) {
        System.out.println("REMOVE SUBSTRING");
        
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the original string");
        String orgString = ob.nextLine();
        
        System.out.println("Enter the string to be deleted");
        String delString = ob.nextLine();
        
        System.out.println(removeString(orgString, delString));
    }
    
    static String removeString(String originalString, String deletionString) {
        if(!originalString.contains(deletionString))
            return "The string to be deleted is not present in the original String";
        
        return "String after deletion is -> " + originalString.replace(deletionString, "");
    }
}
