/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers;

import java.util.Scanner;

/**
 * A Java based program to reverse a number.
 * @author shadab
 */
public class Reverse {
    public static void main(String[] args) {
        System.out.println("REVERSE NUMBER");
        
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        
        while(n!=0) {            
            int r = n%10;
            rev = rev * 10 + r;
            n = n/10;
        }
        
        System.out.println("Remainder = " + rev);
    }
}
