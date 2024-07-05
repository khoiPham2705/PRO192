package part5;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class BookList extends Book implements I_List {
    
    List<Book> list = new ArrayList<>();
    
    @Override
    public void addFromFile(String fName) {
        //    Your code is here!
        if (list.size() > 0) {
            list.clear();
        }
        
        try {
            BufferedReader br = new BufferedReader(new FileReader(fName));
            String line;
            
            while ((line = br.readLine()) != null) {
                if (line.equalsIgnoreCase("")) {
                    continue;
                }
                
                String[] data = line.split("-");
                Book bk = new Book();
                
                bk.setCode(data[0]);
                bk.setMake(data[1]);
                bk.setName(data[2]);
                bk.setYear(Integer.parseInt(data[3]));
                
                list.add(bk);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + fName);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public void saveToFile(String fName) {
        //    Your code is here!

        if (list.isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(fName));
            
            for (int i = 0; i < list.size(); i++) {
                bw.write(list.get(i).toString().toUpperCase().replaceAll(",", ";"));
                bw.newLine();
            }
            
            bw.close();
        } catch (IOException e) {
            System.out.println("Error writing file: " + fName);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    @Override
    public int find(String code) {
        //    Your code is here!

        boolean found = false;
        
        Book tmp = new Book();
        
        for (Book x : list) {
            if (x.getCode().equalsIgnoreCase(code)) {
                tmp = x;
                found = true;
            }
        }
        
        if (found) {
            return 1;
        } else {
            return -1;
        }
    }
    
    @Override
    public void addBook() {
        //    super.input();
        //    Your code is here!

        Book bk = new Book();
        
        bk.input();
        
        list.add(bk);
    }
    
    @Override
    public void findBookByMake(String make) {
        //    Your code is here!

        boolean found = false;
        
        for (Book x : list) {
            if (x.getMake().equalsIgnoreCase(make)) {
                System.out.println(x);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Not found: " + make);
        }
    }
    
    @Override
    public void findBookByPartOfName(String name) {
        //    Your code is here!

        boolean found = false;
        
        for (Book x : list) {
            if (x.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(x);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Not found: " + name);
        }
    }
    
    @Override
    public void remove() {
        //    Your code is here!

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        String code = sc.nextLine().toUpperCase().trim();
        
        if (find(code) == -1) {
            System.out.println("Not found: " + code);
            return;
        }
        
        int pos = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equalsIgnoreCase(code)) {
                pos = i;
            }
        }
        
        list.remove(pos);
        System.out.println("Removed: " + code);
    }
    
    @Override
    public void update() {
        //    Your code is here!
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter code: ");
        String code = sc.nextLine().toUpperCase().trim();
        
        if (find(code) == -1) {
            System.out.println("Not found: " + code);
            return;
        }
        
        int pos = 0;
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equalsIgnoreCase(code)) {
                pos = i;
            }
        }
        
        System.out.print("Enter new code: ");
        String t1 = sc.nextLine().trim();
        if (t1.length() != 0) {
            list.get(pos).setCode(t1);
        }
        
        System.out.print("Enter new make: ");
        String t2 = sc.nextLine().trim();
        if (t2.length() != 0) {
            list.get(pos).setMake(t2);
        }
        
        System.out.print("Enter new name: ");
        String t3 = sc.nextLine().trim();
        if (t3.length() != 0) {
            list.get(pos).setName(t3);
        }
        
        System.out.print("Enter new year: ");
        String t4 = sc.nextLine().trim();
        if (t4.length() != 0) {
            list.get(pos).setYear(Integer.parseInt(t4));
        }
    }
    
    @Override
    public void sortAndPrint() {
        //    Your code is here!
        List<Book> tList = new ArrayList<>();
        tList = list;
        
        Comparator<Book> sortYearAsc = (b1, b2) -> b1.compareTo(b2);
        
        tList.sort(sortYearAsc);
        Collections.reverse(tList);
        
        for (Book x : tList) {
            System.out.println(x.toString());
        }
    }
}