package DEMO_DAY6.bt;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        String str;
        Scanner sc= new Scanner(System.in);
        str=sc.nextLine();
        int d=0, s=1;
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i)<='9'&& str.charAt(i)>='0'){
//                d++;
//                s*=str.charAt(i)-48;
//            }
//        }
//        System.out.println("d: "+d +"\ts: "+s);
        for (int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){ // kiểm tra  ch<='9' &&ch>='0'
                d++;
                s*=Integer.parseInt(String.valueOf(ch));
            }
        }
        System.out.println("d= "+d+"\ts= "+s);

    }
}
