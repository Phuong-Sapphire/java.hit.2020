package BAI5;

import java.util.Scanner;

public class PERSON {
    private String name;
    private String dob;
    private String hometown;

    public PERSON() {
    }

    public PERSON(String name, String dob, String hometown) {
        this.name = name;
        this.dob = dob;
        this.hometown = hometown;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("name: ");
        name = sc.nextLine();
        System.out.println("date of birth: ");
        dob = sc.nextLine();
        System.out.println("hometown: ");
        hometown = sc.nextLine();
    }
    public void Output(){
        System.out.printf("%-15s%-15s%-15s", name, dob, hometown);
    }

    @Override
    public String toString() {
        return "PERSON{" +
                "name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", hometown='" + hometown + '\'' +
                '}';
    }
}
