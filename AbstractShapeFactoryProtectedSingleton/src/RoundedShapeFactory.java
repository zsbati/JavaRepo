public class RoundedShapeFactory extends AbstractFactory{

    private RoundedShapeFactory(){}
    //create an object of SingleObject
    private static RoundedShapeFactory instance;

    //Get the only instance available
    public static RoundedShapeFactory getInstance(){
        if (instance == null){
            instance = new RoundedShapeFactory();
        }
        return instance;
    }

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
