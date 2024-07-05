package part3;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class TShirtList extends TShirt implements I_List {
    List<TShirt> list = new ArrayList<>();
    
    @Override
    public void addFromFile(String fName) {
        //    Your code is here!
        if ( list.size() > 0){
            list.clear();
        }
        try{
            BufferedReader br = new BufferedReader(new FileReader(fName));
            String line;
            
            while ((line = br.readLine()) != null){
                if (line.equalsIgnoreCase("")){
                    continue;
                }
                String[] data = line.split(";");
                String code = data[0];
                String make = data[1];
                String style = data[2];
                int size = Integer.parseInt(data[3]);
                int color = Integer.parseInt(data[4]);
                
                TShirt TShirt = new TShirt(code,make,style,size,color);
                list.add(TShirt);
            }
            br.close();
        }catch(IOException e){
            System.out.println("error reading file");
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    @Override
    public void saveToFile(String fName) {
        //    Your code is here!
        if (list.isEmpty()){
            System.out.println("Empty list");
            return;
        }
        
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(fName));
            
            for (int i = 0 ; i< list.size();i++){
                bw.write(list.get(i).toString().toUpperCase().replaceAll(";",","));
                bw.newLine();
            }
            bw.close();
        }
        catch(IOException e){
            System.out.println("error");
        }
        catch(Exception e){
            System.out.println(e);                
        }
    } 

    @Override
    public int find(String code) {
        //    Your code is here!
        boolean cont = false;
        for (TShirt x: list){
            if (x.getCode().equalsIgnoreCase(code)){
                System.out.println(x);
                cont = true;
                break;
            }
        }
        if (cont == false){
            return -1;
        }
        else{
            return 1;
        }
    }

    @Override
    public void addTShirt() {
        //    Your code is here!
        TShirt tshirt = new TShirt();
        
        tshirt.input();
        list.add(tshirt);
        
    }

    @Override
    public void findTShirtByStyle(String style) {       
        //    Your code is here!
        boolean cont = false;
        for (TShirt x: list){
            if (x.getCode().equalsIgnoreCase(style)){
                System.out.println(x);
                cont = true;
                break;
            }
        }
        if (cont = false){
            System.out.println("Not found: " + style);
        }
        
        
    }
    
    @Override
    public void findTShirtByPartOfStyle(String style) {       
        //    Your code is here!
        boolean found = false;
        
        for (TShirt x : list) {
            if (x.getStyle().toLowerCase().contains(style.toLowerCase())) {
                found = true;
                System.out.println(x);
            }
        }
        
        if (!found) {
            System.out.println("Not found: " + style);
        }
    }

    @Override
    public void remove() {
        //    Your code is here!
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter code:");
        String code = scanner.nextLine().toUpperCase().trim();
        
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter code: ");
        String code = scanner.nextLine().toUpperCase().trim();
        
        if (find(code) == -1){
            System.out.println("not found");
            return;
        }
        int pos = 0;
        for ( int i = 0 ; i < list.size(); i++){
            if (list.get(i).getCode().equalsIgnoreCase(code)){
                pos = i;
            }
            
        }
        System.out.print("enter new size:");
        String t1 = scanner.nextLine().trim();
        if (t1.length() != 0) {
            list.get(pos).setSize(Integer.parseInt(t1));
        }
        System.out.print("enter new color:");
        String t2 = scanner.nextLine().trim();
        if (t2.length() != 0){
            list.get(pos).setColor(Integer.parseInt(t2));
        }
        
        
    }
    

    @Override
    public void sortAndPrint() {
        //    Your code is here!
        List<TShirt> tList = new ArrayList<>();
        tList = list;
        
        Comparator<TShirt> sortAsc = (t1, t2) -> t1.compareTo(t2);
        
        tList.sort(sortAsc);
        
        for (TShirt ts : tList) {
            System.out.println(ts.toString());
        }   
    }
}
