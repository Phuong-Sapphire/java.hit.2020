package BAI4;

import java.util.Scanner;

public class Array {
    private int n;
    private int[] arr;
    public void InputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("n = ");
        n = sc.nextInt();
        arr = new int[n];
        for(int i=0; i<n; ++i)
        {
            System.out.println("arr["+i+"]: ");
            arr[i] = sc.nextInt();
        }
    }
    public void Show(){
        for(int x: arr)
        {
            System.out.println(x+ " ");
        }
    }
    public int Sum(){
        int sum=0;
        for(int x : arr)
        {
            sum+=x;
        }
        return sum;
    }

    public Array(int n, int[] arr) {
        this.n = n;
        this.arr = arr;
    }

    public Array() {
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }
}
