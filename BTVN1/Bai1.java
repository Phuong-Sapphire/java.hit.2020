package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vao giá trị m: ");
        int m = scan.nextInt();
        System.out.println("nhập vào giá trị n: ");
        int n = scan.nextInt();
        for( int i=1; i<=n; ++i)
        {
            for(int j=1; j<=m; ++j)
            {
                if(i==1 || i==n || j==1 || j==m)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println("");
        }

    }
}
