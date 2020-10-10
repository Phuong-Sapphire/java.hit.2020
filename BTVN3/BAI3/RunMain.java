package BAI3;


public class RunMain {
    public static void main(String[] args) {
        Merchandise a = new Merchandise("001", "Book", 50000, 1);
        Merchandise b = new Merchandise();
        b.setGoodsCode("002");
        b.setGoodsName("Pen");
        b.setUnitPrice(5000);
        b.setNumber(2);
        System.out.println("========INFORMATION ABOUT GOODS 1=========");
        a.Show();
        System.out.println("========INFORMATION ABOUT GOODS 2=========");
        b.Show();
    }
}
