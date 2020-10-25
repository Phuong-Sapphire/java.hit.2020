package BAI2;

import java.util.Scanner;

public class Complex_Number {
    private double real;
    private double virtual;

    public Complex_Number() {
    }

    public Complex_Number(double real, double virtual) {
        this.real = real;
        this.virtual = virtual;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getVirtual() {
        return virtual;
    }

    public void setVirtual(double virtual) {
        this.virtual = virtual;
    }
    public void Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("real: ");
        real = sc.nextDouble();
        System.out.println("virtual: ");
        virtual = sc.nextDouble();
    }
    public void Output(){
        System.out.println(real + " + i*" + virtual);
    }
    public Complex_Number Additon(Complex_Number a){
        Complex_Number x = new Complex_Number();
        x.real = this.real + a.real;
        x.virtual = this.virtual + a.virtual;
        return x;
    }
    public Complex_Number Subtraction(Complex_Number a){
        Complex_Number x = new Complex_Number();
        x.real = this.real - a.real;
        x.virtual = this.virtual - a.virtual;
        return x;
    }
}
