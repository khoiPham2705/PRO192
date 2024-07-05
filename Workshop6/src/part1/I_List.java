package part1;
// =========================================================
// Do NOT modify this file 
// =========================================================
//Interface for a group of objects
public interface I_List {
    void addFromFile(String fName);
    void saveToFile(String fName);
    void addClock(); 
    void findClockByCode(String code);
    void findClockByMake(String make);
    Clock findClockWithMaxPrice();
    Clock findClockWithMinPrice();
    void countClock();
    void sortAndPrint();
}
// =========================================================
// Do NOT modify this file 
// =========================================================