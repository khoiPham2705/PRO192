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
public class thptqg {
    public static void main(String[] agrs){
        int count = 0;

        for (int a = 2; a <= 1000; a++) {
            int countB = 0;

            for (int b = -10000; b <= 1000; b++) {
                double powB = Math.pow(b, 2);
                double x = Math.pow(2, powB);
                double y = Math.pow(8, -b);
                double z = Math.pow(a, b + 3);
                double yz = y * z;

                if (x < yz) {
                    countB++;
                    if (countB > 7) {
                        break; 
                    }
                }
            }

            if (countB <= 7) {
                count++;
                
                
            }
        }

        System.out.println( count);
    }
}
