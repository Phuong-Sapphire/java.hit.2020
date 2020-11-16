package BAI3;

import java.lang.ref.SoftReference;
import java.util.Scanner;

public class News implements INews{
    private int id;
    private String title;
    private String publishDate;
    private String author;
    private String content;
    private float averageRate;

    public News() {
    }

    public News(int id, String title, String publishDate, String author, String content, float averageRate) {
        this.id = id;
        this.title = title;
        this.publishDate = publishDate;
        this.author = author;
        this.content = content;
        this.averageRate = averageRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public float getAverageRate() {
        return averageRate;
    }

    @Override
    public void Display() {
        System.out.println("title: "+getTitle());
        System.out.println("publish date: "+getPublishDate());
        System.out.println("author: "+ getAuthor());
        System.out.println("content: "+getContent());
        System.out.println("average rate: "+ getAverageRate());
    }
    public int[] rateList = new int[3];
    public void InputRate(){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<rateList.length; ++i){
            System.out.println("nhập vào đánh giá thứ "+ (i+1)+ ": ");
            rateList[i] = sc.nextInt();
        }
    }
    public void Calculate(){
        int sum = 0;
        for (int i=0; i<rateList.length; ++i){
            sum+= rateList[i];
        }
        this.averageRate = sum/rateList.length;
    }
}
