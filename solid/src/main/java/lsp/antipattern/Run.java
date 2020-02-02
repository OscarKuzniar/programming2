package lsp.antipattern;

public class Run {

    public static void main(String[] args) {
        Rectangle square = new Square(50);

        square.setHeight(100);

        System.out.println(square.getHeight() + " " + square.getWidth());
    }
}
