package HaVanPhong.Ex2;

import java.util.Scanner;

public class Book extends Document{
    private int numOP;
    private String author;
    Scanner sc=new Scanner(System.in);
    public void Input(){
        System.out.println("Enter numofpage: ");
        numOP=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter author: ");
        author=sc.nextLine();
        super.Input();
    }
    public void Output(){
        super.Output();
        System.out.printf("%-20d%-20s\n", numOP, author);

    }

    public int getNumOP() {
        return numOP;
    }

    public void setNumOP(int numOP) {
        this.numOP = numOP;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public Scanner getSc() {
        return sc;
    }

    @Override
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
}
