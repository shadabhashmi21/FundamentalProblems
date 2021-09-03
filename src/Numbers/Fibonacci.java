package Numbers;

import java.util.Scanner;

/**
 * A Java based program to print Fibonacci series.
 * @author shadab
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("FIBONACCI SERIES");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of series");
        int n = sc.nextInt();
        printFibonacci(n);
    }
    
    static void printFibonacci(int length) {
        int a = 0, b = 1, c = 1;
        for (int i = 0; i < length; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
        }
    }
}
