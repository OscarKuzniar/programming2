package lsp.antipattern;

public class Square extends Rectangle {

    private double side;

    public Square(double side) {
        super(side, side);
    }

    public Square(double height, double width) {
        super(height, width);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
