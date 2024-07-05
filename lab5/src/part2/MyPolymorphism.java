/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part2;

/**
 *
 * @author DELL
 */
public class MyPolymorphism implements IPolymorphism {
    @Override
    public int f1(String str){
        String[] tmp = str.split(" ");
        int max = 0;
        for ( String x : tmp){
            if ( max < x.length()){
                max = x.length();
            }        
        }
        return max;
    }
    public double f2(String str){
        String[] tmp = str.split(" ");
        double sum = 0;
        double count = 0;
        for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        if (Character.isDigit(c) && Integer.parseInt(String.valueOf(c)) % 2 == 0) {
            sum += Integer.parseInt(String.valueOf(c));
            count++;
        }
    }
    double avg = (double) sum / count;    
    return avg;
             
        
    }
    
    
}
