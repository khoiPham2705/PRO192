/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5.pkg1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Test f1()");
        System.out.println("2. Test f2()");
        System.out.print("Enter TC (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        
        if (choice == 1){
            MyPolymorphism obj = new MyPolymorphism();
            int output = obj.f1(str);
            System.out.println(output);
        }
        if (choice == 2){
            MyPolymorphism obj = new MyPolymorphism();
            String output = obj.f2(str);
            System.out.println(output);
        }
            
       }
    
}
