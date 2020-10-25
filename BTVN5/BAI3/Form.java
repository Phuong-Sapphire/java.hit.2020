package BAI3;

import java.util.ArrayList;
import java.util.Scanner;

public class Form {
    private String formCode;
    private String formName;
    private DateTime a;
    private ArrayList<Product> list = new ArrayList<>();
    int n;

    public Form() {
    }

    public Form(String formCode, String formName, DateTime a, ArrayList<Product> list, int n) {
        this.formCode = formCode;
        this.formName = formName;
        this.a = a;
        this.list = list;
        this.n = n;
    }

    public String getFormCode() {
        return formCode;
    }

    public void setFormCode(String formCode) {
        this.formCode = formCode;
    }

    public String getFormName() {
        return formName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public DateTime getA() {
        return a;
    }

    public void setA(DateTime a) {
        this.a = a;
    }

    public ArrayList<Product> getList() {
        return list;
    }

    public void setList(ArrayList<Product> list) {
        this.list = list;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("form code: ");
        formCode = sc.nextLine();
        System.out.println("form name: ");
        formName = sc.nextLine();
        System.out.println("date and time: ");
        a = new DateTime();
        a.Input();
        System.out.println("figure of product: ");
        n = sc.nextInt();
        for(int i = 0; i<n; ++i){
            System.out.println("the "+ (i+1) + " product: ");
            Product x = new Product();
            x.Input();
            list.add(x);
        }
    }
    public void Output(){
        System.out.println("========FORM========");
        System.out.println("form code: " + formCode);
        System.out.println("form name: "+formName);
        a.Output();
        System.out.printf("%-20s%-20s%-20s%-20s\n","product code","product name","figure","unit price");
        for (int i =0; i<list.size();++i){
            list.get(i).Output();
        }
        int sum = 0;
        for(int i = 0; i<list.size();i++){
            sum+= list.get(i).getFigure() * list.get(i).getUnitPrice();
        }
        System.out.println("total money: " + sum);
    }
}
