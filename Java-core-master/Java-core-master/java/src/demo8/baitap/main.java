package demo8.baitap;

import BTVN_day5.Ex4.Student;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       List <student> list= new ArrayList<>();
//        for (int i=0; i<3; i++){
//            student k=new student();
//            k.input();
//            list.add(k);
//        }
        //Collections.sort(list, new compare());
        list.add(new student("phong",  19));
        list.add(new student("nam",  59));
        list.add(new student("ddong",  20));
        //ghi file

        try{
            FileWriter fileWriter=new FileWriter("bahs.txt", false);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            PrintWriter printWriter =new PrintWriter(bufferedWriter);
            printWriter.printf("%-20s%-20s\n", "Name", "Age");
            for (student a:list) {
                printWriter.printf("%-20s%-20d\n",a.getName(),a.getAge());
            }
            printWriter.close();
            bufferedWriter.close();
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        //doc file
            try {
                Scanner sc=new Scanner(Paths.get("bahs.txt"));
                String str;
                while(sc.hasNext()){
                    str=sc.nextLine();
                    System.out.println(str);
                }
            }catch (IOException e){
                e.printStackTrace();
            }




    }
}
