import FOOD.Bill;
import QLMONAN.DataController;
import QLMONAN.MonAn;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Khách hàng \t\t\t  2.Nhân viên ");
        System.out.println("bạn là : ");
        int choice = scanner.nextInt();
        if(choice == 1){
            String DishFileName = "monan.txt";
            DataController dataController = new DataController();
            List<MonAn> dishes = (ArrayList<MonAn>) dataController.CreateDishFromData(DishFileName);
            System.out.println(dishes.size());
            System.out.println("=============MENU===========");
            ShowAllDishes(dishes);
            System.out.println("bạn muốn ăn ở đây hay mang về");
            System.out.println("1. Ở đây \t\t\t 2. Mang về");
            System.out.println("lựa chọn của bạn: ");
            int choose = scanner.nextInt();
            if(choose == 1){
                Bill bill =  new Bill();
                bill.Input();
                int luaChon;
//                List<MonAn> food = new ArrayList<MonAn>();
                do{
                    System.out.println("1. thêm món ăn vào hóa đơn");
                    System.out.println("2. xóa món ăn");
                    System.out.println("3. tìm kiếm theo tên ");
                    System.out.println("4. sắp xếp theo giá tiền");
                    System.out.println("5. hiển thị hóa đơn");
                    System.out.println("6. out");
                    System.out.println("bạn muốn: ");
                    luaChon = scanner.nextInt();
                    switch (luaChon){
                        case 1:
                            add(bill.getFood());
                            break;
                        case 2:
                            delete(bill.getFood());
                            break;
                        case 3:
                            searchByName(bill.getFood(), dishes);
                            break;
                        case 4:
                            sortByMoney(bill.getFood(), dishes);
                            break;
                        case 5:
                            bill.show(bill.getFood());
                            show(bill.getFood(),dishes);
                            break;
                        case 6:
                            System.exit(0);
                    }
                }while (true);
            }
        }
    }
    public static void ShowAllDishes(List<MonAn> listDish){
        for(MonAn x : listDish){
            System.out.println(x);
        }
    }
    public static boolean checkExist(List<MonAn> food, String tenMonAn){
        for(int i=0; i<food.size(); ++i){
            if(food.get(i).getTenMonAn().compareTo(tenMonAn) ==0){
                return true;
            }
        }
        return false;
    }
    public static void add(List<MonAn> food){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên món ăn cần thêm: ");
        String nameFood = scanner.nextLine();
        boolean checkName = false;
        checkName = checkExist(food, nameFood);
        if(checkName){
            System.out.println("món ăn đã có trong menu");
        }
        else {
            MonAn x =  new MonAn();
            x.setTenMonAn(nameFood);
            food.add(x);
        }
    }
    public static void delete(List<MonAn> food){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên món ăn cần xóa: ");
        String nameFood = scanner.nextLine();
        boolean checkDel = false;
        checkDel = checkExist(food, nameFood);
        if(checkDel){
            for(int i=0; i<food.size(); ++i){
                if (food.get(i).getTenMonAn().compareTo(nameFood) ==0){
                    food.remove(i);
                    break;
                }
            }
        }
        else {
            System.out.println("món ăn này chưa tồn tại");
        }
    }
    public static void sortByMoney(List<MonAn> food, List<MonAn> dishes){
        for(int i=0; i<dishes.size()-1; i++){
            for (int j=i+1; j<dishes.size(); ++j){
                if(food.get(i).getTenMonAn().compareTo(dishes.get(i).getTenMonAn()) ==0)
                    if(dishes.get(i).getGia() > dishes.get(j).getGia()){
                        MonAn temp = dishes.get(i);
                        dishes.set(i, food.get(j));
                        dishes.set(j, temp);
                    }
                }
            }
        }
    public static void searchByName(List<MonAn> food, List<MonAn> dishes){
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập tên món ăn cần tìm kiếm: ");
        String name  = scanner.nextLine();
        for(int i=0; i<dishes.size(); i++){
            if(dishes.get(i).getTenMonAn().compareTo(name) == 0 && dishes.get(i).getTenMonAn().compareTo(food.get(i).getTenMonAn()) ==0){
                System.out.println(dishes.get(i));
            } else {
                System.out.println("không có món này trong menu");
            }
        }
    }
    public static double TongTien(List<MonAn> food, List<MonAn> dishes){
        double tongTien =0;
        for(int i=0; i<dishes.size(); ++i){
            Slug(dishes.get(i).getTenMonAn());
            if (dishes.get(i).getTenMonAn().compareTo(Slug(food.get(i).getTenMonAn())) == 0){
                tongTien += dishes.get(i).getGia();
            }
        }
        return tongTien;
    }
    public static void show(List<MonAn> food, List<MonAn> dishes){
        System.out.println("====thông tin món ăn=======");
        System.out.println(dishes.size());
        System.out.println(food.size());
        for (int i=0; i<dishes.size(); i++){
            if (dishes.get(i).getTenMonAn().contains(food.get(0).getTenMonAn()) && dishes.size() - i >= food.size()){
                System.out.println(dishes.get(i));
                int k = i+1;
                for(int j = 1; j< food.size(); ++j){
                    if(dishes.get(k).getTenMonAn().contains(food.get(j).getTenMonAn())){
                        System.out.println(dishes.get(k));
                        k++;
                    }
//                    System.out.println("món ăn này không có trong menu ");
                }
            }
            System.out.println("món ăn này không có trong menu");
        }
        System.out.println("tổng tiền: "+TongTien(food, dishes));
    }
    public static String Slug(String str) {
        str = str.toLowerCase();
        String from = "àáạảãâầấậẩẫăằắặẳẵèéẹẻẽêềếệểễìíịỉĩòóọỏõôồốộổỗơờớợởỡùúụủũưừứựửữỳýỵỷỹđ·/_,:;";
        String to = "aaaaaaaaaaaaaaaaaeeeeeeeeeeeiiiiiooooooooooooooooouuuuuuuuuuuyyyyyd------";
        for(int i = 0 ; i < from.length();i++) {
            str = str.replace(from.charAt(i), to.charAt(i));
        }
        return str;
    }
//    public static int compare(MonAn o1, MonAn o2) {
//        SlugString slugString = new SlugString();
//        return slugString.Slug(o1.getTenMonAn()).compareTo(slugString.Slug(o2.getTenMonAn()));
//    }
}
