package Numbers;

import java.util.Scanner;

/**
 * A Java based program to calculate sum of digits.
 * @author shadab
 */
public class DigitsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Sum of Digits = " + sumOfDigits(n));
    }
    
    static int sumOfDigits(int n){
        int sum = 0;
        while (n!=0) {            
            int temp = n%10;
            sum += temp;
            n /= 10;
        }
        return sum;
    }
}
