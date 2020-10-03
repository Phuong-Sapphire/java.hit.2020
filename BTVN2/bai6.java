package Bai6;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi: ");
        String str = sc.nextLine();
        str = str.trim(); //trim() xóa khoảng trắng ở đầu và cuối chuỗi
        while (str.indexOf("  ") != -1 ) //indexOf() trẩ về chỉ số của ký tự hoặc chuỗi con. nếu không có trả về -1
        {
            str = str.replaceAll("  ", " "); //replaceAll() trả về một chuỗi thay thế tất cả regex
        }
        String temp[] = str.split(" "); //split() tách chuỗi theo regex và trả về mảng chuỗi
        str = "";
        for(int i=0; i<temp.length; ++i)
        {
            str += String.valueOf(temp[i].charAt(0)).toUpperCase() + temp[i].substring(1);
            if (i < temp.length - 1) // ? ^-^
                str += " ";
        } //substring() trả về chuỗi con của một chuỗi. chỉ số bắt đầu tính từ 0 và chỉ số kết thúc bắt đầu từ 1
        System.out.println("chuỗi sau khi chuẩn hóa: "+str);
    }
}
