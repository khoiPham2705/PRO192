/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem07;

/**
 *
 * @author DELL
 */
public class NewClass {
    public static void main(String[] agrs){
        int j = 1;
        int x = 2;
        int count = 0;
        while (j == 1){
            if ( isPrime(x) == true){
                count += 1;
            }
            if (count == 10001){
                System.out.println(x);
                j = 2;
            }
            x++;
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
