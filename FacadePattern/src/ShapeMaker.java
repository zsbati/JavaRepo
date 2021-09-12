public class ShapeMaker {

    Shape triangle;
    Shape rectangle;
    Shape square;
    Shape circle;

    public ShapeMaker(){

    }

    public void drawCircle(){
        circle = new Circle();
        circle.draw();
    }

    public void drawTriangle(){
        triangle= new Triangle();
        triangle.draw();
    }

    public void drawRectangle(){
        rectangle = new Rectangle();
        rectangle.draw();
    }

    public void drawSquare(){
        square = new Square();
        square.draw();
    }

}
