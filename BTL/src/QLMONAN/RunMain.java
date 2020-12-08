
package QLMONAN;

import java.util.ArrayList;
import java.util.Scanner;
import javafx.scene.paint.Material;
/**
 *
 * @author admini
 */
public class RunMain {
    public static void main(String[] args) {
        String MaterialFileName = "nguyenlieu.txt";
        String DishFileName = "monan.txt";
        
        DataController dataController = new DataController();
        ArrayList<NguyenLieu> materials = dataController.CreateMaterialFromData(MaterialFileName);
        ArrayList<MonAn> dishes = (ArrayList<MonAn>) dataController.CreateDishFromData(DishFileName);
        Scanner sc = new Scanner(System.in);
        int choice;
        do{
            System.out.println("---------------- MENU ------------------");
            System.out.println("1. Add Material");
            System.out.println("2. Show Materials");
            System.out.println("3. Edit Material");
            System.out.println("4. Delete Material");
            System.out.println("5. Add Dish");
            System.out.println("6. Show Dishes");
            System.out.println("7. Edit Dish");
            System.out.println("8. Delete Dish");
            System.out.println("9. Sort Material");
            System.out.println("10. Sort Dish");
            System.out.println("11. Search Material");
            System.out.println("12. Search Dish");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1: 
                    String name;
                    int soLuong;
                    float giaTien;
                    System.out.println("Enter the ingredient name: ");
                    name = sc.nextLine();
                    System.out.println("Enter the quality: ");
                    soLuong = sc.nextInt();
                    System.out.println("Enter the price of money: ");
                    giaTien = sc.nextFloat();
                    NguyenLieu  material = new NguyenLieu(name, soLuong, giaTien);
                    dataController.WriteMaterialToFile(MaterialFileName , material);
                    break;
                case 2:
                    ShowAllMaterial(materials);
                    break;
                case 3:
                    String materialNameEdit;
                     ShowAllMaterial(materials);
                    System.out.println("Enter the name of the material you want to edit: ");
                    materialNameEdit = sc.nextLine();
                    int index = CheckExistMaterial(materials, materialNameEdit);
                    if( index == -1) {
                        System.out.println("Not found.");
                    } else {
                        System.out.println("Enter the name after editing: ");
                        materialNameEdit = sc.nextLine();
                        materials.get(index).setName(materialNameEdit);
                        dataController.UpdateMaterialToFile(materials, MaterialFileName);
                    }
                    break;
                    
                case 4:
                    String materialDelete;
                    do{
                         ShowAllMaterial(materials);
                        System.out.println("Enter the name of the material to be deleted: ");
                        materialDelete = sc.nextLine();
                        if(CheckExistMaterial(materials, materialDelete) == -1){
                            System.out.println("Material does not exist ");
                        }else{
                            materials.remove(CheckExistMaterial(materials, materialDelete));
                            dataController.UpdateMaterialToFile(materials, MaterialFileName);
                            break;
                        }
                    }while(true);             
                     ShowAllMaterial(materials);
                    break;
                case 5:
                    dishes = (ArrayList<MonAn>) dataController.CreateDishFromData(DishFileName);
                    String id;
                    String tenMonAn;
                    double money;
                    System.out.println("nhập mã món ăn: ");
                    id = sc.nextLine();
                    System.out.print("nhập tên món ăn: ");
                    tenMonAn = sc.nextLine();
                    System.out.print("nhập giá tiền: ");
                    money = sc.nextDouble();
                    MonAn dish = new MonAn(id, tenMonAn, money);
                    dataController.WriteDishToFile(DishFileName, dish);
                    ShowAllDishes(dishes);
                    break;
                case 6:
                    ShowAllDishes(dishes);
                    break;
                case 7:
                    dishes = (ArrayList<MonAn>) dataController.CreateDishFromData(DishFileName);
                    String dishIdEdit;
                    String dishNameEdit;
                    int choose;
                    ShowAllDishes(dishes);
                    do{
                        System.out.println("bạn muốn chỉnh sửa theo tên hay id");
                        System.out.println("1. tên món ăn \t\t\t 2. id");
                        System.out.println("lựa chọn của bạn: ");
                        choose = sc.nextInt();
                        switch (choose){
                            case 1:
                                System.out.println("nhập tên món ăn bạn muốn chỉnh sửa: ");
                                dishIdEdit = sc.nextLine();
                                boolean check = false;
                                check = checkExistId(dishes, dishIdEdit);
                                if (check){
                                    System.out.println("nhập vào id bạn muốn chỉnh sửa: ");
                                    dishIdEdit = sc.nextLine();
                                    dishes.
                                }
                        }
                    }
                        System.out.println("Enter the name of the dish you want to edit: ");
                        dishNameEdit = sc.nextLine();
                        index = checkExistDish(dishes, dishNameEdit);
                        if(index==-1){
                            System.out.println("Not found");
                        }else{
                            System.out.print("Enter the name after editing: ");
                            dishNameEdit = sc.nextLine();
                            dishes.get(index).setTenMonAn(dishNameEdit);
                            dataController.UpdateDishToFile(dishes, DishFileName);
                        }
                        break;
                case 8:
                    dishes = (ArrayList<MonAn>) dataController.CreateDishFromData(DishFileName);
                    String dishNameDelete;
                    do{
                        ShowAllDishes(dishes);
                        System.out.println("Enter the name of the dish to be deleted: ");
                        dishNameDelete = sc.nextLine();
                        if(checkExistDish(dishes, dishNameDelete) == -1){
                            System.out.println("Dish does not exist");
                        }else{
                            dishes.remove(checkExistDish(dishes, dishNameDelete));
                            dataController.UpdateDishToFile(dishes, DishFileName);
                            break;
                        }
                    } while(true);
                    ShowAllDishes(dishes);
                    break;
                case 9:
                    for(int i=0;i<materials.size()-1;i++)
                        for(int j=i+1;j<materials.size();j++)
                            if(materials.get(i).getName().compareTo(materials.get(j).getName())>0){
                                NguyenLieu temp = materials.get(i);
                                materials.set(i, materials.get(j));
                                materials.set(j, temp);
                            }
                    dataController.UpdateMaterialToFile(materials, MaterialFileName);
                    ShowAllMaterial(materials);
                    break;
                case 10:
                    dishes = (ArrayList<MonAn>) dataController.CreateDishFromData(DishFileName);
                    for(int i=0;i<dishes.size()-1;i++)
                        for(int j=i+1;j<dishes.size();j++)
                            if(dishes.get(i).getTenMonAn().compareTo(dishes.get(j).getTenMonAn())>0){
                                MonAn temp = dishes.get(i);
                                dishes.set(i, dishes.get(j));
                                dishes.set(j, temp);
                            }
                    dataController.UpdateDishToFile(dishes, DishFileName);
                    ShowAllDishes(dishes);
                    break;
                case 11:
                    String searchMaterial;
                    System.out.print("Enter the name of the ingredient to be searched: ");
                    searchMaterial = sc.nextLine();
                    ArrayList<NguyenLieu> material_1 = searchMaterialByName(materials, searchMaterial);
                    if(material_1.size() != 0){
                        for(int i=0;i<material_1.size();i++){
                            System.out.println(material_1.get(i));
                        }
                    }else{
                        System.out.println("Not found");
                    }
                    break;
                case 12:
                    dishes = (ArrayList<MonAn>) dataController.CreateDishFromData(DishFileName);
                    String searchDish;
                    System.out.print("Enter the name of the dish to be searched: ");
                    sc.nextLine();
                    searchDish = sc.nextLine();
                    ArrayList<MonAn> dish1 = searchDishByName(dishes, searchDish);
                    if(dish1.size()!=0){
                        for(int i=0;i<dish1.size();i++){
                            System.out.println(dish1.get(i));
                        }
                    }else{
                        System.out.println("Not found");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Entered wrong :))");
                    break;
            } 
             
        }while(choice!=0);
    }
    
