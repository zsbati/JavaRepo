public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shapeType){


        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("TRIANGLE")){
            return new Triangle();
        }


        return new Default();
    }
}
