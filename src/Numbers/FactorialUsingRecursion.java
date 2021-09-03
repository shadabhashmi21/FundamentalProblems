package Numbers;

import java.util.Scanner;

/**
 * A Java based program to find factorial of a number using recursion.
 * @author shadab
 */
public class FactorialUsingRecursion {
    public static void main(String[] args) {
        System.out.println("FACTORIAL USING RECURSION");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Factorial = " + findFactorial(n));
    }
    
    static int findFactorial(int n){
        if (n == 1){
            return 1;
        } else {
            return (n * findFactorial(n - 1));
        }
    }
}
