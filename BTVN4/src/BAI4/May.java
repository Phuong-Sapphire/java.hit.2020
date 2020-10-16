package BAI4;

import java.util.Scanner;

public class May {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public May() {
    }

    public May(String maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }

    public String getMaMay() {
        return maMay;
    }

    public void setMaMay(String maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã máy: ");
        maMay = sc.nextLine();
        System.out.println("nhập kiểu máy: ");
        kieuMay = sc.nextLine();
        System.out.println("nhập tình trạng: ");
        tinhTrang = sc.nextLine();
    }
    public void Output(){
        System.out.println("mã máy: "+maMay + "\t" + "kiểu máy: "+kieuMay + "\t" + "tình trạng: "+tinhTrang);
    }
}
