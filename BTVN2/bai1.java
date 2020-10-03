package Bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("nhập a: ");
        a = sc.nextInt();
        System.out.println("nhập b: ");
        b = sc.nextInt();
        System.out.println("nhập c: ");
        c = sc.nextInt();
        int max= a;
        if (b > max)
        {
            max = b;
        }
        if(c > max)
        {
            max = c;
        }
        System.out.println("max = " +max);
    }
}
