package Bai2;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n: ");
        int n = sc.nextInt();
        int [] a = new int [n];
        input(a);
        output(a);
        Max(a);
        Min(a);
        Arrange(a);
    }
    public static void input(int [] a){
        Scanner in = new Scanner(System.in);
        for(int i=0; i< a.length; ++i)
        {
            System.out.println("nhập vào pt: ");
            a[i]  = in.nextInt();
        }
    }
    public  static void output(int[] a)
    {
        for(int x : a)
        {
            System.out.print(x +"\t");
        }
    }
    public static void Max(int[] a)
    {
        int max = a[0];
        for (int x: a)
        {
            if(x> max)
            {
                max = x;
            }
        }
        System.out.print("\nmax = " +max);
    }
    public static void Min(int[] a)
    {
        int min = a[0];
        for(int x: a)
        {
            if(x<min)
            {
                min = x;
            }
        }
        System.out.println("\nmin = "+min);
    }
    public static void Arrange(int[] a) {
        for (int i = 0; i < a.length - 1; ++i) {
            for (int j = i + 1; j < a.length; ++j) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("\n mảng sau khi sắp xếp: ");
        output(a);
    }
}
