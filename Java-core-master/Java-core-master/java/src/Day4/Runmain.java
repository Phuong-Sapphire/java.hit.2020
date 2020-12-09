package Day4;

public class Runmain {
    public static void main(String[] args) {
        //nạp chồng phương thức
        //
//        SinhVien x=new SinhVien("20933932", "Ha Van Phong");
//        x.HienThi(3);

    SinhVien [] ArrSV = new SinhVien[2];
    for (int i=0; i<ArrSV.length; i++){
        ArrSV[i]=new SinhVien();
//        ArrSV[i].setHoTen("Phong" +i);
//        ArrSV[i].setMaSv(""+(i+1));
        ArrSV[i].InputInfor();

    }
//    for  (int i=0; i<ArrSV.length; i++){
//        ArrSV[i]=new SinhVien();
//        ArrSV[i].HienThi(0);
//    }
    for (SinhVien sinhVien : ArrSV){
        sinhVien.HienThi();

        System.out.println();
    }

    }
}
