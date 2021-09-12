public class ShapeFactory {
    public Shape getShape(String shapeType){

        if (shapeType.equals("CIRCLE")){
            Shape circle = new Circle();
            return circle;
        }
        if (shapeType.equals("ELLIPSE")){
            Shape ellipse = new Ellipse();
            return ellipse;
        }
        if (shapeType.equals("SQUARE")){
            Shape square = new Square();
            return square;
        }
        if (shapeType.equals("RECTANGLE")){
            Shape rectangle = new Rectangle();
            return rectangle;
        }
        if (shapeType.equals("SQUARE")){
            Shape square = new Square();
            return square;
        }
        if (shapeType.equals("TRIANGLE")){
            Shape triangle = new Triangle();
            return triangle;
        }


        return new Default();
    }
}
