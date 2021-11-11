/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import java.util.Scanner;

/**
 * A Java based program to find Frequency of each number of the array.
 * @author shadab
 */
public class ElementsFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int visited = -1;
        int visitedArr[] = new int[n];
        for(int i=0; i<arr.length; i++){
            int count = 1;
            for(int j=i+1; j<arr.length; j++){
                if (arr[i]==arr[j]) {
                    count++;
                    visitedArr[j]=visited;
                }
            }
            
            if(visitedArr[i]!=visited){
                visitedArr[i]=count;
            }
        }
        
        for (int i = 0; i < visitedArr.length; i++) {
            if(visitedArr[i]!=visited){
                System.out.println("Frequency of "+arr[i]+" is "+visitedArr[i]);
            }
            //System.out.println(visitedArr[i]);
        }
    }
}
