package BAI4;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class RunMain {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
            System.out.println("CHOOSE: ");
            System.out.println("1. Add student");
            System.out.println("2. Edit student by id");
            System.out.println("3. Delete student by id");
            System.out.println("4. Sort student by gpa");
            System.out.println("5. sort student by name");
            System.out.println("6. Show student");
            System.out.println("0. Exit");
            System.out.println("your choice: ");
            int x = sc.nextInt();
        do{
            switch (x) {
                case 1:
                    System.out.println("figure of students: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; ++i) {
                        Student a = new Student();
                        a.Input();
                        list.add(a);
                    }
                    System.out.println("your choice: ");
                    x = sc.nextInt();
                    break;
                case 2:
                    System.out.println("enter id which you need to edit: ");
                    sc.nextLine();
                    String temp = sc.nextLine();
                    int count = 0;
                    int position = 0;
                    for (int i = 0; i<list.size(); ++i){
                        if (list.get(i).getId().compareTo(temp) == 0 ){
                             position = i;
                             count++;
                        }
                    }
                    if(count == 0 ){
                        System.out.println("this id doesn't exist");
                    }
                    else {
                        Student a = new Student();
                        a.Input();
                        list.remove(position);
                        list.add(position, a);
                    }
                    System.out.println("your choice: ");
                    x = sc.nextInt();
                    break;
                case 3:
                    System.out.println("enter id which you need to delete: ");
                    sc.nextLine();
                    String tg = sc.nextLine();
                    int dem = 0;
                    int pos =0;
                    for(int i=0; i< list.size();++i){
                        if (list.get(i).getId().compareTo(tg) == 0){
                            dem++;
                            pos = i;
                        }
                    }
                    if(dem == 0){
                        System.out.println("this id doesn't exist");
                    }
                    else {
                        list.remove(pos);
                    }
                    System.out.println("your choice: ");
                    x = sc.nextInt();
                    break;
                case 4:
                    for (int i=0; i< list.size() - 1; i++){
                        for (int j=i+1; j< list.size(); ++j){
                            if (list.get(i).getGpa() > list.get(j).getGpa()){
                                Student y = list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, y);
                            }
                        }
                    }
                    System.out.println("your choice: ");
                    x = sc.nextInt();
                    break;
                case 5:
                    for (int i=0; i<list.size() - 1; i++){
                            for (int j = i+1; j<list.size(); j++){
                                if (list.get(i).getName().compareTo(list.get(j).getName()) > 0){
                                    Student z = list.get(i);
                                    list.set(i, list.get(j));
                                    list.set(j, z);
                                }
                            }
                    }
                    System.out.println("your choice: ");
                    x = sc.nextInt();
                    break;
                case 6:
                    System.out.println("=======INFORMATION ABOUT STUDENTS=======");
                    System.out.printf("%-12s%-12s%-12s%-12s%-12s\n", "id", "name", "age", "address", "gpa");
                    for(int i=0; i< list.size();++i){
                        list.get(i).Output();
                    }
                    System.out.println("your choice: ");
                    x = sc.nextInt();
                    break;
                case 0:
                    System.out.println("ENDED");
                    break;
                default:
                    System.out.println("this case is not valid");
            }
        }while (true);
    }
}

