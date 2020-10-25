package BAI1;

import java.util.Scanner;

public class Air_Conditional extends Product{
    private double congSuat;
    private int giaBan;
    public Air_Conditional(){

    }

    public Air_Conditional(String productCode, String productName, String HSX, int day, double congSuat, int giaBan) {
        super(productCode, productName, HSX, day);
        this.congSuat = congSuat;
        this.giaBan = giaBan;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    public void Input(){
        super.Input();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap cong suat: ");
        congSuat = sc.nextDouble();
        System.out.println("nhap gia ban: ");
        giaBan = sc.nextInt();
    }
    public void Output(){
        super.Output();
        System.out.println("Cong suat: "+congSuat);
        System.out.println("gia ban: "+ giaBan);
    }
}
