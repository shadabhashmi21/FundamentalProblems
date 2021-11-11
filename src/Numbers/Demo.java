/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Numbers;

import java.util.Scanner;

/**
 *
 * @author shada
 */
public class Demo {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the String to be permuted");
        //System.out.println(createNum(ob.nextInt(), ob.nextInt(), ob.nextInt()));
        int a = ob.nextInt();
        int b = ob.nextInt();
        int c = ob.nextInt();
        int num = createNum(a, b, c);
        System.out.println(num);
    }
    
    static int createNum(int a, int b, int c){
        int num = 0;
        int x,y,z;
        x=y=z=0;
        if(a > b && a > c){
            x = a;
            if(b>c){
                y = b;
                z = c;
            }else{
                z = b;
                y = c;
            }
        }
        else if(b > c) {
            x = b;
            if(a > c){
                y = a;
                z = c;
            }else{
                y = c;
                z = a;
            }
        }
        else{
            x = c;
            if(a > c){
                y = a;
                z = b;
            }else{
                y = b;
                z = a;
            }
        }
        return 100 * x + 10 * y + z;
    }
}
