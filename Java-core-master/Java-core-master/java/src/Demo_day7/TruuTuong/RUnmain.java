package Demo_day7.TruuTuong;

public class RUnmain {
    public static void main(String[] args) {
        Animal animal=new Cat();// thay vì Cat() cat=new Cat();
        animal.sleep();
        animal=new DOG();
        animal.sleep();
        animal.Ad();
    }
}
