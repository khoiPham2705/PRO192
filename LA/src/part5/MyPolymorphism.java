/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part5;

/**
 *
 * @author DELL
 */
public class MyPolymorphism implements IPolymorphism {
    
    @Override
    public int f1(String str){
        int sum = 0;
        String[] tmp = str.split(" ");
        for (String x : tmp){
            sum += countLetter(x);
        }
    return sum;    
    }
    @Override
    public int f2(String str){
        int num;
        int result;
        if (str.matches("-?\\d+")){
            num = Integer.parseInt(str);
            result = num * num;
        }
        else{
            result = str.length();
        }
    return result;    
    }
    private static int countLetter(String word){
        int count = 0;
        for (int i = 0 ; i < word.length() ; i++){
            if (Character.isLetter(word.charAt(i))){
                count++;
            }
        }
      return count;
    }   
}

