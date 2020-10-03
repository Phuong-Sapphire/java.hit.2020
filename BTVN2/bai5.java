package Bai5;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập chuỗi: ");
        String str = sc.nextLine();
        int count =0;
        float sum=0;
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            if(Character.isDigit(ch))
            {
               count++;
               sum+=Integer.parseInt(String.valueOf(ch));
            }
        }
        System.out.println("average is "+(sum/count));
    }
}
