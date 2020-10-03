package Bai3;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHOOSE: ");
        System.out.println("1. tạo và nhập mảng với n số nguyên ");
        System.out.println("2. hiển thị mảng vừa tạo ");
        System.out.println("3. thêm một phần tử vào vị trí k");
        System.out.println("4. xóa một phần tử ở vị trí k");
        System.out.println("5. đảo ngược mảng");
        System.out.println("6. hiển thị phần tử a[1] và các số chia hết cho a[1]");
        System.out.println("7. thoát");
        System.out.println("nhập vào sự lựa chọn: ");
        int x = sc.nextInt();
        int n;
        System.out.println("nhập n: ");
        n = sc.nextInt();
        int[] a = new int[n];
        do {
            switch (x){
                case 1:
                    input(a);
                    System.out.println("\nnhập vào sự lựa chọn: ");
                    x = sc.nextInt();
                    break;
                case 2:
                    output(a);
                    System.out.println("\nnhập vào sự lựa chọn: ");
                    x = sc.nextInt();
                    break;
                case 3:
                    System.out.println("nhập vào vị trí cần chèn: ");
                    int k = sc.nextInt();
                    System.out.println("nhập vào số cần chèn: ");
                    int y = sc.nextInt();
                    insert(a,y,k);
                    System.out.println("\nnhập vào sự lựa chọn: ");
                    x = sc.nextInt();
                    break;
                case 4:
                    System.out.println("nhập vị trí cần xóa: ");
                    int m = sc.nextInt();
                    delete(a,m);
                    System.out.println("\nnhập vào sự lựa chọn: ");
                    x = sc.nextInt();
                    break;
                case 5:
                    reverse(a);
                    System.out.println("\nnhập vào sự lựa chọn: ");
                    x = sc.nextInt();
                    break;
                case 6:
                    display(a);
                    System.out.println("\nnhập vào sự lựa chọn: ");
                    x = sc.nextInt();
                    break;
                case 7:
                    System.out.println("program ended");
                    break;
                default:
                    System.out.println("lựa chọn không hợp lệ ");
            }
        } while (x!=7);
    }
    public  static void input (int[] a)
    {
        Scanner in = new Scanner(System.in);
        for(int i=0; i< a.length; ++i)
        {
            System.out.println("nhập vào pt: ");
            a[i]  = in.nextInt();
        }

    }
    public static void output(int[] a)
    {
        for(int x: a)
        {
            System.out.print(x+" ");
        }
    }
    public static void insert(int[] a, int x, int k)
    {
        int length = a.length;
        int temp[] = new int[length +1];
        System.arraycopy(a,0,temp,0,k);
        temp[k]=x;
        System.arraycopy(a,k,temp,k+1,length-k);
        System.out.println("\n mảng sau khi chèn: ");
        output(temp);
    }
    public static void delete(int[] a, int m)
    {
        int temp[]= new int[a.length -1];
        int index =0;
        for(int i=0; i<a.length; ++i)
        {
            if( i!= m-1)
            {
                temp[index]=a[i];
                index++;
            }
        }
        System.out.println("\n mảng sau khi xóa: ");
        output(temp);
    }
    public static void reverse(int[] a)
    {
        int[] temp = new int[a.length];
        for(int i=0; i<a.length; i++)
        {
            temp[a.length-i-1]=a[i];
        }
        System.out.println("\n mảng sau khi đảo ngược: ");
        output(temp);
    }
    public static void display(int[] a)
    {
        System.out.println("a[1]: "+ a[1]);
        int count =0;
        for(int i=0; i<a.length; ++i)
        {
            if(a[i]%a[1] == 0 )
            {
                count++;
            }
        }
        if(count ==0)
        {
            System.out.println("\n không có số nào chia hết cho a[1]");
        }
        else {
            System.out.println("\ncác số chia hết cho a[1]: ");
            for(int i=2; i<a.length; ++i)
            {
                if(a[i]%a[1] == 0 )
                {
                    System.out.print(a[i]+" ");
                }
            }
        }
    }
}
