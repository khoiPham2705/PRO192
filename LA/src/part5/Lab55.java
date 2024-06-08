/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Lab55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Test f1()");
        System.out.println("2. Test f2()");
        boolean cont = false;
        int choice = 0;
        
        do{
            
           try{
               
               Scanner sc = new Scanner(System.in);
               System.out.println("Enter TC (1 or 2): ");
               choice = sc.nextInt();
               if (choice < 1 || choice > 2){
                   throw new Exception();
            }
               cont = false;
        }
            catch(Exception e){
               System.out.println("Invalid choice, please enter again");
               cont = true;
        }
        
            }while ( cont );
        

        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        
        if (choice == 1){
            MyPolymorphism obj = new MyPolymorphism();
            int result = obj.f1(str);
            System.out.println(result);
            
        }
        if (choice == 2){
            MyPolymorphism obj = new MyPolymorphism();
            int result = obj.f2(str);
            System.out.println(result);
            
        }
    }
    
}

