public class ShapeFactory extends AbstractFactory{

    private ShapeFactory(){}
    //create an object of SingleObject
    private static ShapeFactory instance;

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

    //Get the only object available
    public static ShapeFactory getInstance(){

        if (instance == null){
            instance = new ShapeFactory();
        }
        return instance;
    }

}
