package Day5;

import java.util.ArrayList;

public class demo5 {
//    public static void show (int a){
//        System.out.println("a= "+ a);
//    }
//    public static void show (double a){
//        System.out.println("a= "+a);
//    }
//    public static void show (String a){
//        System.out.println("a= "+a);
//    }
    //generic giai quyet
    public static <T> void show(T a){
        System.out.println("a= "+a);
    }
    //chay chậm hơn nạp chồng
    //dùng trong arlist

    public static void main(String[] args) {
        //generic
        //template C++ khuon mau
//        show(0);
//        show(1.2);
//        show("phong");
//        show(5);
//        ArrayList<Integer> list =new ArrayList<>(); //Object nhận đc kiểu như generic
//        list.add(3);
//        list.add(26);
//        list.add(6);
//        list.add(1,66);
//        for (int i=0; i<list.size(); i++){
//            System.out.println(list.get(i)+" "); //lấy
//        }
//        System.out.println("=======================");
//        list.remove(1);
//        list.set(0,0);
////        list.clear(); //xoá
//        for (Integer in: list   ) {
//            System.out.println(in + " ");
//
//        }
//        date [] arr=new date[3];
//        for (int i=0; i<arr.length; i++){
//            arr[i]=new date();
//            arr[i].Input();
//        }
//

//
       // ArrayList<date> list=new ArrayList<>();
//        date x=new date(3,12,2001);
//        list.add(new date(3,5,2001));
//        list.add(new date(3,5,2001));
//        list.add(new date(3,5,2001));
//        for (date dte: list){
//            System.out.println(dte);
//        }
//        for (int i=0; i<2; i++){
//            date k=new date();
//            k.Input();
//            list.add(k);
//        }
//        for ( date d: list           ) {
//            System.out.println(d);
//        }














    }
}

