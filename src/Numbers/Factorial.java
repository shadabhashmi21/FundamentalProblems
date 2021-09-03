package Numbers;

import java.util.Scanner;

/**
 * A Java based program to find factorial of a number.
 * @author shadab
 */
public class Factorial {
    public static void main(String[] args) {
        System.out.println("FACTORIAL");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Factorial = " + findFactorial(n));
    }
    
    static int findFactorial(int n) {
        int fact = 1;
        
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
