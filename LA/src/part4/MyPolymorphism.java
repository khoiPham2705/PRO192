/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part4;

/**
 *
 * @author DELL
 */
public class MyPolymorphism implements IPolymorphism {
    
    @Override
    public void f1(String str){
        StringBuilder result = new StringBuilder();
        String[] tmp = str.split(" ");
        for (String x : tmp){
            if (wordMoreThanOneEvenDigit(x) == true){
                result.append(x + " ");
            }
        }
        System.out.println(result);
    }
    @Override
    public int f2(String str){
        String[] tmp = str.split(" ");
        int sum = 0;
        for ( String x : tmp){
            sum += sumOfOddDigit(x);
        }
        return sum;     
    }
    private static boolean wordMoreThanOneEvenDigit(String word){
        int digitCount = 0;
        for (int i = 0 ; i < word.length();i++){
            if ( Character.isDigit(word.charAt(i)) && Integer.parseInt(String.valueOf(word.charAt(i))) % 2 == 0 ){
                digitCount++;
                if ( digitCount >= 1){
                    return true;
                }
            }
        }
       return false; 
    }
    private static int sumOfOddDigit(String word) {
    int sum = 0;
    for (int i = 0; i < word.length(); i++) {
        if (Character.isDigit(word.charAt(i))) {
            int digit = Character.getNumericValue(word.charAt(i));
            if (digit % 2 != 0) {
                sum += digit;
            }
        }
    }
    return sum;
}
}

