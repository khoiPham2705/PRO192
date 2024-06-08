/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part3;

/**
 *
 * @author DELL
 */
public class MyPolymorphism implements IPolymorphism {
    
    @Override
    public int f1(String str){
        String[] tmp = str.split(" ");
        int count = 0;
        for (String x : tmp){
            if ( wordMoreThan2digit(x) == true){
                count ++;
            }
        }
        return count;
    }
    
    @Override
    public void f2(String str){
        String[] tmp = str.split(" ");
        StringBuilder result = new StringBuilder();
        for ( String x : tmp){
            if ( containsEvenDigit(x) == true ) {
                result.append("ABC ");
            }
            else{
                result.append(x + " ");
            }
        }
        System.out.println(result);
    }
    private static boolean wordMoreThan2digit(String word){
        int digitCount = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isDigit(word.charAt(i))) {
                digitCount++;               
                if (digitCount >= 2) {                    
                    return true;
            }
        }
    }
    return false;
    }
    private static boolean containsEvenDigit(String word) {
    for (int i = 0; i < word.length(); i++) {
        if (Character.isDigit(word.charAt(i)) && Integer.parseInt(String.valueOf(word.charAt(i))) % 2 != 1) {
            return true;
        }
    }
    return false;
    }

}
