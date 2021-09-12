public abstract class AbstractFactory {

    protected AbstractFactory(){}

    abstract Shape getShape(String shapeType);
}
