package part1;

import java.util.Scanner;

public class Clock extends Item {
    //    Your code is here!

    // Fields
    private int size;
    private int price;

    // Constructors
    public Clock() {
    }

    public Clock(String code, String make, int size, int price) {
        this.setCode(code);
        this.setMake(make);
        this.size = size;
        this.price = price;
    }

    // Getters
    public int getSize() {
        return size;
    }

    public int getPrice() {
        return price;
    }

    // Setters
    public void setSize(int size) {
        this.size = size;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Others
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter clock code: ");
        this.setCode(sc.nextLine());

        System.out.print("Enter clock maker: ");
        this.setMake(sc.nextLine());

        System.out.print("Enter clock size: ");
        this.setSize(Integer.parseInt(sc.nextLine()));

        System.out.print("Enter clock price: ");
        this.setPrice(Integer.parseInt(sc.nextLine()));

    }

    @Override
    public String toString() {
        return this.getCode() + ", " + this.getMake() + ", " + this.getSize() + ", " + this.getPrice();
    }

}