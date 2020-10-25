package BAI2;

public class RunMain {
    public static void main(String[] args) {
        Complex_Number A = new Complex_Number();
        Complex_Number B = new Complex_Number();
        System.out.println("the first complex number: ");
        A.Input();
        System.out.println("the second complex number: ");
        B.Input();
        Complex_Number C = A.Additon(B);
        System.out.print("A + B = " );
        C.Output();
        Complex_Number D = A.Subtraction(B);
        System.out.print("A - B = " );
        D.Output();
    }
}
