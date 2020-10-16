package bai3;

import java.util.Scanner;

public class Hang {
    private String maHang;
    private String tenHang;
    private int dongia;

    public Hang() {
    }

    public Hang(String maHang, String tenHang, int dongia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        dongia = dongia;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getdongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        dongia = dongia;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.println("nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("nhap don gia: ");
        dongia = sc.nextInt();
    }
    public void Output(){
        System.out.println("ma hang : "+maHang);
        System.out.println("ten hang: "+tenHang);
        System.out.println("don gia: "+dongia);
    }
}
