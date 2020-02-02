package ocp;

public class Triangle implements Shape {

    private double height;

    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double getArea() {
        return this.base * this.height * 0.5;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }
}
