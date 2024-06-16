/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem0;

/**
 *
 * @author DELL
 */
public class Problem5 {
    public static void main(String[] agrs){
        int x = 1;
        int j = 1;
        int count=0;
        
        
        while ( j == 1){
            for (int i = 1 ; i<= 20; i++){
                if ( x % i == 0){
                    count++;
                }            
            }
            if(count == 20){
                System.out.println(x);
                j = 2;
            }
            else{
                count = 0;
            }
            x++;
        }
        
        
    }
}
