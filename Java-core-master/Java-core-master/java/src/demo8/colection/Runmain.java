package demo8.colection;

import com.sun.security.jgss.GSSUtil;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Runmain {
    public static void main(String[] args) {
        List<std> list=new ArrayList<>();
        list.add(new std("phong",  19));
        list.add(new std("nam",  59));
        list.add(new std("ddong",  20));
//        Collections.sort(list, new Compare());
        list.sort(new Compare());
        for (std a: list) {
            System.out.println(a);
        }
        //ghi  file
        /*
        try {
            FileWriter fileWriter=new FileWriter("DATA.txt", false);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            PrintWriter printWriter =new PrintWriter(bufferedWriter);
            printWriter.printf("%-20s", "hahajajs");
            int stt=1;
            bufferedWriter.write("hello "+(stt++));
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    //doc file
        try {
            Scanner sc=new Scanner(Paths.get("data.txt"));
            String str;
            while (sc.hasNext()){
                str=sc.nextLine();
                System.out.println(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }


*/
    }
}
