public class BlueShapeDecorator extends Decorator{

    public BlueShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setBlueBorder(decoratedShape);
    }

    private void setBlueBorder(Shape decoratedShape){
        System.out.println("Border Color: Blue");
    }
}
