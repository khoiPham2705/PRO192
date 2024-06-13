/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem01;

/**
 *
 * @author DELL
 */
public class NewClass {
    public static void main(String[] agrs){
        int sum = 0;
        for (int i = 1; i < 1000;i++){
            if (i % 3 == 0 || i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
