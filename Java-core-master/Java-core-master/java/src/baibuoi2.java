import java.util.Scanner;

public class baibuoi2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        int n=scan.nextInt();
//        System.out.println(n);
//        byte b;
//        short c;
//        b= scan.nextByte();
//        c=scan.nextShort();
//        System.out.println(b+c);
//        float a;
//        a= scan.nextFloat();
//        System.out.println(a);
//        scan.nextLine(); //xóa bộ đệm <=> fflush(stdin);
//        String str;
//        str=scan.nextLine();
//        System.out.println(str);
//
//        Integer x=5; // int x;
//        System.out.println(x.compareTo(5));
//        System.out.println(x.compareTo(7));
//        System.out.println(x.compareTo(3));
//        Integer y=9;
       // System.out.println(x.equals(y));//so sánh đối tượng
//        char ch='a';
//        Character ch1 ='a';
//        //Character.isAlphabetic(ch1);
//        System.out.println(Character.isDigit(ch1));
//
//        int a=5;
//        float b=a;//ép kiểu tường minh
//        int c=(int)b;
//        String str="10.665885";
//      //  int d = Integer.parseInt(str); //Integer chỉ chuyển được số dạng nguyên
//        double d= Double.parseDouble(str); // đối tượng Double
//        System.out.println(d);
//        int d=10;
//        String str=String.valueOf(d);
//        System.out.printf("str= " +str);
//        System.out.printf("tong la: " + (3+5));
//      //  System.out.println((double)10/3);
//        String str="Ha Van Phong";
//       // System.out.println(str.charAt(0)); //truy xuất đến vị trí
//        int index=str.length();
//        System.out.println(index);
//
//        int []A=new int [] {1,2,3,4,5};
//        for (int i=0; i< A.length; i++)
//        System.out.print(A[i]+ " ");
//
//        System.out.println("");
//
//// for (KDL index : A) {   };
//        for (int x: A){   // dùng với danh sách .   x là phần tử đại diện cho phần tử từ đầu đến cuối mảng
//            System.out.print(x + " ");
//        }

//        String [] arrString = new String[]{
//                "ổi", "cam", "quýt", "bưởi", " của phòng đẹp trai"
//        };
//        for (String k: arrString){
//            System.out.print(k+ " ");  // for rít
//        }
//      aa:  for (int i=0; i<3; i++){
//        bb:    for (int j=0; j<3; j++){
//                System.out.println("i = "+i +"\tj= " +j);
//                if (i==2 && j==2 ) break aa;
//            }
//        }
//        show();
//        System.out.println(Sum(3,7));
       int sum=0;
        String input;
        input = scan.nextLine(); //nhập

      for (int i=0; i< input.length(); i++){
            //if (input.charAt(i)<='9' && input.charAt(i)>='0') {
               // int d = Character.charCount(input.charAt(i));
                char ch= input.charAt(i);
                if (Character.isDigit(ch)){
                    sum+= Integer.parseInt(String.valueOf(ch));
               // sum+=(int)ch-48;
            }
        }


//        System.out.println(sum);
//
int n;
//n=scan.nextInt();
       n=nhapN();
int []A=new int [n];
//for (int i=0; i<n; i++){
//    A[i]=scan.nextInt();
//}
        Nhap(A,n);
int sumSnt=0;
for (int i=0; i<n;i++){
    if (snt(A[i])) sumSnt+=A[i];
}
        System.out.println("Tong so nguyen to: " +sumSnt);

    }

//    public static void show(){
//        System.out.print("goị hàm tính tổng: ");
//    }
//    public static int Sum (int a, int b){
//        return a+b;
//    }
    public static boolean snt (int a){
        if (a==2) return true;
        for (int i=2; i<=Math.sqrt(a); i++ ){
            if (a%i==0) return false;
        }
        return true;
    }

    public static void Nhap(int []A, int n){
        Scanner scan = new Scanner(System.in);
        for (int i=0; i<n; i++){
            A[i]=scan.nextInt();
        }
    }
    public static int nhapN (){
        int n;
        Scanner s= new Scanner(System.in);
       return n =s.nextInt();
    }



}
