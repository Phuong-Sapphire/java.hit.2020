package HaVanPhong.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);

        int choice;
        do{
            System.out.println("==========================MENU======================================================================");
            System.out.println("1. ADD BOOK \t2. EDIT BOOK BY ID\t3.Delete book by id\t4.Sort book by name (ascending)\t5.Sort book by price (descending)\n6.Show all books\t0.EXIT\n");
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Nhap so sach: ");
                    int n=sc.nextInt();
                   // Book []b=new Book[n];
                    for (int i=0; i<n; i++){
                        System.out.println("NHAP SACH THU "+(i+1));
                        Book k=new Book();
                        k.Input();
                        list.add(k);
                    }

                    break;
                case 2:
                    sc.nextLine();
                    int d=0;
                    System.out.println("Nhap id can Edit: ");
                    String id=sc.nextLine();
                    for (int i=0; i<list.size(); i++){
                        if(id.compareToIgnoreCase(list.get(i).getiD())==0){

                            d++;
                            System.out.println("======THONG TIN CHINH SUA========");
                            System.out.println("Nhap ten: ");
                            list.get(i).setName(sc.nextLine());
                            System.out.println("Nhap publisher: ");
                            list.get(i).setPublh(sc.nextLine());
                            System.out.println("Nhap price: ");
                            list.get(i).setPrice(sc.nextLong());
                            sc.nextLine();
                            System.out.println("Nhap Numofpage: ");
                            list.get(i).setNumOP(sc.nextInt());
                            sc.nextLine();
                            System.out.println("Nhap author: ");
                            list.get(i).setAuthor(sc.nextLine());
//                            list.remove(i);
                        }
                    }
                    if(d==0) System.out.println("ID was not founded");
                    else System.out.println("EDIT XONG");
                    break;
                case 3:
                    System.out.println("Nhap ID can xoa: ");
                    sc.nextLine();
                    String idd=sc.nextLine();
                    int dd=0;
                    for (int i=0; i<list.size(); i++){
                        if(idd.compareToIgnoreCase(list.get(i).getiD())==0) {
                            list.remove(i);
                            dd++;
                        }
                    }
                    if(dd==0) System.out.println("ID WAS NOT FOUNDED");
                    else
                        System.out.println("XOA XONG");
                    break;
                case 4:
                    for(int i=0; i<list.size()-1; i++)
                        for (int j=0; j<list.size(); j++){
                            if(list.get(i).getName().compareToIgnoreCase(list.get(j).getName())>0) {
                                Book temp = list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, temp);
                            }
                        }
                    System.out.println("SORTED");
                    break;
                case 5:
                    for(int i=0; i<list.size()-1; i++)
                        for (int j=0; j<list.size(); j++){
                            if(list.get(i).getPrice()<list.get(j).getPrice()){
                                Book temp=list.get(i);
                                list.set(i, list.get(j));
                                list.set(j, temp);
                            }
                        }
                    System.out.println("SORTED");
                    break;
                case 6:
                    System.out.println("============================THONG TIN SACH===============================");
                    System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s\n", "ID", "NAME", "PUBLISHER", "PRICE", "NUMOFPAGE", "AUTHOR");
                    for (Book a: list) {
                        a.Output();
                    }
                    System.out.println("==========================================================================");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nhap saiiiiiiiiiiii");

            }
        }while(choice!=0);
    }

}
