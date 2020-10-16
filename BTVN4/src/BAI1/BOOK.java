package BAI1;

import java.util.Scanner;

public class BOOK {
    private String bookCode;
    private String bookName;
    private String publishingHouse;
    private int pageNumber;
    private int price;

    public BOOK() {
    }

    public BOOK(String bookCode, String bookName, String publishingHouse, int pageNumber, int price) {
        this.bookCode = bookCode;
        this.bookName = bookName;
        this.publishingHouse = publishingHouse;
        this.pageNumber = pageNumber;
        this.price = price;
    }

    public String getBookCode() {
        return bookCode;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập mã sách: ");
        bookCode = sc.nextLine();
        System.out.println("nhập tên sách: ");
        bookName = sc.nextLine();
        System.out.println("nhập NXB: ");
        publishingHouse = sc.nextLine();
        System.out.println("nhập số trang: ");
        pageNumber =sc.nextInt();
        System.out.println("nhập đơn giá: ");
        price = sc.nextInt();
    }
    public void Output(){
        System.out.println(bookCode + "\t" + bookName + "\t" + publishingHouse + "\t" + pageNumber + "\t" + price);
    }
}
