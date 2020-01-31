package ocp;

import java.util.List;

public class AreaCalculator {

    public double calculateTotalArea(List<Rectangle> rectangles) {
        double totalArea = 0;
        for (Rectangle rectangle : rectangles) {
            totalArea += rectangle.getWidth() * rectangle.getHeight();
        }

        return totalArea;
    }
}
