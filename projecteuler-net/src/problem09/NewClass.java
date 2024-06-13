/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem09;

/**
 *
 * @author DELL
 */
public class NewClass {
    public static void main(String[] agrs){
        int a , b ;
        double c;
        
         
        boolean cont = false;
        for( a = 1; a < 1000/3;a++){
            for ( b = 1 ; b < 1000/2 ; b++){
                c = Math.sqrt(a*a+b*b);
                if (a + b + c == 1000){
                    System.out.println((int)(a*b*c));
                }
            }
            if (cont){
                break;
            }
        }
    }
    
}