//    
    public static void ShowAllMaterial(ArrayList<NguyenLieu> listMaterial){
        for(NguyenLieu x: listMaterial){
            System.out.println(x);
        }
    }
    
    public static void ShowAllDishes(ArrayList<MonAn> listDish){
        for(MonAn x : listDish){
            System.out.println(x);
        }
    }
    
    private static int CheckExistMaterial(ArrayList<NguyenLieu> materials, String materialName){
        for(int i=0;i<materials.size();i++){
        if(materials.get(i).getName().compareTo(materialName)==0){
            return i;
        }
    }
        return -1;
    }
    
    private static int checkExistDish(ArrayList<MonAn> dishes, String dishName){
        for(int i=0;i<dishes.size();i++){
            if(dishes.get(i).getTenMonAn().compareTo(dishName)==0)
                return i;
        }
        return -1;
    }
    private static boolean checkExistId(ArrayList<MonAn> dishes, String dishId){
        for (int i=0; i<dishes.size(); ++i){
            if (dishes.get(i).getId().compareTo(dishId) ==0){
                return true;
            }
        }
        return false;
    }
    
    public static ArrayList<NguyenLieu> searchMaterialByName(ArrayList<NguyenLieu> materials, String name){
        ArrayList<NguyenLieu> list = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getName().contains(name)){
                list.add(list.get(i));
            }
        }
        return list;   
    }
    
    public static ArrayList<MonAn> searchDishByName(ArrayList<MonAn> dishes, String name){
        ArrayList<MonAn> list = new ArrayList<>();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getTenMonAn().contains(name)){
                list.add(list.get(i));
            }
        }
        return list;
    }
}