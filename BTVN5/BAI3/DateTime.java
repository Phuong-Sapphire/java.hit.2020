package BAI3;

import java.util.Scanner;

public class DateTime {
    private int day;
    private int month;
    private int year;

    public DateTime() {
    }

    public DateTime(int day, int month, int year) {
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
        System.out.println("day: ");
        day = sc.nextInt();
        System.out.println("month: ");
        month = sc.nextInt();
        System.out.println("year: ");
        year = sc.nextInt();
    }
    public void Output(){
        System.out.print("date and time: ");
        System.out.println(day + "/" + month + "/" + year);
    }

}
