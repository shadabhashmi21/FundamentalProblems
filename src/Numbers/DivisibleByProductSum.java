/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers;

import java.util.Scanner;

/**
 * A Java based program to check whether the sum or product of digits is equal to the element or not.
 * @author shadab
 */
public class DivisibleByProductSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(numDivisbleBySumOrProductOfDigits(arr));
    }
    
    static int numDivisbleBySumOrProductOfDigits(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % sumOfDigits(arr[i]) == 0 || arr[i] % productOfDigits(arr[i]) == 0){
                count++;
            }
        }
        return count;
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
    
    static int productOfDigits(int n){
        int p = 1;
        while (n!=0) {            
            int temp = n%10;
            if(temp != 0){
                p *= temp;
            }
            n /= 10;
        }
        return p;
    }
}
