package ocp;

import java.math.BigDecimal;
import java.util.List;

public class AreaCalculator {

    public double calculateTotalArea(List<Shape> shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}
