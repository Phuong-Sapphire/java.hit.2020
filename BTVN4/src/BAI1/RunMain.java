package BAI1;

import java.util.ArrayList;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        ArrayList<BOOK> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số lượng sách: ");
        int n = sc.nextInt();
        for(int i=0; i<n; ++i){
            BOOK x = new BOOK();
            x.Input();
            list.add(x);
        }
        System.out.println("====INFORMATION=====");
        for(int i=0; i< list.size(); i++){
            System.out.println("thông tin về cuốn sách thứ "+i+1);
            System.out.println("mã sách: "+list.get(i).getBookCode()+"\t"+ "tên sách: "+list.get(i).getBookName());
            System.out.println("NXB: "+list.get(i).getPublishingHouse()+"\t" +"số trang: "+list.get(i).getPageNumber());
            System.out.println("đơn giá: "+list.get(i).getPrice());
        }
    }
}
