package Numbers;

import java.util.Scanner;

/**
 * A Java based program to find GCD/HCF of two numbers.
 * @author shada
 */
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("HCF = "+findHCF(a, b));
    }
    
    static int findHCF(int a, int b){
        int hcf = 0;
        for(int i=1; i<=a || i<=b; i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }
        return hcf;
    }
}
