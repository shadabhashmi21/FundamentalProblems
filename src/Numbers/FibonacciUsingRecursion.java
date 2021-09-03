package Numbers;

import java.util.Scanner;

/**
 * A Java based program to print Fibonacci series using recursion.
 * @author shadab
 */
public class FibonacciUsingRecursion {
    static int a = 0, b = 1, c = 1;
    
    public static void main(String[] args) {
        System.out.println("FIBONACCI USING RECURSION");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of series");
        int n = sc.nextInt();
        System.out.print(a+" "+b + " ");
        fibonacci(n);
    }
    
    static void fibonacci(int n) {
        if(n > 0) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            fibonacci(n - 1);
        }
    }
}
