package BAI4;

import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String name;

    public QuanLy() {
    }

    public QuanLy(String maQL, String name) {
        this.maQL = maQL;
        this.name = name;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã quản lý: ");
        maQL = sc.nextLine();
        System.out.println("nhập họ tên: ");
        name = sc.nextLine();
    }
    public void Output(){
        System.out.println("mã QL: "+maQL);
        System.out.println("họ tên: "+name);
    }
}
