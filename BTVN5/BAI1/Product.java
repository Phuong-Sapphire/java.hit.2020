package BAI1;

import java.util.Scanner;

public class Product {
    private String productCode;
    private String productName;
    private String HSX;
    private int day;

    public Product() {
    }

    public Product(String productCode, String productName, String HSX, int day) {
        this.productCode = productCode;
        this.productName = productName;
        this.HSX = HSX;
        this.day = day;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getHSX() {
        return HSX;
    }

    public void setHSX(String HSX) {
        this.HSX = HSX;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma sp: ");
        productCode = sc.nextLine();
        System.out.println("nhap ten sp: ");
        productName = sc.nextLine();
        System.out.println("nhap hang sx: ");
        HSX = sc.nextLine();
        System.out.println("nhap ngay nhap: ");
        day = sc.nextInt();
    }
    public void Output(){
        System.out.println("Product Code: "+productCode);
        System.out.println("Product Name: "+productName);
        System.out.println("hang SX: "+HSX);
        System.out.println("day: "+day);
    }
}
