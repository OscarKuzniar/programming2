package kiss;

public class NotSimple {


    private void drawShape(String shape) {
        if(!shape.equals("CIRCLE") && !shape.equals("TRIANGLE")) {
            if(shape.equals("SQUARE") || shape.equals("RECTANGLE")) {
                drawRectangle();
            }
        } else  {
            // some other weird logic
        }
    }

    private void drawRectangle() {
        System.out.println("drawing RECTANGLE");
    }
}
