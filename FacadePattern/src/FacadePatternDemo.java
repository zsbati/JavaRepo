public class FacadePatternDemo {

    public static void main(String[] args) {

        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawTriangle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }

}

