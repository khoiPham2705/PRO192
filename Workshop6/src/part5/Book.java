package part5;

import java.util.Scanner;

public class Book extends Item implements Comparable<Book> {
    //    Your code is here!

    // Files
    private String name;
    private int year;

    // Constructors
    public Book() {
    }

    public Book(String code, String make, String name, int year) {
        this.setCode(code);
        this.setMake(make);
        this.name = name;
        this.year = year;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Others
    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter code: ");
        this.setCode(sc.nextLine());

        System.out.print("Enter make: ");
        this.setMake(sc.nextLine());

        System.out.print("Enter name: ");
        this.setName(sc.nextLine());

        System.out.print("Enter year: ");
        this.setYear(Integer.parseInt(sc.nextLine()));
    }

    @Override
    public String toString() {
        return this.getCode() + ", " + this.getMake() + ", " + this.getName() + ", " + this.getYear();
    }

    @Override
    public int compareTo(Book obj) {
        //    Your code is here!
        return Integer.compare(this.getYear(), obj.getYear());
    }
}