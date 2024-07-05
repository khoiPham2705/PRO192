package part3;
import java.util.Scanner;


public class TShirt extends Item implements Comparable<TShirt> { 
    //    Your code is here!
    private String style;
    private int size;
    private int color;

    // Constructor
    public TShirt() {
    }

    public TShirt(String code, String make, String style, int size, int color) {
        this.setCode(code);
        this.setMake(make);
        this.style = style;
        this.size = size;
        this.color = color;
    }

    // Getters
    public String getStyle() {
        return style;
    }

    public int getSize() {
        return size;
    }

    public int getColor() {
        return color;
    }

    // Setters
    public void setStyle(String style) {
        this.style = style;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setColor(int color) {
        this.color = color;
    }

    // Others
    @Override
    public void input() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter code: ");
        this.setCode(sc.nextLine());

        System.out.print("Enter make: ");
        this.setMake(sc.nextLine());

        System.out.print("Enter style: ");
        this.setStyle(sc.nextLine());

        System.out.print("Enter size: ");
        this.setSize(Integer.parseInt(sc.nextLine()));

        System.out.print("Enter color: ");
        this.setColor(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String toString() {
        return this.getCode() + ", " + this.getMake() + ", " + this.getStyle() + ", " + this.getSize() + ", " + this.getColor();
    }
    @Override
    public int compareTo(TShirt obj) {        
        //    Your code is here!
        return 0;
    } 
    
}
