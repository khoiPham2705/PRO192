/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problem1;

import java.math.BigInteger;

/**
 *
 * @author DELL
 */
public class Problem16 {
    public static void main(String[] agrs){
        BigInteger base = BigInteger.valueOf(2);
        
        // Calculate 2^1000 using the pow method
        BigInteger result = base.pow(1000);
        
        String resultString = result.toString();
        
        // Initialize sum of digits
        int sumOfDigits = 0;
        
        // Iterate over each character in the string
        for (int i = 0; i < resultString.length(); i++) {
            // Convert the character to a digit and add to the sum
            sumOfDigits += Character.getNumericValue(resultString.charAt(i));
        }
        
        // Output the sum of the digits
        System.out.println("Sum of the digits of 2^1000: " + sumOfDigits);
    }
        
        
    }

