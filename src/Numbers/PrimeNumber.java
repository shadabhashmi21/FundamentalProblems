package Numbers;

import java.util.Scanner;

/**
 * A Java based program to check a number is prime or not.
 * @author shadab
 */
public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("PRIME NUMBER");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(isPrime(n) ? "The number is prime" : "The number is not prime");
    }
    
    static boolean isPrime(int n){
        
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
