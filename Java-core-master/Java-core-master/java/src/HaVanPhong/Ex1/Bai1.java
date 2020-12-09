package HaVanPhong.Ex1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        int sum=0, count=0;
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                sum+=Integer.parseInt(String.valueOf(ch));
                count++;
            }

        }
        System.out.println("Tong: "+sum+"\nSo chu so: " +count);

        int tich=1;
        for (int i=0; i<str.length(); i++){
            if( check(sum, str.charAt(i)-48 ) ) tich*=(str.charAt(i)-48);
        }
        System.out.println("Tich: "+ tich);
    }
    static boolean  check(int x, int y){
        if(y==0) return false;
        if(x%y==0) return true;
        return false;
    }
}
