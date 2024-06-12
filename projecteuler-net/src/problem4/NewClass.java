/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem4;

/**
 *
 * @author DELL
 */
public class NewClass {
    public static void main(String[] agrs){
        int max = 0;
        
        
        for ( int i = 998001 ; i >= 10000 ; i--){
            if ( reverseNumber(i) == true && check(i) == true){
                if (max < i){
                    max = i;
                }
            }
        
    }
        System.out.println(max);
        
        
        
    }
        
   public static boolean reverseNumber(int num) {
       int check = num; 
       int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if (reversed == check){
            return true;
        }
        return false;
    }
   public static boolean check(int n){
       for (int i = 100 ; i <=999 ; i++){
           for (int j = 100; j <= 999 ; j++){
               if ( i * j == n){
                   return true;
               }
           }
       }
       return false;
   }
}


