
package QLMONAN;

import java.util.Scanner;

/**
 *
 * @author admini
 */
public class MonAn {
    private String id;
    private String tenMonAn;
    private double money;

    public MonAn() {
    }

    public MonAn(String id, String tenMonAn, double money) {
        this.tenMonAn = tenMonAn;
        this.money = money;
        this.id = id;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào mã món ăn: ");
        id = sc.nextLine();
        System.out.print("nhập tên món ăn: ");
        tenMonAn = sc.nextLine();
//        System.out.println("Snter the price of money");
//        money = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "MonAn{" +
                "maMonAn='" + id + '\'' +
                ", tenMonAn='" + tenMonAn + '\'' +
                ", money=" + money +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenMonAn() {
        return tenMonAn;
    }

    public void setTenMonAn(String tenMonAn) {
        this.tenMonAn = tenMonAn;
    }

    public double getGia() {
        return money;
    }

    public void setGia(double money) {
        this.money = money;
    }
    
}
