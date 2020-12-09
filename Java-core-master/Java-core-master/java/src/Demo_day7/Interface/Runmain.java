package Demo_day7.Interface;

public class Runmain {
    public static void main(String[] args) {
        Animal animal =new Cat();
        animal.sleep();
        animal=new Dog();
        animal.sleep();
    }
}
