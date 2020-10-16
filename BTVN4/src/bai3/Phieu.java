package bai3;

import javax.swing.text.ChangedCharSetException;
import java.util.Scanner;

public class Phieu {
    private String maPhieu;
    private Hang[] x;
    private int n;

    public Phieu() {
    }

    public Phieu(String maPhieu, Hang[] x, int n) {
        this.maPhieu = maPhieu;
        this.x = x;
        this.n = n;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public Hang[] getX() {
        return x;
    }

    public void setX(Hang[] x) {
        this.x = x;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.println("nhap so luong hang: ");
        n = sc.nextInt();
        x = new Hang[n];
        for(int i=0; i<n; ++i){
            x[i] = new Hang();
            x[i].Input();
        }
    }
    public void Output(){
        System.out.println("ma phieu: "+maPhieu);
        System.out.println("====== thong tin ve mat hang======");
        for (int i=0; i<n; ++i){
            x[i].Output();
        }
        int Sum = 0;
        for (int i =0 ; i<n; ++i){
            Sum+=x[i].getdongia();
        }
        System.out.println("total money: "+Sum);
    }
}
