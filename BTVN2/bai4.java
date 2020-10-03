package Bai4;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("nhập n: ");
      int n = sc.nextInt();
      int[] a = new int[n];
      int[] prime = new int[n];
      input(a);
      int sum=0;
      for(int i=0; i<n; ++i)
      {
          sum+= Isprime(a[i]) ? a[i] +prime[i] - i :a[i];
      }
        System.out.println("sum = "+sum);
    }
    public static void input(int [] a){
        Scanner in = new Scanner(System.in);
        for(int i=0; i< a.length; ++i)
        {
            System.out.println("nhập vào pt: ");
            a[i]  = in.nextInt();
        }
    }
    public  static  boolean Isprime(int n)
    {
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0) return false;
        }
        return n>1;
    }
    public static void prime(int[] prime, int n)
    {
        int count =2;
        for(int i=0; i<n; ++i)
        {
            do {
                if (Isprime(count))
                {
                    prime[i] = count;
                }
            } while (!Isprime(count++));
        }

    }

}
