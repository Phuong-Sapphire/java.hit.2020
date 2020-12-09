package HaVanPhong.Ex2;

import java.util.Scanner;

public class Document {
    private String iD, name, publh;
    private long price;
    Scanner sc= new Scanner(System.in);

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublh() {
        return publh;
    }

    public void setPublh(String publh) {
        this.publh = publh;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public void Input(){
        System.out.println("Nhap id: ");
        iD=sc.nextLine();
        System.out.println("Nhap ten: ");
        name=sc.nextLine();
        System.out.println("Nhap publisher: ");
        publh=sc.nextLine();
        System.out.println("Nhap price: ");
        price=sc.nextLong();

    }
    public void Output(){
        System.out.printf("%-20s%-20s%-20s%-20s", iD, name, publh, price);
    }


}
