package Array;

import java.util.Scanner;

/**
 * A Java based program to find Second Highest of an array without sorting.
 * @author shadab
 */
public class SecondHighest {
    
    public static void main(String[] args) {
        System.out.println("SECOND ARRAY");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        MyResult res = secondHighest(arr);
        System.out.println("Largest Element = " + res.getFirst());
        System.out.println("Second Largest Element = " + res.getSecond());
    }
    
    static MyResult secondHighest(int arr[]) {
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        } 
        return new MyResult(largest, secondLargest);
    }
}
