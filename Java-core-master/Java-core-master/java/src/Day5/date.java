package Day5;

import java.util.Scanner;

public class date {
    private int day, month, year;

    public void Input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ngay: ");
        day=sc.nextInt();
        System.out.println("Nhap thang: ");
        month=sc.nextInt();
        System.out.println("Nhap nam: ");
        year=sc.nextInt();
    }
    public void HienThiii(){
        System.out.println("\t" +day +" -" +month+"-"+year);
    }

//contructor
    public date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public date(){

    }

    @Override
    public String toString() {
        return "date{" +
                "day=" + day +
                ", month=" + month +
                ", phong dep trai year=" + year +
                '}';
    }

    //getter and setter
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
}
