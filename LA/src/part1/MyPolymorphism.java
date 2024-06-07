/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

/**
 *
 * @author DELL
 */
public class MyPolymorphism implements IPolymorphism {
    @Override
    public int f1(String str){
        int count = 0;
        String[] tmp = str.split("\\s+");
        for (String x : tmp){
            if (containsOddDigit(x)){
                count++;
            }
        }
        return count;
    }
    @Override 
    public String f2(String str){
        StringBuilder result = new StringBuilder();
        String[] tmp = str.split(" ");
        for ( String x : tmp){
            if (wordMoreThan2digit(x) == true){
                result.append("XYZ ");
            } 
            else{
                result.append(x+" ");
            }
        }
        return result.toString().trim();
    }
    private static boolean containsOddDigit(String word) {
    for (int i = 0; i < word.length(); i++) {
        if (Character.isDigit(word.charAt(i)) && Integer.parseInt(String.valueOf(word.charAt(i))) % 2 != 0) {
            return true;
        }
    }
    return false;
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
    

}

