public class GreenShapeDecorator extends Decorator{

    public GreenShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setGreenBorder(decoratedShape);
    }

    private void setGreenBorder(Shape decoratedShape){
        System.out.println("Border Color: Green");
    }
}
