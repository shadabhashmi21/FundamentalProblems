/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 * A Java based program to check whether a string starts with "A" or "a".
 * @author shada
 */
public class AString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        String arr[] = new String[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        System.out.println("String which start with A = "+ AInTheString(arr));
    }
    
    static int AInTheString(String[] B){
        int res = 0;
        for (int i = 0; i < B.length; i++) {
            if(B[i].startsWith("a") || B[i].startsWith("A")){
                res++;
            }
        }
        return res;
    }
}
