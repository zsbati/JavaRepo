public class ProtectedFactoryProducer {

    private ProtectedFactoryProducer(){}

    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return RoundedShapeFactory.getInstance();
        }else{
            return ShapeFactory.getInstance();
        }
    }
}
