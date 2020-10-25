package BAI3;

import java.util.Scanner;

public class Product {
    private String productCode;
    private String productName;
    private int figure;
    private int unitPrice;

    public Product() {
    }

    public Product(String productCode, String productName, int figure, int unitPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.figure = figure;
        this.unitPrice = unitPrice;
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

    public int getFigure() {
        return figure;
    }

    public void setFigure(int figure) {
        this.figure = figure;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("product code: ");
        productCode = sc.nextLine();
        System.out.println("product name: ");
        productName = sc.nextLine();
        System.out.println("figure: ");
        figure = sc.nextInt();
        System.out.println("unit price: ");
        unitPrice = sc.nextInt();
    }
    public void Output(){
        System.out.printf("%-20s%-20s%-20d%-12d", productCode, productName,figure,unitPrice);
        System.out.println();
    }
}
