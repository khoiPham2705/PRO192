/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

/**
 *
 * @author DELL
 */
public class Problem14 {
    public static void main(String[] agrs){
        long count;
        long max = 1;
        long maxNum = 0;
        
        for (long i = 1 ; i <= 1000000;i++){
            count = 1;
            long sub = i;
            while ( sub != 1){
                if ( sub % 2 == 0){
                    sub /= 2;
                    count++;
                }
                else {
                    sub = 3*sub+1;
                    count++;             
                }
                
                          
            }
            if (count >= max){
                max = count;
                maxNum = i;
            }
            
        }
        System.out.println(maxNum);
        
    }
}
