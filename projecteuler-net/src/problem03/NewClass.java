/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem03;

/**
 *
 * @author DELL
 */
public class NewClass {
    public static void main(String[] agrs){
        long  a = 600851475143L;
        int i = 2;
        while ( a > 1){
            
            if ( isPrime(i) == true){
                if (a % i == 0){
                    System.out.println(i);
                    a /= i;
                }
            }
            i++;
        }
        
    
}
    public static boolean isPrime(int n){
        if ( n <= 1){
            return false;
        }
        else{
            for (int i = 2 ; i * i <= n ; i++){
                if ( n % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
