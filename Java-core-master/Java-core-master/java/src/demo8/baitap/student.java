package demo8.baitap;

import java.util.Scanner;

public class student {
    String name;
    int age;
    Scanner sc=new Scanner(System.in);
    public student() {
    }

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void input(){
        System.out.println("Enter name: ");
        name=sc.nextLine();
        System.out.println("Enter age: ");
        age=sc.nextInt();
    }
    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
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
}
