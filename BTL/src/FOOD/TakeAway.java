package FOOD;

import QLMONAN.MonAn;

import java.util.List;
import java.util.Scanner;

public class TakeAway extends Bill{
    private String tenKH;
    private String diaChi;
    private String soDT;

    public TakeAway() {
    }

    public TakeAway(String maHD, int gioVao, int gioRa, String nvPhucVu, int soLuongKhach, List food, int soLuongMonAn, String tenKH, String diaChi, String soDT) {
        super(maHD, gioVao, gioRa, nvPhucVu, soLuongKhach, food, soLuongMonAn);
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }
    public void Input(){
        Scanner scanner = new Scanner(System.in);
        super.Input();
        System.out.println("nhập tên khách hàng: ");
        tenKH = scanner.nextLine();
        System.out.println("nhập địa chỉ KH: ");
        diaChi = scanner.nextLine();
        System.out.println("nhập số điện thoại: ");
        soDT = scanner.nextLine();
    }
    public void show(List<MonAn> food){
        System.out.println("========INFORMATION ABOUT CUSTOMER=======");
        System.out.println("tên khách hàng: "+tenKH);
        System.out.println("địa chỉ: "+ diaChi);
        System.out.println("SĐT: "+soDT);
        super.show(food);
    }
}
