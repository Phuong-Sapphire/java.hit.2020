package BAI2;

public class Cirlce implements Ishape{
    private double radius;

    public Cirlce(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*Math.PI*radius;
    }

    @Override
    public double getPerimeter() {
        return radius*2*Math.PI;
    }
}
