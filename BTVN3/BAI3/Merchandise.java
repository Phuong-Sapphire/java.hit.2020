package BAI3;

public class Merchandise {
    private String goodsCode;
    private String goodsName;
    private double unitPrice;
    private int number;

    public Merchandise(String goodsCode, String goodsName, int unitPrice, int number) {
        this.goodsCode = goodsCode;
        this.goodsName = goodsName;
        this.unitPrice = unitPrice;
        this.number = number;
    }

    public Merchandise() {
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void Show(){
        System.out.println("code: "+goodsCode);
        System.out.println("name: "+goodsName);
        System.out.println("price: "+unitPrice);
        System.out.println("number: "+number);
        System.out.println("total money = "+(unitPrice*number));
    }
}
