package FOOD;

import QLMONAN.MonAn;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bill {
    private String maHD;
    private int gioVao;
    private int gioRa;
    private String nvPhucVu;
    private int soLuongKhach;
    List food = new ArrayList<MonAn>();
    private int soLuongMonAn;

    public Bill() {
    }

    public Bill(String maHD, int gioVao, int gioRa, String nvPhucVu, int soLuongKhach, List food, int soLuongMonAn) {
        this.maHD = maHD;
        this.gioVao = gioVao;
        this.gioRa = gioRa;
        this.nvPhucVu = nvPhucVu;
        this.soLuongKhach = soLuongKhach;
        this.food = food;
        this.soLuongMonAn = soLuongMonAn;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public int getGioVao() {
        return gioVao;
    }

    public void setGioVao(int gioVao) {
        this.gioVao = gioVao;
    }

    public int getGioRa() {
        return gioRa;
    }

    public void setGioRa(int gioRa) {
        this.gioRa = gioRa;
    }

    public String getNvPhucVu() {
        return nvPhucVu;
    }

    public void setNvPhucVu(String nvPhucVu) {
        this.nvPhucVu = nvPhucVu;
    }

    public int getSoLuongKhach() {
        return soLuongKhach;
    }

    public void setSoLuongKhach(int soLuongKhach) {
        this.soLuongKhach = soLuongKhach;
    }

    public List getFood() {
        return food;
    }

    public void setFood(List food) {
        this.food = food;
    }

    public int getSoLuongMonAn() {
        return soLuongMonAn;
    }

    public void setSoLuongMonAn(int soLuongMonAn) {
        this.soLuongMonAn = soLuongMonAn;
    }

    public void Input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập mã hóa đơn: ");
        maHD= scanner.nextLine();
        System.out.println("nhập giờ vào: ");
        gioVao = scanner.nextInt();
        System.out.println("nhập giờ ra: ");
        gioRa = scanner.nextInt();
        System.out.println("nhập nhân viên phục vụ: ");
        scanner.nextLine();
        nvPhucVu = scanner.nextLine();
        System.out.println("nhập số lượng khách: ");
        soLuongKhach = scanner.nextInt();
        System.out.println("nhập số lượng món ăn: ");
        soLuongMonAn = scanner.nextInt();
        for(int i=0; i<soLuongMonAn; ++i){
            MonAn x = new MonAn();
            x.Input();
            food.add(x);
        }
    }
    public boolean checkExist(List<MonAn> food, String tenMonAn){
        for(int i=0; i<food.size(); ++i){
            if(food.get(i).getTenMonAn() == tenMonAn){
                return true;
            }
        }
        return false;
    }
    public void add(List<MonAn> food){
       Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên món ăn cần thêm: ");
        String nameFood = scanner.nextLine();
        boolean checkName = false;
        checkName = checkExist(food, nameFood);
        if(checkName){
            System.out.println("món ăn đã có trong menu");
        }
        else {
            for(int i=0; i<food.size(); i++){
                MonAn x = new MonAn();
                x.Input();
                food.add(x);
            }
        }
    }
    public void delete(List<MonAn> food){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên món ăn cần xóa: ");
        String nameFood = scanner.nextLine();
        boolean checkDel = false;
        checkDel = checkExist(food, nameFood);
        if(checkDel){
            for(int i=0; i<food.size(); ++i){
                if (food.get(i).getTenMonAn() == nameFood){
                    food.remove(i);
                    break;
                }
            }
        }
        else {
            System.out.println("món ăn này chưa tồn tại");
        }
    }
    public void sortByMoney(List<MonAn> food){
        for(int i=0; i<food.size()-1; i++){
            for (int j=i+1; j<food.size(); ++j){
                if(food.get(i).getGia() > food.get(j).getGia()){
                    MonAn temp = food.get(i);
                    food.set(i, food.get(j));
                    food.set(j, temp);
                }
            }
        }
    }
    public void searchByName(List<MonAn> food){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên món ăn cần tìm kiếm: ");
        String name  = scanner.nextLine();
        for(int i=0; i<food.size(); i++){
            if(food.get(i).getTenMonAn() == name){
                System.out.println(food.get(i));
            } else {
                System.out.println("không có món này trong menu");
            }
        }
    }
    public double tongTien(List<MonAn> food){
        double tongTien = 0;
        for (int j=0; j<food.size(); ++j){
            tongTien += food.get(j).getGia();
        }
        return tongTien;
    }
    public void show(List<MonAn> food){

        System.out.println("mã hóa đơn: "+maHD);
        System.out.println("giờ vào: "+gioVao +"\t\t\t" + "giờ ra: "+gioRa );
        System.out.println("nhân viên: "+nvPhucVu);
        System.out.println("số lượng khách: "+soLuongKhach);
    }
}
