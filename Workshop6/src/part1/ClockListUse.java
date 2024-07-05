package part1;
        

// =========================================================
// Do NOT modify this file 
// =========================================================
import java.util.ArrayList;
import java.util.Scanner;

public class ClockListUse {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String filename1 = "src/Part1/data-in.txt";
        String filename2 = "src/Part1/data-out.txt";
        I_Menu menu = new Menu();
        menu.addItem("Add Clock");
        menu.addItem("Seach Clock");
        menu.addItem("Show Clock");
        menu.addItem("Print list");
        menu.addItem("Save to file");
        menu.addItem("Others: Quit");
        int choice;
        String choice2 = null;
        String choice3 = null;
        boolean quit = false;
        I_List list = new ClockList();
        list.addFromFile(filename1); // load initial data
        do {
            System.out.println("____________________________");
            System.out.println("\n       CLOCK MANAGER");
            System.out.println();
            choice = menu.getChoice();
            switch (choice) {
                case 1:
                    list.addClock();
                    break;
                case 2:
                    ArrayList<String> list2 = new ArrayList<>();
                    do {
                        list2.clear();
                        list2.add("Seach by code");
                        list2.add("Seach by make");
                        choice2 = menu.getChoice2(list2);
                        switch (choice2) {
                            case "2.1":
                                System.out.print("   Enter code: ");
                                String code = sc.nextLine();
                                list.findClockByCode(code);
                                break;
                            case "2.2":
                                System.out.print("   Enter make: ");
                                String make = sc.nextLine();
                                list.findClockByMake(make);
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
                        list3.add("Show by highest price");
                        list3.add("Show by lowest price");
                        choice3 = menu.getChoice3(list3);
                        switch (choice3) {
                            case "3.1":
                                System.out.println("   "
                                        + list.findClockWithMaxPrice());
                                break;
                            case "3.2":
                                System.out.println("   "
                                        + list.findClockWithMinPrice());
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