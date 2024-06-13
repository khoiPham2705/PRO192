/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem10;

/**
 *
 * @author DELL
 */
public class NewClass {
    public static void main(String[] agrs){
        long sum = 0;
        for(long i = 1 ; i <= 2000000;i++){
            if ( isPrime(i) == true){
                
                sum += i;
                
            }
        }
        System.out.println("sum:" + sum);
    }
    public static boolean isPrime(long n){
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
