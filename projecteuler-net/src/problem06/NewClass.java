/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem06;

/**
 *
 * @author DELL
 */
public class NewClass {
    public static void main(String[] agrs){
        int sum = 0;
        int sum2 = 0;
        
        for (int i = 0 ; i <= 100 ; i++){
            sum += i*i;
        }
        for(int i = 0 ; i<= 100 ; i++){
            sum2 += i;
        }
        sum2 = sum2 * sum2;
        System.out.println(sum2 - sum);
    
    
    }
}
