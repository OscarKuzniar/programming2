package ocp;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(5, 150);
        Rectangle rectangleTwo = new Rectangle(50,180);
        Triangle triangle = new Triangle(50, 150);
        Circle circle = new Circle(50);

        AreaCalculator areaCalculator = new AreaCalculator();
        List<Shape> shapes = List.of(rectangleOne, rectangleTwo, triangle, circle);
        double totalArea = areaCalculator.calculateTotalArea(shapes);
        System.out.println(totalArea);
    }
}
