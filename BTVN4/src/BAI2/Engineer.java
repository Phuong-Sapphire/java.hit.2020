package BAI2;

import java.util.Scanner;

public class Engineer {
    private String maNS;
    private String name;
    private DATE NS;

    public Engineer() {
    }

    public Engineer(String maNS, String name, DATE NS) {
        this.maNS = maNS;
        this.name = name;
        this.NS = NS;
    }

    public String getMaNS() {
        return maNS;
    }

    public void setMaNS(String maNS) {
        this.maNS = maNS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DATE getNS() {
        return NS;
    }

    public void setNS(DATE NS) {
        this.NS = NS;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã nhân sự: ");
        maNS = sc.nextLine();
        System.out.println("nhập họ tên: ");
        name = sc.nextLine();
        NS = new DATE();
        NS.Input();
    }
    public void Output(){
        System.out.println("mã NS: " + maNS);
        System.out.println("họ tên: "+name);
        NS.Output();
    }
}
