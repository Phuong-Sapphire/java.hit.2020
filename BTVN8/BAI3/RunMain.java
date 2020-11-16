package BAI3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        List<News> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("=======MENU=========");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.println("your choice: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    Insert(list);
                    break;
                case 2:
                    View(list);
                    break;
                case 3:
                    Average(list);
                    break;
                case 4:
                    System.exit(0);

            }

        }while (true);
    }
    public static void Insert(List<News> list){
        Scanner scanner = new Scanner(System.in);
        News x = new News();
        System.out.println("enter id : ");
        x.setId(scanner.nextInt());
        scanner.nextLine();
        System.out.println("enter title: ");
        x.setTitle(scanner.nextLine());
        System.out.println("enter publish date: ");
        x.setPublishDate(scanner.nextLine());
        System.out.println("enter author: ");
        x.setAuthor(scanner.nextLine());
        System.out.println("enter content: ");
        x.setContent(scanner.nextLine());
        System.out.println("enter rate ");
        x.InputRate();
        list.add(x);
    }
    public static void View(List<News> list){
        for (int i=0; i<list.size(); ++i){
            System.out.println("information about the "+(i+1) + "new : ");
            list.get(i).Display();
        }
    }
    public static void Average(List<News> list){
        for (int i=0; i<list.size(); ++i){
            list.get(i).Calculate();
            System.out.println("information about the "+(i+1) + "new : ");
            list.get(i).Display();
        }
    }
}
