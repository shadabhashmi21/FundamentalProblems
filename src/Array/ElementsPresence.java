/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 * A Java based program to check whether a element is present or not in an array.
 * @author shadab
 */
public class ElementsPresence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element");
        int e = sc.nextInt();
        System.out.println(isElementPresent(arr, e) ? "Element found" : "Element not found");
    }
    
    static boolean isElementPresent(int arr[], int e){
        boolean isPreseent = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == e){
                isPreseent = true;
            }
        }
        return isPreseent;
    }
}
