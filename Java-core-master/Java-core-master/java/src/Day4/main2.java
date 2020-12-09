package Day4;

import Ex4.Array;

import java.util.ArrayList;

public class main2 {

//    public static double Sum(double a, double b){
//        return a+b;
//    }
//    public static <T> T Sum(T a, T b){
//        return a+b;
////        System.out.println(a);
////        System.out.println(b);
//    }

    public static void main(String[] args) {
        // Sum(2.2,5.3);
//        System.out.println(Sum(2.4, 5.4));
//        MyG <Integer> mg=new MyG <>();
//        mg.setObj(55544);
//        System.out.println(mg.getObj);
        ArrayList<SinhVien> list = new ArrayList<>();
        SinhVien sv = new SinhVien();
        list.add(sv);
        list.add(new SinhVien("78", "phondfffg"));
        list.add(new SinhVien("78", "phondfdfdfdg"));
        list.add(new SinhVien("78", "phongdfdfd"));
        list.remove(1);


//        list.add("phong");
//        list.add("dong");
//        list.add("oke");
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i).getMaSv());
        System.out.println(list.get(i).getMaSv());
        System.out.println(list.get(i).getMaSv());
    }


        // System.out.println(list.size());
    }
}
