package BAI5;

public class RunMain {
    public static void main(String[] args) {
        CLASSROOM x = new CLASSROOM();
        x.Input();
        //x.Output();
        System.out.println("\n=====after filter======");
        x.filter();
        System.out.println("\n======after sort========");
        x.increment();
    }
}
