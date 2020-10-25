package BAI1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<Air_Conditional> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so luong dieu hoa: ");
        int n = sc.nextInt();
        for(int i = 0; i<n; ++i) {
            Air_Conditional x = new Air_Conditional();
            x.Input();
            list.add(x);
        }
//        for (int i = 0; i<list.size(); ++i)
//        {
//            list.get(i).Output();
//        }
        int min = list.get(0).getGiaBan();
        int count =0;
        for(int i=0; i<list.size(); ++i){
             if(list.get(i).getGiaBan()<min && list.get(i).getHSX().compareTo("electrolux") == 0) {
                 min = list.get(i).getGiaBan();
                 count++;
             }
        }
        if(count == 0){
            System.out.println("NOT EXIST");
        }
        else {
            System.out.println("===LIST====");
            for(int i=0; i<list.size(); ++i){
                if(list.get(i).getGiaBan() == min && list.get(i).getHSX().compareTo("electrolux") == 0){
                    list.get(i).Output();
                }
            }
        }
    }
}
