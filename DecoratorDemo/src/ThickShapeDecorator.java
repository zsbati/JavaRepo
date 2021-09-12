public class ThickShapeDecorator extends Decorator{

    public ThickShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setThickBorder(decoratedShape);
    }

    private void setThickBorder(Shape decoratedShape){
        System.out.println("Border line: Thick");
    }
}
