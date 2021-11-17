/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 * A Java based program to count the Even/Odd elements of an Array.
 * @author shadab
 */
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of arry");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a[] = countEvenOdd(arr);
        System.out.println("Count of even = "+a[0]);
        System.out.println("Count of odd = "+a[1]);
    }
    
    static int[] countEvenOdd(int arr[]){
        int e = 0, o =0;
        int evenOdd[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2 == 0){
                e++;
            } else {
                o++;
            }
        }
        evenOdd[0] = e;
        evenOdd[1] = o;
        return evenOdd;
    }
}
