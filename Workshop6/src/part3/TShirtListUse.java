package part3;
// =========================================================
// Do NOT modify this file 
// =========================================================
import java.util.ArrayList;
import java.util.Scanner;

public class TShirtListUse {
   public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String filename1 = "src/part3/data-in.txt";
        String filename2 = "str/part3/data-out.txt";
        I_Menu menu = new Menu();
        menu.addItem("Add tShirt");
        menu.addItem("Seach tShirt");
        menu.addItem("Update/Delete tShirt");
        menu.addItem("Print list");
        menu.addItem("Save to file");
        menu.addItem("Others: Quit"); 
        int choice;
        String choice2 = null;
        String choice3 = null;
        boolean quit = false;
        I_List list = new TShirtList();
        list.addFromFile(filename1); // load initial data
        do{
           System.out.println("____________________________");
           System.out.println("\n     T-SHIRT MANAGER");
           System.out.println();
           choice= menu.getChoice();
           switch(choice){
                case 1: list.addTShirt(); break;
                case 2: 
                    ArrayList<String> list2 = new ArrayList<>();
                    do{                        
                        list2.clear();
                        list2.add("Seach by style");
                        list2.add("Seach by part of style");
                        choice2 = menu.getChoice2(list2);
                        switch(choice2) {
                            case "2.1": 
                                System.out.print("   Enter style: ");
                                String style1 = sc.nextLine();  
                                list.findTShirtByStyle(style1);
                                break;   
                            case "2.2": 
                                System.out.print("   Enter part of style: ");
                                String style2 = sc.nextLine();  
                                list.findTShirtByPartOfStyle(style2);
                                break;
                            default:
                                quit = true;
                        }   
                    } while (!quit); 
                    break;
                case 3: 
                    ArrayList<String> list3 = new ArrayList<>();
                    do{                        
                        list3.clear();
                        list3.add("Update a tShirt");
                        list3.add("Delete a tShirt");
                        choice3 = menu.getChoice3(list3);
                        switch(choice3) {
                            case "3.1": 
                                list.update();break;    
                            case "3.2": 
                                list.remove();break;
                            default:
                                quit = true;
                        }   
                    } while (!quit); 
                    break;
                case 4: list.sortAndPrint();break;
                case 5: list.saveToFile(filename2);break;
           }
       }
       while (choice>0 && choice<=5);
   }   
}
// =========================================================
// Do NOT modify this file 
// =========================================================