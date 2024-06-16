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
public class Problem12 {
    public static void main(String[] agrs){
        for(int i = 0 ; i<=1000000 ; i++){
            int x = (i*(i+1))/2;
            if(divisorCount(x) >= 500){
                System.out.println(x);
                break;
            }
        }
        
        
    }
    public static int divisorCount(int number) {
        int count = 0;

        // Duyệt qua các số từ 1 đến căn bậc hai của number
        // Vì nếu i là ước của number, thì number/i cũng là ước của number
        int sqrt = (int) Math.sqrt(number);
        for (int i = 1; i <= sqrt; i++) {
            if (number % i == 0) {
                count++;
                // Nếu i không phải là căn bậc hai của number, tăng count thêm 1
                if (i != number / i) {
                    count++;
                }
            }
        }

        return count;
    }
}
