package part5;
// =========================================================
// Do NOT modify this file 
// =========================================================
//Interface for a group of objects
public interface I_List {
    void addFromFile(String fName);
    void saveToFile(String fName);
    int find(String code);
    void addBook(); 
    void findBookByMake(String make);
    void findBookByPartOfName(String name);
    void remove();
    void update();
    void sortAndPrint();
}
// =========================================================
// Do NOT modify this file 
// =========================================================