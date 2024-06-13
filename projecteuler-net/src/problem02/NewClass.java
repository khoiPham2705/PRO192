/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem02;

/**
 *
 * @author DELL
 */
public class NewClass {
    public static void main(String[] agrs){
        int a = 1;
        int b = 2;
        int sum = 0;
        while ( a <= 4000000){
            
            if ( b % 2 == 0){
                sum += b;
            }
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(sum);
    }
}
