package part5;

// =========================================================
// Do NOT modify this file 
// =========================================================
import java.util.ArrayList;
import java.util.Scanner;

public class BookListUse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String filename1 = "src/Part5/data-in.txt";
        String filename2 = "src/Part5/data-out.txt";
        I_Menu menu = new Menu();
        menu.addItem("Add Book");
        menu.addItem("Seach Book");
        menu.addItem("Update/Delete Book");
        menu.addItem("Print list");
        menu.addItem("Save to file");
        menu.addItem("Others: Quit");
        int choice;
        String choice2 = null;
        String choice3 = null;
        boolean quit = false;
        I_List list = new BookList();
        list.addFromFile(filename1); // load initial data
        do {
            System.out.println("____________________________");
            System.out.println("\n       BOOK MANAGER");
            System.out.println();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    list.addBook();
                    break;
                case 2:
                    ArrayList<String> list2 = new ArrayList<>();
                    do {
                        list2.clear();
                        list2.add("Seach by make");
                        list2.add("Seach by part of name");
                        choice2 = menu.getChoice2(list2);
                        switch (choice2) {
                            case "2.1":
                                System.out.print("   Enter make: ");
                                String make = sc.nextLine();
                                list.findBookByMake(make);
                                break;
                            case "2.2":
                                System.out.print("   Enter part of name: ");
                                String name = sc.nextLine();
                                list.findBookByPartOfName(name);
                                break;
                            default:
                                quit = true;
                        }
                    } while (!quit);
                    break;
                case 3:
                    ArrayList<String> list3 = new ArrayList<>();
                    do {
                        list3.clear();
                        list3.add("Update a Book");
                        list3.add("Delete a Book");
                        choice3 = menu.getChoice3(list3);
                        switch (choice3) {
                            case "3.1":
                                list.update();
                                break;
                            case "3.2":
                                list.remove();
                                break;
                            default:
                                quit = true;
                        }
                    } while (!quit);
                    break;
                case 4:
                    list.sortAndPrint();
                    break;
                case 5:
                    list.saveToFile(filename2);
                    break;
            }
        } while (choice > 0 && choice <= 5);
    }
}
// =========================================================
// Do NOT modify this file 
// =========================================================