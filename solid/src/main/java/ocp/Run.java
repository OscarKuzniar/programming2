package ocp;

import java.util.List;

public class Run {

    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(5, 150);
        Rectangle rectangleTwo = new Rectangle(50,180);

        AreaCalculator areaCalculator = new AreaCalculator();
        List<Rectangle> rectangles = List.of(rectangleOne, rectangleTwo);
        double totalArea = areaCalculator.calculateTotalArea(rectangles);
        System.out.println(totalArea);
    }
}
