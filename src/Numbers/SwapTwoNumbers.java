package Numbers;


import java.util.Scanner;

/**
 * A Java based program to swap two numbers without using a third variable.
 * @author shadab
 */
public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println("SWAP TWO NUMBERS");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res[] = swapNumbers(a, b);
        System.out.println("First number = " + res[0] + " Second Number = " + res[1]);
    }
    
    static int[] swapNumbers(int a, int b){
        b = b + a;
        a = b - a;
        b = b - a;
        
        int ans[] = new int[2];
        ans[0] = a;
        ans[1] = b;
        
        return ans;
    }
}
