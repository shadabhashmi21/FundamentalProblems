package Numbers;

import java.util.Scanner;

/**
 * A Java based program to check a integer is Armstrong or not.
 * @author shadab
 */
public class Armstrong {
    public static void main(String[] args) {
        System.out.println("ARMSTRONG");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(isArmstrong(n) ? "The number is Armstrong" : "The number is not Armstrong");
    }
    
    static boolean isArmstrong(int num) {
        int sum = 0;
        int data = num;
        int digit = 0;
        while(data > 0) {
            digit = data % 10;
            data = data /10;
            sum += digit * digit * digit;
        }
       
        return num == sum;
    }
}
