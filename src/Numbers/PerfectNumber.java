package Numbers;

import java.util.Scanner;

/**
 * A Java based program to check whether a number is perfect or not.
 * An integer number is said to be "perfect number" if its factors, including 1(but not the number itself),
 * sum to the number. E.g., 6 is a perfect number because 6=1+2+3
 * @author shadab
 */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(isPerfectNumber(n)? "It is a perfect number" : "It is not a perfect number");
    }
    
    static boolean isPerfectNumber(int n){
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n%i == 0){
                sum += i;
            }
        }
        return sum == n;
    }
}
