package BAI4;

import java.util.Scanner;

public class Student {
    private String id;
    private String name;
    private int age;
    private String address;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, int age, String address, double gpa) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("id: ");
        id = sc.nextLine();
        System.out.println("name: ");
        name = sc.nextLine();
        System.out.println("age: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("address: ");
        address = sc.nextLine();
        System.out.println("gpa: ");
        gpa = sc.nextDouble();
    }
    public void Output(){
        System.out.printf("%-12s%-12s%-12d%-12s%-12f",id,name,age,address,gpa);
        System.out.println();
    }
}
