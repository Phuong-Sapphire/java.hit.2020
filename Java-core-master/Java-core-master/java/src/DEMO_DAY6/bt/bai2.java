package DEMO_DAY6.bt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("n= ");
        n=sc.nextInt();
        ArrayList<Double> l =new ArrayList<>();
//        l.add(1.2);
//        l.add(3.6);
//        l.add(5.5);
//        l.add(1.5);
        double []a=new double[n];
        for (int i=0; i<n; i++){
            System.out.println("Enter A["+i+"]= ");
            a[i]=sc.nextDouble();
            l.add(a[i]);
        }
        for (Double d: l ) {
            System.out.println(d);
        }
        Collections.sort(l);
        Collections.reverse(l);
        System.out.println("sx==========");
        for (Double d: l ) {
            System.out.println(d.toString());
        }
        System.out.println("=========");

        ArrayList<Double> scp=new ArrayList<>();
        int count=0;
        for (int i=0; i<n; i++){
            if(check(a[i])) {
                scp.add(a[i]);
                count++;
            }
        }
        System.out.println("Có " +count +" số chính phương");
        for (Double d:scp) {
            System.out.println(d+" ");
        }

    }
    public static boolean check(double a){
        int sq=(int)Math.sqrt(a);
        return ( (sq*sq-a) ==0);
    }
    public static boolean checksnt(int n){
        for (int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return n>1;
    }

}
