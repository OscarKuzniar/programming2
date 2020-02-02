package ocp;

public class Rectangle implements Shape {

    private double height;

    @Override
    public double getArea() {
        return this.width * this.height;
    }

    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
