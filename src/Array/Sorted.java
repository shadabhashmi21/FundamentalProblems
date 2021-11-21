/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 * A Java based program to check whether an Array is sorted(ascending order) or not.
 * @author shadab
 */
public class Sorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(isSorted(arr) ? "Array is sorted" : "Array is not sorted");
    }
    
    static boolean isSorted(int arr[]){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] >= arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
