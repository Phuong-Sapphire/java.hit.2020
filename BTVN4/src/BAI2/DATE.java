package BAI2;

import java.util.Scanner;

public class DATE {
    private int day;
    private int month;
    private int year;

    public DATE() {
    }

    public DATE(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập ngày: ");
        day = sc.nextInt();
        System.out.println("nhập tháng: ");
        month = sc.nextInt();
        System.out.println("nhập năm: ");
        year = sc.nextInt();
    }
    public void Output(){
        System.out.println(day + "-" + month + "-" + year);
    }
}
