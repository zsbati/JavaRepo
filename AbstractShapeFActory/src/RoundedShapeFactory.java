public class RoundedShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType){


        if (shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("ELLIPSE")){
            return new Ellipse();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        if (shapeType.equalsIgnoreCase("TRIANGLE")){
            return new RoundedTriangle();
        }


        return new Default();
    }
}
