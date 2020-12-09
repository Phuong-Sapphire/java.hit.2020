package demo8;

import java.io.FileWriter;
import java.util.Scanner;

public class runmain {
    public static void main(String[] args)   {
//        exception  ngoại lệ
//        try {
//            FileWriter a=new FileWriter("data.txt");
//        }catch{
//
//        }
        boolean kt=true;
        Scanner sc=new Scanner(System.in);
        int num=0;
        while (num==0){
            String str=sc.nextLine();
            num=Integer.parseInt(str);
            try {
                String st=sc.nextLine();
                num=Integer.parseInt(st);
            }catch (Exception e){
                //...
            }
        }
        System.out.println(num);
        try{ //try: cố gắng
            String str="1";
            int a=Integer.parseInt(str);
           // int a=8/2;
            System.out.println(a);
        }catch (Exception e){ //nếu try k thục hiện được
            System.out.println("Error");
        }finally {
            System.out.println("hello"); //ví dụ: thanks
        }

        System.out.println("hehe");


    }
}
