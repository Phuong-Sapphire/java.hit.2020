package Day5.kethua;

import Ex1.Person;

import java.util.Scanner;

public class PerSon {
    private String name;
    private int age;
    private String dob;

    public void Input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name=sc.nextLine();
        System.out.println("Nhap tuoi: ");
        age=sc.nextInt();
        sc.nextLine();//  xóa bộ nhớ đệm
        System.out.println("Nhap ngay sinh: ");
        dob=sc.nextLine();
    }


    public PerSon(String name, int age, String dob) {
        this.name = name;
        this.age = age;
        this.dob = dob;
    }
    public PerSon(){

    }

    @Override
    public String toString() {
        return "PerSon{ " +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dob='" + dob + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
