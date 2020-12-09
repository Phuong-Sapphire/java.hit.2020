package Day5.kethua;

import Ex1.Person;

import java.util.Scanner;

public class SinhVien extends PerSon {
    private double diem;

    public void Input(){
        super.Input();
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap diem: ");
        diem=sc.nextDouble();

    }

    //contructor
    public SinhVien(String name, int age, String dob, double diem) {
        super(name, age, dob);
        this.diem = diem;
    }
    public SinhVien() {
    }
//getter and setter
    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }







}
