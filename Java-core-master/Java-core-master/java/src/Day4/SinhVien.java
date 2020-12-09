package Day4;

import java.util.Scanner;

public class SinhVien {
    private String maSv;
    private String hoTen;
    private int stt;
    private date ngaySinh;   // quan hệ has a => tiết kiệm code

    public date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public void InputInfor (){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ma sinh vien: ");
        maSv=sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen=sc.nextLine();
        ngaySinh =new date();
        ngaySinh.Input();
    }

    //contructor
    public SinhVien(String maSv, String hoTen) {
        this.maSv = maSv;
        this.hoTen = hoTen;
    }
    public SinhVien(){
    }
//getter and setter
    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
 //okeeee
    public void HienThi(){
        System.out.println("Ma sinh vien: " +maSv);
        System.out.println("Ho ten: " +hoTen);
        ngaySinh.HienThiii();
    }
    public  void HienThi(int stt){
        System.out.println("STT: " +stt);
        System.out.println("Ma sinh vien: " +maSv);
        System.out.println("Ho ten: " +hoTen);
        ngaySinh.HienThiii();
    }
}
