package BAI4;

import javax.print.DocFlavor;
import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private double dienTich;
    QuanLy x;
    May[] y;
    int n;

    public PhongMay() {
    }

    public PhongMay(String maPhong, String tenPhong, double dienTich) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã phòng: ");
        maPhong = sc.nextLine();
        System.out.println("nhập tên phòng: ");
        tenPhong = sc.nextLine();
        System.out.println("nhập diện tích: ");
        dienTich = sc.nextDouble();
        x = new QuanLy();
        x.Input();
        System.out.println("nhập vào số lượng máy: ");
        n = sc.nextInt();
        y = new May[n];
        for (int i=0; i<n; ++i){
            y[i] = new May();
            y[i].Input();
        }
    }
    public void Output(){
        System.out.println("mã phòng: "+maPhong);
        System.out.println("tên phòng: "+tenPhong);
        System.out.println("diện tích: "+dienTich);
        x.Output();
        for(int i=0; i<n; ++i){
            y[i].Output();
        }
    }
}
